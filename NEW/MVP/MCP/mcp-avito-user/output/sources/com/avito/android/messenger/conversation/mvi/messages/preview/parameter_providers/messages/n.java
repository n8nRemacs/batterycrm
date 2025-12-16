package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;

/* compiled from: TextMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/n;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends MessengerPreviewParameterProvider {
    public n() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        T1.d dVarD = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, "This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", C42745f0.U(new MessageBody.Text.Chunk.Plain(0, C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", "text", 0, false, 6) + 4), new MessageBody.Text.Chunk.Link(C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", Constants.SCHEME, 0, false, 6), C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", "com", 0, false, 6) + 3), new MessageBody.Text.Chunk.Plain(C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", "Phone", 0, false, 6), C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", "And", 0, false, 6) - 2), new MessageBody.Text.Chunk.Plain(C43066x.I("This is plain text https://www.google.com Phone number +79991234567 and email test@test.com And some emojies: 😁 😁 😁", "And", 0, false, 6), 117)), true, 2), "Входящее текстовое сообщение\n(IncomingTextMessage, MessageBody.Text)", null, null, null, null, 122);
        MessageBody.Text.Regular regularH = com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, "This is untrusted link message https://google.com", C42745f0.U(new MessageBody.Text.Chunk.Plain(0, C43066x.I("This is untrusted link message https://google.com", Constants.SCHEME, 0, false, 6) - 2), new MessageBody.Text.Chunk.Link(C43066x.I("This is untrusted link message https://google.com", Constants.SCHEME, 0, false, 6), 48)), false, 2);
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, "😁", Collections.singletonList(new MessageBody.Text.Chunk.Plain(0, 1)), false, 2), "Входяшее текстовое сообщение, состоящее из одного Emoji \n(OutgoingTextMessage, MessageBody.Text)", null, null, null, null, 122), true), new MessengerPreviewParameterProvider.a(mVar.k(regularH, messageDeliveryStatus, "Исходяшее текстовое сообщение\n(OutgoingTextMessage, MessageBody.Text)"), true), new MessengerPreviewParameterProvider.a(dVarD, false), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, "A b c d e f g h i j k l m n o p q r s t u v w x y z A b c d e f g h i j k l m n o p q r s t u v w x y z A b c d e f g h i j k l m n o p q r s t u v w x y z ", Collections.singletonList(new MessageBody.Text.Chunk.Plain(0, 155)), false, 2), "Входяшее текстовое сообщение с длинным текстом по одной букве \n(IncomingTextMessage, MessageBody.Text)", null, null, null, null, 122), false), new MessengerPreviewParameterProvider.a(mVar.k(com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, "A b c d e f g h i j k l m n o p q r s t u v w x y z A b c d e f g h i j k l m n o p q r s t u v w x y z A b c d e f g h i j k l m n o p q r s t u v w x y z ", Collections.singletonList(new MessageBody.Text.Chunk.Plain(0, 155)), false, 2), messageDeliveryStatus, "Исходящее текстовое сообщение с длинным текстом по одной букве \n(IncomingTextMessage, MessageBody.Text)"), false)});
    }

    public n(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
