package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.yandex.div.core.widget.C38045a;
import kotlin.Metadata;

/* compiled from: AdaptiveMaxLines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/c;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.widget.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnPreDrawListenerC38047c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C38045a f369253b;

    public ViewTreeObserverOnPreDrawListenerC38047c(C38045a c38045a) {
        this.f369253b = c38045a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C38045a c38045a = this.f369253b;
        C38045a.C10888a c10888a = c38045a.f369248d;
        if (c10888a == null) {
            return true;
        }
        com.yandex.div.core.view2.divs.widgets.k kVar = c38045a.f369245a;
        if (TextUtils.isEmpty(kVar.getText())) {
            return true;
        }
        if (c38045a.f369249e) {
            c38045a.a();
            c38045a.f369249e = false;
            return true;
        }
        int lineCount = kVar.getLineCount();
        int iIntValue = c10888a.f369250a;
        Integer num = lineCount > c10888a.f369251b + iIntValue ? null : Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        }
        if (iIntValue == kVar.getMaxLines()) {
            c38045a.a();
            return true;
        }
        kVar.setMaxLines(iIntValue);
        c38045a.f369249e = true;
        return false;
    }
}
