package com.avito.android.messenger.conversation.mvi.video;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: VideoMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/h;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface h extends S20.a<b> {

    /* compiled from: VideoMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/h$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: VideoMessageClickInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f194999a = new b();
    }

    @Y61.k
    z<Throwable> Q();

    void a6(@Y61.k LocalMessage localMessage);

    @Y61.k
    /* renamed from: ca */
    com.jakewharton.rxrelay3.c getF195007b0();

    @Y61.k
    /* renamed from: pb */
    com.jakewharton.rxrelay3.c getF195009d0();

    void r2(@Y61.k LocalMessage localMessage, @Y61.k T1.d.b bVar, @Y61.l VideoInfo videoInfo);
}
