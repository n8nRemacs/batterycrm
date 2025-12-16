package xY0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.E;
import com.google.android.material.R;
import com.google.android.material.color.k;
import com.google.android.material.internal.G;
import com.google.android.material.resources.c;
import j.N;
import j.P;

/* compiled from: MaterialRadioButton.java */
/* renamed from: xY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49898a extends E {

    /* renamed from: h, reason: collision with root package name */
    public static final int f442528h = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f442529i = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: f, reason: collision with root package name */
    @P
    public ColorStateList f442530f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442531g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C49898a(@N Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.radioButtonStyle;
        int i13 = f442528h;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        Context context2 = getContext();
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.MaterialRadioButton, i12, i13, new int[0]);
        if (typedArrayD.hasValue(R.styleable.MaterialRadioButton_buttonTint)) {
            setButtonTintList(c.b(typedArrayD, context2, R.styleable.MaterialRadioButton_buttonTint));
        }
        this.f442531g = typedArrayD.getBoolean(R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f442530f == null) {
            int iD2 = k.d(this, R.attr.colorControlActivated);
            int iD3 = k.d(this, R.attr.colorOnSurface);
            int iD4 = k.d(this, R.attr.colorSurface);
            this.f442530f = new ColorStateList(f442529i, new int[]{k.f(1.0f, iD4, iD2), k.f(0.54f, iD4, iD3), k.f(0.38f, iD4, iD3), k.f(0.38f, iD4, iD3)});
        }
        return this.f442530f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f442531g && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z12) {
        this.f442531g = z12;
        if (z12) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
