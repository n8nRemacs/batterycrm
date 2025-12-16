package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.FileMessageData;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: FileMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/e;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends MessengerPreviewParameterProvider {
    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.c(mVar, "Фёдор Достоевский преступление и наказание.pdf", 362649L)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее голосовое, в процессе воспроизведения\n(IncomingVoiceMessage, playing)", null, new FileMessageData("Фёдор Достоевский преступление и наказание.pdf", 362649L, FileMessageData.IconState.f192472b), null, null, null, null, null, 1073084365);
        Image image = new Image(P0.c());
        T1.d.b.a aVar = new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.c(mVar, "Фёдор Достоевский преступление и наказание.pdf", 362649L));
        FileMessageData.IconState iconState = FileMessageData.IconState.f192474d;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarB, true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, aVar, null, "12:34", false, null, image, null, null, null, null, "Входящее сообщение с файлом, файл скачен\n(IncomingFileMessage, downloaded)", null, new FileMessageData("Фёдор Достоевский преступление и наказание.pdf", 362649L, iconState), null, null, null, null, null, 1073084365), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.c(mVar, "Фёдор Достоевский преступление и наказание.pdf", 362649L)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее сообщение с файлом, файл не скачен\n(IncomingFileMessage, not downloaded)", null, new FileMessageData("Фёдор Достоевский преступление и наказание.pdf", 362649L, FileMessageData.IconState.f192473c), null, null, null, null, null, 1073084365), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.c(mVar, "Фёдор Достоевский преступление и наказание.pdf", 362649L)), null, "12:34", true, null, null, null, null, null, null, "Исходящее сообщение с файлом, файл скачен\n(OutgoingFileMessage, downloaded)", null, new FileMessageData("Фёдор Достоевский преступление и наказание.pdf", 362649L, iconState), null, null, null, null, null, 1073086413), false), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.c(mVar, "(1).pdf", 5654L)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее сообщение с файлом с коротким названием, файл скачен\n(IncomingShortFileMessage, downloaded)", null, new FileMessageData("(1).pdf", 5654L, iconState), null, null, null, null, null, 1073084365), false)});
    }
}
