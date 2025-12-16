package com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel;

import com.avito.android.deep_linking.links.DeleteChannelLink;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import l41.o;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: DeleteChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f190518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeleteChannelLink f190519c;

    public a(d dVar, DeleteChannelLink deleteChannelLink) {
        this.f190518b = dVar;
        this.f190519c = deleteChannelLink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!o0.b(messengerUserHashInfo)) {
            return I.q(DeleteChannelLink.b.C3993b.f133178b);
        }
        d dVar = this.f190518b;
        return dVar.f190523g.c(this.f190519c.f133176b, messengerUserHashInfo).x(dVar.f190524h.a()).B(DeleteChannelLink.b.c.f133179b);
    }
}
