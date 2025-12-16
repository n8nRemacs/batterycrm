package com.avito.android.messenger.channels.mvi.interactor;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsErrorInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/h;", "Lcom/avito/android/messenger/channels/mvi/interactor/d;", "Landroidx/lifecycle/M0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.interactor.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31770h extends M0 implements InterfaceC31766d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final w0 f187646E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f187647J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f187648K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f187649L;

    @Inject
    public C31770h(@Y61.k w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f187646E = w0Var;
        this.f187647J = interfaceC35745a5;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f187648K = cVar;
        this.f187649L = C31685o.m();
        cVar.b(w0Var.b().j0(interfaceC35745a5.a()).q0(1L).N(C31767e.f187643b).v0(new C31768f(this), C31769g.f187645b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d
    public final io.reactivex.rxjava3.core.z I1() {
        return this.f187649L;
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d
    public final void W4() {
        this.f187649L.accept(G0.f406611a);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f187648K.e();
        super.onCleared();
    }
}
