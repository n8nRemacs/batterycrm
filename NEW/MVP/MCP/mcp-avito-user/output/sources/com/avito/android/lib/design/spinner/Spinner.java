package com.avito.android.lib.design.spinner;

import LV.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Spinner.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/avito/android/lib/design/spinner/Spinner;", "Landroid/widget/ProgressBar;", "LpK0/a;", "LLV/d;", "Lcom/avito/android/lib/design/spinner/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/spinner/a;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "Landroid/content/res/ColorStateList;", "tint", "setTintColor", "(Landroid/content/res/ColorStateList;)V", "size", "setSize", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Spinner extends ProgressBar implements InterfaceC46971a, d<a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f180559b;

    public Spinner(@k Context context) {
        super(context);
        a(this, null);
    }

    public static void a(Spinner spinner, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = spinner.getContext().obtainStyledAttributes(attributeSet, d.n.f178923H, 0, 0);
        a.C5301a c5301a = a.f180560d;
        Context context = spinner.getContext();
        c5301a.getClass();
        spinner.setStyle(a.C5301a.c(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i12, int i13) {
        a aVar = this.f180559b;
        if (aVar != null) {
            setMeasuredDimension(aVar.f180562b, aVar.f180563c);
        }
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178923H);
        a.C5301a c5301a = a.f180560d;
        Context context = getContext();
        c5301a.getClass();
        setStyle(a.C5301a.c(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setSize(int size) {
        a aVar = this.f180559b;
        if (aVar != null) {
            setStyle(a.a(aVar, null, size, size, 1));
        }
    }

    public final void setTintColor(@l ColorStateList tint) {
        a aVar = this.f180559b;
        if (aVar != null) {
            setStyle(a.a(aVar, tint != null ? C35771d0.b(tint) : null, 0, 0, 6));
        }
    }

    @Override // LV.d
    public void setStyle(@k a newStyle) {
        a aVar = this.f180559b;
        if (new c(newStyle, aVar).f181333c) {
            return;
        }
        this.f180559b = newStyle;
        C35763c0 c35763c0 = aVar != null ? aVar.f180561a : null;
        C35763c0 c35763c02 = newStyle.f180561a;
        if (!new c(c35763c02, c35763c0).f181333c && c35763c02 != null) {
            setIndeterminateTintList(c35763c02.b());
            setIndeterminateTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        if (L.f(Integer.valueOf(newStyle.f180563c), aVar != null ? Integer.valueOf(aVar.f180563c) : null)) {
            if (L.f(Integer.valueOf(newStyle.f180562b), aVar != null ? Integer.valueOf(aVar.f180562b) : null)) {
                return;
            }
        }
        requestLayout();
    }

    public Spinner(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        a(this, attributeSet);
    }
}
