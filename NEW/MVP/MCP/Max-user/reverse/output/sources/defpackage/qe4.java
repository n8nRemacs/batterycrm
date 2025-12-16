package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface qe4 extends je4 {
    long R(ye4 ye4Var);

    void S(vgg vggVar);

    void close();

    Uri getUri();

    default Map x() {
        return Collections.EMPTY_MAP;
    }
}
