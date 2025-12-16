package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.app.task.C28567j1;
import com.avito.android.persistence.messenger.InterfaceC33043a0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelMetaInfoRepo.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/l;", "Lcom/avito/android/messenger/channels/mvi/data/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31704l implements InterfaceC31700h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33043a0 f187236a;

    @Inject
    public C31704l(@Y61.k InterfaceC33043a0 interfaceC33043a0) {
        this.f187236a = interfaceC33043a0;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final B0 a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f187236a.c(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).d0(C31703k.f187235b);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31701i(this, messengerUserHashInfo, str, 0));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<String>> c(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f187236a.a(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final B0 d(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f187236a.d(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).d0(C31702j.f187233b);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final C41826q e(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41826q(new C28567j1(2, this, messengerUserHashInfo, str));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31700h
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31701i(this, messengerUserHashInfo, str, 1));
    }
}
