package com.yandex.div.internal.widget;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuperLineHeightTextView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/widget/r;", "Lcom/yandex/div/internal/widget/e;", "", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class r extends e {

    /* renamed from: n, reason: collision with root package name */
    public int f370333n;

    /* renamed from: o, reason: collision with root package name */
    public int f370334o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f370335p;

    public /* synthetic */ r(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f370334o;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f370333n;
    }

    @Override // com.yandex.div.internal.widget.e, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        super.onMeasure(i12, i13);
        int lastMeasuredHeight = getLastMeasuredHeight();
        if (lastMeasuredHeight != -1 && ((this.f370333n != 0 || this.f370334o != 0) && lastMeasuredHeight - getMeasuredHeight() != 0)) {
            this.f370335p = true;
            this.f370333n = 0;
            this.f370334o = 0;
        }
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        CharSequence text = getText();
        Layout layout = getLayout();
        float lineSpacingExtra = getLineSpacingExtra();
        if (layout != null && this.f370335p && measuredWidth > 0 && lineSpacingExtra > 0.0f && !TextUtils.isEmpty(text) && getLayout().getLineCount() == 1) {
            this.f370333n = kotlin.math.b.b(lineSpacingExtra / 2.0f);
            this.f370334o = ((int) lineSpacingExtra) / 2;
            this.f370335p = false;
            int measuredHeightAndState = getMeasuredHeightAndState();
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measuredHeightAndState) + this.f370333n + this.f370334o, View.MeasureSpec.getMode(measuredHeightAndState)));
        }
        setLastMeasuredHeight(getMeasuredHeight());
    }

    @Override // com.yandex.div.internal.widget.e, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        super.onTextChanged(charSequence, i12, i13, i14);
        if (this.isInternalTextChange) {
            return;
        }
        this.f370335p = true;
        this.f370333n = 0;
        this.f370334o = 0;
    }

    @X41.j
    public r(@Y61.l Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f370335p = true;
    }
}
