package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import j.N;
import j.f0;
import java.util.WeakHashMap;

/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37053a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Rect f356507a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f356508b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f356509c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f356510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f356511e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.shape.q f356512f;

    public C37053a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i12, com.google.android.material.shape.q qVar, @N Rect rect) {
        androidx.core.util.z.d(rect.left);
        androidx.core.util.z.d(rect.top);
        androidx.core.util.z.d(rect.right);
        androidx.core.util.z.d(rect.bottom);
        this.f356507a = rect;
        this.f356508b = colorStateList2;
        this.f356509c = colorStateList;
        this.f356510d = colorStateList3;
        this.f356511e = i12;
        this.f356512f = qVar;
    }

    @N
    public static C37053a a(@f0 int i12, @N Context context) throws Resources.NotFoundException {
        androidx.core.util.z.a("Cannot create a CalendarItemStyle with a styleResId of 0", i12 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListB3 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.q qVarA = com.google.android.material.shape.q.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C37053a(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, qVarA, rect);
    }

    public final void b(@N TextView textView) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k();
        com.google.android.material.shape.q qVar = this.f356512f;
        kVar.setShapeAppearanceModel(qVar);
        kVar2.setShapeAppearanceModel(qVar);
        kVar.n(this.f356509c);
        kVar.v(this.f356511e);
        kVar.u(this.f356510d);
        ColorStateList colorStateList = this.f356508b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), kVar, kVar2);
        Rect rect = this.f356507a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        textView.setBackground(insetDrawable);
    }
}
