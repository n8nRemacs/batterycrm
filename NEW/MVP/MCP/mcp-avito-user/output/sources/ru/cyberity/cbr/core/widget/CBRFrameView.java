package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import m.C43852a;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;

/* compiled from: CBRFrameView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFrameView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "width", "color", "Lkotlin/G0;", "setStroke", "(II)V", "setFillColor", "(I)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRFrameView extends FrameLayout {
    @j
    public CBRFrameView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setFillColor(int color) {
        Drawable foreground = getForeground();
        CBRFrameDrawable cBRFrameDrawable = foreground instanceof CBRFrameDrawable ? (CBRFrameDrawable) foreground : null;
        if (cBRFrameDrawable != null) {
            cBRFrameDrawable.setFillColor(color);
        }
    }

    public final void setStroke(int width, int color) {
        Drawable foreground = getForeground();
        CBRFrameDrawable cBRFrameDrawable = foreground instanceof CBRFrameDrawable ? (CBRFrameDrawable) foreground : null;
        if (cBRFrameDrawable != null) {
            cBRFrameDrawable.setStroke(width, color);
        }
    }

    public /* synthetic */ CBRFrameView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_FrameViewStyle : i12, (i14 & 8) != 0 ? R.style.CBRFrameViewStyle : i13);
    }

    @j
    public CBRFrameView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRFrameView, i12, i13);
        setForeground(new CBRFrameDrawable(C43852a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRFrameView_cbr_FrameDrawable, -1)), ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRFrameView_cbr_FrameFillColor, -16777216), typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFrameView_cbr_FramePaddingLeft, 0.0f), typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFrameView_cbr_FramePaddingTop, 0.0f), typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFrameView_cbr_FramePaddingRight, 0.0f), typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFrameView_cbr_FramePaddingBottom, 0.0f)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
