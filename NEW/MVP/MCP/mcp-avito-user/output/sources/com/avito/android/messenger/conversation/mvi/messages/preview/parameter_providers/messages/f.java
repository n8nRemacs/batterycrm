package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: ImageMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/f;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends MessengerPreviewParameterProvider {
    public f() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        RY.a.f14512a.getClass();
        Image image = RY.a.f14514c;
        mVar.getClass();
        T1.d dVarD = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, new MessageBody.ImageBody(image), "Входящее сообщение-картинка\n(IncomingImageMessage, MessageBody.Image)", null, null, null, null, 122);
        T1.d dVarD2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, new MessageBody.ImageReference("someImageId"), "Входящее сообщение-картинка, в процессе скачивания\n(IncomingImageMessage, MessageBody.ImageReference)", null, null, null, null, 122);
        Uri uri = RY.a.f14513b;
        T1.d dVarD3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.i(mVar, uri.toString(), uri.toString(), image), "Входящее сообщение-ссылка на картинку\n(IncomingImageMessage, MessageBody.Link with Preview.Image)", null, null, null, null, 122);
        T1.d dVarE = mVar.e(com.avito.android.messenger.conversation.mvi.messages.utils.m.o(mVar, image), "Входящее платформенное сообщение-картинка от имени юзера\n(IncomingImageMessage, Platform.FromUser)");
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarD, true), new MessengerPreviewParameterProvider.a(dVarD2, true), new MessengerPreviewParameterProvider.a(dVarD3, false), new MessengerPreviewParameterProvider.a(dVarE, false), new MessengerPreviewParameterProvider.a(mVar.k(new MessageBody.ImageBody(image), messageDeliveryStatus, "Исходящее сообщение-картинка\n(OutgoingImageMessage, MessageBody.Image)"), false), new MessengerPreviewParameterProvider.a(mVar.k(new MessageBody.ImageBody(image), MessageDeliveryStatus.f186163b, "Исходящее сообщение-картинка, в процессе отправки\n(OutgoingImageMessage, MessageBody.Image, uploading)"), true), new MessengerPreviewParameterProvider.a(mVar.k(new MessageBody.ImageReference("someImageId"), messageDeliveryStatus, "Исходящее сообщение-картинка, в процессе скачивания\n(OutgoingImageMessage, MessageBody.ImageReference)"), false), new MessengerPreviewParameterProvider.a(mVar.k(com.avito.android.messenger.conversation.mvi.messages.utils.m.i(mVar, uri.toString(), uri.toString(), image), messageDeliveryStatus, "Исходящее сообщение-ссылка на картинку\n(OutgoingImageMessage, MessageBody.Link with Preview.Image)"), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.l(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.o(mVar, image), "Исходящее платформенное сообщение-картинка от имени юзера\n(OutgoingImageMessage, Platform.FromUser)"), true), new MessengerPreviewParameterProvider.a(mVar.q(com.avito.android.messenger.conversation.mvi.messages.utils.m.o(mVar, image), "Платформенное сообщение-картинка от Авито\n(PlatformImageMessageFromAvito)"), true)});
    }

    public f(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
