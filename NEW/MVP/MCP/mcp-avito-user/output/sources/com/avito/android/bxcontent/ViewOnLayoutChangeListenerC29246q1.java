package com.avito.android.bxcontent;

import android.view.View;
import kotlin.Metadata;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/q1;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.q1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnLayoutChangeListenerC29246q1 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f112821b;

    public ViewOnLayoutChangeListenerC29246q1(C29240o1 c29240o1) {
        this.f112821b = c29240o1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if (view.getHeight() > 0) {
            view.removeOnLayoutChangeListener(this);
            this.f112821b.f112754r.c(view.getHeight());
        }
    }
}
