package com.avito.android.messenger.channels.mvi.sync;

import Hq0.C14020b;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.maybe.C41930y;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelSyncOnPushAgent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/v;", "Lcom/avito/android/messenger/channels/mvi/sync/t;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31864v extends AbstractC32892c<InterfaceC31860t.a> implements InterfaceC31860t {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f188570V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47842z> f188571W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final h31.e<ChannelSyncAgent> f188572X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.messenger.conversation.mvi.sync.K> f188573Y;

    /* renamed from: Z, reason: collision with root package name */
    public final long f188574Z;

    /* compiled from: ChannelSyncOnPushAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/v$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.v$a */
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31860t.a> {
        public a() {
            throw null;
        }
    }

    /* compiled from: ChannelSyncOnPushAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/v$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.v$b */
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31860t.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f188575d;

        public b(@Y61.k String str) {
            super(null, "channelId=".concat(str), 1, null);
            this.f188575d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<InterfaceC31860t.a> b(InterfaceC31860t.a aVar) {
            InterfaceC31860t.a aVar2 = aVar;
            if (aVar2.f188564a.contains(this.f188575d)) {
                return io.reactivex.rxjava3.core.I.q(InterfaceC31860t.a.a(aVar2, null, aVar2.f188565b - 1, 1));
            }
            C31864v c31864v = C31864v.this;
            io.reactivex.rxjava3.core.q<T> qVarG = new io.reactivex.rxjava3.internal.operators.observable.S(c31864v.f188570V.g()).g(new com.avito.android.messenger.x0());
            hu.akarnokd.rxjava3.schedulers.c cVar = c31864v.f207140R;
            return new C41906z1(new io.reactivex.rxjava3.internal.operators.completable.T(new io.reactivex.rxjava3.internal.operators.maybe.D(new io.reactivex.rxjava3.internal.operators.maybe.i0(qVarG.k(cVar), new C41930y(new RuntimeException("currentUserId is empty"))), new C31866w(this)), new C14020b(13, aVar2, this), null).D().o(c31864v.f188574Z)).u(new androidx.room.rxjava3.b(aVar2, 5)).z(cVar);
        }
    }

    /* compiled from: ChannelSyncOnPushAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/v$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.v$c */
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31860t.a> {
        public c() {
            throw null;
        }
    }

    public C31864v() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C31864v(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k h31.e<InterfaceC47842z> eVar, @Y61.k h31.e<ChannelSyncAgent> eVar2, @Y61.k h31.e<com.avito.android.messenger.conversation.mvi.sync.K> eVar3, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        com.avito.android.mvi.rx3.with_monolithic_state.F f12 = new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0);
        InterfaceC31860t.a.f188562c.getClass();
        super("ChannelSyncOnPushAgent", InterfaceC31860t.a.f188563d, interfaceC35745a5, null, f12, null, null, null, 232, null);
        this.f188570V = w0Var;
        this.f188571W = eVar;
        this.f188572X = eVar2;
        this.f188573Y = eVar3;
        this.f188574Z = 3L;
        new io.reactivex.rxjava3.disposables.c().b(w0Var.g().D(io.reactivex.rxjava3.internal.functions.a.f401991a).x0(this.f207133K.a()).t0(new C31870y(this)));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t
    public final void Na(@Y61.k String str) {
        le().s(new a(C22491k0.a(')', "EnqSyncMutator(channelId=", str), null, new C31862u(this, str), 2, null));
    }
}
