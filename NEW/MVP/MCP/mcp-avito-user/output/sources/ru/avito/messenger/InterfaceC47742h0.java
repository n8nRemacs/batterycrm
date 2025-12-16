package ru.avito.messenger;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessengerSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/h0;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47742h0 {

    /* compiled from: MessengerSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.h0$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendFileMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendImageMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendItemMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendLinkMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I sendLocationMessage(@Y61.k String str, double d12, double d13, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendReactionMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVideoMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVoiceMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> y(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<ChatMessage>> aVar);
}
