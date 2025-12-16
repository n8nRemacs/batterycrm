package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;

/* loaded from: classes.dex */
public final /* synthetic */ class aj4 implements pa8, im4, uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj4(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.im4
    public int a(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.c;
        int i = this.a;
        int i2 = this.b;
        Size sizeG = ff5.g(mediaCodecInfo, str, i, i2);
        if (sizeG == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (sizeG.getHeight() * sizeG.getWidth()));
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ((jd) obj).M((id) this.c, this.a, this.b);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        yp4 yp4Var = (yp4) this.c;
        yp4Var.b(new my1(yp4Var, 27, new u90(this.a, this.b, tu1Var)), new vp4(tu1Var, 0));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
