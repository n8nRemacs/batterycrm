package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: CallMessagePreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/a;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends MessengerPreviewParameterProvider {
    public a() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        Image image = new Image(P0.c());
        mVar.getClass();
        T1.d.b.a aVar = new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.a());
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar2 = com.akita.compose.theme.re23.b.f63984b;
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, aVar, null, "12:34", false, null, image, null, null, null, null, "Входящее сообщение о аудио-звонке внутри Авито, Исходящий проведенный звонок 15 сек\n(IncomingAppCallAudioMessage, succeeded 15 sec)", null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d("Входящий", null, aVar2.f63938l, "15 сек", Integer.valueOf(R.drawable.ic_messenger_call_audio), new d.a(R.drawable.ic_messenger_call_arrow_outgoing, aVar2.f63963t0), 2, null), null, null, null, null, 1072560077);
        Image image2 = new Image(P0.c());
        T1.d dVarB2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.a()), null, "12:34", true, null, image2, null, null, null, null, "Исходящее сообщение о видео-звонке внутри Авито, Исходящий отмененный звонок\n(OutgoingAppCallVideoMessage, canceled)", null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d("Исходящий видеозвонок", null, aVar2.f63938l, "Отменен", Integer.valueOf(R.drawable.ic_messenger_call_video), new d.a(R.drawable.ic_messenger_call_arrow_incoming, aVar2.f63880R0), 2, null), null, null, null, null, 1072560077);
        Image image3 = new Image(P0.c());
        T1.d dVarB3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.a()), null, "12:34", false, null, image3, null, null, null, null, "Входящее видео сообщение о звонке внутри Авито, Пропущенный звонок 5 раз\n(IncomingAppCallVideoMessage, missed)", null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d("Пропущенные видеозвонки (5)", null, aVar2.f63880R0, null, Integer.valueOf(R.drawable.ic_messenger_call_video), null, 42, null), null, null, null, null, 1072560077);
        Image image4 = new Image(P0.c());
        T1.d dVarB4 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(new MessageBody.Call(false)), null, "12:34", true, null, image4, null, null, null, null, "Исходящее сообщение о GSM звонке, Пропущенный звонок\n(OutgoingGSMCAllMessage, missed)", null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d(null, Integer.valueOf(R.string.message_body_description_incoming_call), aVar2.f63880R0, null, Integer.valueOf(R.drawable.common_ic_missed_call_outline_24), null, 41, null), null, null, null, null, 1072560077);
        Image image5 = new Image(P0.c());
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarB, true), new MessengerPreviewParameterProvider.a(dVarB2, true), new MessengerPreviewParameterProvider.a(dVarB3, true), new MessengerPreviewParameterProvider.a(dVarB4, true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(new MessageBody.Call(true)), null, "12:34", false, null, image5, null, null, null, null, "Входящее сообщение о GSM звонке, Пропущенный звонок\n(IncomingGSMCAllMessage, missed)", null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d(null, Integer.valueOf(R.string.message_body_description_outgoing_call), aVar2.f63938l, null, Integer.valueOf(R.drawable.common_ic_missed_call_outline_24), null, 41, null), null, null, null, null, 1072560077), true)});
    }

    public a(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
