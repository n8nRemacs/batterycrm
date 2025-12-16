package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class x79 implements qn6, t69, h37 {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public Object o;

    @Override // defpackage.qn6
    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        z79 z79Var = (z79) ((x79) this.o).o;
        if (this != z79Var.q) {
            return;
        }
        z79.D(z79Var.k, i28.l((w19) this.a, (String) this.b, (Uri) this.c, this.d, bitmap));
        o79 o79Var = z79Var.g;
        zxg.a0(o79Var.o, new i79(o79Var, 1));
    }

    @Override // defpackage.t69
    public void c(int i, PendingIntent pendingIntent) {
        ((b79) ((z79) this.o).k.b).a.setSessionActivity(pendingIntent);
    }

    @Override // defpackage.t69
    public void d(int i, aie aieVar) {
        Bundle bundle = Bundle.EMPTY;
        h79 h79Var = ((z79) this.o).k;
        String str = aieVar.b;
        h79Var.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((b79) h79Var.b).a.sendSessionEvent(str, bundle);
    }

    @Override // defpackage.t69
    public void f(int i, o3c o3cVar) {
        z79 z79Var = (z79) this.o;
        a5c a5cVar = z79Var.g.t;
        int i2 = a5cVar.S(20) ? 4 : 0;
        if (z79Var.r != i2) {
            z79Var.r = i2;
            ((b79) z79Var.k.b).a.setFlags(i2 | 3);
        }
        z79Var.M(a5cVar);
    }

    @Override // defpackage.t69
    public void i(int i, wie wieVar, boolean z, boolean z2, int i2) {
        z79 z79Var = (z79) this.o;
        z79Var.M(z79Var.g.t);
    }

    public void j(k20 k20Var) {
        z79 z79Var = (z79) this.o;
        if (z79Var.g.t.H().a == 0) {
            int iT = i28.t(k20Var);
            b79 b79Var = (b79) z79Var.k.b;
            b79Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iT);
            b79Var.a.setPlaybackToLocal(builder.build());
        }
    }

    public void k() {
        int i;
        v79 v79Var;
        z79 z79Var = (z79) this.o;
        h79 h79Var = z79Var.k;
        a5c a5cVar = z79Var.g.t;
        if (a5cVar.H().a == 0) {
            v79Var = null;
        } else {
            o3c o3cVarZ = a5cVar.z();
            if (o3cVarZ.a.a(26, 34)) {
                i = o3cVarZ.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            int i2 = i;
            Handler handler = new Handler(a5cVar.a.E0);
            if (a5cVar.S(23)) {
                a5cVar.I();
            }
            mv4 mv4VarH = a5cVar.H();
            v79Var = new v79(i2, mv4VarH.c, 0, mv4VarH.d, handler, a5cVar);
        }
        z79Var.n = v79Var;
        if (v79Var != null) {
            ((b79) h79Var.b).a.setPlaybackToRemote(v79Var.a());
            return;
        }
        int iT = i28.t(a5cVar.S(21) ? a5cVar.w() : k20.h);
        b79 b79Var = (b79) h79Var.b;
        b79Var.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(iT);
        b79Var.a.setPlaybackToLocal(builder.build());
    }

    public void l(k09 k09Var) {
        z79 z79Var = (z79) this.o;
        h79 h79Var = z79Var.k;
        s();
        if (k09Var == null) {
            ((b79) h79Var.b).a.setRatingType(0);
        } else {
            ((b79) h79Var.b).a.setRatingType(i28.u(k09Var.d.i));
        }
        z79Var.M(z79Var.g.t);
    }

    public void m(int i, a5c a5cVar) {
        z79 z79Var = (z79) this.o;
        r(a5cVar.G());
        o(a5cVar.S(18) ? a5cVar.L() : w19.K);
        a5cVar.J();
        s();
        q(a5cVar.y());
        p(a5cVar.getRepeatMode());
        a5cVar.H();
        k();
        int i2 = a5cVar.S(20) ? 4 : 0;
        if (z79Var.r != i2) {
            z79Var.r = i2;
            ((b79) z79Var.k.b).a.setFlags(i2 | 3);
        }
        l(a5cVar.F());
    }

    @Override // defpackage.h37
    public g37 n() {
        int iOrdinal = ((rs4) this.a).ordinal();
        if (iOrdinal == 0) {
            return (a1b) ((bwf) this.c).getValue();
        }
        if (iOrdinal == 1) {
            return (y0b) ((bwf) this.o).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void o(w19 w19Var) {
        z79 z79Var = (z79) this.o;
        h79 h79Var = z79Var.k;
        CharSequence queueTitle = ((tx8) ((i5i) h79Var.c).a).a.getQueueTitle();
        CharSequence charSequence = w19Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        a5c a5cVar = z79Var.g.t;
        if (!z79Var.w.a(17) || !a5cVar.z().a(17)) {
            charSequence = null;
        }
        ((b79) h79Var.b).a.setQueueTitle(charSequence);
    }

    @Override // defpackage.t69
    public void onDisconnected() {
    }

    @Override // defpackage.qn6
    public void onFailure(Throwable th) {
        if (this != ((z79) ((x79) this.o).o).q) {
            return;
        }
        a8i.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public void p(int i) {
        h79 h79Var = ((z79) this.o).k;
        int iN = i28.n(i);
        b79 b79Var = (b79) h79Var.b;
        if (b79Var.j != iN) {
            b79Var.j = iN;
            synchronized (b79Var.d) {
                for (int iBeginBroadcast = b79Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((ab7) b79Var.f.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(iN);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                b79Var.f.finishBroadcast();
            }
        }
    }

    public void q(boolean z) {
        h79 h79Var = ((z79) this.o).k;
        hh7 hh7Var = i28.a;
        b79 b79Var = (b79) h79Var.b;
        if (b79Var.k != z) {
            b79Var.k = z ? 1 : 0;
            synchronized (b79Var.d) {
                for (int iBeginBroadcast = b79Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((ab7) b79Var.f.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(z ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                b79Var.f.finishBroadcast();
            }
        }
    }

    public void r(s9g s9gVar) throws Throwable {
        t(s9gVar);
        s();
    }

    public void s() {
        ha8 ha8VarE;
        Bitmap bitmap;
        Uri uri;
        z79 z79Var = (z79) this.o;
        o79 o79Var = z79Var.g;
        a5c a5cVar = o79Var.t;
        k09 k09VarF = a5cVar.F();
        w19 w19VarJ = a5cVar.J();
        long duration = -9223372036854775807L;
        if ((!a5cVar.S(16) || !a5cVar.O()) && a5cVar.S(16)) {
            duration = a5cVar.getDuration();
        }
        String str = k09VarF != null ? k09VarF.a : "";
        Uri uri2 = (k09VarF == null || (uri = k09VarF.f.a) == null) ? null : uri;
        if (Objects.equals((w19) this.a, w19VarJ) && Objects.equals((String) this.b, str) && Objects.equals((Uri) this.c, uri2) && this.d == duration) {
            return;
        }
        this.b = str;
        this.c = uri2;
        this.a = w19VarJ;
        this.d = duration;
        h79 h79Var = o79Var.m;
        h79Var.getClass();
        byte[] bArr = w19VarJ.k;
        if (bArr != null) {
            ha8VarE = h79Var.q(bArr);
        } else {
            Uri uri3 = w19VarJ.m;
            ha8VarE = uri3 != null ? h79Var.e(uri3) : null;
        }
        if (ha8VarE != null) {
            z79Var.q = null;
            if (ha8VarE.isDone()) {
                try {
                    bitmap = (Bitmap) a6a.a(ha8VarE);
                } catch (CancellationException | ExecutionException e) {
                    a8i.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                x79 x79Var = new x79();
                x79Var.o = this;
                x79Var.a = w19VarJ;
                x79Var.b = str;
                x79Var.c = uri2;
                x79Var.d = duration;
                z79Var.q = x79Var;
                Handler handler = o79Var.l;
                Objects.requireNonNull(handler);
                ha8VarE.d(new yn6(ha8VarE, 0, x79Var), new fv1(1, handler));
            }
            bitmap = null;
        } else {
            bitmap = null;
        }
        z79.D(z79Var.k, i28.l(w19VarJ, str, uri2, duration, bitmap));
    }

    public void t(s9g s9gVar) throws Throwable {
        z79 z79Var = (z79) this.o;
        o79 o79Var = z79Var.g;
        a5c a5cVar = o79Var.t;
        if (!z79Var.w.a(17) || !a5cVar.z().a(17) || s9gVar.p()) {
            z79.C(z79Var.k, null);
            return;
        }
        hh7 hh7Var = i28.a;
        ArrayList arrayList = new ArrayList();
        q9g q9gVar = new q9g();
        for (int i = 0; i < s9gVar.o(); i++) {
            arrayList.add(s9gVar.m(i, q9gVar, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        u02 u02Var = new u02(this, new AtomicInteger(0), arrayList, arrayList2, 9);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((k09) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                u02Var.run();
            } else {
                ha8 ha8VarQ = o79Var.m.q(bArr);
                arrayList2.add(ha8VarQ);
                Handler handler = o79Var.l;
                Objects.requireNonNull(handler);
                ha8VarQ.d(u02Var, new fv1(1, handler));
            }
        }
    }
}
