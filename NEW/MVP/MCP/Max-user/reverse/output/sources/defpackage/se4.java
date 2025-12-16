package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface se4 extends ke4 {
    long H(ze4 ze4Var);

    void I(wgg wggVar);

    void close();

    Uri getUri();

    default Map x() {
        return Collections.EMPTY_MAP;
    }
}
