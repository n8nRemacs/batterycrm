package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23107s;
import androidx.media3.common.C23108t;
import androidx.media3.common.G;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.V;
import androidx.media3.common.X;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23171w;
import com.google.common.base.F;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: AnalyticsListener.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: AnalyticsListener.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @J
    public @interface a {
    }

    /* compiled from: AnalyticsListener.java */
    @J
    /* renamed from: androidx.media3.exoplayer.analytics.b$b, reason: collision with other inner class name */
    public static final class C1823b {

        /* renamed from: a, reason: collision with root package name */
        public final long f48632a;

        /* renamed from: b, reason: collision with root package name */
        public final P f48633b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48634c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final A.b f48635d;

        /* renamed from: e, reason: collision with root package name */
        public final long f48636e;

        /* renamed from: f, reason: collision with root package name */
        public final P f48637f;

        /* renamed from: g, reason: collision with root package name */
        public final int f48638g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final A.b f48639h;

        /* renamed from: i, reason: collision with root package name */
        public final long f48640i;

        /* renamed from: j, reason: collision with root package name */
        public final long f48641j;

        public C1823b(long j12, P p12, int i12, @j.P A.b bVar, long j13, P p13, int i13, @j.P A.b bVar2, long j14, long j15) {
            this.f48632a = j12;
            this.f48633b = p12;
            this.f48634c = i12;
            this.f48635d = bVar;
            this.f48636e = j13;
            this.f48637f = p13;
            this.f48638g = i13;
            this.f48639h = bVar2;
            this.f48640i = j14;
            this.f48641j = j15;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1823b.class != obj.getClass()) {
                return false;
            }
            C1823b c1823b = (C1823b) obj;
            return this.f48632a == c1823b.f48632a && this.f48634c == c1823b.f48634c && this.f48636e == c1823b.f48636e && this.f48638g == c1823b.f48638g && this.f48640i == c1823b.f48640i && this.f48641j == c1823b.f48641j && F.a(this.f48633b, c1823b.f48633b) && F.a(this.f48635d, c1823b.f48635d) && F.a(this.f48637f, c1823b.f48637f) && F.a(this.f48639h, c1823b.f48639h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f48632a), this.f48633b, Integer.valueOf(this.f48634c), this.f48635d, Long.valueOf(this.f48636e), this.f48637f, Integer.valueOf(this.f48638g), this.f48639h, Long.valueOf(this.f48640i), Long.valueOf(this.f48641j)});
        }
    }

    /* compiled from: AnalyticsListener.java */
    @J
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C23107s f48642a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<C1823b> f48643b;

        public c(C23107s c23107s, SparseArray<C1823b> sparseArray) {
            this.f48642a = c23107s;
            SparseBooleanArray sparseBooleanArray = c23107s.f47700a;
            SparseArray<C1823b> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i12 = 0; i12 < sparseBooleanArray.size(); i12++) {
                int iB2 = c23107s.b(i12);
                C1823b c1823b = sparseArray.get(iB2);
                c1823b.getClass();
                sparseArray2.append(iB2, c1823b);
            }
            this.f48643b = sparseArray2;
        }

        public final boolean a(int i12) {
            return this.f48642a.f47700a.get(i12);
        }

        public final C1823b b(int i12) {
            C1823b c1823b = this.f48643b.get(i12);
            c1823b.getClass();
            return c1823b;
        }
    }

    @J
    default void H(C1823b c1823b) {
    }

    @J
    default void O(C1823b c1823b) {
    }

    @J
    default void c(C1823b c1823b) {
    }

    @J
    default void n(C1823b c1823b) {
    }

    @J
    default void p(C1823b c1823b) {
    }

    @J
    default void s(C1823b c1823b) {
    }

    @J
    default void A(C1823b c1823b, int i12) {
    }

    @J
    @Deprecated
    default void B(C1823b c1823b, String str) {
    }

    @J
    default void D(C1823b c1823b, int i12) {
    }

    @J
    default void E(C1823b c1823b, int i12) {
    }

    @J
    default void F(C1823b c1823b, G g12) {
    }

    @J
    @Deprecated
    default void G(C1823b c1823b, String str) {
    }

    @J
    default void I(C1823b c1823b, Object obj) {
    }

    @J
    default void J(C1823b c1823b, PlaybackException playbackException) {
    }

    @J
    default void K(C1823b c1823b, C23138g c23138g) {
    }

    @J
    default void L(C1823b c1823b, int i12) {
    }

    @J
    default void N(C1823b c1823b, String str) {
    }

    @J
    default void a(C1823b c1823b, boolean z12) {
    }

    @J
    default void b(C1823b c1823b, C23108t c23108t) {
    }

    @J
    default void d(C1823b c1823b, Exception exc) {
    }

    @J
    default void e(C1823b c1823b, int i12) {
    }

    @J
    default void f(C1823b c1823b, boolean z12) {
    }

    @J
    default void g(C1823b c1823b, int i12) {
    }

    @J
    default void i(C1823b c1823b, int i12) {
    }

    @J
    default void j(C1823b c1823b, V v12) {
    }

    @J
    default void k(C1823b c1823b, X x12) {
    }

    @J
    default void l(C1823b c1823b, C23171w c23171w) {
    }

    @J
    default void m(H h12, c cVar) {
    }

    @J
    default void o(C1823b c1823b, boolean z12) {
    }

    @J
    default void q(C1823b c1823b, Metadata metadata) {
    }

    @J
    default void r(C1823b c1823b, boolean z12) {
    }

    @J
    default void t(C1823b c1823b, C23108t c23108t) {
    }

    @J
    default void w(C1823b c1823b, C23091e c23091e) {
    }

    @J
    default void y(C1823b c1823b, float f12) {
    }

    @J
    default void z(C1823b c1823b, String str) {
    }

    @J
    default void C(C1823b c1823b, int i12, int i13) {
    }

    @J
    default void h(int i12, long j12, C1823b c1823b) {
    }

    @J
    default void u(C1823b c1823b, int i12, boolean z12) {
    }

    @J
    default void v(C1823b c1823b, C23171w c23171w, IOException iOException) {
    }

    @J
    default void M(C1823b c1823b, int i12, long j12, long j13) {
    }

    @J
    default void x(C1823b c1823b, H.k kVar, H.k kVar2, int i12) {
    }
}
