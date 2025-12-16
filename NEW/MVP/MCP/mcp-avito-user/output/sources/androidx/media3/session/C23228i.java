package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.U;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.exoplayer.C23179x;
import androidx.media3.session.A1;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.InterfaceC23246o;
import androidx.media3.session.O0;
import androidx.media3.session.T0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23228i implements InterfaceC23096j.a, BinderC23267v0.a, T0.c, InterfaceC23119j, A1.e, A1.c, A1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52491b;

    public /* synthetic */ C23228i(int i12) {
        this.f52491b = i12;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) {
        switch (this.f52491b) {
            case 2:
                c23229i0.f52499h.f(26, new C23179x(3));
                break;
            case 3:
                int i12 = BinderC23267v0.f52647p;
                J jC02 = c23229i0.c0();
                J jC03 = c23229i0.c0();
                Objects.requireNonNull(jC03);
                jC02.a0(new Z(jC03, 2));
                break;
            case 4:
                int i13 = BinderC23267v0.f52647p;
                if (c23229i0.isConnected()) {
                    J jC04 = c23229i0.c0();
                    jC04.getClass();
                    C23110a.g(Looper.myLooper() == jC04.f52080e.getLooper());
                    jC04.f52079d.getClass();
                    break;
                }
                break;
            default:
                int i14 = BinderC23267v0.f52647p;
                if (c23229i0.isConnected()) {
                    J jC05 = c23229i0.c0();
                    jC05.getClass();
                    C23110a.g(Looper.myLooper() == jC05.f52080e.getLooper());
                    jC05.f52079d.getClass();
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        G1 g12 = (G1) obj;
        switch (this.f52491b) {
            case 9:
                g12.e0();
                break;
            case 10:
                g12.j0();
                break;
            case 11:
                int i12 = A1.f51915u;
                g12.v();
                break;
            case 12:
                int i13 = A1.f51915u;
                g12.stop();
                break;
            case 13:
                g12.l0();
                break;
            case 14:
            case 18:
            case 19:
            case 20:
            default:
                g12.Z();
                break;
            case 15:
                int i14 = A1.f51915u;
                g12.N();
                break;
            case 16:
                g12.f0();
                break;
            case 17:
                g12.pause();
                break;
            case 21:
                int i15 = A1.f51915u;
                g12.D();
                break;
            case 22:
                g12.i0();
                break;
            case 23:
                g12.prepare();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                g12.k0();
                break;
        }
    }

    @Override // androidx.media3.session.T0.c
    public void b(O0.f fVar, int i12) {
        switch (this.f52491b) {
            case 6:
                fVar.getClass();
                break;
            case 7:
                fVar.getClass();
                break;
            default:
                fVar.g(i12);
                break;
        }
    }

    @Override // androidx.media3.session.A1.d
    public void c(G1 g12, O0.i iVar) {
        C1.E(g12, iVar);
    }

    @Override // androidx.media3.session.A1.e
    public Object d(T0 t02, O0.g gVar, int i12) {
        switch (this.f52491b) {
            case 14:
                int i13 = A1.f51915u;
                ((G0) t02).getClass();
                throw null;
            case 18:
                int i14 = A1.f51915u;
                t02.f52290d.getClass();
                return C37568u0.d(new O1(-6));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i15 = A1.f51915u;
                ((G0) t02).getClass();
                throw null;
            default:
                int i16 = A1.f51915u;
                t02.f52290d.getClass();
                return C37568u0.d(new O1(-6));
        }
    }

    @Override // androidx.media3.session.A1.c
    public void e(G1 g12, O0.g gVar, List list) {
        switch (this.f52491b) {
            case 19:
                int i12 = A1.f51915u;
                g12.Y(list);
                break;
            default:
                int i13 = A1.f51915u;
                g12.Y(list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.media3.session.o] */
    @Override // androidx.media3.common.InterfaceC23096j.a
    public InterfaceC23096j fromBundle(Bundle bundle) {
        InterfaceC23246o.b.a aVar;
        PlaybackException playbackException;
        switch (this.f52491b) {
            case 0:
                int i12 = bundle.getInt(C23231j.f52527g, 0);
                int i13 = bundle.getInt(C23231j.f52531k, 0);
                String string = bundle.getString(C23231j.f52528h);
                string.getClass();
                String str = C23231j.f52529i;
                C23110a.b(bundle.containsKey(str));
                int i14 = bundle.getInt(str);
                Bundle bundle2 = bundle.getBundle(C23231j.f52530j);
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                return new C23231j(i12, i13, string, i14, bundle2);
            case 1:
                int i15 = bundle.getInt(C23234k.f52543l, 0);
                int i16 = bundle.getInt(C23234k.f52552u, 0);
                IBinder binder = bundle.getBinder(C23234k.f52544m);
                binder.getClass();
                IBinder iBinder = binder;
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(C23234k.f52545n);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C23234k.f52546o);
                AbstractC37401r1 abstractC37401r1A = parcelableArrayList != null ? C23114e.a(C23213d.f52422n, parcelableArrayList) : AbstractC37401r1.C();
                Bundle bundle3 = bundle.getBundle(C23234k.f52547p);
                L1 l12 = bundle3 == null ? L1.f52123c : (L1) L1.f52125e.fromBundle(bundle3);
                Bundle bundle4 = bundle.getBundle(C23234k.f52549r);
                H.c cVar = bundle4 == null ? H.c.f47239c : (H.c) H.c.f47241e.fromBundle(bundle4);
                Bundle bundle5 = bundle.getBundle(C23234k.f52548q);
                H.c cVar2 = bundle5 == null ? H.c.f47239c : (H.c) H.c.f47241e.fromBundle(bundle5);
                Bundle bundle6 = bundle.getBundle(C23234k.f52550s);
                Bundle bundle7 = bundle.getBundle(C23234k.f52551t);
                D1 d12 = bundle7 == null ? D1.f51936G : (D1) D1.f51968m0.fromBundle(bundle7);
                int i17 = InterfaceC23246o.b.f52593a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC23246o)) {
                    InterfaceC23246o.b.a aVar2 = new InterfaceC23246o.b.a();
                    aVar2.f52594a = iBinder;
                    aVar = aVar2;
                } else {
                    aVar = (InterfaceC23246o) iInterfaceQueryLocalInterface;
                }
                return new C23234k(i15, i16, aVar, pendingIntent, abstractC37401r1A, l12, cVar2, cVar, bundle6 == null ? Bundle.EMPTY : bundle6, d12);
            default:
                Bundle bundle8 = bundle.getBundle(D1.f51954Y);
                if (bundle8 == null) {
                    playbackException = null;
                } else {
                    PlaybackException.f47431i.getClass();
                    playbackException = new PlaybackException(bundle8);
                }
                int i18 = bundle.getInt(D1.f51956a0, 0);
                Bundle bundle9 = bundle.getBundle(D1.f51955Z);
                N1 n12 = bundle9 == null ? N1.f52178m : (N1) N1.f52189x.fromBundle(bundle9);
                Bundle bundle10 = bundle.getBundle(D1.f51957b0);
                H.k kVar = bundle10 == null ? N1.f52177l : (H.k) H.k.f47253r.fromBundle(bundle10);
                Bundle bundle11 = bundle.getBundle(D1.f51958c0);
                H.k kVar2 = bundle11 == null ? N1.f52177l : (H.k) H.k.f47253r.fromBundle(bundle11);
                int i19 = bundle.getInt(D1.f51959d0, 0);
                Bundle bundle12 = bundle.getBundle(D1.f51937H);
                androidx.media3.common.G g12 = bundle12 == null ? androidx.media3.common.G.f47232e : (androidx.media3.common.G) androidx.media3.common.G.f47235h.fromBundle(bundle12);
                int i22 = bundle.getInt(D1.f51938I, 0);
                boolean z12 = bundle.getBoolean(D1.f51939J, false);
                Bundle bundle13 = bundle.getBundle(D1.f51940K);
                androidx.media3.common.P p12 = bundle13 == null ? androidx.media3.common.P.f47368b : (androidx.media3.common.P) androidx.media3.common.P.f47372f.fromBundle(bundle13);
                int i23 = bundle.getInt(D1.f51967l0, 0);
                Bundle bundle14 = bundle.getBundle(D1.f51941L);
                androidx.media3.common.X x12 = bundle14 == null ? androidx.media3.common.X.f47549f : (androidx.media3.common.X) androidx.media3.common.X.f47554k.fromBundle(bundle14);
                Bundle bundle15 = bundle.getBundle(D1.f51942M);
                androidx.media3.common.B b12 = bundle15 == null ? androidx.media3.common.B.f47110J : (androidx.media3.common.B) androidx.media3.common.B.f47144r0.fromBundle(bundle15);
                float f12 = bundle.getFloat(D1.f51943N, 1.0f);
                Bundle bundle16 = bundle.getBundle(D1.f51944O);
                C23091e c23091e = bundle16 == null ? C23091e.f47644h : (C23091e) C23091e.f47650n.fromBundle(bundle16);
                Bundle bundle17 = bundle.getBundle(D1.f51960e0);
                androidx.media3.common.text.b bVar = bundle17 == null ? androidx.media3.common.text.b.f47856d : (androidx.media3.common.text.b) androidx.media3.common.text.b.f47859g.fromBundle(bundle17);
                Bundle bundle18 = bundle.getBundle(D1.f51945P);
                C23104o c23104o = bundle18 == null ? C23104o.f47686f : (C23104o) C23104o.f47691k.fromBundle(bundle18);
                int i24 = bundle.getInt(D1.f51946Q, 0);
                boolean z13 = bundle.getBoolean(D1.f51947R, false);
                boolean z14 = bundle.getBoolean(D1.f51948S, false);
                int i25 = bundle.getInt(D1.f51949T, 1);
                int i26 = bundle.getInt(D1.f51950U, 0);
                int i27 = bundle.getInt(D1.f51951V, 1);
                boolean z15 = bundle.getBoolean(D1.f51952W, false);
                boolean z16 = bundle.getBoolean(D1.f51953X, false);
                Bundle bundle19 = bundle.getBundle(D1.f51961f0);
                androidx.media3.common.B b13 = bundle19 == null ? androidx.media3.common.B.f47110J : (androidx.media3.common.B) androidx.media3.common.B.f47144r0.fromBundle(bundle19);
                long j12 = bundle.getLong(D1.f51962g0, 0L);
                long j13 = bundle.getLong(D1.f51963h0, 0L);
                long j14 = bundle.getLong(D1.f51964i0, 0L);
                Bundle bundle20 = bundle.getBundle(D1.f51966k0);
                androidx.media3.common.V v12 = bundle20 == null ? androidx.media3.common.V.f47535c : (androidx.media3.common.V) androidx.media3.common.V.f47537e.fromBundle(bundle20);
                Bundle bundle21 = bundle.getBundle(D1.f51965j0);
                return new D1(playbackException, i18, n12, kVar, kVar2, i19, g12, i22, z12, x12, p12, i23, b12, f12, c23091e, bVar, c23104o, i24, z13, z14, i25, i26, i27, z15, z16, b13, j12, j13, j14, v12, bundle21 == null ? androidx.media3.common.U.f47456B : new androidx.media3.common.U(new U.a(bundle21)));
        }
    }

    public /* synthetic */ C23228i(int i12, PendingIntent pendingIntent) {
        this.f52491b = 4;
    }

    public /* synthetic */ C23228i(Object obj, int i12) {
        this.f52491b = i12;
    }

    public /* synthetic */ C23228i(String str, InterfaceC23096j interfaceC23096j, int i12) {
        this.f52491b = i12;
    }
}
