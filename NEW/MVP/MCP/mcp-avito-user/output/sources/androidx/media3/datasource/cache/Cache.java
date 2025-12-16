package androidx.media3.datasource.cache;

import androidx.media3.common.util.J;
import j.P;
import j.l0;
import java.io.IOException;

@J
/* loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface a {
    }

    @l0
    f a(long j12, long j13, String str);

    long b();

    void c(f fVar);

    j d();

    @l0
    void e();

    @P
    @l0
    f f();
}
