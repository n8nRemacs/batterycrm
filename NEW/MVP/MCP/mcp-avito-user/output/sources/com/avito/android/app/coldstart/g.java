package com.avito.android.app.coldstart;

import Y61.k;
import android.view.View;
import com.avito.android.app.coldstart.h;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActivityFirstDrawListening.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/coldstart/g;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f91362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f91363c;

    public g(Y41.a aVar, View view) {
        this.f91362b = view;
        this.f91363c = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
        h.a aVar = h.f91364f;
        View view2 = this.f91362b;
        Y41.a<G0> aVar2 = this.f91363c;
        aVar.getClass();
        view2.getViewTreeObserver().addOnDrawListener(new h(aVar2, view2));
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
    }
}
