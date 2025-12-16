package com.avito.android.bxcontent;

import android.view.View;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/b0;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.b0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC28964b0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.x f109509c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f109510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f109511e;

    public ViewOnAttachStateChangeListenerC28964b0(BxContentFragment bxContentFragment, com.avito.android.bxcontent.mvi.entity.x xVar, boolean z12, boolean z13) {
        this.f109508b = bxContentFragment;
        this.f109509c = xVar;
        this.f109510d = z12;
        this.f109511e = z13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        BxContentFragment bxContentFragment = this.f109508b;
        bxContentFragment.f109063u5 = null;
        view.removeOnAttachStateChangeListener(this);
        bxContentFragment.h6(this.f109509c, this.f109510d, this.f109511e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f109508b.f109063u5 = null;
        view.removeOnAttachStateChangeListener(this);
    }
}
