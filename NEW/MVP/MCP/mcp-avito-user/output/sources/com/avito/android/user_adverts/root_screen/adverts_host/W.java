package com.avito.android.user_adverts.root_screen.adverts_host;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f312353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f312354c;

    public /* synthetic */ W(SwipeRefreshLayout swipeRefreshLayout, int i12) {
        this.f312353b = i12;
        this.f312354c = swipeRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f312353b) {
            case 0:
                this.f312354c.setRefreshing(false);
                break;
            case 1:
                this.f312354c.setRefreshing(false);
                break;
            default:
                this.f312354c.setRefreshing(false);
                break;
        }
    }
}
