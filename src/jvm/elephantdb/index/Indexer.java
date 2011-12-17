package elephantdb.index;

import elephantdb.persistence.Document;
import elephantdb.persistence.Persistence;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * Document here needs a kryo serializer registered.
 */

public interface Indexer<P extends Persistence, D extends Document> extends Serializable {
    public void update(P persistence, D doc) throws IOException;
}