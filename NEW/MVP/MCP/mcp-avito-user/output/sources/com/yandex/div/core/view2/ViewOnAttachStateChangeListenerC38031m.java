package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC38031m implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C38029k f369164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C38029k f369165c;

    public ViewOnAttachStateChangeListenerC38031m(C38029k c38029k, C38029k c38029k2) {
        this.f369164b = c38029k;
        this.f369165c = c38029k2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        this.f369164b.removeOnAttachStateChangeListener(this);
        this.f369165c.getDiv2Component().s().a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
    }
}
