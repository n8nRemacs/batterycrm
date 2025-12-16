package pY0;

import aZ0.InterfaceC19845a;
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
import android.widget.ListAdapter;
import androidx.appcompat.app.l;
import androidx.appcompat.view.d;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.shape.k;
import j.InterfaceC42150f;
import j.N;
import j.P;
import j.e0;
import j.f0;
import j.r;

/* compiled from: MaterialAlertDialogBuilder.java */
/* renamed from: pY0.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47034b extends l.a {

    @InterfaceC42150f
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;

    @f0
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;

    @InterfaceC42150f
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;

    @P
    private Drawable background;

    @N
    @r
    private final Rect backgroundInsets;

    public C47034b(@N Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(@N Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextA = BY0.a.a(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? contextA : new d(contextA, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@N Context context) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(MATERIAL_ALERT_DIALOG_THEME_OVERLAY, context);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int getOverridingThemeResId(@N Context context, int i12) {
        return i12 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i12;
    }

    @Override // androidx.appcompat.app.l.a
    @N
    public l create() {
        l lVarCreate = super.create();
        Window window = lVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof k) {
            ((k) drawable).m(C22823h0.l(decorView));
        }
        Drawable drawable2 = this.background;
        Rect rect = this.backgroundInsets;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC47033a(lVarCreate, this.backgroundInsets));
        return lVarCreate;
    }

    @P
    public Drawable getBackground() {
        return this.background;
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setItems(@P CharSequence[] charSequenceArr, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setNeutralButton(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setNeutralButton(charSequence, onClickListener);
    }

    public C47034b(@N Context context, int i12) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i12));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i13 = DEF_STYLE_ATTR;
        int i14 = DEF_STYLE_RES;
        TypedArray typedArrayD = G.d(context2, null, R.styleable.MaterialAlertDialog, i13, i14, new int[0]);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetStart, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayD.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetTop, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayD.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetEnd, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayD.getDimensionPixelSize(R.styleable.MaterialAlertDialog_backgroundInsetBottom, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayD.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.backgroundInsets = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iC2 = com.google.android.material.color.k.c(context2, R.attr.colorSurface, getClass().getCanonicalName());
        k kVar = new k(context2, null, i13, i14);
        kVar.j(context2);
        kVar.n(ColorStateList.valueOf(iC2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                kVar.l(dimension);
            }
        }
        this.background = kVar;
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setAdapter(@P ListAdapter listAdapter, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setCancelable(boolean z12) {
        return (C47034b) super.setCancelable(z12);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setCustomTitle(@P View view) {
        return (C47034b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setIcon(@P Drawable drawable) {
        return (C47034b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setMultiChoiceItems(@P CharSequence[] charSequenceArr, @P boolean[] zArr, @P DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C47034b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setOnCancelListener(@P DialogInterface.OnCancelListener onCancelListener) {
        return (C47034b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setOnDismissListener(@P DialogInterface.OnDismissListener onDismissListener) {
        return (C47034b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setOnKeyListener(@P DialogInterface.OnKeyListener onKeyListener) {
        return (C47034b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setMessage(@e0 int i12) {
        return (C47034b) super.setMessage(i12);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setNegativeButton(@e0 int i12, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setNegativeButton(i12, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setPositiveButton(@e0 int i12, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setPositiveButton(i12, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setSingleChoiceItems(@P CharSequence[] charSequenceArr, int i12, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setSingleChoiceItems(charSequenceArr, i12, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setTitle(@e0 int i12) {
        return (C47034b) super.setTitle(i12);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setView(int i12) {
        return (C47034b) super.setView(i12);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setMessage(@P CharSequence charSequence) {
        return (C47034b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setNegativeButton(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setPositiveButton(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setSingleChoiceItems(@P ListAdapter listAdapter, int i12, @P DialogInterface.OnClickListener onClickListener) {
        return (C47034b) super.setSingleChoiceItems(listAdapter, i12, onClickListener);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setTitle(@P CharSequence charSequence) {
        return (C47034b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.l.a
    @InterfaceC19845a
    @N
    public C47034b setView(@P View view) {
        return (C47034b) super.setView(view);
    }
}
