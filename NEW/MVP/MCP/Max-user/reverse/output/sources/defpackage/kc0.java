package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import ru.ok.utils.widgets.BadgeCountView;

/* loaded from: classes2.dex */
public final class kc0 extends i3 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    /* JADX WARN: Illegal instructions before constructor call */
    public kc0(lc0 lc0Var, yeb yebVar) {
        Boolean bool = Boolean.TRUE;
        this.d = lc0Var;
        this.o = yebVar;
        super(12, bool);
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        int i;
        switch (this.c) {
            case 0:
                yeb yebVar = (yeb) this.o;
                lc0 lc0Var = (lc0) this.d;
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        yebVar.getText();
                        i = -1;
                    } else {
                        i = yebVar.getText().e;
                    }
                    lc0Var.v0 = i;
                    lc0Var.b();
                    lc0Var.invalidateSelf();
                    break;
                }
                break;
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                BadgeCountView badgeCountView = (BadgeCountView) this.d;
                if (badgeCountView.getManageVisibility()) {
                    badgeCountView.setVisibility(iIntValue > 0 ? 0 : 8);
                }
                vg0 vg0Var = null;
                if (badgeCountView.getVisibility() != 0) {
                    badgeCountView.setText((CharSequence) null);
                    break;
                } else if (iIntValue >= 0) {
                    badgeCountView.setText(badgeCountView.getNeedPlusIndicator() ? ((Context) this.o).getString(d5d.folder_new_messages_max_exceeded, Integer.valueOf(iIntValue)) : String.valueOf(iIntValue));
                    int i2 = badgeCountView.y0;
                    GradientDrawable gradientDrawableD = iIntValue < 10 ? uga.d(Integer.valueOf(i2), null, null) : uga.e(Integer.valueOf(i2), null, null, kti.d(20 * vw4.d().getDisplayMetrics().density));
                    if (1 <= iIntValue && iIntValue < 10) {
                        vg0Var = new vg0(gradientDrawableD, 20, 12);
                    } else if (10 <= iIntValue && iIntValue < 100) {
                        vg0Var = new vg0(gradientDrawableD, 22, 12);
                    } else if (100 <= iIntValue && iIntValue < 1000) {
                        vg0Var = new vg0(gradientDrawableD, 26, 12);
                    } else if (1000 <= iIntValue && iIntValue < 10000) {
                        vg0Var = new vg0(gradientDrawableD, 31, 4);
                    }
                    badgeCountView.setStyle(vg0Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(BadgeCountView badgeCountView, Context context) {
        super(12, (Object) 0);
        this.d = badgeCountView;
        this.o = context;
    }
}
