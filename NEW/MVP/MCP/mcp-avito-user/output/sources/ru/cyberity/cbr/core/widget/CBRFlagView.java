package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;

/* compiled from: CBRFlagView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFlagView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRFlagView extends ShapeableImageView {
    @j
    public CBRFlagView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ CBRFlagView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_FlagViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRFlagView : i13);
    }

    @j
    public CBRFlagView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        setShapeAppearanceModel(q.c(context, attributeSet, i12, i13).a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRFlagView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFlagView_strokeColor)) {
            setStrokeColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFlagView_strokeColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFlagView_strokeWidth)) {
            setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFlagView_strokeWidth, 0.0f));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
    }
}
