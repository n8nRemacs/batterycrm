package androidx.media3.session;

import android.os.Bundle;
import androidx.media.C;
import androidx.media3.common.H;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.L1;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.InterfaceC37569v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: MediaSession.java */
@aZ0.f
/* loaded from: classes.dex */
public class O0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f52202b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public static final HashMap<String, O0> f52203c;

    /* renamed from: a, reason: collision with root package name */
    public final T0 f52204a;

    /* compiled from: MediaSession.java */
    public static final class b extends c<O0, b, d> {
        public b(com.avito.android.messenger.service.media_session.a aVar, androidx.media3.common.H h12) {
            super(aVar, h12, new P0());
        }

        public final O0 a() {
            if (this.f52210f == null) {
                this.f52210f = new C23210c(new U1());
            }
            AbstractC37401r1<C23213d> abstractC37401r1 = this.f52211g;
            CallbackT callbackt = this.f52208d;
            C23210c c23210c = this.f52210f;
            c23210c.getClass();
            return new O0(this.f52205a, this.f52207c, this.f52206b, abstractC37401r1, callbackt, this.f52209e, c23210c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(d dVar) {
            this.f52208d = dVar;
        }
    }

    /* compiled from: MediaSession.java */
    public static abstract class c<SessionT extends O0, BuilderT extends c<SessionT, BuilderT, CallbackT>, CallbackT extends d> {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.service.media_session.a f52205a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.H f52206b;

        /* renamed from: d, reason: collision with root package name */
        public CallbackT f52208d;

        /* renamed from: f, reason: collision with root package name */
        public C23210c f52210f;

        /* renamed from: c, reason: collision with root package name */
        public final String f52207c = "";

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f52209e = Bundle.EMPTY;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC37401r1<C23213d> f52211g = AbstractC37401r1.C();

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.avito.android.messenger.service.media_session.a aVar, androidx.media3.common.H h12, d dVar) {
            this.f52205a = aVar;
            this.f52206b = h12;
            this.f52208d = dVar;
        }
    }

    /* compiled from: MediaSession.java */
    public interface d {
        @androidx.media3.common.util.J
        default com.google.common.util.concurrent.e1 a(O0 o02, g gVar, List list, final int i12, final long j12) {
            return androidx.media3.common.util.M.P(b(list), new InterfaceC37569v() { // from class: androidx.media3.session.Q0
                @Override // com.google.common.util.concurrent.InterfaceC37569v
                public final com.google.common.util.concurrent.D0 apply(Object obj) {
                    return C37568u0.d(new O0.i((List) obj, i12, j12));
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        default com.google.common.util.concurrent.D0 b(List list) {
            O4 o4ListIterator = ((AbstractC37401r1) list).listIterator(0);
            while (o4ListIterator.hasNext()) {
                if (((androidx.media3.common.z) o4ListIterator.next()).f47979c == null) {
                    return C37568u0.c(new UnsupportedOperationException());
                }
            }
            return C37568u0.d(list);
        }

        default com.google.common.util.concurrent.D0<O1> c(O0 o02, g gVar, K1 k12, Bundle bundle) {
            return C37568u0.d(new O1(-6));
        }

        default e d(O0 o02, g gVar) {
            return new e(true, o02 instanceof AbstractServiceC23270w0.c ? e.f52213f : e.f52212e, e.f52214g, null);
        }
    }

    /* compiled from: MediaSession.java */
    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final L1 f52212e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final L1 f52213f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final H.c f52214g;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f52215a;

        /* renamed from: b, reason: collision with root package name */
        public final L1 f52216b;

        /* renamed from: c, reason: collision with root package name */
        public final H.c f52217c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.J
        @j.P
        public final AbstractC37401r1<C23213d> f52218d;

        /* compiled from: MediaSession.java */
        @androidx.media3.common.util.J
        public static class a {
        }

        static {
            L1.b bVar = new L1.b();
            AbstractC37401r1<Integer> abstractC37401r1 = K1.f52109e;
            bVar.a(abstractC37401r1);
            f52212e = bVar.b();
            L1.b bVar2 = new L1.b();
            bVar2.a(K1.f52110f);
            bVar2.a(abstractC37401r1);
            f52213f = bVar2.b();
            H.c.a aVar = new H.c.a();
            aVar.f47244a.b(H.c.a.f47243b);
            f52214g = aVar.c();
        }

        public e(boolean z12, L1 l12, H.c cVar, @j.P AbstractC37401r1<C23213d> abstractC37401r1) {
            this.f52215a = z12;
            this.f52216b = l12;
            this.f52217c = cVar;
            this.f52218d = abstractC37401r1;
        }
    }

    /* compiled from: MediaSession.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final C.b f52219a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52220b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f52221c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final f f52222d;

        public g(C.b bVar, int i12, boolean z12, @j.P f fVar) {
            this.f52219a = bVar;
            this.f52220b = i12;
            this.f52221c = z12;
            this.f52222d = fVar;
        }

        public final boolean equals(@j.P Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            f fVar = this.f52222d;
            return (fVar == null && gVar.f52222d == null) ? this.f52219a.equals(gVar.f52219a) : androidx.media3.common.util.M.a(fVar, gVar.f52222d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f52222d, this.f52219a});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
            C.b bVar = this.f52219a;
            sb2.append(bVar.a());
            sb2.append(", uid=");
            sb2.append(bVar.c());
            sb2.append("})");
            return sb2.toString();
        }
    }

    /* compiled from: MediaSession.java */
    public interface h {
    }

    /* compiled from: MediaSession.java */
    @androidx.media3.common.util.J
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC37401r1<androidx.media3.common.z> f52223a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52224b;

        /* renamed from: c, reason: collision with root package name */
        public final long f52225c;

        public i(List<androidx.media3.common.z> list, int i12, long j12) {
            this.f52223a = AbstractC37401r1.v(list);
            this.f52224b = i12;
            this.f52225c = j12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (this.f52223a.equals(iVar.f52223a)) {
                Integer numValueOf = Integer.valueOf(this.f52224b);
                Integer numValueOf2 = Integer.valueOf(iVar.f52224b);
                int i12 = androidx.media3.common.util.M.f47887a;
                if (numValueOf.equals(numValueOf2) && Long.valueOf(this.f52225c).equals(Long.valueOf(iVar.f52225c))) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.common.primitives.n.b(this.f52225c) + (((this.f52223a.hashCode() * 31) + this.f52224b) * 31);
        }
    }

    static {
        androidx.media3.common.A.a("media3.session");
        f52202b = new Object();
        f52203c = new HashMap<>();
    }

    public O0(com.avito.android.messenger.service.media_session.a aVar, String str, androidx.media3.common.H h12, AbstractC37401r1 abstractC37401r1, d dVar, Bundle bundle, C23210c c23210c) {
        synchronized (f52202b) {
            HashMap<String, O0> map = f52203c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.f52204a = new T0(this, aVar, str, h12, abstractC37401r1, dVar, bundle, c23210c);
    }

    public T0 a() {
        return this.f52204a;
    }

    public final androidx.media3.common.H b() {
        return this.f52204a.f52302p.f47862a;
    }

    public final void c() {
        try {
            synchronized (f52202b) {
                f52203c.remove(this.f52204a.f52294h);
            }
            this.f52204a.k();
        } catch (Exception unused) {
        }
    }

    /* compiled from: MediaSession.java */
    public interface f {
        default void f() {
        }

        default void g(int i12) {
        }

        default void a(int i12, C23252q<?> c23252q) {
        }

        default void c(int i12, O1 o12) {
        }

        default void e(int i12, H.c cVar) {
        }

        default void d(int i12, N1 n12, boolean z12, boolean z13) {
        }

        default void b(int i12, D1 d12, H.c cVar, boolean z12, boolean z13, int i13) {
        }
    }
}
