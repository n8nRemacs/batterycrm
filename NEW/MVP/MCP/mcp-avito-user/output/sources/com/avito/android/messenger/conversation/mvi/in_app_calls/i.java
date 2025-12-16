package com.avito.android.messenger.conversation.mvi.in_app_calls;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelIacPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/i;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends M0 implements h {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final ChannelIacInteractor f191400E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f191401J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f191402K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final D<Boolean> f191403L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final D<G0> f191404M;

    /* compiled from: ChannelIacPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            i.this.f191403L.postValue(bool);
        }
    }

    /* compiled from: ChannelIacPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f191404M.postValue((G0) obj);
        }
    }

    @Inject
    public i(@k ChannelIacInteractor channelIacInteractor, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f191400E = channelIacInteractor;
        this.f191401J = interfaceC35745a5;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191402K = cVar;
        this.f191403L = new D<>();
        this.f191404M = new D<>();
        cVar.b(channelIacInteractor.Hc().j0(interfaceC35745a5.c()).t0(new a()));
        cVar.b(channelIacInteractor.o7().j0(interfaceC35745a5.c()).t0(new b()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.h
    public final void a9() {
        this.f191400E.t6();
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.h
    /* renamed from: ab, reason: from getter */
    public final D getF191403L() {
        return this.f191403L;
    }

    @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.h
    /* renamed from: f8, reason: from getter */
    public final D getF191404M() {
        return this.f191404M;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f191402K.e();
    }
}
