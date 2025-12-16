package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class g2i implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ int c;

    public /* synthetic */ g2i(Widget widget, int i, int i2) {
        this.a = i2;
        this.b = widget;
        this.c = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Widget.childSlotRouter$lambda$11(this.b, this.c, (c83) obj);
            default:
                return Widget.viewBinding$lambda$5(this.b, this.c, (View) obj);
        }
    }
}
