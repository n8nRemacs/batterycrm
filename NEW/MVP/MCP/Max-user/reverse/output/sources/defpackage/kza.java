package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class kza extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ OneMeButton d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kza(OneMeButton oneMeButton, int i) {
        super(12, jza.b);
        this.c = i;
        switch (i) {
            case 1:
                this.d = oneMeButton;
                super(12, iza.a);
                break;
            case 2:
                this.d = oneMeButton;
                super(12, gza.a);
                break;
            case 3:
                this.d = oneMeButton;
                super(12, (Object) null);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                this.d = oneMeButton;
                super(12, bool);
                break;
            default:
                this.d = oneMeButton;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        int i = this.c;
        OneMeButton oneMeButton = this.d;
        switch (i) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    yy7[] yy7VarArr = OneMeButton.A0;
                    oneMeButton.j();
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    yy7[] yy7VarArr2 = OneMeButton.A0;
                    oneMeButton.e();
                    break;
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    yy7[] yy7VarArr3 = OneMeButton.A0;
                    oneMeButton.e();
                    break;
                }
                break;
            case 3:
                if (!fni.a(obj, obj2)) {
                    yeb yebVarY = (yeb) obj2;
                    if (yebVarY == null) {
                        yebVarY = a93.s0.y(oneMeButton);
                    }
                    oneMeButton.onThemeChanged(yebVarY);
                    break;
                }
                break;
            default:
                ?? r0 = oneMeButton.s0;
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        ((View) r0.getValue()).setVisibility(0);
                        int i2 = zud.a;
                        OneMeButton.a(oneMeButton, false);
                    } else if (r0.e()) {
                        ((m9b) r0.getValue()).setVisibility(8);
                        int i3 = zud.a;
                        OneMeButton.a(oneMeButton, true);
                    }
                    yy7[] yy7VarArr4 = OneMeButton.A0;
                    oneMeButton.j();
                    break;
                }
                break;
        }
    }
}
