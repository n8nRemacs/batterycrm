package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class itd extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ jtd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd(ftd ftdVar, jtd jtdVar) {
        super(12, ftdVar);
        this.c = 2;
        this.d = jtdVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((etd) obj) != ((etd) obj2)) {
                    this.d.F();
                    return;
                }
                return;
            case 1:
                if (((dtd) obj) != ((dtd) obj2)) {
                    this.d.F();
                    return;
                }
                return;
            default:
                ftd ftdVar = (ftd) obj2;
                if (fni.a((ftd) obj, ftdVar)) {
                    return;
                }
                ImageView iconView = this.d.getIconView();
                ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                kt3 kt3Var = (kt3) layoutParams;
                ((ViewGroup.MarginLayoutParams) kt3Var).height = ftdVar.b;
                ((ViewGroup.MarginLayoutParams) kt3Var).width = ftdVar.a;
                iconView.setLayoutParams(kt3Var);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd(jtd jtdVar, int i) {
        super(12, etd.Z);
        this.c = i;
        this.d = jtdVar;
        switch (i) {
            case 1:
                super(12, dtd.a);
                break;
            default:
                break;
        }
    }
}
