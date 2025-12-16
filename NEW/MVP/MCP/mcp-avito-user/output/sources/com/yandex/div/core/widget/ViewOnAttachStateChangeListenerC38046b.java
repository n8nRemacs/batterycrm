package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;

/* compiled from: AdaptiveMaxLines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/b;", "Landroid/view/View$OnAttachStateChangeListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.widget.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC38046b implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C38045a f369252b;

    public ViewOnAttachStateChangeListenerC38046b(C38045a c38045a) {
        this.f369252b = c38045a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        C38045a c38045a = this.f369252b;
        if (c38045a.f369247c != null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC38047c viewTreeObserverOnPreDrawListenerC38047c = new ViewTreeObserverOnPreDrawListenerC38047c(c38045a);
        c38045a.f369245a.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC38047c);
        c38045a.f369247c = viewTreeObserverOnPreDrawListenerC38047c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f369252b.a();
    }
}
