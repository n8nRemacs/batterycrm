package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m79 implements r3c {
    public final WeakReference a;
    public final WeakReference b;

    public m79(o79 o79Var, a5c a5cVar) {
        this.a = new WeakReference(o79Var);
        this.b = new WeakReference(a5cVar);
    }

    @Override // defpackage.r3c
    public final void A(egg eggVar) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.s = o79VarA.s.j(eggVar);
        o79VarA.c.a(true, true);
        o79VarA.d(new zz8(6));
    }

    @Override // defpackage.r3c
    public final void A0(c3c c3cVar) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.s = o79VarA.s.d(c3cVar);
        o79VarA.c.a(true, true);
        try {
            z79 z79Var = (z79) o79VarA.h.i.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void B0(o3c o3cVar) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.f(o3cVar);
    }

    @Override // defpackage.r3c
    public final void E0(mv4 mv4Var) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.k();
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.k();
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void F0(long j) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j2 = q4cVar.A;
        long j3 = q4cVar.B;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        if (!s9gVar.p()) {
            eggVar = eggVar2;
            if (wieVar.a.b >= s9gVar.o()) {
                z = false;
            }
            hsi.g(z);
            o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j2, j3, j, kggVar, eggVar);
            o79VarA.c.a(true, true);
        }
        eggVar = eggVar2;
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j2, j3, j, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void G0(k09 k09Var, int i) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.l(k09Var);
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.l(k09Var);
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                z79 z79Var = (z79) o79VarA.h.i.o;
                z79Var.M(z79Var.g.t);
                return;
            }
            eggVar = eggVar2;
            z79 z79Var2 = (z79) o79VarA.h.i.o;
            z79Var2.M(z79Var2.g.t);
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void T(boolean z) {
        egg eggVar;
        boolean z2;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z2 = false;
                }
                hsi.g(z2);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.q(z);
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.q(z);
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z2 = true;
        hsi.g(z2);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void W(ib4 ib4Var) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        if (!s9gVar.p()) {
            eggVar = eggVar2;
            if (wieVar.a.b >= s9gVar.o()) {
                z = false;
            }
            hsi.g(z);
            o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
            o79VarA.c.a(true, true);
        }
        eggVar = eggVar2;
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    public final o79 a() {
        return (o79) this.a.get();
    }

    @Override // defpackage.r3c
    public final void c() {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        fde fdeVar = o79VarA.g.d;
        wg7 wg7VarP = fdeVar.p();
        for (int i = 0; i < wg7VarP.size(); i++) {
            u69 u69Var = (u69) wg7VarP.get(i);
            fdeVar.s(u69Var);
            o79VarA.c(u69Var, new zz8(5));
        }
    }

    @Override // defpackage.r3c
    public final void e0(kgg kggVar) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.s = o79VarA.s.b(kggVar);
        o79VarA.c.a(true, false);
        o79VarA.d(new zz8(4));
    }

    @Override // defpackage.r3c
    public final void f(int i) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        o79VarA.s = q4cVar.c(q4cVar.u, i, q4cVar.t);
        o79VarA.c.a(true, true);
        try {
            z79 z79Var = (z79) o79VarA.h.i.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void g(sch schVar) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z2 = q4cVar.s;
        boolean z3 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z4 = q4cVar.v;
        boolean z5 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar = q4cVar.E;
        hsi.g(s9gVar.p() || wieVar.a.b < s9gVar.o());
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z2, z3, i6, i7, i8, z4, z5, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
        try {
            o79VarA.h.i.getClass();
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void h(boolean z) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar = q4cVar.E;
        hsi.g(s9gVar.p() || wieVar.a.b < s9gVar.o());
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
        try {
            o79VarA.h.i.getClass();
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
        o79VarA.u();
    }

    @Override // defpackage.r3c
    public final void h0(long j) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.getClass();
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.getClass();
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void i(int i, boolean z) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        o79VarA.s = q4cVar.c(i, q4cVar.x, z);
        o79VarA.c.a(true, true);
        try {
            z79 z79Var = (z79) o79VarA.h.i.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void i0(w19 w19Var) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var2 = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var2, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.s();
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.s();
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var2, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void j(float f) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        o79VarA.s = o79VarA.s.k(f);
        o79VarA.c.a(true, true);
        try {
            o79VarA.h.i.getClass();
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void j0(w19 w19Var) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.o(w19Var);
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.o(w19Var);
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void k(int i) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        a5c a5cVar = (a5c) this.b.get();
        if (a5cVar == null) {
            return;
        }
        o79VarA.s = o79VarA.s.e(i, a5cVar.n());
        o79VarA.c.a(true, true);
        try {
            x79 x79Var = o79VarA.h.i;
            a5cVar.n();
            z79 z79Var = (z79) x79Var.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void k0(long j) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j2 = q4cVar.A;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j2, j, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.getClass();
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.getClass();
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j2, j, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.r3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r39, boolean r40) {
        /*
            r38 = this;
            o79 r0 = r38.a()
            if (r0 != 0) goto L8
            goto Lc2
        L8:
            r0.v()
            r1 = r38
            java.lang.ref.WeakReference r2 = r1.b
            java.lang.Object r2 = r2.get()
            a5c r2 = (defpackage.a5c) r2
            if (r2 != 0) goto L19
            goto Lc2
        L19:
            q4c r2 = r0.s
            androidx.media3.common.PlaybackException r4 = r2.a
            int r5 = r2.b
            wie r6 = r2.c
            t3c r7 = r2.d
            t3c r8 = r2.e
            int r9 = r2.f
            c3c r10 = r2.g
            int r11 = r2.h
            boolean r12 = r2.i
            s9g r14 = r2.j
            int r15 = r2.k
            sch r13 = r2.l
            w19 r3 = r2.m
            float r1 = r2.n
            r17 = r1
            k20 r1 = r2.o
            r18 = r1
            ib4 r1 = r2.p
            r19 = r1
            mv4 r1 = r2.q
            r20 = r1
            boolean r1 = r2.t
            r23 = r1
            int r1 = r2.u
            r24 = r1
            boolean r1 = r2.v
            r27 = r1
            boolean r1 = r2.w
            r28 = r1
            int r1 = r2.x
            r25 = r1
            int r1 = r2.y
            r26 = r1
            w19 r1 = r2.z
            r21 = r3
            r16 = r4
            long r3 = r2.A
            r30 = r3
            long r3 = r2.B
            r32 = r3
            long r3 = r2.C
            r29 = r1
            kgg r1 = r2.D
            egg r2 = r2.E
            boolean r22 = r14.p()
            r36 = r1
            if (r22 != 0) goto L8a
            t3c r1 = r6.a
            int r1 = r1.b
            r37 = r2
            int r2 = r14.o()
            if (r1 >= r2) goto L88
            goto L8c
        L88:
            r1 = 0
            goto L8d
        L8a:
            r37 = r2
        L8c:
            r1 = 1
        L8d:
            defpackage.hsi.g(r1)
            r34 = r3
            q4c r3 = new q4c
            r22 = r40
            r4 = r16
            r16 = r21
            r21 = r39
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r37)
            r0.s = r3
            l79 r1 = r0.c
            r2 = 1
            r1.a(r2, r2)
            z79 r0 = r0.h     // Catch: android.os.RemoteException -> Lc3
            x79 r0 = r0.i     // Catch: android.os.RemoteException -> Lc3
            java.lang.Object r0 = r0.o     // Catch: android.os.RemoteException -> Lc3
            z79 r0 = (defpackage.z79) r0     // Catch: android.os.RemoteException -> Lc3
            v79 r0 = r0.n     // Catch: android.os.RemoteException -> Lc3
            if (r0 == 0) goto Lc2
            if (r40 == 0) goto Lb7
            r1 = 0
            goto Lb9
        Lb7:
            r1 = r39
        Lb9:
            r0.d = r1     // Catch: android.os.RemoteException -> Lc3
            android.media.VolumeProvider r0 = r0.a()     // Catch: android.os.RemoteException -> Lc3
            r0.setCurrentVolume(r1)     // Catch: android.os.RemoteException -> Lc3
        Lc2:
            return
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "MediaSessionImpl"
            java.lang.String r2 = "Exception in using media1 API"
            defpackage.a8i.h(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.l(int, boolean):void");
    }

    @Override // defpackage.r3c
    public final void n0(s9g s9gVar, int i) throws Throwable {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        a5c a5cVar = (a5c) this.b.get();
        if (a5cVar == null) {
            return;
        }
        o79VarA.s = o79VarA.s.i(s9gVar, a5cVar.m(), i);
        o79VarA.c.a(false, true);
        try {
            o79VarA.h.i.r(s9gVar);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void onRepeatModeChanged(int i) {
        egg eggVar;
        boolean z;
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i2 = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i3 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        try {
            if (!s9gVar.p()) {
                eggVar = eggVar2;
                if (wieVar.a.b >= s9gVar.o()) {
                    z = false;
                }
                hsi.g(z);
                o79VarA.s = new q4c(playbackException, i2, wieVar, t3cVar, t3cVar2, i3, c3cVar, i, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
                o79VarA.c.a(true, true);
                o79VarA.h.i.p(i);
                return;
            }
            eggVar = eggVar2;
            o79VarA.h.i.p(i);
            return;
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        hsi.g(z);
        o79VarA.s = new q4c(playbackException, i2, wieVar, t3cVar, t3cVar2, i3, c3cVar, i, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
    }

    @Override // defpackage.r3c
    public final void q(boolean z) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        q4c q4cVar = o79VarA.s;
        PlaybackException playbackException = q4cVar.a;
        int i = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i2 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        s9g s9gVar = q4cVar.j;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar = q4cVar.E;
        hsi.g(s9gVar.p() || wieVar.a.b < s9gVar.o());
        o79VarA.s = new q4c(playbackException, i, wieVar, t3cVar, t3cVar2, i2, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z, z5, w19Var2, j, j2, j3, kggVar, eggVar);
        o79VarA.c.a(true, true);
        try {
            z79 z79Var = (z79) o79VarA.h.i.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
        o79VarA.u();
    }

    @Override // defpackage.r3c
    public final void t(t3c t3cVar, t3c t3cVar2, int i) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.s = o79VarA.s.f(t3cVar, t3cVar2, i);
        o79VarA.c.a(true, true);
        try {
            z79 z79Var = (z79) o79VarA.h.i.o;
            z79Var.M(z79Var.g.t);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.r3c
    public final void y(k20 k20Var) {
        o79 o79VarA = a();
        if (o79VarA == null) {
            return;
        }
        o79VarA.v();
        if (((a5c) this.b.get()) == null) {
            return;
        }
        o79VarA.s = o79VarA.s.a(k20Var);
        o79VarA.c.a(true, true);
        try {
            o79VarA.h.i.j(k20Var);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }
}
