package com.avito.android.messenger.conversation.mvi.file_download;

import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32038b {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.A a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12, @Y61.l List list, @Y61.l Integer num);

    @Y61.k
    W b(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41811b c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l List list, @Y61.l Integer num);
}
