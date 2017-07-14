
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.util.GeometryTransformer;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

public class GeometryAsText {

    
    public static Geometry geometryFromWKT(String wktString) throws ParseException {
        WKTReader wkt = new WKTReader();
        Geometry polygon = wkt.read(wktString);
        return polygon;
    }
}
