package com.avito.android.lib.design.skeleton;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wK0.AbstractC49526a;

/* compiled from: TextSkeleton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/skeleton/TextSkeleton;", "Lcom/avito/android/lib/design/text_view/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class TextSkeleton extends a {

    /* renamed from: q, reason: collision with root package name */
    public final int f180512q;

    /* renamed from: r, reason: collision with root package name */
    public final float f180513r;

    /* renamed from: s, reason: collision with root package name */
    public final float f180514s;

    @j
    public TextSkeleton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.avito.android.lib.design.text_view.a, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        super.onMeasure(i12, i13);
        D6.c(this, null, Integer.valueOf((int) (this.f180514s - this.f180512q)), null, Integer.valueOf((int) this.f180513r), 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextSkeleton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, 0, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178938O0, i12, i13);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int iD2 = C35835l0.d(R.attr.white, context);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        paint.getTextBounds("x", 0, 1, rect);
        int iHeight = rect.height();
        this.f180512q = iHeight;
        this.f180513r = getLastBaselineToBottomHeight();
        this.f180514s = getFirstBaselineToTopHeight();
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, ColorStateList.valueOf(iD2), null, dimensionPixelSize, null, 0, 122));
        setHeight(iHeight);
    }
}
