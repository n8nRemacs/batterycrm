package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: FileMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/N;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface N extends S20.a<b> {

    /* compiled from: FileMessageClickInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: FileMessageClickInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f190850a = new b();
    }

    void B7(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num);

    @Y61.k
    com.jakewharton.rxrelay3.c L5();

    @Y61.k
    com.jakewharton.rxrelay3.c M9();

    void w6(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num);
}
