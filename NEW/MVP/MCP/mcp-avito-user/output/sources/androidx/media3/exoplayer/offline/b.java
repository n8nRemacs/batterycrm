package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.util.J;
import androidx.media3.common.z;
import androidx.media3.datasource.cache.a;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: DefaultDownloaderFactory.java */
@J
/* loaded from: classes.dex */
public class b implements m {
    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
    }

    public static Constructor<? extends l> a(Class<?> cls) {
        try {
            return cls.asSubclass(l.class).getConstructor(z.class, a.d.class, Executor.class);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Downloader constructor missing", e12);
        }
    }
}
