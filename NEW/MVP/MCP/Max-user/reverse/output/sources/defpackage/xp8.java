package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xp8 extends uc {
    public static final int e = dvc.alertDialogStyle;
    public static final int f = m5d.MaterialAlertDialog_MaterialComponents;
    public static final int g = dvc.materialAlertDialogTheme;
    public final wq8 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public xp8(Context context, int i) {
        int i2 = g;
        TypedValue typedValueE = wsi.e(context, i2);
        int i3 = typedValueE == null ? 0 : typedValueE.data;
        int i4 = e;
        int i5 = f;
        Context contextA = er8.a(context, null, i4, i5);
        contextA = i3 != 0 ? new m44(contextA, i3) : contextA;
        TypedValue typedValueE2 = wsi.e(context, i2);
        super(contextA, typedValueE2 == null ? 0 : typedValueE2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = z5d.MaterialAlertDialog;
        d7g.a(context2, null, i4, i5);
        d7g.b(context2, null, iArr, i4, i5, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i4, i5);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.MaterialAlertDialog_backgroundInsetStart, context2.getResources().getDimensionPixelSize(dwc.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.MaterialAlertDialog_backgroundInsetTop, context2.getResources().getDimensionPixelSize(dwc.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.MaterialAlertDialog_backgroundInsetEnd, context2.getResources().getDimensionPixelSize(dwc.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.MaterialAlertDialog_backgroundInsetBottom, context2.getResources().getDimensionPixelSize(dwc.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iE = eti.e(context2, xp8.class.getCanonicalName(), dvc.colorSurface);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, z5d.MaterialAlertDialog, i4, i5);
        int color = typedArrayObtainStyledAttributes2.getColor(z5d.MaterialAlertDialog_backgroundTint, iE);
        typedArrayObtainStyledAttributes2.recycle();
        wq8 wq8Var = new wq8(context2, null, i4, i5);
        wq8Var.i(context2);
        wq8Var.k(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                s5i s5iVarE = wq8Var.a.a.e();
                s5iVarE.e = new g0(dimension);
                s5iVarE.f = new g0(dimension);
                s5iVarE.g = new g0(dimension);
                s5iVarE.h = new g0(dimension);
                wq8Var.setShapeAppearanceModel(s5iVarE.g());
            }
        }
        this.c = wq8Var;
    }

    public final xp8 a(int i, nl6 nl6Var) {
        return (xp8) super.setPositiveButton(i, nl6Var);
    }

    public final xp8 b(String str) {
        return (xp8) super.setTitle(str);
    }

    @Override // defpackage.uc
    public final vc create() {
        vc vcVarCreate = super.create();
        Window window = vcVarCreate.getWindow();
        View decorView = window.getDecorView();
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            WeakHashMap weakHashMap = hfh.a;
            wq8Var.j(veh.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) wq8Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ao7(vcVarCreate, rect));
        return vcVarCreate;
    }

    @Override // defpackage.uc
    public final uc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (xp8) super.setNegativeButton(i, onClickListener);
    }

    @Override // defpackage.uc
    public final uc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (xp8) super.setPositiveButton(i, onClickListener);
    }

    @Override // defpackage.uc
    public final uc setTitle(CharSequence charSequence) {
        return (xp8) super.setTitle(charSequence);
    }

    @Override // defpackage.uc
    public final uc setView(View view) {
        return (xp8) super.setView(view);
    }
}
