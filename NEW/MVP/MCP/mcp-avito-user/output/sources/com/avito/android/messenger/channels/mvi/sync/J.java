package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.C30277e1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;

/* compiled from: ChannelsBackendNotificationsHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/J;", "Lcom/avito/android/messenger/channels/mvi/sync/A;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class J implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f188340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f188341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188342c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.j<IY.a> f188343d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f188344e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C31852o0 f188345f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31834f0 f188346g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.K f188347h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f188348i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188349j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188350k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ChannelsBackendNotificationsHandler.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "newUserInfo", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            J j12 = J.this;
            j12.f188350k.e();
            if (ru.avito.messenger.o0.b(messengerUserHashInfo)) {
                InterfaceC47842z interfaceC47842z = j12.f188341b;
                io.reactivex.rxjava3.core.z<T> zVarC = interfaceC47842z.C(X81.g.class);
                InterfaceC35745a5 interfaceC35745a5 = j12.f188342c;
                io.reactivex.rxjava3.internal.operators.completable.M mX2 = zVarC.j0(interfaceC35745a5.c()).v(new D(messengerUserHashInfo, j12)).x(interfaceC35745a5.c());
                String simpleName = X81.g.class.getSimpleName();
                B b12 = B.f188311b;
                io.reactivex.rxjava3.internal.observers.l lVarV = mX2.v(b12, new C(simpleName));
                io.reactivex.rxjava3.disposables.c cVar = j12.f188350k;
                cVar.b(lVarV);
                cVar.b(interfaceC47842z.C(X81.a.class).j0(interfaceC35745a5.c()).v(new E(messengerUserHashInfo, j12)).x(interfaceC35745a5.c()).v(b12, new C(X81.a.class.getSimpleName())));
                cVar.b(interfaceC47842z.C(ChatMessage.class).j0(interfaceC35745a5.c()).v(new F(messengerUserHashInfo, j12)).x(interfaceC35745a5.c()).v(b12, new C("ChatMessage")));
                cVar.b(interfaceC47842z.C(ChatMessageUpdate.class).j0(interfaceC35745a5.c()).v(new G(messengerUserHashInfo, j12)).x(interfaceC35745a5.c()).v(b12, new C("ChatMessageUpdate")));
                cVar.b(interfaceC47842z.C(X81.e.class).j0(interfaceC35745a5.c()).v(new H(messengerUserHashInfo, j12)).x(interfaceC35745a5.c()).v(b12, new C(X81.e.class.getSimpleName())));
            }
        }
    }

    /* compiled from: ChannelsBackendNotificationsHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f188352b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("ChannelsBackendNotificationsHandler", "accountStateProvider.userId() subscription encountered an error", (Throwable) obj);
        }
    }

    public J(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.mvi.rx3.locks.j jVar, @Y61.k io.reactivex.rxjava3.core.H h12, @Y61.k C31852o0 c31852o0, @Y61.k C31834f0 c31834f0, @Y61.k com.avito.android.messenger.conversation.mvi.sync.K k12, @Y61.k C30277e1 c30277e1) {
        this.f188340a = w0Var;
        this.f188341b = interfaceC47842z;
        this.f188342c = interfaceC35745a5;
        this.f188343d = jVar;
        this.f188344e = h12;
        this.f188345f = c31852o0;
        this.f188346g = c31834f0;
        this.f188347h = k12;
        this.f188348i = c30277e1;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.A
    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.f188349j;
        if (cVar.g() == 0) {
            io.reactivex.rxjava3.internal.operators.observable.L lG2 = this.f188340a.g();
            InterfaceC35745a5 interfaceC35745a5 = this.f188342c;
            cVar.b(lG2.j0(interfaceC35745a5.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).x0(interfaceC35745a5.c()).v0(new a(), b.f188352b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }
}
