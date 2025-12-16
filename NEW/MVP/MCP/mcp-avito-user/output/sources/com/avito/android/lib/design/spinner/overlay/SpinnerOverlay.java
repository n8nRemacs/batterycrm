package com.avito.android.lib.design.spinner.overlay;

import LV.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.spinner.overlay.a;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SpinnerOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/spinner/overlay/SpinnerOverlay;", "Landroid/widget/FrameLayout;", "LLV/d;", "Lcom/avito/android/lib/design/spinner/overlay/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/spinner/overlay/a;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpinnerOverlay extends FrameLayout implements d<a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f180564b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Spinner f180565c;

    @j
    public SpinnerOverlay(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpinnerOverlay(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.spinnerOverlay : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_SpinnerOverlay : i13;
        super(context, attributeSet, i12, i13);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        LayoutInflater.from(context).inflate(R.layout.design_spinner_overlay, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.design_spinner_overlay_spinner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f180565c = (Spinner) viewFindViewById;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178920F0, i12, i13);
        a.f180566c.getClass();
        setStyle(a.C5302a.b(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.d
    public void setStyle(@k a newStyle) {
        Spinner spinner;
        a aVar = this.f180564b;
        if (new c(newStyle, aVar).f181333c) {
            return;
        }
        this.f180564b = newStyle;
        com.avito.android.lib.design.spinner.a aVar2 = aVar != null ? aVar.f180567a : null;
        com.avito.android.lib.design.spinner.a aVar3 = newStyle.f180567a;
        if (!new c(aVar3, aVar2).f181333c && aVar3 != null && (spinner = this.f180565c) != null) {
            spinner.setStyle(aVar3);
        }
        C35763c0 c35763c0 = aVar != null ? aVar.f180568b : null;
        C35763c0 c35763c02 = newStyle.f180568b;
        if (new c(c35763c02, c35763c0).f181333c || c35763c02 == null) {
            return;
        }
        setBackgroundTintList(ColorStateList.valueOf(c35763c02.f318848a));
    }
}
