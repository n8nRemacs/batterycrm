package com.avito.android.sx_address.address_video_verification.view;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;

/* compiled from: SxAddressVideoVerificationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/view/j;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f292758b;

    public j(i iVar) {
        this.f292758b = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        i iVar = this.f292758b;
        iVar.f292750d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        NestedScrollView nestedScrollView = iVar.f292750d;
        nestedScrollView.p(nestedScrollView.getChildAt(0).getHeight());
    }
}
