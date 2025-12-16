package com.avito.android.photo_gallery.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.K;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: FixedRatioImageView.kt */
@P
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/photo_gallery/ui/FixedRatioImageView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "j", "F", "getRatio", "()F", "setRatio", "(F)V", "ratio", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FixedRatioImageView extends SimpleDraweeView {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float ratio;

    public FixedRatioImageView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ratio = 0.75f;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, K.k.f216528a);
        this.ratio = typedArrayObtainStyledAttributes.getFloat(0, 0.75f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // com.facebook.drawee.view.d, android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredWidth;
        int iB2;
        super.onMeasure(i12, i13);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i14 = layoutParams.height;
        boolean z12 = false;
        boolean z13 = (i14 == -1 || i14 == -2) ? false : true;
        int i15 = layoutParams.width;
        if (i15 != -1 && i15 != -2) {
            z12 = true;
        }
        if (z13 && z12) {
            measuredWidth = getMeasuredWidth();
            iB2 = getMeasuredHeight();
        } else if (z13) {
            iB2 = getMeasuredHeight();
            measuredWidth = layoutParams.width;
        } else {
            measuredWidth = getMeasuredWidth();
            iB2 = kotlin.math.b.b(measuredWidth * this.ratio);
        }
        setMeasuredDimension(measuredWidth, iB2);
    }

    public final void setRatio(float f12) {
        this.ratio = f12;
    }
}
