package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: OldCallMessagePreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/j;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends MessengerPreviewParameterProvider {
    public j() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        Image image = new Image(P0.c());
        mVar.getClass();
        T1.d.b.a aVar = new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.a());
        h.a aVar2 = new h.a(R.plurals.seconds, 47);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_messenger_call_audio);
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, aVar, null, "12:34", true, null, image, null, null, null, null, "Исходящее сообщение о звонке внутри Авито, Старая версия, Исходящий проведенный звонок 47 сек\n(OldOutgoingAppCallMessage, succeeded 47 sec)", null, null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h("Исходящий звонок", null, null, aVar2, null, numValueOf, 22, null), null, null, null, 1071511501);
        Image image2 = new Image(P0.c());
        T1.d.b.a aVar3 = new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.a());
        com.akita.compose.theme.re23.b.f63983a.getClass();
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarB, true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, aVar3, null, "12:34", true, null, image2, null, null, null, null, "Исходящее сообщение о звонке внутри Авито, Старая версия, Несостоявшийся звонок\n(OldOutgoingAppCallMessage, failed)", null, null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h("Исходящий звонок", null, com.akita.compose.theme.re23.b.f63984b.f63880R0, null, "Перезвонить", numValueOf, 10, null), null, null, null, 1071511501), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(new MessageBody.Call(false)), null, "12:34", true, null, new Image(P0.c()), null, null, null, null, "Исходящее сообщение о GSM звонке , Старая версия, Несостоявшийся звонок\n(OldOutgoingGSMCallMessage, failed)", null, null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h(null, Integer.valueOf(R.string.message_body_description_outgoing_call), null, null, null, Integer.valueOf(R.drawable.common_ic_missed_call_outline_16), 29, null), null, null, null, 1071511501), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(new MessageBody.Call(true)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее сообщение о GSM звонке , Старая версия, Несостоявшийся звонок\n(OldIncomingGSMCallMessage, failed)", null, null, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h(null, Integer.valueOf(R.string.message_body_description_incoming_call), null, null, null, Integer.valueOf(R.drawable.common_ic_missed_call_outline_16), 29, null), null, null, null, 1071511501), true)});
    }

    public j(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
