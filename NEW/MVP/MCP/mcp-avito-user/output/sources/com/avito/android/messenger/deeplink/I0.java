package com.avito.android.messenger.deeplink;

import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/avito/messenger/api/entity/ChatMessage;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class I0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final I0<T, R> f195348b = new I0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((ChatMessage) obj).getChannelId();
    }
}
