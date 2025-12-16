package com.avito.android.beduin.common.component.label;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NonClickConsumingTextView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/label/NonClickConsumingTextView;", "Lcom/avito/android/lib/design/text_view/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NonClickConsumingTextView extends com.avito.android.lib.design.text_view.a {
    @j
    public NonClickConsumingTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(@l MotionEvent motionEvent) throws ExecutionException, InterruptedException {
        if (!hasOnClickListeners() && !getLinksClickable()) {
            return false;
        }
        Layout layout = getLayout();
        if (motionEvent != null && !hasOnClickListeners() && layout != null) {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
            CharSequence text = getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    ClickableSpan clickableSpan = (ClickableSpan) obj;
                    if (!(clickableSpan instanceof PK0.j) || ((PK0.j) clickableSpan).f12985b != null) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public NonClickConsumingTextView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
