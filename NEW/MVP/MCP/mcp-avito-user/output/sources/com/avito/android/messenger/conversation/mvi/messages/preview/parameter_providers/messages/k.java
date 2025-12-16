package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: PlatformTextMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/k;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends MessengerPreviewParameterProvider {
    public k() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        AttributedText attributedText = new AttributedText("{{text}} - {{link}} - {{deep}}", C42745f0.U(new LinkAttribute("link", "link", "http://link", null, 8, null), new FontAttribute("text", "colored text", Collections.singletonList(new FontParameter.ColorParameter(null, null, "red600"))), new DeepLinkAttribute("deep", Constants.DEEPLINK, new BeduinUniversalPageLink("/api/1/installments/details/buyer", "bottomSheet", "installmentsBuyerDetails", null, null, null, null, 120, null), null, null, null, 56, null)), 0, 4, null);
        mVar.getClass();
        T1.d.b.C5574b c5574b = new T1.d.b.C5574b(new MessageBody.SystemMessageBody.Platform.Bubble.Text(attributedText));
        T1.d dVarB = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, null, null, false, null, new Image(P0.c()), null, null, null, null, "Платформенное текстовое сообщение от Авито", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, null, null, 15), 32759), 1006499805);
        T1.d dVarB2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, null, null, false, null, new Image(P0.c()), null, null, null, null, "Входящее платформенное текстовое сообщение", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.n(mVar, null, 15), 32759), 1006499805);
        T1.d dVarB3 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, null, null, true, null, new Image(P0.c()), null, null, null, null, "Исходящее платформенное текстовое сообщение", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.n(mVar, null, 15), 32759), 1006499805);
        T1.d dVarB4 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, "Ассистент Авито", null, false, null, new Image(P0.c()), null, new T1.c(true, true, false, false, false, false, false, false, true, 252, null), null, null, "Платформенное текстовое сообщение от Ассистента Авито", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, null, "smart-assistant", 11), 32759), 738056153);
        Image image = new Image(P0.c());
        LocalMessage localMessageF = com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, null, "smart-assistant-reply", 11), 32759);
        com.akita.compose.theme.re23.e eVar = com.akita.compose.theme.re23.e.f64437a;
        T1.d dVarB5 = com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, "Ответ Ассистента Авито", null, false, null, image, null, new T1.c(true, true, false, false, false, false, false, false, true, 252, null), null, null, "Платформенное текстовое сообщение-ответ от Ассистента Авито", null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.f.a(), localMessageF, 461232089);
        Image image2 = new Image(P0.c());
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVarA = com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.c.a();
        int i12 = com.avito.android.messenger.conversation.mvi.messages.composables.other.shapes.l.f192844a;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarB, true), new MessengerPreviewParameterProvider.a(dVarB2, false), new MessengerPreviewParameterProvider.a(dVarB3, false), new MessengerPreviewParameterProvider.a(dVarB4, false), new MessengerPreviewParameterProvider.a(dVarB5, true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(mVar, c5574b, "Ассистент продавца", null, false, null, image2, new T1.d.a(kVarA, com.avito.android.messenger.conversation.mvi.messages.composables.other.shapes.c.a()), new T1.c(true, true, false, false, false, false, false, false, true, 252, null), null, null, "Платформенное текстовое сообщение от Ассистента продавца", null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.utils.m.f(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.m(mVar, null, "smart-assistant", 11), 32759), 738052057), true)});
    }

    public k(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
