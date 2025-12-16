package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class gj2 extends dtf implements sm6 {
    public final /* synthetic */ ij2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj2(ij2 ij2Var, Continuation continuation) {
        super(2, continuation);
        this.X = ij2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gj2 gj2Var = (gj2) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gj2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gj2 gj2Var = new gj2(this.X, continuation);
        gj2Var.o = obj;
        return gj2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yeb yebVar = (yeb) this.o;
        ij2 ij2Var = this.X;
        bwf bwfVar = ij2Var.j;
        if (bwfVar.e()) {
            Drawable drawable = (Drawable) bwfVar.getValue();
            cei.k(drawable, yebVar.getIcon().j);
            drawable.invalidateSelf();
        }
        bwf bwfVar2 = ij2Var.k;
        if (bwfVar2.e()) {
            Drawable drawable2 = (Drawable) bwfVar2.getValue();
            cei.k(drawable2, yebVar.getIcon().j);
            drawable2.invalidateSelf();
        }
        bwf bwfVar3 = ij2Var.l;
        if (bwfVar3.e()) {
            Drawable drawable3 = (Drawable) bwfVar3.getValue();
            cei.k(drawable3, yebVar.getIcon().j);
            drawable3.invalidateSelf();
        }
        bwf bwfVar4 = ij2Var.m;
        if (bwfVar4.e()) {
            Drawable drawable4 = (Drawable) bwfVar4.getValue();
            cei.k(drawable4, yebVar.getIcon().j);
            drawable4.invalidateSelf();
        }
        bwf bwfVar5 = ij2Var.n;
        if (bwfVar5.e()) {
            Drawable drawable5 = (Drawable) bwfVar5.getValue();
            cei.k(drawable5, yebVar.getIcon().j);
            drawable5.invalidateSelf();
        }
        bwf bwfVar6 = ij2Var.o;
        if (bwfVar6.e()) {
            Drawable drawable6 = (Drawable) bwfVar6.getValue();
            cei.k(drawable6, yebVar.getIcon().j);
            drawable6.invalidateSelf();
        }
        bwf bwfVar7 = ij2Var.p;
        if (bwfVar7.e()) {
            Drawable drawable7 = (Drawable) bwfVar7.getValue();
            cei.k(drawable7, yebVar.getIcon().j);
            drawable7.invalidateSelf();
        }
        bwf bwfVar8 = ij2Var.q;
        if (bwfVar8.e()) {
            Drawable drawable8 = (Drawable) bwfVar8.getValue();
            cei.k(drawable8, yebVar.getIcon().j);
            drawable8.invalidateSelf();
        }
        bwf bwfVar9 = ij2Var.r;
        if (bwfVar9.e()) {
            Drawable drawable9 = (Drawable) bwfVar9.getValue();
            cei.k(drawable9, yebVar.getIcon().j);
            drawable9.invalidateSelf();
        }
        bwf bwfVar10 = ij2Var.s;
        if (bwfVar10.e()) {
            Drawable drawable10 = (Drawable) bwfVar10.getValue();
            cei.k(drawable10, yebVar.getIcon().c);
            drawable10.invalidateSelf();
        }
        bwf bwfVar11 = ij2Var.t;
        if (bwfVar11.e()) {
            Drawable drawable11 = (Drawable) bwfVar11.getValue();
            cei.k(drawable11, yebVar.getIcon().c);
            drawable11.invalidateSelf();
        }
        bwf bwfVar12 = ij2Var.u;
        if (bwfVar12.e()) {
            Drawable drawable12 = (Drawable) bwfVar12.getValue();
            cei.k(drawable12, yebVar.getIcon().b);
            drawable12.invalidateSelf();
        }
        bwf bwfVar13 = ij2Var.v;
        if (bwfVar13.e()) {
            ((FitFontImageSpan) bwfVar13.getValue()).onThemeChanged(yebVar);
        }
        bwf bwfVar14 = ij2Var.w;
        if (bwfVar14.e()) {
            ((FitFontImageSpan) bwfVar14.getValue()).onThemeChanged(yebVar);
        }
        bwf bwfVar15 = ij2Var.x;
        if (bwfVar15.e()) {
            ((FitFontImageSpan) bwfVar15.getValue()).onThemeChanged(yebVar);
        }
        bwf bwfVar16 = ij2Var.y;
        if (bwfVar16.e()) {
            ((FitFontImageSpan) bwfVar16.getValue()).onThemeChanged(yebVar);
        }
        bwf bwfVar17 = ij2Var.z;
        if (bwfVar17.e()) {
            ((FitFontImageSpan) bwfVar17.getValue()).onThemeChanged(yebVar);
        }
        return qqg.a;
    }
}
