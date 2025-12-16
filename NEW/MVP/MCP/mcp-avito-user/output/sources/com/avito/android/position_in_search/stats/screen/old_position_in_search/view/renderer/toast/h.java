package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f221255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ToastState f221256c;

    public /* synthetic */ h(ToastState toastState, int i12) {
        this.f221255b = i12;
        this.f221256c = toastState;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f221255b) {
            case 0:
                ToastState toastState = this.f221256c;
                toastState.b().invoke(toastState.getF221229a());
                break;
            default:
                ToastState toastState2 = this.f221256c;
                toastState2.a().invoke(toastState2.getF221229a());
                break;
        }
    }
}
