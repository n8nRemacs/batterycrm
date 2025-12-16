package defpackage;

import android.content.Context;
import android.util.Size;

/* loaded from: classes2.dex */
public final /* synthetic */ class dvb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ dvb(k18 k18Var, Context context, int i) {
        this.a = i;
        this.b = k18Var;
        this.c = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int iMax;
        switch (this.a) {
            case 0:
                ((lv4) this.b.getValue()).getClass();
                Size sizeH = lv4.h(this.c);
                iMax = Math.max(sizeH.getWidth(), sizeH.getHeight());
                break;
            case 1:
                ((lv4) this.b.getValue()).getClass();
                Size sizeH2 = lv4.h(this.c);
                int iMin = (int) ((Math.min(sizeH2.getWidth(), sizeH2.getHeight()) / 3.0f) * 2.0f);
                if (iMin < 400) {
                    iMin = 400;
                }
                return Integer.valueOf(iMin);
            default:
                ((lv4) this.b.getValue()).getClass();
                Size sizeH3 = lv4.h(this.c);
                iMax = Math.max(sizeH3.getWidth(), sizeH3.getHeight());
                break;
        }
        return Integer.valueOf(iMax);
    }
}
