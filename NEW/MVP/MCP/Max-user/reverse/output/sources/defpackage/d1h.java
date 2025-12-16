package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class d1h implements hdh {
    public final WeakReference X;
    public final yk8 Y;
    public final boolean Z;
    public final String a;
    public final long b;
    public final cbh c;
    public final k4c d;
    public final g2h o;

    public d1h(String str, long j, cbh cbhVar, k4c k4cVar, g2h g2hVar, WeakReference weakReference, fj2 fj2Var, boolean z) {
        this.a = str;
        this.b = j;
        this.c = cbhVar;
        this.d = k4cVar;
        this.o = g2hVar;
        this.X = weakReference;
        this.Y = fj2Var;
        this.Z = z;
    }

    @Override // defpackage.hdh
    public final int B() {
        return 2;
    }

    @Override // defpackage.hdh
    public final int F() {
        return this.o.getHeight();
    }

    @Override // defpackage.hdh
    public final void J(Surface surface, a3h a3hVar) {
        String name = d1h.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                long j = this.b;
                String str = this.a;
                boolean zD = this.c.d();
                StringBuilder sbN = ho7.n("Player autoplay. Surface created, \n                            |msgId:", j, ", \n                            |attachId:", str);
                sbN.append("\n                            |playing:");
                sbN.append(zD);
                l6bVar.c(lg8Var, name, wmf.e(sbN.toString()), null);
            }
        }
        this.c.a0(surface);
        this.c.O(a3hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1h)) {
            return false;
        }
        d1h d1hVar = (d1h) obj;
        return fni.a(this.a, d1hVar.a) && this.b == d1hVar.b && fni.a(this.c, d1hVar.c) && fni.a(this.d, d1hVar.d) && this.o.equals(d1hVar.o) && this.X.equals(d1hVar.X) && fni.a(this.Y, d1hVar.Y) && this.Z == d1hVar.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + ((this.Y.hashCode() + ((this.X.hashCode() + ((this.o.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + a9h.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.hdh
    public final int m() {
        return this.o.getWidth();
    }

    @Override // defpackage.hdh
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = d1h.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                long j = this.b;
                String str = this.a;
                boolean zD = this.c.d();
                int iG = this.Y.g();
                StringBuilder sbN = ho7.n("Player autoplay. Surface destroyed, \n                            |msgId:", j, ", \n                            |attachId:", str);
                sbN.append("\n                            |playing:");
                sbN.append(zD);
                sbN.append("\n                            |states:");
                sbN.append(iG);
                l6bVar.c(lg8Var, name, wmf.e(sbN.toString()), null);
            }
        }
        this.d.a(this.c);
        qdh qdhVar = (qdh) this.X.get();
        if (qdhVar != null) {
            qdhVar.w();
        }
        this.Y.e(this.a);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("PlayingState(attachId=", this.b, this.a, ", messageId=");
        sbQ.append(", player=");
        sbQ.append(this.c);
        sbQ.append(", playerHolder=");
        sbQ.append(this.d);
        sbQ.append(", videoContent=");
        sbQ.append(this.o);
        sbQ.append(", weakViewRef=");
        sbQ.append(this.X);
        sbQ.append(", states=");
        sbQ.append(this.Y);
        sbQ.append(", isGif=");
        sbQ.append(this.Z);
        sbQ.append(")");
        return sbQ.toString();
    }
}
