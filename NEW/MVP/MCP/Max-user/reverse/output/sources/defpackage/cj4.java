package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class cj4 implements oa8, pa8, om6, m7c, tm6, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ cj4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                ((a5c) obj).r(this.b);
                break;
            case 8:
                ((a5c) obj).N(this.b);
                break;
            case 9:
                ((a5c) obj).j0(this.b);
                break;
            default:
                ((a5c) obj).g0(this.b);
                break;
        }
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return Integer.valueOf(this.b);
            default:
                Bitmap bitmap = (Bitmap) ((List) obj).get(this.b);
                return bitmap == null ? tr8.a : or8.d(bitmap);
        }
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((fl5) obj).getClass();
                wqi.c("fl5", "onDroppedVideoFrames: " + i2, new Object[0]);
                break;
            case 1:
                ((q3c) obj).onRepeatModeChanged(i2);
                break;
            case 2:
                ((r3c) obj).K(i2);
                break;
            default:
                ((r3c) obj).onRepeatModeChanged(i2);
                break;
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return this.b < ((List) obj).size();
    }

    public /* synthetic */ cj4(hd hdVar, int i, long j) {
        this.a = 0;
        this.b = i;
    }
}
