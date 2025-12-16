package com.avito.android.messenger.deeplink;

import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f195356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195357c;

    public J0(O0 o02, String str) {
        this.f195356b = o02;
        this.f195357c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        O0 o02 = this.f195356b;
        return o02.f195394m.sendTextMessage(((Channel) obj).getChannelId(), o02.f195392k.a(), C43066x.A0(this.f195357c).toString(), null, null, null, null, null).r(I0.f195348b);
    }
}
