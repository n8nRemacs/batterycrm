package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

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

/* compiled from: LinkSnippetPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/h;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends MessengerPreviewParameterProvider {
    public h() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        RY.a.f14512a.getClass();
        Image image = RY.a.f14514c;
        T1.d dVarD = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.j(mVar, "https://www.youtube.com/watch?v=9SJPuAixZNM&t=1s", image, "YouTube или другое название контента в двух словах", "Правое полушарие интровёрта: Психологическое объяснение феномена и как его обойти в реальных условиях"), "Входящее сообщение с ссылкой, длинный title, длинный subtitle, длинный url \n(IncomingLinkSnippet)", null, null, null, null, 122);
        MessageBody.Link linkJ = com.avito.android.messenger.conversation.mvi.messages.utils.m.j(mVar, "https://avito.ru", image, "YouTube", "Правое");
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(mVar.k(linkJ, messageDeliveryStatus, "Исходящее сообщение с ссылкой, короткий title, короткий subtitle, короткий url \n(OutgoingLinkSnippet)"), false), new MessengerPreviewParameterProvider.a(dVarD, true), new MessengerPreviewParameterProvider.a(mVar.k(com.avito.android.messenger.conversation.mvi.messages.utils.m.j(mVar, "https://www.youtube.com/watch?v=9SJPuAixZNM&t=1s", null, "YouTube", null), messageDeliveryStatus, "Исходящее сообщение с ссылкой, короткий title, нет subtitle, длинный url, нет картинки \n(OutgoingLinkSnippet)"), true)});
    }

    public h(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
