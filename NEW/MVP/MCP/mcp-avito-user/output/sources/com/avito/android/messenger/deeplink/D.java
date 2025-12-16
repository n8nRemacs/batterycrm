package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.messenger.deeplink.C;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", RequestReviewResultKt.INFO_TYPE, "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f195319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateChannelLink f195320c;

    public D(C c12, CreateChannelLink createChannelLink) {
        this.f195319b = c12;
        this.f195320c = createChannelLink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!ru.avito.messenger.o0.b(messengerUserHashInfo)) {
            return io.reactivex.rxjava3.core.I.l(new C.a());
        }
        C c12 = this.f195319b;
        CreateChannelLink createChannelLink = this.f195320c;
        io.reactivex.rxjava3.core.I iA2 = c12.f195298j.a(messengerUserHashInfo, createChannelLink.f133130b, (28 & 4) != 0 ? null : createChannelLink.f133133e, null, (28 & 16) != 0 ? null : createChannelLink.f133136h);
        InterfaceC35745a5 interfaceC35745a5 = c12.f195301m;
        return iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
    }
}
