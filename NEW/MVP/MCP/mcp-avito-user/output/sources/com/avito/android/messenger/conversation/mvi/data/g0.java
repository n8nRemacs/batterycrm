package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.C33136x2;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/g0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g0 {

    /* compiled from: MessageRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    C41828t A(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l List list, @Y61.l Integer num);

    @Y61.k
    C41828t B(@Y61.k List list);

    @Y61.k
    C41828t D(@Y61.k List list);

    @Y61.k
    C41828t E(@Y61.k LocalMessage localMessage);

    @Y61.k
    C41828t F(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5);

    @Y61.k
    C41828t G(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t H(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    @Y61.k
    C41828t I(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12, @Y61.k String str3);

    @Y61.k
    C41828t N(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t P(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t R(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l List list, @Y61.l Integer num);

    @Y61.k
    C41828t T(@Y61.k LocalMessage localMessage, @Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    @Y61.k
    C41828t U(@Y61.k LocalMessage localMessage, @Y61.k String str, @Y61.k String str2, long j12);

    @Y61.k
    C41828t V(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t W(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12);

    @Y61.k
    C41828t X(@Y61.k List list);

    @Y61.k
    C41828t b0(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List list, long j12);

    @Y61.k
    C41828t c(@Y61.k ArrayList arrayList);

    @Y61.k
    C41828t d0(long j12, @Y61.k String str);

    @Y61.k
    C41828t e(@Y61.k C33136x2 c33136x2);

    @Y61.k
    C41828t e0(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t f0(@Y61.k LocalMessage localMessage);

    @Y61.k
    C41828t h(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t h0(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t i0(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t k(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41828t n(@Y61.k List list);

    @Y61.k
    C41828t s(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, long j13, @Y61.l String str4, @Y61.l String str5, boolean z12);

    @Y61.k
    C41828t u(@Y61.k LocalMessage localMessage, @Y61.k String str);

    @Y61.k
    C41828t v(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Integer num, @Y61.l Q1 q12);

    @Y61.k
    C41828t y(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l Integer num);

    @Y61.k
    C41828t z(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l List list, @Y61.l Integer num);
}
