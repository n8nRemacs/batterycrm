package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;

/* compiled from: CBRVideoIdentDocumentView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRVideoIdentDocumentView;", "Lru/cyberity/cbr/core/widget/CBRStepView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/G0;", "drawableStateChanged", "()V", "defaultStrokeWidth", "I", "activatedStrokeWidth", "Landroid/widget/Button;", "getUploadButton", "()Landroid/widget/Button;", "uploadButton", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRVideoIdentDocumentView extends CBRStepView {
    private int activatedStrokeWidth;
    private int defaultStrokeWidth;

    public /* synthetic */ CBRVideoIdentDocumentView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_VideoIdentDocumentViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRVideoIdentDocumentView : i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isActivated()) {
            setStrokeWidth(this.activatedStrokeWidth);
        } else {
            setStrokeWidth(this.defaultStrokeWidth);
        }
    }

    @l
    public final Button getUploadButton() {
        return (Button) findViewById(R.id.cbr_item_button);
    }

    @j
    public CBRVideoIdentDocumentView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13, null, 16, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRVideoIdentDocumentView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRVideoIdentDocumentView_cbr_stepStrokeWidthDefault)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRVideoIdentDocumentView_cbr_stepStrokeWidthDefault, 0);
            this.defaultStrokeWidth = dimensionPixelSize;
            setStrokeWidth(dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRVideoIdentDocumentView_cbr_stepStrokeWidthActivated)) {
            this.activatedStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRVideoIdentDocumentView_cbr_stepStrokeWidthActivated, 0);
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
    }
}
