package com.avito.android.lib.design.photo_uploader_image;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pK0.InterfaceC46971a;

/* compiled from: PhotoUploaderLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007R*\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/photo_uploader_image/PhotoUploaderLayout;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "value", "b", "I", "getRatioWidth", "()I", "setRatioWidth", "ratioWidth", "c", "getRatioHeight", "setRatioHeight", "ratioHeight", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoUploaderLayout extends FrameLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int ratioWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int ratioHeight;

    @j
    public PhotoUploaderLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final int getRatioHeight() {
        return this.ratioHeight;
    }

    public final int getRatioWidth() {
        return this.ratioWidth;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (size <= 0 || mode == 0) {
            super.onMeasure(i12, i13);
        } else {
            super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec((size * this.ratioHeight) / this.ratioWidth, 1073741824));
        }
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178979l0);
        setRatioWidth(typedArrayObtainStyledAttributes.getInt(1, this.ratioWidth));
        setRatioHeight(typedArrayObtainStyledAttributes.getInt(0, this.ratioHeight));
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setRatioHeight(int i12) {
        if (i12 < 1) {
            i12 = 1;
        }
        this.ratioHeight = i12;
        requestLayout();
    }

    public final void setRatioWidth(int i12) {
        if (i12 < 1) {
            i12 = 1;
        }
        this.ratioWidth = i12;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoUploaderLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.photoUploaderLayout : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_PhotoUploaderLayout : i13;
        super(context, attributeSet, i12);
        this.ratioWidth = 1;
        this.ratioHeight = 1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178979l0, i12, i13);
        setRatioWidth(typedArrayObtainStyledAttributes.getInt(1, this.ratioWidth));
        setRatioHeight(typedArrayObtainStyledAttributes.getInt(0, this.ratioHeight));
        typedArrayObtainStyledAttributes.recycle();
    }
}
