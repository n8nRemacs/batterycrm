package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: VoiceMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/q;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q extends MessengerPreviewParameterProvider {
    public q() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее голосовое, готово к скачиванию или воспроизведению\n(IncomingVoiceMessage, default)", null, null, null, null, null, null, null, 1073608653);
        T1.d dVarB2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", true, null, new Image(P0.c()), null, null, null, null, "Исходящее голосовое, готово к скачиванию или воспроизведению\n(OutgoingVoiceMessage, default)", null, null, null, null, null, null, null, 1073608653);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVarU = com.avito.android.messenger.conversation.mvi.messages.utils.m.u(mVar, m.a.c.f192701a, 61);
        T1.d dVarB3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее голосовое, в процессе скачивания\n(IncomingVoiceMessage, downloading)", mVarU, null, null, null, null, null, null, 1073346509);
        T1.d dVarB4 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", true, null, new Image(P0.c()), null, null, null, null, "Исходящее голосовое, в процессе скачивания\n(IncomingVoiceMessage, downloading)", mVarU, null, null, null, null, null, null, 1073346509);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVarU2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.u(mVar, m.a.C5691a.f192699a, 1);
        T1.d dVarB5 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее голосовое, в процессе воспроизведения\n(IncomingVoiceMessage, playing)", mVarU2, null, null, null, null, null, null, 1073346509);
        T1.d dVarB6 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", true, null, new Image(P0.c()), null, null, null, null, "Исходящее голосовое, в процессе воспроизведения\n(IncomingVoiceMessage, playing)", mVarU2, null, null, null, null, null, null, 1073346509);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVarU3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.u(mVar, m.a.b.f192700a, 1);
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarB, true), new MessengerPreviewParameterProvider.a(dVarB2, false), new MessengerPreviewParameterProvider.a(dVarB3, true), new MessengerPreviewParameterProvider.a(dVarB4, false), new MessengerPreviewParameterProvider.a(dVarB5, true), new MessengerPreviewParameterProvider.a(dVarB6, false), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", false, null, new Image(P0.c()), null, null, null, null, "Входящее голосовое, на паузе\n(IncomingVoiceMessage, paused)", mVarU3, null, null, null, null, null, null, 1073346509), false), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, new T1.d.b.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.t(mVar)), null, "12:34", true, null, new Image(P0.c()), null, null, null, null, "Исходящее голосовое, на паузе\n(IncomingVoiceMessage, paused)", mVarU3, null, null, null, null, null, null, 1073346509), true)});
    }

    public q(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
