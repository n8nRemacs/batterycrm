package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;

/* compiled from: SuperLineHeightEditText.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/internal/widget/p;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "lineHeight", "Lkotlin/G0;", "setFixedLineHeight", "(Ljava/lang/Integer;)V", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "", "whether", "setHorizontallyScrolling", "(Z)V", "getVisibleLineCount", "visibleLineCount", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class p extends AppCompatEditText {

    /* renamed from: b, reason: collision with root package name */
    public int f370329b;

    /* renamed from: c, reason: collision with root package name */
    public int f370330c;

    /* renamed from: d, reason: collision with root package name */
    public int f370331d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370332e;

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f370331d;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f370330c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (this.f370329b == -1 || View.MeasureSpec.getMode(i13) == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + (this.f370329b * getVisibleLineCount()), View.MeasureSpec.getMode(getMeasuredHeightAndState())));
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (!this.f370332e) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFixedLineHeight(@Y61.l Integer lineHeight) {
        this.f370329b = lineHeight == null ? -1 : lineHeight.intValue();
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean whether) {
        this.f370332e = !whether;
        super.setHorizontallyScrolling(whether);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f12, float f13) {
        float f14 = f12 / 2;
        this.f370330c = kotlin.math.b.b(f14);
        this.f370331d = (int) f14;
        super.setLineSpacing(f12, f13);
    }
}
