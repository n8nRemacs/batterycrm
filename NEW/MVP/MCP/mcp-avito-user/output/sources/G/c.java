package G;

import androidx.annotation.RestrictTo;
import androidx.camera.core.Q;
import j.N;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ResolutionSelector.java */
@X
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final G.a f6125a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final d f6126b;

    /* compiled from: ResolutionSelector.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    /* compiled from: ResolutionSelector.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public G.a f6127a = G.a.f6123b;

        /* renamed from: b, reason: collision with root package name */
        @P
        public d f6128b = null;

        @N
        public final c a() {
            return new c(this.f6127a, this.f6128b, null);
        }
    }

    public c(@N G.a aVar, @P d dVar, @P Q q12) {
        this.f6125a = aVar;
        this.f6126b = dVar;
    }
}
