package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class h2i implements sm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ h2i(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Widget.viewBinding$lambda$6(this.b, (View) obj, (ha3) obj2);
            default:
                return Widget.binding$lambda$9(this.b, obj, (ha3) obj2);
        }
    }
}
