package com.avito.android.bxcontent;

import android.view.View;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/c0;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.c0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC28967c0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.z f109638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f109639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f109640e;

    public ViewOnAttachStateChangeListenerC28967c0(BxContentFragment bxContentFragment, com.avito.android.bxcontent.mvi.entity.z zVar, boolean z12, boolean z13) {
        this.f109637b = bxContentFragment;
        this.f109638c = zVar;
        this.f109639d = z12;
        this.f109640e = z13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        BxContentFragment bxContentFragment = this.f109637b;
        bxContentFragment.f109063u5 = null;
        view.removeOnAttachStateChangeListener(this);
        bxContentFragment.k6(this.f109638c, this.f109639d, this.f109640e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f109637b.f109063u5 = null;
        view.removeOnAttachStateChangeListener(this);
    }
}
