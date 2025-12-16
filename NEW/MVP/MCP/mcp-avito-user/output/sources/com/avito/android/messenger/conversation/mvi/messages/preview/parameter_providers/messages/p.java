package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: VideoMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends MessengerPreviewParameterProvider {
    public p() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        RY.a.f14512a.getClass();
        VideoInfo videoInfo = new VideoInfo("someVideoId", "", RY.a.f14513b.toString(), VideoStatus.Uploaded.INSTANCE, 90L);
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5)), null, null, false, null, new Image(P0.c()), null, null, videoInfo, null, "Входящее видео-сообщение\n(IncomingVideoMessage, MessageBody.Video)", null, null, null, null, null, null, null, 1073592285);
        Image image = new Image(P0.c());
        T1.d.b.C5574b c5574b = new T1.d.b.C5574b(new MessageBody.SystemMessageBody.Platform.Bubble.Video("someVideoId"));
        C42784z0 c42784z0 = C42784z0.f406748b;
        T1.d dVarB2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, null, "Video message from avito", false, null, image, null, null, videoInfo, null, "Платформенное видео-сообщение от Авито\n(PlatformVideoMessageFromAvito, Platform.FromAvito w/ Bubble.Video)", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, c42784z0, null, 14), 32759), 1006483405);
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        T1.d.b.a aVar = new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5));
        VideoStatus.Created created = VideoStatus.Created.INSTANCE;
        T1.d dVarB3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, aVar, null, "Transfer in progress video message", true, messageDeliveryStatus, null, null, null, new VideoInfo("someVideoId", "", "", created, 90L), null, "Исходящее видео-сообщение в процессе загрузки\n(OutgoingVideoMessage, MessageBody.Video Status.Created)", null, null, null, null, null, null, null, 1073594253);
        T1.d dVarB4 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5)), null, "Transfer in undefined progress video message", false, null, new Image(P0.c()), null, null, new VideoInfo("someVideoId", "", "", created, 90L), null, "Входящее видео-сообщение в процессе загрузки\n(IncomingVideoMessage, MessageBody.Video Status.Created)", null, null, null, null, null, null, null, 1073592269);
        T1.d dVarB5 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5)), null, null, true, null, new Image(P0.c()), null, null, null, null, "Исходящее видео-сообщение, которое не удалось отправить\n(IncomingVideoMessage, MessageBody.Video Status.Created isFailed)", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, null, 32511), 1006499805);
        T1.d dVarB6 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.C5574b(new MessageBody.SystemMessageBody.Platform.Bubble.Video("someVideoId")), null, null, true, null, new Image(P0.c()), null, null, VideoInfo.copy$default(videoInfo, null, null, null, VideoStatus.Error.INSTANCE, 0L, 23, null), null, "Исходящее видео-сообщение c ошибкой отправки\n(IncomingVideoMessage, MessageBody.Video Status.Error)", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, c42784z0, null, 14), 32503), 1006483421);
        T1.d dVarB7 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 7)), null, null, true, null, new Image(P0.c()), null, null, VideoInfo.copy$default(videoInfo, null, null, null, VideoStatus.Banned.INSTANCE, 0L, 23, null), null, "Исходящее видео-сообщение, которое забанили\n(IncomingVideoMessage, MessageBody.Video Status.Banned)", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, null, 32511), 1006483421);
        T1.d dVarB8 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5)), null, null, false, null, new Image(P0.c()), null, null, null, null, "Входящее видео-сообщение до получения доп. информации о нем\n(IncomingVideoMessage, MessageBody.Video, videoInfo==null)", null, null, null, null, null, null, null, 1073592285);
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.s(mVar, 5)), null, null, true, null, new Image(P0.c()), null, null, null, null, "Исходящее видео-сообщение до получения доп. информации о нем\n(IncomingVideoMessage, MessageBody.Video, videoInfo==null)", null, null, null, null, null, null, null, 1073592285), false), new MessengerPreviewParameterProvider.a(dVarB8, true), new MessengerPreviewParameterProvider.a(dVarB7, true), new MessengerPreviewParameterProvider.a(dVarB6, true), new MessengerPreviewParameterProvider.a(dVarB5, true), new MessengerPreviewParameterProvider.a(dVarB4, true), new MessengerPreviewParameterProvider.a(dVarB3, true), new MessengerPreviewParameterProvider.a(dVarB2, true), new MessengerPreviewParameterProvider.a(dVarB, true)});
    }

    public p(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
