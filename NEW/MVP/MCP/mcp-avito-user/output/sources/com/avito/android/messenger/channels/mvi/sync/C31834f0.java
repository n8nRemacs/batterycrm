package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: ChannelsUpdateHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/f0;", "Lcom/avito/android/messenger/channels/mvi/sync/Z;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31834f0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188472a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f188473b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f188474c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f188475d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C31848m0 f188476e;

    /* compiled from: Singles.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/M0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.f0$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188478c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f188479d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f188480e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f188481f;

        public a(MessengerUserHashInfo messengerUserHashInfo, ChatMessage chatMessage, MessengerUserHashInfo messengerUserHashInfo2, ChatMessage chatMessage2) {
            this.f188478c = messengerUserHashInfo;
            this.f188479d = chatMessage;
            this.f188480e = messengerUserHashInfo2;
            this.f188481f = chatMessage2;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
        @Override // l41.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object apply(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 620
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.sync.C31834f0.a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public C31834f0(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k ru.avito.messenger.A a12, @Y61.k com.avito.android.messenger.B b12, @Y61.k C31848m0 c31848m0) {
        this.f188472a = interfaceC35745a5;
        this.f188473b = rVar;
        this.f188474c = a12;
        this.f188475d = b12;
        this.f188476e = c31848m0;
    }

    @Y61.k
    public final AbstractC41768a a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ChatMessage chatMessage) {
        if (!kotlin.jvm.internal.L.f(chatMessage.getUid(), messengerUserHashInfo.f430682d)) {
            return C41823n.f402260b;
        }
        return this.f188473b.b(chatMessage.getChannelId(), messengerUserHashInfo).j0(this.f188472a.c()).S().u(C31824a0.f188424b).o(new a(messengerUserHashInfo, chatMessage, messengerUserHashInfo, chatMessage));
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.A b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel) {
        com.avito.android.remote.model.messenger.Channel channelC = this.f188475d.c(messengerUserHashInfo, channel);
        return (io.reactivex.rxjava3.internal.operators.single.A) this.f188473b.b(channel.getChannelId(), messengerUserHashInfo).j0(this.f188472a.c()).S().u(C31824a0.f188424b).o(new C31836g0(this, messengerUserHashInfo, channelC, channelC, messengerUserHashInfo));
    }
}
