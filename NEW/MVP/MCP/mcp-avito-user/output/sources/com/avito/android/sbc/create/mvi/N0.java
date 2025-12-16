package com.avito.android.sbc.create.mvi;

import android.view.ViewTreeObserver;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/N0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class N0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f259468b;

    public N0(M0 m02) {
        this.f259468b = m02;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        M0 m02 = this.f259468b;
        m02.f259373Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        MnzFloatingFooter mnzFloatingFooter = m02.f259373Y;
        D6.f(m02.f259386g, 0, 0, 0, D6.j(mnzFloatingFooter, 16) + mnzFloatingFooter.getHeight(), 7);
    }
}
