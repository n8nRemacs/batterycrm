package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.user_adverts.root_screen.adverts_host.host_view.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HostViewRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/d;", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements InterfaceC43172j<HostViewState> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f313013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.C9591c f313014c;

    public d(j jVar, c.C9591c c9591c) {
        this.f313013b = jVar;
        this.f313014c = c9591c;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(HostViewState hostViewState, Continuation continuation) {
        HostViewState hostViewState2 = hostViewState;
        j jVar = this.f313013b;
        com.avito.android.analytics.screens.mvi.a.i(hostViewState2, jVar.f313020b, new q(jVar, hostViewState2, this.f313014c));
        return G0.f406611a;
    }
}
