package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class z89 extends Binder implements eb7 {
    public static final /* synthetic */ int h = 0;
    public final WeakReference c;
    public final fde d;
    public final Set e;
    public yjd f;
    public int g;

    public z89(o79 o79Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(o79Var);
        this.d = new fde(o79Var);
        this.e = Collections.synchronizedSet(new HashSet());
        this.f = yjd.s0;
    }

    public static ha8 T(o79 o79Var, u69 u69Var, int i, y89 y89Var, fu3 fu3Var) {
        if (o79Var.j()) {
            return bg7.b;
        }
        ha8 ha8Var = (ha8) y89Var.n(o79Var, u69Var, i);
        hke hkeVar = new hke();
        ha8Var.d(new u02(o79Var, hkeVar, fu3Var, ha8Var, 12), dx4.a);
        return hkeVar;
    }

    public static void X(o79 o79Var, u69 u69Var, int i, yie yieVar) {
        try {
            t69 t69Var = u69Var.d;
            hsi.h(t69Var);
            t69Var.g(i, yieVar);
            o79Var.c.a(true, true);
        } catch (RemoteException e) {
            a8i.m("MediaSessionStub", "Failed to send result to controller " + u69Var, e);
        }
    }

    public static sl6 Y(fu3 fu3Var) {
        return new sl6(25, new sl6(26, fu3Var));
    }

    public final void A(ya7 ya7Var, final int i, final aie aieVar, final int i2, final y89 y89Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final o79 o79Var = (o79) this.c.get();
            if (o79Var != null && !o79Var.j()) {
                final u69 u69VarQ = this.d.q(ya7Var.asBinder());
                if (u69VarQ == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    zxg.a0(o79Var.l, new Runnable() { // from class: q89
                        @Override // java.lang.Runnable
                        public final void run() {
                            fde fdeVar = this.a.d;
                            u69 u69Var = u69VarQ;
                            if (fdeVar.y(u69Var)) {
                                aie aieVar2 = aieVar;
                                o79 o79Var2 = o79Var;
                                int i3 = i;
                                if (aieVar2 != null) {
                                    if (!fdeVar.B(u69Var, aieVar2)) {
                                        z89.X(o79Var2, u69Var, i3, new yie(-4));
                                        return;
                                    }
                                } else if (!fdeVar.A(u69Var, i2)) {
                                    z89.X(o79Var2, u69Var, i3, new yie(-4));
                                    return;
                                }
                                y89Var.n(o79Var2, u69Var, i3);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.eb7
    public final void B(ya7 ya7Var, int i) {
        if (ya7Var == null) {
            return;
        }
        V(ya7Var, i, 4, Y(new zz8(27)));
    }

    @Override // defpackage.eb7
    public final void D(ya7 ya7Var, int i, long j) {
        if (ya7Var == null) {
            return;
        }
        V(ya7Var, i, 5, Y(new t00(j, 12)));
    }

    @Override // defpackage.eb7
    public final void E(ya7 ya7Var, int i) {
        if (ya7Var == null) {
            return;
        }
        V(ya7Var, i, 2, Y(new zz8(26)));
    }

    @Override // defpackage.eb7
    public final void F(ya7 ya7Var, int i, Bundle bundle) {
        L(ya7Var, i, bundle, true);
    }

    @Override // defpackage.eb7
    public final void G(ya7 ya7Var, int i) {
        if (ya7Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            o79 o79Var = (o79) this.c.get();
            if (o79Var != null && !o79Var.j()) {
                zxg.a0(o79Var.l, new k79(this, 5, ya7Var));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.eb7
    public final void K(ya7 ya7Var, int i, Bundle bundle) {
        if (ya7Var == null || bundle == null) {
            return;
        }
        try {
            ds3 ds3VarA = ds3.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ds3VarA.d;
            }
            try {
                b89 b89Var = new b89(ds3VarA.c, callingPid, callingUid);
                o79 o79Var = (o79) this.c.get();
                boolean z = o79Var != null && f89.a(o79Var.f).b(b89Var);
                int i2 = ds3VarA.a;
                int i3 = ds3VarA.b;
                i(ya7Var, new u69(b89Var, i2, i3, z, new v89(ya7Var, i3), ds3VarA.e));
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.eb7
    public final void L(ya7 ya7Var, int i, Bundle bundle, boolean z) {
        if (ya7Var == null || bundle == null) {
            return;
        }
        try {
            V(ya7Var, i, 31, new s89(new dq4(new eq4(2, k09.b(bundle), z), 22, new p89(1)), 1));
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.eb7
    public final void M(ya7 ya7Var) {
        if (ya7Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            o79 o79Var = (o79) this.c.get();
            if (o79Var != null && !o79Var.j()) {
                u69 u69VarQ = this.d.q(ya7Var.asBinder());
                if (u69VarQ != null) {
                    zxg.a0(o79Var.l, new k79(this, 6, u69VarQ));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.eb7
    public final void O(ya7 ya7Var, int i, Bundle bundle, Bundle bundle2) {
        if (ya7Var == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            aie aieVarA = aie.a(bundle);
            A(ya7Var, i, aieVarA, 0, new s89(new zz8(aieVarA, 13, bundle2), 1));
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.eb7
    public final void Q(ya7 ya7Var, int i) {
        u69 u69VarQ;
        if (ya7Var == null || (u69VarQ = this.d.q(ya7Var.asBinder())) == null) {
            return;
        }
        W(u69VarQ, i, 3, Y(new zz8(24)));
    }

    public final q4c S(q4c q4cVar) {
        wg7 wg7Var = q4cVar.D.a;
        tg7 tg7VarI = wg7.i();
        fg7 fg7Var = new fg7(4);
        for (int i = 0; i < wg7Var.size(); i++) {
            jgg jggVar = (jgg) wg7Var.get(i);
            lfg lfgVar = jggVar.b;
            String string = (String) this.f.get(lfgVar);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.g;
                this.g = i2 + 1;
                String str = zxg.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(lfgVar.b);
                string = sb.toString();
            }
            fg7Var.d0(lfgVar, string);
            tg7VarI.a(new jgg(new lfg(string, jggVar.b.d), jggVar.c, jggVar.d, jggVar.e));
        }
        this.f = fg7Var.u();
        q4c q4cVarB = q4cVar.b(new kgg(tg7VarI.i()));
        egg eggVar = q4cVarB.E;
        if (eggVar.D.isEmpty()) {
            return q4cVarB;
        }
        cgg cggVarC = eggVar.a().c();
        rrg it = eggVar.D.values().iterator();
        while (it.hasNext()) {
            xfg xfgVar = (xfg) it.next();
            lfg lfgVar2 = xfgVar.a;
            String str2 = (String) this.f.get(lfgVar2);
            if (str2 != null) {
                cggVarC.a(new xfg(new lfg(str2, lfgVar2.d), xfgVar.b));
            } else {
                cggVarC.a(xfgVar);
            }
        }
        return q4cVarB.j(cggVarC.b());
    }

    public final int U(u69 u69Var, a5c a5cVar, int i) {
        if (a5cVar.S(17)) {
            fde fdeVar = this.d;
            if (!fdeVar.z(u69Var, 17) && fdeVar.z(u69Var, 16)) {
                return a5cVar.t() + i;
            }
        }
        return i;
    }

    public final void V(ya7 ya7Var, int i, int i2, y89 y89Var) {
        u69 u69VarQ = this.d.q(ya7Var.asBinder());
        if (u69VarQ != null) {
            W(u69VarQ, i, i2, y89Var);
        }
    }

    public final void W(final u69 u69Var, final int i, final int i2, final y89 y89Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final o79 o79Var = (o79) this.c.get();
            if (o79Var != null && !o79Var.j()) {
                zxg.a0(o79Var.l, new Runnable() { // from class: r89
                    @Override // java.lang.Runnable
                    public final void run() {
                        fde fdeVar = this.a.d;
                        final u69 u69Var2 = u69Var;
                        int i3 = i2;
                        boolean z = fdeVar.z(u69Var2, i3);
                        final o79 o79Var2 = o79Var;
                        final int i4 = i;
                        if (!z) {
                            z89.X(o79Var2, u69Var2, i4, new yie(-4));
                            return;
                        }
                        usd usdVar = o79Var2.e;
                        o79Var2.t(u69Var2);
                        usdVar.getClass();
                        final y89 y89Var2 = y89Var;
                        if (i3 != 27) {
                            fdeVar.b(u69Var2, i3, new cr3() { // from class: u89
                                @Override // defpackage.cr3
                                public final ha8 run() {
                                    return (ha8) y89Var2.n(o79Var2, u69Var2, i4);
                                }
                            });
                        } else {
                            y89Var2.n(o79Var2, u69Var2, i4);
                            fdeVar.b(u69Var2, i3, new t89());
                        }
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.eb7
    public final void a(ya7 ya7Var, int i, Bundle bundle) {
        dr3 dr3Var;
        if (ya7Var == null || bundle == null) {
            return;
        }
        try {
            yie yieVarA = yie.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                fde fdeVar = this.d;
                IBinder iBinderAsBinder = ya7Var.asBinder();
                synchronized (fdeVar.a) {
                    try {
                        u69 u69VarQ = fdeVar.q(iBinderAsBinder);
                        dr3Var = u69VarQ != null ? (dr3) ((us) fdeVar.c).get(u69VarQ) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                dy dyVar = dr3Var != null ? dr3Var.b : null;
                if (dyVar == null) {
                    return;
                }
                dyVar.A(i, yieVarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.eb7
    public final void d(ya7 ya7Var, int i, Bundle bundle, boolean z) {
        if (ya7Var == null || bundle == null) {
            return;
        }
        try {
            V(ya7Var, i, 35, Y(new eq4(3, k20.a(bundle), z)));
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.eb7
    public final void e(ya7 ya7Var, int i) {
        u69 u69VarQ;
        if (ya7Var == null || (u69VarQ = this.d.q(ya7Var.asBinder())) == null) {
            return;
        }
        W(u69VarQ, i, 1, Y(new zz8(9)));
    }

    @Override // defpackage.eb7
    public final void h(ya7 ya7Var, int i, Bundle bundle, long j) {
        if (ya7Var == null || bundle == null) {
            return;
        }
        try {
            V(ya7Var, i, 31, new s89(new dq4(new ny1(k09.b(bundle), j, 8), 22, new p89(1)), 1));
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void i(ya7 ya7Var, u69 u69Var) {
        if (ya7Var == null) {
            v9j.b(ya7Var);
            return;
        }
        o79 o79Var = (o79) this.c.get();
        if (o79Var == null || o79Var.j()) {
            v9j.b(ya7Var);
        } else {
            this.e.add(u69Var);
            zxg.a0(o79Var.l, new u02(this, u69Var, o79Var, ya7Var, 11));
        }
    }

    @Override // defpackage.eb7
    public final void m(ya7 ya7Var, int i) {
        u69 u69VarQ;
        if (ya7Var == null || (u69VarQ = this.d.q(ya7Var.asBinder())) == null) {
            return;
        }
        W(u69VarQ, i, 1, Y(new dq4(this, 21, u69VarQ)));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        u69 u69VarQ;
        u69 u69VarQ2;
        u69 u69VarQ3;
        u69 u69VarQ4;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 3002:
                s(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                ya7 ya7VarI = vy8.i(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                if (ya7VarI != null && i4 >= 0) {
                    V(ya7VarI, i3, 25, Y(new cj4(i4, 10)));
                }
                return true;
            case 3004:
                ya7 ya7VarI2 = vy8.i(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                if (ya7VarI2 != null) {
                    V(ya7VarI2, i5, 26, Y(new zz8(11)));
                }
                return true;
            case 3005:
                ya7 ya7VarI3 = vy8.i(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                if (ya7VarI3 != null) {
                    V(ya7VarI3, i6, 26, Y(new zz8(21)));
                }
                return true;
            case 3006:
                ya7 ya7VarI4 = vy8.i(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                z = parcel.readInt() != 0;
                if (ya7VarI4 != null) {
                    V(ya7VarI4, i7, 26, Y(new j21(z, 7)));
                }
                return true;
            case 3007:
                L(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                h(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                L(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                x(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                x(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                p(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                ya7 ya7VarI5 = vy8.i(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                z = parcel.readInt() != 0;
                if (ya7VarI5 != null) {
                    V(ya7VarI5, i8, 1, Y(new j21(z, 6)));
                }
                return true;
            case 3014:
                a(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                K(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                ya7 ya7VarI6 = vy8.i(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                O(ya7VarI6, i9, (Bundle) dfi.a(parcel, creator), (Bundle) dfi.a(parcel, creator));
                return true;
            case 3017:
                ya7 ya7VarI7 = vy8.i(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                if (ya7VarI7 != null && (i11 == 2 || i11 == 0 || i11 == 1)) {
                    V(ya7VarI7, i10, 15, Y(new cj4(i11, 9)));
                }
                return true;
            case 3018:
                ya7 ya7VarI8 = vy8.i(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                z = parcel.readInt() != 0;
                if (ya7VarI8 != null) {
                    V(ya7VarI8, i12, 14, Y(new j21(z, 8)));
                }
                return true;
            case 3019:
                y(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                ya7 ya7VarI9 = vy8.i(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                if (ya7VarI9 != null && i14 >= 0 && i15 >= i14) {
                    V(ya7VarI9, i13, 20, new sl6(25, new l89(this, i14, i15)));
                }
                return true;
            case 3021:
                ya7 ya7VarI10 = vy8.i(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                if (ya7VarI10 != null) {
                    V(ya7VarI10, i16, 20, Y(new zz8(29)));
                }
                return true;
            case 3022:
                ya7 ya7VarI11 = vy8.i(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                if (ya7VarI11 != null && i18 >= 0 && i19 >= 0) {
                    V(ya7VarI11, i17, 20, Y(new sl5(i18, i19, 3)));
                }
                return true;
            case 3023:
                ya7 ya7VarI12 = vy8.i(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                final int i21 = parcel.readInt();
                final int i22 = parcel.readInt();
                final int i23 = parcel.readInt();
                if (ya7VarI12 != null && i21 >= 0 && i22 >= i21 && i23 >= 0) {
                    V(ya7VarI12, i20, 20, Y(new fu3() { // from class: o89
                        @Override // defpackage.fu3
                        public final void accept(Object obj) {
                            a5c a5cVar = (a5c) obj;
                            a5cVar.m0();
                            a5cVar.a.g1(i21, i22, i23);
                        }
                    }));
                }
                return true;
            case 3024:
                m(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                e(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                E(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                ya7 ya7VarI13 = vy8.i(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                Bundle bundle = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI13 != null && bundle != null) {
                    try {
                        V(ya7VarI13, i24, 13, Y(new hy8(new c3c(bundle.getFloat(c3c.e, 1.0f), bundle.getFloat(c3c.f, 1.0f)))));
                    } catch (RuntimeException e) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
                    }
                }
                return true;
            case 3028:
                r(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                ya7 ya7VarI14 = vy8.i(parcel.readStrongBinder());
                int i25 = parcel.readInt();
                Bundle bundle2 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI14 != null && bundle2 != null) {
                    try {
                        final k09 k09VarB = k09.b(bundle2);
                        final int i26 = 2;
                        V(ya7VarI14, i25, 20, new s89(new dq4(new y89() { // from class: n89
                            @Override // defpackage.y89
                            public final Object n(o79 o79Var, u69 u69Var, int i27) {
                                switch (i26) {
                                }
                                return o79Var.l(u69Var, wg7.m(k09VarB));
                            }
                        }, 23, new zz8(22)), 1));
                    } catch (RuntimeException e2) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    }
                }
                return true;
            case 3030:
                ya7 ya7VarI15 = vy8.i(parcel.readStrongBinder());
                int i27 = parcel.readInt();
                int i28 = parcel.readInt();
                Bundle bundle3 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI15 != null && bundle3 != null && i28 >= 0) {
                    try {
                        final k09 k09VarB2 = k09.b(bundle3);
                        final int i29 = 0;
                        V(ya7VarI15, i27, 20, new s89(new dq4(new y89() { // from class: n89
                            @Override // defpackage.y89
                            public final Object n(o79 o79Var, u69 u69Var, int i272) {
                                switch (i29) {
                                }
                                return o79Var.l(u69Var, wg7.m(k09VarB2));
                            }
                        }, 23, new m89(this, i28, 1)), 1));
                    } catch (RuntimeException e3) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
                    }
                }
                return true;
            case 3031:
                ya7 ya7VarI16 = vy8.i(parcel.readStrongBinder());
                int i30 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (ya7VarI16 != null && strongBinder != null) {
                    try {
                        wg7 wg7VarA = iw0.a(strongBinder);
                        tg7 tg7VarI = wg7.i();
                        for (int i31 = 0; i31 < wg7VarA.size(); i31++) {
                            Bundle bundle4 = (Bundle) wg7VarA.get(i31);
                            bundle4.getClass();
                            tg7VarI.a(k09.b(bundle4));
                        }
                        V(ya7VarI16, i30, 20, new s89(new dq4(new oh2(15, tg7VarI.i()), 23, new zz8(20)), 1));
                    } catch (RuntimeException e4) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                    }
                }
                return true;
            case 3032:
                ya7 ya7VarI17 = vy8.i(parcel.readStrongBinder());
                int i32 = parcel.readInt();
                int i33 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (ya7VarI17 != null && strongBinder2 != null && i33 >= 0) {
                    try {
                        wg7 wg7VarA2 = iw0.a(strongBinder2);
                        tg7 tg7VarI2 = wg7.i();
                        for (int i34 = 0; i34 < wg7VarA2.size(); i34++) {
                            Bundle bundle5 = (Bundle) wg7VarA2.get(i34);
                            bundle5.getClass();
                            tg7VarI2.a(k09.b(bundle5));
                        }
                        V(ya7VarI17, i32, 20, new s89(new dq4(new oh2(14, tg7VarI2.i()), 23, new m89(this, i33, 3)), 1));
                    } catch (RuntimeException e5) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                    }
                }
                return true;
            case 3033:
                ya7 ya7VarI18 = vy8.i(parcel.readStrongBinder());
                int i35 = parcel.readInt();
                Bundle bundle6 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI18 != null && bundle6 != null) {
                    try {
                        V(ya7VarI18, i35, 19, Y(new nl5(w19.b(bundle6))));
                    } catch (RuntimeException e6) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e6);
                    }
                }
                return true;
            case 3034:
                Q(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                G(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                B(vy8.i(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                ya7 ya7VarI19 = vy8.i(parcel.readStrongBinder());
                int i36 = parcel.readInt();
                int i37 = parcel.readInt();
                if (ya7VarI19 != null && i37 >= 0) {
                    V(ya7VarI19, i36, 10, new sl6(25, new m89(this, i37, 0)));
                }
                return true;
            case 3038:
                D(vy8.i(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                ya7 ya7VarI20 = vy8.i(parcel.readStrongBinder());
                int i38 = parcel.readInt();
                int i39 = parcel.readInt();
                long j = parcel.readLong();
                if (ya7VarI20 != null && i39 >= 0) {
                    V(ya7VarI20, i38, 10, new sl6(25, new lr5(this, i39, j, 2)));
                }
                return true;
            case 3040:
                ya7 ya7VarI21 = vy8.i(parcel.readStrongBinder());
                int i40 = parcel.readInt();
                if (ya7VarI21 != null && (u69VarQ = this.d.q(ya7VarI21.asBinder())) != null) {
                    W(u69VarQ, i40, 11, Y(new zz8(12)));
                }
                return true;
            case 3041:
                ya7 ya7VarI22 = vy8.i(parcel.readStrongBinder());
                int i41 = parcel.readInt();
                if (ya7VarI22 != null && (u69VarQ2 = this.d.q(ya7VarI22.asBinder())) != null) {
                    W(u69VarQ2, i41, 12, Y(new zz8(17)));
                }
                return true;
            case 3042:
                ya7 ya7VarI23 = vy8.i(parcel.readStrongBinder());
                int i42 = parcel.readInt();
                if (ya7VarI23 != null) {
                    V(ya7VarI23, i42, 6, Y(new zz8(15)));
                }
                return true;
            case 3043:
                ya7 ya7VarI24 = vy8.i(parcel.readStrongBinder());
                int i43 = parcel.readInt();
                if (ya7VarI24 != null) {
                    V(ya7VarI24, i43, 8, Y(new zz8(10)));
                }
                return true;
            case 3044:
                ya7 ya7VarI25 = vy8.i(parcel.readStrongBinder());
                int i44 = parcel.readInt();
                Surface surface = (Surface) dfi.a(parcel, Surface.CREATOR);
                if (ya7VarI25 != null) {
                    V(ya7VarI25, i44, 27, Y(new sl6(24, surface)));
                }
                return true;
            case 3045:
                M(vy8.i(parcel.readStrongBinder()));
                return true;
            case 3046:
                ya7 ya7VarI26 = vy8.i(parcel.readStrongBinder());
                int i45 = parcel.readInt();
                if (ya7VarI26 != null && (u69VarQ3 = this.d.q(ya7VarI26.asBinder())) != null) {
                    W(u69VarQ3, i45, 7, Y(new zz8(14)));
                }
                return true;
            case 3047:
                ya7 ya7VarI27 = vy8.i(parcel.readStrongBinder());
                int i46 = parcel.readInt();
                if (ya7VarI27 != null && (u69VarQ4 = this.d.q(ya7VarI27.asBinder())) != null) {
                    W(u69VarQ4, i46, 9, Y(new zz8(18)));
                }
                return true;
            case 3048:
                ya7 ya7VarI28 = vy8.i(parcel.readStrongBinder());
                int i47 = parcel.readInt();
                Bundle bundle7 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI28 != null && bundle7 != null) {
                    try {
                        V(ya7VarI28, i47, 29, Y(new dq4(this, 20, egg.b(bundle7))));
                    } catch (RuntimeException e7) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e7);
                    }
                }
                return true;
            case 3049:
                ya7 ya7VarI29 = vy8.i(parcel.readStrongBinder());
                int i48 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle8 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI29 != null && string != null && bundle8 != null) {
                    if (TextUtils.isEmpty(string)) {
                        a8i.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            A(ya7VarI29, i48, null, 40010, new s89(new zz8(string, 19, g8d.a(bundle8)), 1));
                        } catch (RuntimeException e8) {
                            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e8);
                        }
                    }
                }
                return true;
            case 3050:
                ya7 ya7VarI30 = vy8.i(parcel.readStrongBinder());
                int i49 = parcel.readInt();
                Bundle bundle9 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI30 != null && bundle9 != null) {
                    try {
                        g8d.a(bundle9);
                        A(ya7VarI30, i49, null, 40010, new s89(new p89(2), 1));
                    } catch (RuntimeException e9) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e9);
                    }
                }
                return true;
            case 3051:
                ya7 ya7VarI31 = vy8.i(parcel.readStrongBinder());
                int i50 = parcel.readInt();
                int i51 = parcel.readInt();
                int i52 = parcel.readInt();
                if (ya7VarI31 != null && i51 >= 0) {
                    V(ya7VarI31, i50, 33, Y(new sl5(i51, i52, 2)));
                }
                return true;
            case 3052:
                ya7 ya7VarI32 = vy8.i(parcel.readStrongBinder());
                int i53 = parcel.readInt();
                int i54 = parcel.readInt();
                if (ya7VarI32 != null) {
                    V(ya7VarI32, i53, 34, Y(new cj4(i54, 8)));
                }
                return true;
            case 3053:
                ya7 ya7VarI33 = vy8.i(parcel.readStrongBinder());
                int i55 = parcel.readInt();
                int i56 = parcel.readInt();
                if (ya7VarI33 != null) {
                    V(ya7VarI33, i55, 34, Y(new cj4(i56, 7)));
                }
                return true;
            case 3054:
                ya7 ya7VarI34 = vy8.i(parcel.readStrongBinder());
                int i57 = parcel.readInt();
                z = parcel.readInt() != 0;
                int i58 = parcel.readInt();
                if (ya7VarI34 != null) {
                    V(ya7VarI34, i57, 34, Y(new wl5(z, i58)));
                }
                return true;
            case 3055:
                ya7 ya7VarI35 = vy8.i(parcel.readStrongBinder());
                int i59 = parcel.readInt();
                int i60 = parcel.readInt();
                Bundle bundle10 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                if (ya7VarI35 != null && bundle10 != null && i60 >= 0) {
                    try {
                        final k09 k09VarB3 = k09.b(bundle10);
                        final int i61 = 1;
                        V(ya7VarI35, i59, 20, new s89(new dq4(new y89() { // from class: n89
                            @Override // defpackage.y89
                            public final Object n(o79 o79Var, u69 u69Var, int i272) {
                                switch (i61) {
                                }
                                return o79Var.l(u69Var, wg7.m(k09VarB3));
                            }
                        }, 23, new m89(this, i60, 2)), 1));
                    } catch (RuntimeException e10) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                    }
                }
                return true;
            case 3056:
                ya7 ya7VarI36 = vy8.i(parcel.readStrongBinder());
                int i62 = parcel.readInt();
                int i63 = parcel.readInt();
                int i64 = parcel.readInt();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (ya7VarI36 != null && strongBinder3 != null && i63 >= 0 && i64 >= i63) {
                    try {
                        wg7 wg7VarA3 = iw0.a(strongBinder3);
                        tg7 tg7VarI3 = wg7.i();
                        for (int i65 = 0; i65 < wg7VarA3.size(); i65++) {
                            Bundle bundle11 = (Bundle) wg7VarA3.get(i65);
                            bundle11.getClass();
                            tg7VarI3.a(k09.b(bundle11));
                        }
                        V(ya7VarI36, i62, 20, new s89(new dq4(new sl6(23, tg7VarI3.i()), 23, new l89(this, i63, i64)), 1));
                    } catch (RuntimeException e11) {
                        a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                    }
                }
                return true;
            case 3057:
                d(vy8.i(parcel.readStrongBinder()), parcel.readInt(), (Bundle) dfi.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            default:
                switch (i) {
                    case 4001:
                        ya7 ya7VarI37 = vy8.i(parcel.readStrongBinder());
                        int i66 = parcel.readInt();
                        Bundle bundle12 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                        if (ya7VarI37 != null) {
                            if (bundle12 == null) {
                                A(ya7VarI37, i66, null, 50000, new s89(new zz8(25), 0));
                            } else {
                                try {
                                    f19.a(bundle12);
                                    A(ya7VarI37, i66, null, 50000, new s89(new zz8(25), 0));
                                } catch (RuntimeException e12) {
                                    a8i.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                }
                            }
                        }
                        return true;
                    case 4002:
                        ya7 ya7VarI38 = vy8.i(parcel.readStrongBinder());
                        int i67 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (ya7VarI38 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                a8i.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            A(ya7VarI38, i67, null, 50004, new s89(new zz8(16), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        ya7 ya7VarI39 = vy8.i(parcel.readStrongBinder());
                        int i68 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i69 = parcel.readInt();
                        int i70 = parcel.readInt();
                        Bundle bundle13 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                        if (ya7VarI39 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                a8i.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i69 < 0) {
                                a8i.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i70 < 1) {
                                a8i.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle13 == null) {
                                A(ya7VarI39, i68, null, 50003, new s89(new zz8(8), 0));
                            } else {
                                try {
                                    f19.a(bundle13);
                                    A(ya7VarI39, i68, null, 50003, new s89(new zz8(8), 0));
                                } catch (RuntimeException e13) {
                                    a8i.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e13);
                                }
                            }
                        }
                        return true;
                    case 4004:
                        ya7 ya7VarI40 = vy8.i(parcel.readStrongBinder());
                        int i71 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle14 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                        if (ya7VarI40 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                a8i.l("MediaSessionStub", "search(): Ignoring empty query");
                            } else if (bundle14 == null) {
                                int i72 = 0;
                                A(ya7VarI40, i71, null, 50005, new s89(new p89(i72), i72));
                            } else {
                                try {
                                    f19.a(bundle14);
                                    int i722 = 0;
                                    A(ya7VarI40, i71, null, 50005, new s89(new p89(i722), i722));
                                } catch (RuntimeException e14) {
                                    a8i.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e14);
                                }
                            }
                        }
                        return true;
                    case 4005:
                        ya7 ya7VarI41 = vy8.i(parcel.readStrongBinder());
                        int i73 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i74 = parcel.readInt();
                        int i75 = parcel.readInt();
                        Bundle bundle15 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                        if (ya7VarI41 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                a8i.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i74 < 0) {
                                a8i.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i75 < 1) {
                                a8i.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle15 == null) {
                                A(ya7VarI41, i73, null, 50006, new s89(new zz8(23), 0));
                            } else {
                                try {
                                    f19.a(bundle15);
                                    A(ya7VarI41, i73, null, 50006, new s89(new zz8(23), 0));
                                } catch (RuntimeException e15) {
                                    a8i.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e15);
                                }
                            }
                        }
                        return true;
                    case 4006:
                        ya7 ya7VarI42 = vy8.i(parcel.readStrongBinder());
                        int i76 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle16 = (Bundle) dfi.a(parcel, Bundle.CREATOR);
                        if (ya7VarI42 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                a8i.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else if (bundle16 == null) {
                                A(ya7VarI42, i76, null, 50001, new s89(new zz8(28), 0));
                            } else {
                                try {
                                    f19.a(bundle16);
                                    A(ya7VarI42, i76, null, 50001, new s89(new zz8(28), 0));
                                } catch (RuntimeException e16) {
                                    a8i.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e16);
                                }
                            }
                        }
                        return true;
                    case 4007:
                        ya7 ya7VarI43 = vy8.i(parcel.readStrongBinder());
                        int i77 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (ya7VarI43 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                a8i.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            A(ya7VarI43, i77, null, 50002, new s89(new zz8(7), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.eb7
    public final void p(ya7 ya7Var, int i, IBinder iBinder, int i2, long j) {
        if (ya7Var == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                wg7 wg7VarA = iw0.a(iBinder);
                tg7 tg7VarI = wg7.i();
                for (int i3 = 0; i3 < wg7VarA.size(); i3++) {
                    Bundle bundle = (Bundle) wg7VarA.get(i3);
                    bundle.getClass();
                    tg7VarI.a(k09.b(bundle));
                }
                V(ya7Var, i, 20, new s89(new dq4(new lr5(tg7VarI.i(), i2, j, 3), 22, new p89(1)), 1));
            } catch (RuntimeException e) {
                a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.eb7
    public final void r(ya7 ya7Var, int i, float f) {
        if (ya7Var == null || f <= 0.0f) {
            return;
        }
        V(ya7Var, i, 13, Y(new ll5(3, f)));
    }

    @Override // defpackage.eb7
    public final void s(ya7 ya7Var, int i, float f) {
        if (ya7Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        V(ya7Var, i, 24, Y(new ll5(4, f)));
    }

    @Override // defpackage.eb7
    public final void x(ya7 ya7Var, int i, IBinder iBinder, boolean z) {
        if (ya7Var == null || iBinder == null) {
            return;
        }
        try {
            wg7 wg7VarA = iw0.a(iBinder);
            tg7 tg7VarI = wg7.i();
            for (int i2 = 0; i2 < wg7VarA.size(); i2++) {
                Bundle bundle = (Bundle) wg7VarA.get(i2);
                bundle.getClass();
                tg7VarI.a(k09.b(bundle));
            }
            V(ya7Var, i, 20, new s89(new dq4(new eq4(4, tg7VarI.i(), z), 22, new p89(1)), 1));
        } catch (RuntimeException e) {
            a8i.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.eb7
    public final void y(ya7 ya7Var, int i, int i2) {
        if (ya7Var == null || i2 < 0) {
            return;
        }
        V(ya7Var, i, 20, new sl6(25, new m89(this, i2, 4)));
    }
}
