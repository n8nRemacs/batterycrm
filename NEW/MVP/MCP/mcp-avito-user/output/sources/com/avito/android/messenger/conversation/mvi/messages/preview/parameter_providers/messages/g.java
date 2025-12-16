package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: ItemMessagesPreviewParameterProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/g;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends MessengerPreviewParameterProvider {
    public g() {
        this(null, 1, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
        T1.d dVarD = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.g(mVar), "Входящее сообщение-объявление\n(IncomingItemMessage, MessageBody.Item)", null, null, null, null, 122);
        T1.d dVarD2 = com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, new MessageBody.ItemReference("12345"), "Входящее сообщение-объявление в состоянии загрузки\n(IncomingItemMessage, MessageBody.ItemReference)", null, null, null, null, 122);
        T1.d dVarE = mVar.e(com.avito.android.messenger.conversation.mvi.messages.utils.m.p(mVar, null, "Подставка для ноутбука из натурального дерева вяза", null, null, new Image(Collections.singletonMap(new Size(140, 105), Uri.parse("https://i.ibb.co/0sHrb8Z/1st00013300-3.png"))), 93), "Входящее платформенное сообщение-объявление от имени юзера\n(IncomingPlatformItemMessage, Platform.FromUser w/ Bubble.Item)");
        MessageBody.Item itemG = com.avito.android.messenger.conversation.mvi.messages.utils.m.g(mVar);
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        T1.d dVarK = mVar.k(itemG, messageDeliveryStatus, "Исходящее сообщение-объявление\n(OutgoingItemMessage, MessageBody.Item)");
        T1.d dVarK2 = mVar.k(new MessageBody.ItemReference("12345"), messageDeliveryStatus, "Исходящее сообщение-объявление в состоянии загрузки\n(OutgoingItemMessage)");
        T1.d dVarL = com.avito.android.messenger.conversation.mvi.messages.utils.m.l(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.p(mVar, null, "Подставка для ноутбука из натурального дерева вяза", null, null, new Image(Collections.singletonMap(new Size(140, 105), Uri.parse("https://i.ibb.co/0sHrb8Z/1st00013300-3.png"))), 93), "Исходящее платформенное сообщение-объявление от имени юзера\n(OutgoingPlatformItemMessage, Platform.FromUser w/ Bubble.Item)");
        T1.d dVarQ = mVar.q(com.avito.android.messenger.conversation.mvi.messages.utils.m.p(mVar, null, "Подставка для ноутбука из натурального дерева вяза", null, null, new Image(Collections.singletonMap(new Size(140, 105), Uri.parse("https://i.ibb.co/0sHrb8Z/1st00013300-3.png"))), 93), "Сообщение-объявление от Авито\n(PlatformItemMessageFromAvito, Platform.FromAvito w/ Bubble.Item)");
        Image image = new Image(Collections.singletonMap(new Size(140, 105), Uri.parse("https://i.ibb.co/0sHrb8Z/1st00013300-3.png")));
        C42784z0 c42784z0 = C42784z0.f406748b;
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(dVarD, false), new MessengerPreviewParameterProvider.a(dVarD2, true), new MessengerPreviewParameterProvider.a(dVarE, false), new MessengerPreviewParameterProvider.a(dVarK, true), new MessengerPreviewParameterProvider.a(dVarK2, false), new MessengerPreviewParameterProvider.a(dVarL, true), new MessengerPreviewParameterProvider.a(dVarQ, true), new MessengerPreviewParameterProvider.a(mVar.q(new MessageBody.SystemMessageBody.Platform.Bubble.Item("12345", "Подставка для ноутбука из натурального дерева вяза", "25999 ₽", "36000 ₽", "м. Белорусская", image, "ru.avito://1/item/show?itemId=12345", new MessageBody.SystemMessageBody.Platform.ItemExtended(new AttributedText("60 00000 ₽", c42784z0, 0, 4, null), Collections.singletonList(new UniversalImage(new Image(Collections.singletonMap(new Size(235, 176), Uri.parse("https://i.ibb.co/pXL4c3v/bg-1.png"))), new Image(Collections.singletonMap(new Size(235, 176), Uri.parse("https://i.ibb.co/pXL4c3v/bg-1.png"))))), C42745f0.U(new MessageBody.SystemMessageBody.ExtendedTextFields.Text("text", new AttributedText("Нет ограничений в Росреестре  · Свободная продажа · Ипотека ВТБ", c42784z0, 0, 4, null)), new MessageBody.SystemMessageBody.ExtendedTextFields.Text("text", new AttributedText("Монолитный дом · 1987 год  ·  Запланирован снос", c42784z0, 0, 4, null)), new MessageBody.SystemMessageBody.ExtendedTextFields.Content("geo", new MessageBody.SystemMessageBody.ExtendedContent("400m", "6-10min", C42745f0.U(new MessageBody.SystemMessageBody.ExtendedColor("0x4FB04F"), new MessageBody.SystemMessageBody.ExtendedColor("0xfe0001")), "Texnopark", "ул. Чапаева, д. 22а"))), new MessageBody.SystemMessageBody.ExtendedActions(new MessageBody.SystemMessageBody.ExtendedButton("Заказать звонок", "overlayPrimarySmall", null, new AdvertDetailsLink("1234", null, null, null, null, null, null, null, null, null, null, 2044, null), 4, null), null, new MessageBody.SystemMessageBody.ExtendedButton("Позвонить", "accentSmall", null, new AdvertDetailsLink("1234", null, null, null, null, null, null, null, null, null, null, 2044, null), 4, null)))), "Сообщение-объявление от Авито\n(PlatformExtendedItemMessageFromAvito, Platform.FromAvito w/ Bubble.Item)"), true)});
    }

    public g(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193056d : previewConfig);
    }
}
