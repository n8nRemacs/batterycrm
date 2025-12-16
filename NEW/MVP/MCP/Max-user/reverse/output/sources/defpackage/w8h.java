package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class w8h implements hdh {
    public long Y;
    public final cbh Z;
    public final long a;
    public final long b;
    public final String c;
    public final g2h d;
    public final k4c s0;
    public v8h o = v8h.a;
    public float X = 0.0f;

    public w8h(long j, long j2, String str, g2h g2hVar, long j3, cbh cbhVar, z2f z2fVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = g2hVar;
        this.Y = j3;
        this.Z = cbhVar;
        this.s0 = z2fVar;
    }

    @Override // defpackage.hdh
    public final int B() {
        return 3;
    }

    @Override // defpackage.hdh
    public final int F() {
        return this.d.getHeight();
    }

    @Override // defpackage.hdh
    public final void J(Surface surface, a3h a3hVar) {
        cbh cbhVar = this.Z;
        cbhVar.a0(surface);
        cbhVar.O(a3hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8h)) {
            return false;
        }
        w8h w8hVar = (w8h) obj;
        return this.a == w8hVar.a && this.b == w8hVar.b && fni.a(this.c, w8hVar.c) && fni.a(this.d, w8hVar.d) && this.o == w8hVar.o && Float.compare(this.X, w8hVar.X) == 0 && this.Y == w8hVar.Y && fni.a(this.Z, w8hVar.Z) && fni.a(this.s0, w8hVar.s0);
    }

    public final int hashCode() {
        return this.s0.hashCode() + ((this.Z.hashCode() + a9h.a(hf3.b((this.o.hashCode() + ((this.d.hashCode() + u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, this.X, 31), 31, this.Y)) * 31);
    }

    @Override // defpackage.hdh
    public final int m() {
        return this.d.getWidth();
    }

    @Override // defpackage.hdh
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.Z.a0(null);
    }

    public final String toString() {
        v8h v8hVar = this.o;
        float f = this.X;
        long j = this.Y;
        StringBuilder sbL = az1.l(this.a, "VideoMessageState(localChatId=", ", messageId=");
        hf3.e(this.b, ", attachId=", this.c, sbL);
        sbL.append(", videoContent=");
        sbL.append(this.d);
        sbL.append(", state=");
        sbL.append(v8hVar);
        sbL.append(", progress=");
        sbL.append(f);
        sbL.append(", durationProgress=");
        sbL.append(j);
        sbL.append(", player=");
        sbL.append(this.Z);
        sbL.append(", playerHolder=");
        sbL.append(this.s0);
        sbL.append(")");
        return sbL.toString();
    }
}
