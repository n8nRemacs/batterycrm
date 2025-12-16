package com.avito.android.ui.widget;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import com.avito.android.lib.design.text_view.a;
import hw.InterfaceC41177b;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;

/* compiled from: WrapWidthTextView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ui/widget/WrapWidthTextView;", "Lcom/avito/android/lib/design/text_view/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class WrapWidthTextView extends a {
    public WrapWidthTextView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.avito.android.lib.design.text_view.a, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        super.onMeasure(i12, i13);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float lineWidth = 0.0f;
            for (int i14 = 0; i14 < lineCount; i14++) {
                if (layout.getLineWidth(i14) > lineWidth) {
                    lineWidth = layout.getLineWidth(i14);
                }
            }
            setMeasuredDimension(getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(lineWidth)), getMeasuredHeight());
        }
    }
}
