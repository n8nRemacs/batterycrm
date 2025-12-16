package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class yj4 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        hm5 hm5Var;
        ak4 ak4Var;
        y6i y6iVar;
        im5 im5Var;
        switch (this.a) {
            case 0:
                fsi.d(audioTrack == ((zj4) ((jkc) this.b).c).u);
                zj4 zj4Var = (zj4) ((jkc) this.b).c;
                x6i x6iVar = zj4Var.r;
                if (x6iVar != null && zj4Var.U && (hm5Var = ((lw8) x6iVar.b).Y1) != null) {
                    hm5Var.a.Z.c(2);
                    break;
                }
                break;
            default:
                if (audioTrack.equals(((ak4) ((u5i) this.b).c).w) && (y6iVar = (ak4Var = (ak4) ((u5i) this.b).c).s) != null && ak4Var.U && (im5Var = ((mw8) y6iVar.b).R0) != null) {
                    im5Var.a();
                    break;
                }
                break;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.a) {
            case 1:
                if (audioTrack.equals(((ak4) ((u5i) this.b).c).w)) {
                    ((ak4) ((u5i) this.b).c).T = true;
                    break;
                }
                break;
            default:
                super.onPresentationEnded(audioTrack);
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        hm5 hm5Var;
        ak4 ak4Var;
        y6i y6iVar;
        im5 im5Var;
        switch (this.a) {
            case 0:
                fsi.d(audioTrack == ((zj4) ((jkc) this.b).c).u);
                zj4 zj4Var = (zj4) ((jkc) this.b).c;
                x6i x6iVar = zj4Var.r;
                if (x6iVar != null && zj4Var.U && (hm5Var = ((lw8) x6iVar.b).Y1) != null) {
                    hm5Var.a.Z.c(2);
                    break;
                }
                break;
            default:
                if (audioTrack.equals(((ak4) ((u5i) this.b).c).w) && (y6iVar = (ak4Var = (ak4) ((u5i) this.b).c).s) != null && ak4Var.U && (im5Var = ((mw8) y6iVar.b).R0) != null) {
                    im5Var.a();
                    break;
                }
                break;
        }
    }
}
