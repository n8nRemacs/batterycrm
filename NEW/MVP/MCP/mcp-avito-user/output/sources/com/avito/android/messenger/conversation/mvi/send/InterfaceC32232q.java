package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import io.reactivex.rxjava3.internal.operators.observable.H1;
import io.reactivex.rxjava3.internal.operators.single.C42015m;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessageInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/q;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32232q {

    /* compiled from: SendMessageInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.q$a */
    public static final class a {
    }

    @Y61.k
    H1 a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Quote quote);

    @Y61.k
    C42015m b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k FeedbackAdvertItem feedbackAdvertItem, @Y61.l Quote quote);

    @Y61.k
    C42015m c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Voice voice, @Y61.k String str, @Y61.k String str2, long j12, @Y61.l Quote quote);

    @Y61.k
    C42015m d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Location location, @Y61.l Quote quote);

    @Y61.k
    C42015m e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Video video, @Y61.k Uri uri, @Y61.l String str, @Y61.k String str2, @Y61.l Quote quote);

    @Y61.k
    C42015m f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.W g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Quote quote, @Y61.l Long l12);

    @Y61.k
    io.reactivex.rxjava3.core.z<kotlin.G0> h();

    @Y61.k
    C42015m i(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.File file, @Y61.k Uri uri, @Y61.l Quote quote);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.I j(long j12, @Y61.k List list);
}
