package com.avito.android.cpx_promo.priceinput;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/F6", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f127320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f127321c;

    public h(View view, g gVar) {
        this.f127320b = view;
        this.f127321c = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f127320b.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this.f127321c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
