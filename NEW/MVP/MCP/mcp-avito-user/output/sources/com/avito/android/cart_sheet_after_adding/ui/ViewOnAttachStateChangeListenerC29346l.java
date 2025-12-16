package com.avito.android.cart_sheet_after_adding.ui;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC29346l implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewStub f115614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewStub f115615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f115616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115617e;

    public ViewOnAttachStateChangeListenerC29346l(ViewStub viewStub, ViewStub viewStub2, View view, CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
        this.f115614b = viewStub;
        this.f115615c = viewStub2;
        this.f115616d = view;
        this.f115617e = cartSheetAfterAddingDialogFragment;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f115614b.removeOnAttachStateChangeListener(this);
        ViewStub viewStub = this.f115615c;
        if (viewStub.getParent() == null) {
            return;
        }
        viewStub.inflate();
        View viewFindViewById = this.f115616d.findViewById(R.id.footer_compose_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.post(new RunnableC29345k(composeView, this.f115617e));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
