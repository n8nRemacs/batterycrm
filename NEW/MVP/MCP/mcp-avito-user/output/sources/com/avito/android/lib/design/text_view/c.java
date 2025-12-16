package com.avito.android.lib.design.text_view;

import Y61.k;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.util.C1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;

/* compiled from: AvitoTextView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/text_view/c;", "Landroid/text/style/ClickableSpan;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f180937b;

    public c(a aVar) {
        this.f180937b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        a aVar = this.f180937b;
        if (L.f(aVar.f180925d, aVar.f180931j) || L.f(aVar.f180925d, aVar.getText())) {
            return;
        }
        Y41.a<G0> aVar2 = aVar.f180933l;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        aVar.f180926e = true;
        aVar.setText(aVar.f180925d);
        aVar.measure(View.MeasureSpec.makeMeasureSpec(aVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.getHeight(), 0));
        ValueAnimator valueAnimator = aVar.f180928g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(aVar.getHeight(), aVar.getMeasuredHeight());
        valueAnimatorOfInt.setInterpolator(new androidx.interpolator.view.animation.b());
        valueAnimatorOfInt.setDuration(s.d(Math.abs(aVar.getMeasuredHeight() - aVar.getHeight()) * 2, 300L));
        valueAnimatorOfInt.addUpdateListener(new AV.a(aVar, 12));
        valueAnimatorOfInt.addListener(new b(aVar));
        C1.f318564a.getClass();
        if (C1.a() && !valueAnimatorOfInt.isStarted()) {
            valueAnimatorOfInt.start();
        }
        aVar.f180928g = valueAnimatorOfInt;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
