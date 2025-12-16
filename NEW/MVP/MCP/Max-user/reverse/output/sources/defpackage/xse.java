package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class xse {
    public l6j a = new qtd();
    public l6j b = new qtd();
    public l6j c = new qtd();
    public l6j d = new qtd();
    public t74 e = new g0(0.0f);
    public t74 f = new g0(0.0f);
    public t74 g = new g0(0.0f);
    public t74 h = new g0(0.0f);
    public q85 i;
    public q85 j;
    public q85 k;
    public q85 l;

    public xse() {
        int i = 0;
        this.i = new q85(i);
        this.j = new q85(i);
        this.k = new q85(i);
        this.l = new q85(i);
    }

    public static s5i a(Context context, int i, int i2, g0 g0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(z5d.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(z5d.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(z5d.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(z5d.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(z5d.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(z5d.ShapeAppearance_cornerFamilyBottomLeft, i3);
            t74 t74VarC = c(typedArrayObtainStyledAttributes, z5d.ShapeAppearance_cornerSize, g0Var);
            t74 t74VarC2 = c(typedArrayObtainStyledAttributes, z5d.ShapeAppearance_cornerSizeTopLeft, t74VarC);
            t74 t74VarC3 = c(typedArrayObtainStyledAttributes, z5d.ShapeAppearance_cornerSizeTopRight, t74VarC);
            t74 t74VarC4 = c(typedArrayObtainStyledAttributes, z5d.ShapeAppearance_cornerSizeBottomRight, t74VarC);
            t74 t74VarC5 = c(typedArrayObtainStyledAttributes, z5d.ShapeAppearance_cornerSizeBottomLeft, t74VarC);
            s5i s5iVar = new s5i();
            l6j l6jVarB = iti.b(i4);
            s5iVar.a = l6jVarB;
            s5i.h(l6jVarB);
            s5iVar.e = t74VarC2;
            l6j l6jVarB2 = iti.b(i5);
            s5iVar.b = l6jVarB2;
            s5i.h(l6jVarB2);
            s5iVar.f = t74VarC3;
            l6j l6jVarB3 = iti.b(i6);
            s5iVar.c = l6jVarB3;
            s5i.h(l6jVarB3);
            s5iVar.g = t74VarC4;
            l6j l6jVarB4 = iti.b(i7);
            s5iVar.d = l6jVarB4;
            s5i.h(l6jVarB4);
            s5iVar.h = t74VarC5;
            return s5iVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static s5i b(Context context, AttributeSet attributeSet, int i, int i2) {
        g0 g0Var = new g0(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, g0Var);
    }

    public static t74 c(TypedArray typedArray, int i, t74 t74Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new g0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new gkd(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return t74Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(q85.class) && this.j.getClass().equals(q85.class) && this.i.getClass().equals(q85.class) && this.k.getClass().equals(q85.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof qtd) && (this.a instanceof qtd) && (this.c instanceof qtd) && (this.d instanceof qtd));
    }

    public final s5i e() {
        s5i s5iVar = new s5i();
        s5iVar.a = this.a;
        s5iVar.b = this.b;
        s5iVar.c = this.c;
        s5iVar.d = this.d;
        s5iVar.e = this.e;
        s5iVar.f = this.f;
        s5iVar.g = this.g;
        s5iVar.h = this.h;
        s5iVar.i = this.i;
        s5iVar.j = this.j;
        s5iVar.k = this.k;
        s5iVar.l = this.l;
        return s5iVar;
    }
}
