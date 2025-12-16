package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.persistence.messenger.G0;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: DraftRepo.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/V;", "Lcom/avito/android/messenger/channels/mvi/data/P;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class V implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G0 f187198a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32012a f187199b;

    @Inject
    public V(@Y61.k G0 g02, @Y61.k InterfaceC32012a interfaceC32012a) {
        this.f187198a = g02;
        this.f187199b = interfaceC32012a;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.Y
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Q(this, messengerUserHashInfo, str, 0)).t(new T(this, "deleteDraft", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str)))).r();
    }

    @Override // com.avito.android.messenger.channels.mvi.data.X
    @Y61.k
    public final K0 b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        C41934a1 c41934a1 = new C41934a1(this.f187198a.b(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(S.f187192b), new U(this, com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str))));
        io.reactivex.rxjava3.internal.operators.observable.U u12 = io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        Objects.requireNonNull(u12, "fallback is null");
        return c41934a1.l0(io.reactivex.rxjava3.internal.functions.a.g(u12));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.Y
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31711t(this, messengerUserHashInfo, str, str2, str3, 1)).t(new T(this, "putDraft", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("text", str3)))).r();
    }

    @Override // com.avito.android.messenger.channels.mvi.data.Y
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I d(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Q(this, messengerUserHashInfo, str, 1)).t(new T(this, "deleteAllDraftsWithInterlocutor", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("interlocutorId", str)))).r();
    }
}
