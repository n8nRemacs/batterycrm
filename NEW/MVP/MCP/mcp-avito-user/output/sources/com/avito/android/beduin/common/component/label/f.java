package com.avito.android.beduin.common.component.label;

import Y61.k;
import android.annotation.SuppressLint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: LinkMovementMethodTouchListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/label/f;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@k View view, @k MotionEvent motionEvent) {
        int action;
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if ((text instanceof Spanned) && ((action = motionEvent.getAction()) == 0 || action == 1)) {
            float x12 = motionEvent.getX();
            float y12 = (motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) y12), (x12 - textView.getTotalPaddingLeft()) + textView.getScrollX());
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return false;
    }
}
