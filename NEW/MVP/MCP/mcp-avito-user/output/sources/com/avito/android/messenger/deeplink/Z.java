package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MarkChannelUnreadDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/deep_linking/links/MarkChannelUnreadLink$b;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32375c0 f195446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MarkChannelUnreadLink f195447c;

    public Z(C32375c0 c32375c0, MarkChannelUnreadLink markChannelUnreadLink) {
        this.f195446b = c32375c0;
        this.f195447c = markChannelUnreadLink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!ru.avito.messenger.o0.b(messengerUserHashInfo)) {
            return io.reactivex.rxjava3.core.I.q(MarkChannelUnreadLink.b.C4004b.f133439b);
        }
        C32375c0 c32375c0 = this.f195446b;
        return c32375c0.f195499g.d(this.f195447c.f133437b, messengerUserHashInfo).x(c32375c0.f195500h.a()).B(MarkChannelUnreadLink.b.c.f133440b);
    }
}
