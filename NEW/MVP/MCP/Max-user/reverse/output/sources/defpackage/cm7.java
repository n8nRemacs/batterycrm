package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class cm7 extends i3 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ dm7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm7(dm7 dm7Var) {
        super(12, (Object) null);
        this.d = dm7Var;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    if (drawable != null) {
                        drawable.setBounds(this.d.getBounds());
                        break;
                    }
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    dm7 dm7Var = this.d;
                    dm7Var.d.setColor(iIntValue);
                    dm7Var.invalidateSelf();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm7(Integer num, dm7 dm7Var) {
        super(12, num);
        this.d = dm7Var;
    }
}
