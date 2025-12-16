package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.InterfaceC23102m;
import androidx.media3.common.util.J;
import j.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface j extends InterfaceC23102m {

    /* compiled from: DataSource.java */
    public interface a {
        @J
        j a();
    }

    @J
    default Map<String, List<String>> c() {
        return Collections.emptyMap();
    }

    @J
    void close();

    @J
    long e(o oVar);

    @J
    @P
    Uri getUri();

    @J
    void j(B b12);
}
