package com.avito.android.short_term_rent.view.components.toggle_v2;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.a;
import com.google.android.material.shape.q;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pK0.InterfaceC46971a;
import wK0.AbstractC49528c;

/* compiled from: ToggleV2Button.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2Button;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "setText", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleV2Button extends FrameLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public q f283062b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ColorStateList f283063c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ColorStateList f283064d;

    /* renamed from: e, reason: collision with root package name */
    public float f283065e;

    /* renamed from: f, reason: collision with root package name */
    public float f283066f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ColorStateList f283067g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f283068h;

    @j
    public ToggleV2Button(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(TypedArray typedArray) {
        this.f283063c = x.a(typedArray, getContext(), 1);
        this.f283064d = x.a(typedArray, getContext(), 2);
        this.f283065e = typedArray.getDimension(3, this.f283065e);
        this.f283066f = typedArray.getDimension(4, this.f283066f);
        this.f283067g = x.a(typedArray, getContext(), 0);
        q.b bVarF = this.f283062b.f();
        ColorStateList colorStateList = this.f283063c;
        ColorStateList colorStateList2 = this.f283064d;
        float f12 = this.f283066f;
        Float fValueOf = Float.valueOf(this.f283065e);
        bVarF.c(f12);
        q qVarA = bVarF.a();
        setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, qVarA, 0, 0, 0, 0, colorStateList, null, fValueOf, colorStateList2, 94));
        this.f283062b = qVarA;
        this.f283068h.setTextColor(this.f283067g);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, a.i.f281177b);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setText(@k AttributedText text) {
        com.avito.android.util.text.j.a(this.f283068h, text, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToggleV2Button(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        AbstractC49528c.f441377b.getClass();
        this.f283062b = AbstractC49528c.a.a();
        LayoutInflater.from(context).inflate(R.layout.toggle_v2_button, (ViewGroup) this, true);
        this.f283068h = (TextView) findViewById(R.id.payment_button_text);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.f281177b, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
