package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageUpdateMerger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/o0;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32280o0 {

    /* compiled from: MessageUpdateMerger.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/o0$a;", "Lcom/avito/android/messenger/conversation/mvi/sync/o0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.o0$a */
    public static final class a implements InterfaceC32280o0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f194834a = new a();

        @Override // com.avito.android.messenger.conversation.mvi.sync.InterfaceC32280o0
        @Y61.k
        public final io.reactivex.rxjava3.core.I<List<LocalMessage>> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<LocalMessage> list) {
            return io.reactivex.rxjava3.core.I.q(list);
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<List<LocalMessage>> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<LocalMessage> list);
}
