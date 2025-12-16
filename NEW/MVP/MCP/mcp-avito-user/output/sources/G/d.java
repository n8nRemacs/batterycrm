package G;

import android.util.Size;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ResolutionStrategy.java */
@X
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final d f6129c = new d();

    /* renamed from: a, reason: collision with root package name */
    @P
    public final Size f6130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6131b;

    /* compiled from: ResolutionStrategy.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    public d() {
        this.f6130a = null;
        this.f6131b = 0;
    }

    public d(@N Size size) {
        this.f6130a = size;
        this.f6131b = 1;
    }
}
