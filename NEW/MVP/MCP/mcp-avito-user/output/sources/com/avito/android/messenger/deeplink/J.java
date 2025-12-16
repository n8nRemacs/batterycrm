package com.avito.android.messenger.deeplink;

import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "Lru/avito/messenger/api/entity/Channel;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f195353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f195355d;

    public J(C c12, String str, String str2) {
        this.f195353b = c12;
        this.f195354c = str;
        this.f195355d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406619b;
        Channel channel = (Channel) q12.f406620c;
        C c12 = this.f195353b;
        return c12.f195298j.f(messengerUserHashInfo, channel.getChannelId(), c12.f195300l.a(), C43066x.A0(this.f195354c).toString(), null, null, null, this.f195355d, null);
    }
}
