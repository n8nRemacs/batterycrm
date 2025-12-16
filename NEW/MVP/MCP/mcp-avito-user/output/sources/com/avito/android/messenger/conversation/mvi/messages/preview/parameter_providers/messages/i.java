package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: LocationMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/i;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends MessengerPreviewParameterProvider {
    public i() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, new MessageBody.Location(55.75581399999372d, 37.617634999999986d, "Кирочная ул., дом 3, Санкт-Петербург, Россия, 191028", null, null, 24, null), "Входящее гео-сообщение\n(IncomingLocationMessage, MessageBody.Location)", null, null, null, null, 122), true), new MessengerPreviewParameterProvider.a(mVar.e(new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation("Кирочная ул., дом 3, Санкт-Петербург, Россия, 191028", new GeoMarker[]{new GeoMarker(55.75581399999372d, 37.617634999999986d, null, null)}, null), "Входящее платформенное гео-сообщение от имени юзера\n(IncomingLocationMessage, Platform.FromUser w/ Bubble.GeoLocation)"), false), new MessengerPreviewParameterProvider.a(mVar.k(new MessageBody.Location(55.75581399999372d, 37.617634999999986d, "Кирочная ул., дом 3, Санкт-Петербург, Россия, 191028", null, null, 24, null), MessageDeliveryStatus.f186165d, "Исходящее гео-сообщение\n(OutgoingLocationMessage, MessageBody.Location)"), false), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.l(mVar, new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation("Кирочная ул., дом 3, Санкт-Петербург, Россия, 191028", new GeoMarker[]{new GeoMarker(55.75581399999372d, 37.617634999999986d, null, null)}, null), "Исходящее платформенное гео-сообщение от имени юзера\n(OutgoingLocationMessage, Platform.FromUser w/ Bubble.GeoLocation)"), true), new MessengerPreviewParameterProvider.a(mVar.q(new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation("Кирочная ул., дом 3, Санкт-Петербург, Россия, 191028", new GeoMarker[]{new GeoMarker(55.75581399999372d, 37.617634999999986d, null, null)}, null), "Платформенное гео-сообщение от Авито\n(PlatformGeoMessageFromAvito, Platform.FromAvito w/ Bubble.GeoLocation)"), true)});
    }

    public i(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
