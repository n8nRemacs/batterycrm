package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChatAndDraftEraser.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/o0;", "Lcom/avito/android/messenger/channels/mvi/sync/n0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31852o0 implements InterfaceC31850n0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f188516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f188517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.Y f188518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188519d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.j<IY.a> f188520e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f188521f;

    /* compiled from: ChatAndDraftEraser.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.o0$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188523c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f188524d;

        public a(MessengerUserHashInfo messengerUserHashInfo, String str) {
            this.f188523c = messengerUserHashInfo;
            this.f188524d = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C31852o0 c31852o0 = C31852o0.this;
            com.avito.android.messenger.channels.mvi.data.Y y12 = c31852o0.f188518c;
            MessengerUserHashInfo messengerUserHashInfo = this.f188523c;
            String str = this.f188524d;
            io.reactivex.rxjava3.internal.operators.completable.I iA2 = y12.a(str, messengerUserHashInfo);
            InterfaceC35745a5 interfaceC35745a5 = c31852o0.f188519d;
            return iA2.q(interfaceC35745a5.c()).g(c31852o0.f188517b.a(str, messengerUserHashInfo).q(interfaceC35745a5.c()).x(interfaceC35745a5.c())).q(interfaceC35745a5.c());
        }
    }

    public C31852o0(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k com.avito.android.messenger.channels.mvi.data.Y y12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.mvi.rx3.locks.j<IY.a> jVar, @Y61.k io.reactivex.rxjava3.core.H h12) {
        this.f188516a = interfaceC47842z;
        this.f188517b = rVar;
        this.f188518c = y12;
        this.f188519d = interfaceC35745a5;
        this.f188520e = jVar;
        this.f188521f = h12;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31850n0
    @Y61.k
    public final AbstractC41768a c(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC41768a abstractC41768aO = this.f188516a.v(str).s(this.f188519d.c()).o(new a(messengerUserHashInfo, str));
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188520e.t(abstractC41768aO.B(kotlin.G0.f406611a), "deleteChatAndDraftFromEverywhere", setSingleton, this.f188521f));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31850n0
    @Y61.k
    public final AbstractC41768a d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        io.reactivex.rxjava3.internal.operators.completable.I iD2 = this.f188518c.d(str, messengerUserHashInfo);
        InterfaceC35745a5 interfaceC35745a5 = this.f188519d;
        io.reactivex.rxjava3.internal.operators.completable.H hQ2 = iD2.q(interfaceC35745a5.c());
        boolean zK2 = C43066x.K(str2);
        com.avito.android.messenger.channels.mvi.data.r rVar = this.f188517b;
        C41811b c41811bG = hQ2.g((!zK2 ? rVar.a(str2, messengerUserHashInfo) : rVar.p(str, str3, messengerUserHashInfo)).q(interfaceC35745a5.c()));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188520e.t(c41811bG.B(kotlin.G0.f406611a), "deleteChatAndAllDraftsWithInterlocutorFromDb", Collections.singleton(a.C0466a.f8191a), this.f188521f));
    }
}
