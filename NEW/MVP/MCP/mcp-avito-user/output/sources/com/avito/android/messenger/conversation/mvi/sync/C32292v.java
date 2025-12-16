package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.body.item.BodyItem;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Item;", "it", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32292v extends kotlin.jvm.internal.N implements Y41.l<BodyItem, MessageBody.Item> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32275m f194851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32292v(C32275m c32275m) {
        super(1);
        this.f194851l = c32275m;
    }

    @Override // Y41.l
    public final MessageBody.Item invoke(BodyItem bodyItem) {
        MessageBody messageBodyA = this.f194851l.f194809b.a(bodyItem);
        if (messageBodyA instanceof MessageBody.Item) {
            return (MessageBody.Item) messageBodyA;
        }
        return null;
    }
}
