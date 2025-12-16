package com.avito.android.messenger;

import Oq.InterfaceC14725a;
import android.net.Uri;
import com.avito.android.C30277e1;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.ChatAvatar;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.ReadOnlyState;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35837l2;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import ru.avito.messenger.api.entity.Avatar;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.Images;
import ru.avito.messenger.api.entity.PublicProfile;
import ru.avito.messenger.api.entity.body.CallReference;
import ru.avito.messenger.api.entity.body.ImageReference;
import ru.avito.messenger.api.entity.body.ItemReference;
import ru.avito.messenger.api.entity.body.Text;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import ru.avito.messenger.api.entity.body.item.Item;
import ru.avito.messenger.api.entity.body.item.Unknown;

/* compiled from: MessengerEntityConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/C;", "Lcom/avito/android/messenger/B;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q0 f186139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f186140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C31667x f186141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186142d;

    @Inject
    public C(@Y61.k q0 q0Var, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k C31667x c31667x, @Y61.k C30277e1 c30277e1) {
        this.f186139a = q0Var;
        this.f186140b = xVar;
        this.f186141c = c31667x;
        this.f186142d = c30277e1;
    }

    public static Image i(ru.avito.messenger.api.entity.Image image) {
        Map<String, Uri> variants = image.getVariants();
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
        Iterator<T> it = variants.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(C35837l2.a((String) entry.getKey()), entry.getValue());
        }
        return new Image(C35755b0.b(linkedHashMap));
    }

    @Override // com.avito.android.messenger.B
    @Y61.k
    public final MessageBody a(@Y61.k BodyItem bodyItem) {
        ru.avito.messenger.api.entity.Image image;
        Image imageI = null;
        if (!(bodyItem instanceof Item)) {
            return bodyItem instanceof Unknown ? new MessageBody.Unknown(((Unknown) bodyItem).f430731b, null, 2, null) : new MessageBody.Unknown("unknown", null, 2, null);
        }
        Item item = (Item) bodyItem;
        String id2 = item.getId();
        String userId = item.getUserId();
        String title = item.getTitle();
        String formattedPrice = item.getFormattedPrice();
        String location = item.getLocation();
        Images images = item.getImages();
        if (images != null && (image = images.getImage()) != null) {
            imageI = i(image);
        }
        return new MessageBody.Item(id2, userId, title, imageI, formattedPrice, location);
    }

    @Override // com.avito.android.messenger.B
    @Y61.k
    public final User b(@Y61.k ChannelUser channelUser) {
        ChatAvatar chatAvatar;
        String id2 = channelUser.getId();
        String name = channelUser.getName();
        Long lastActionTime = channelUser.getLastActionTime();
        Long timeDiff = channelUser.getTimeDiff();
        PublicProfile publicProfile = channelUser.getPublicProfile();
        com.avito.android.remote.model.messenger.PublicProfile publicProfile2 = null;
        if (publicProfile != null) {
            Avatar avatar = publicProfile.getAvatar();
            if (avatar != null) {
                String str = avatar.getDefault();
                ru.avito.messenger.api.entity.Image image = avatar.getImage();
                chatAvatar = new ChatAvatar(str, image != null ? i(image) : null);
            } else {
                chatAvatar = null;
            }
            SimpleAction action = publicProfile.getAction();
            publicProfile2 = new com.avito.android.remote.model.messenger.PublicProfile(chatAvatar, action != null ? h(action) : null);
        }
        return new User(id2, name, lastActionTime, timeDiff, publicProfile2, channelUser.getLabel());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    @Override // com.avito.android.messenger.B
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.messenger.Channel c(@Y61.k ru.avito.messenger.MessengerUserHashInfo r35, @Y61.k ru.avito.messenger.api.entity.Channel r36) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.C.c(ru.avito.messenger.MessengerUserHashInfo, ru.avito.messenger.api.entity.Channel):com.avito.android.remote.model.messenger.Channel");
    }

    @Override // com.avito.android.messenger.B
    @Y61.k
    public final ReadOnlyState d(@Y61.k ru.avito.messenger.api.entity.ReadOnlyState readOnlyState) {
        String reason = readOnlyState.getReason();
        String description = readOnlyState.getDescription();
        if (description == null) {
            description = "";
        }
        return new ReadOnlyState(reason, description);
    }

    @Override // com.avito.android.messenger.B
    @Y61.k
    public final MessageBody.ImageBody e(@Y61.k ru.avito.messenger.api.entity.Image image) {
        return new MessageBody.ImageBody(i(image));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    @Override // com.avito.android.messenger.B
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.messenger.message.LocalMessage f(@Y61.l ru.avito.messenger.MessengerUserHashInfo r31, @Y61.k ru.avito.messenger.api.entity.ChatMessage r32) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.C.f(ru.avito.messenger.MessengerUserHashInfo, ru.avito.messenger.api.entity.ChatMessage):com.avito.android.remote.model.messenger.message.LocalMessage");
    }

    @Override // com.avito.android.messenger.B
    @Y61.k
    public final InputState g(@Y61.k ru.avito.messenger.api.entity.InputState inputState) {
        return new InputState(inputState.getIsDisabled(), inputState.getReason(), inputState.getDescription());
    }

    public final Action h(SimpleAction simpleAction) {
        return new Action(simpleAction.getTitle(), this.f186140b.e(simpleAction.getUri()), null, null, simpleAction.getUri().toString(), null, null, null, null, null, null, null, null, null, null, null, 65516, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessageBody j(ru.avito.messenger.api.entity.body.MessageBody messageBody, boolean z12, PlatformSupport platformSupport) {
        MessageBody fromUser;
        List<String> platforms;
        if ((platformSupport == null || (platforms = platformSupport.getPlatforms()) == null) ? true : platforms.contains("android")) {
            boolean z13 = messageBody instanceof MessageBody.Text.Reaction;
            C31667x c31667x = this.f186141c;
            q0 q0Var = this.f186139a;
            if (z13) {
                try {
                    MessageBody.Text.Reaction reaction = (MessageBody.Text.Reaction) messageBody;
                    return new MessageBody.Text.Reaction(reaction.getText(), q0Var.a(reaction.getText()), reaction.getF430729c(), null, 8, null);
                } catch (Throwable th2) {
                    MessengerConversionAfterParsingException messengerConversionAfterParsingException = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th2);
                    V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException);
                    InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException, null, 6);
                    return new MessageBody.Unknown(MessageBody.Text.Reaction.TYPE, null, 2, null);
                }
            }
            if (messageBody instanceof MessageBody) {
                if (messageBody instanceof MessageBody.AppCall) {
                    try {
                        MessageBody.AppCall appCall = (MessageBody.AppCall) messageBody;
                        fromUser = appCall.copy((1023 & 1) != 0 ? appCall.text : null, (1023 & 2) != 0 ? appCall.call : null, (1023 & 4) != 0 ? appCall.callId : null, (1023 & 8) != 0 ? appCall.duration : null, (1023 & 16) != 0 ? appCall.direction : null, (1023 & 32) != 0 ? appCall.status : null, (1023 & 64) != 0 ? appCall.title : null, (1023 & 128) != 0 ? appCall.subtitle : null, (1023 & 256) != 0 ? appCall.isVideo : null, (1023 & 512) != 0 ? appCall.randomId : null);
                    } catch (Throwable th3) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException2 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th3);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException2);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException2, null, 6);
                        fromUser = new MessageBody.Unknown(MessageBody.AppCall.TYPE, null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.Deleted) {
                    try {
                        fromUser = MessageBody.Deleted.copy$default((MessageBody.Deleted) messageBody, null, null, 3, null);
                    } catch (Throwable th4) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException3 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th4);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException3);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException3, null, 6);
                        fromUser = new MessageBody.Unknown("deleted", null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.File) {
                    try {
                        fromUser = MessageBody.File.copy$default((MessageBody.File) messageBody, null, null, 0L, null, null, 31, null);
                    } catch (Throwable th5) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException4 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th5);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException4);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException4, null, 6);
                        fromUser = new MessageBody.Unknown("file", null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.Link) {
                    try {
                        fromUser = MessageBody.Link.copy$default((MessageBody.Link) messageBody, null, null, null, false, 15, null);
                    } catch (Throwable th6) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException5 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th6);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException5);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException5, null, 6);
                        fromUser = new MessageBody.Unknown("link", null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.Location) {
                    try {
                        MessageBody.Location location = (MessageBody.Location) messageBody;
                        fromUser = location.copy((31 & 1) != 0 ? location.latitude : 0.0d, (31 & 2) != 0 ? location.longitude : 0.0d, (31 & 4) != 0 ? location.title : null, (31 & 8) != 0 ? location.kind : null, (31 & 16) != 0 ? location.randomId : null);
                    } catch (Throwable th7) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException6 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th7);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException6);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException6, null, 6);
                        fromUser = new MessageBody.Unknown("location", null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromAvito) {
                    try {
                        fromUser = MessageBody.SystemMessageBody.Platform.FromAvito.copy$default((MessageBody.SystemMessageBody.Platform.FromAvito) messageBody, null, null, null, null, null, 31, null);
                    } catch (Throwable th8) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException7 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th8);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException7);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException7, null, 6);
                        fromUser = new MessageBody.Unknown(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE, null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
                    try {
                        fromUser = MessageBody.SystemMessageBody.Platform.FromUser.copy$default((MessageBody.SystemMessageBody.Platform.FromUser) messageBody, null, null, null, null, null, 31, null);
                    } catch (Throwable th9) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException8 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th9);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException8);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException8, null, 6);
                        fromUser = new MessageBody.Unknown(MessageBody.SystemMessageBody.Platform.FromUser.TYPE, null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.SystemMessageBody.Text) {
                    try {
                        fromUser = MessageBody.SystemMessageBody.Text.copy$default((MessageBody.SystemMessageBody.Text) messageBody, null, 1, null);
                    } catch (Throwable th10) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException9 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th10);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException9);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException9, null, 6);
                        fromUser = new MessageBody.Unknown(MessageBody.SystemMessageBody.Text.TYPE, null, 2, null);
                    }
                } else if (messageBody instanceof MessageBody.Video) {
                    try {
                        fromUser = MessageBody.Video.copy$default((MessageBody.Video) messageBody, null, null, null, 7, null);
                    } catch (Throwable th11) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException10 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th11);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException10);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException10, null, 6);
                        fromUser = new MessageBody.Unknown("video", null, 2, null);
                    }
                } else {
                    if (!(messageBody instanceof MessageBody.Voice)) {
                        return (MessageBody) messageBody;
                    }
                    try {
                        fromUser = MessageBody.Voice.copy$default((MessageBody.Voice) messageBody, null, null, 3, null);
                    } catch (Throwable th12) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException11 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th12);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException11);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException11, null, 6);
                        fromUser = new MessageBody.Unknown("voice", null, 2, null);
                    }
                }
            } else if (messageBody instanceof ItemReference) {
                try {
                    return new MessageBody.ItemReference(((ItemReference) messageBody).getItemId());
                } catch (Throwable th13) {
                    MessengerConversionAfterParsingException messengerConversionAfterParsingException12 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th13);
                    V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException12);
                    InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException12, null, 6);
                    fromUser = new MessageBody.Unknown("item", null, 2, null);
                }
            } else {
                if (messageBody instanceof Text) {
                    try {
                        Text text = (Text) messageBody;
                        String text2 = text.getText();
                        ArrayList arrayListA = q0Var.a(text.getText());
                        boolean zF2 = kotlin.jvm.internal.L.f(text.getUrlsAreTrusted(), Boolean.TRUE);
                        C30277e1 c30277e1 = this.f186142d;
                        c30277e1.getClass();
                        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[70];
                        return new MessageBody.Text.Regular(text2, null, arrayListA, zF2, ((Boolean) c30277e1.f145034q0.a().invoke()).booleanValue() ? text.getAttrText() : null);
                    } catch (Throwable th14) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException13 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th14);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException13);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException13, null, 6);
                        return new MessageBody.Unknown("text", null, 2, null);
                    }
                }
                if (messageBody instanceof CallReference) {
                    try {
                        return new MessageBody.Call(!z12);
                    } catch (Throwable th15) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException14 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th15);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException14);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException14, null, 6);
                        fromUser = new MessageBody.Unknown("call", null, 2, null);
                    }
                } else if (messageBody instanceof ImageReference) {
                    try {
                        return new MessageBody.ImageReference(((ImageReference) messageBody).getImageId());
                    } catch (Throwable th16) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException15 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th16);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException15);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException15, null, 6);
                        fromUser = new MessageBody.Unknown("image", null, 2, null);
                    }
                } else if (messageBody instanceof ru.avito.messenger.api.entity.body.Unknown) {
                    try {
                        return new MessageBody.Unknown(((ru.avito.messenger.api.entity.body.Unknown) messageBody).f430728b, null, 2, null);
                    } catch (Throwable th17) {
                        MessengerConversionAfterParsingException messengerConversionAfterParsingException16 = new MessengerConversionAfterParsingException("Conversion failed for API MessageBody: " + messageBody, th17);
                        V2.f318762a.a("DEFAULT_TAG", "MsgEntityConverter", messengerConversionAfterParsingException16);
                        InterfaceC14725a.C0808a.a(c31667x, messengerConversionAfterParsingException16, null, 6);
                        fromUser = new MessageBody.Unknown("unknown", null, 2, null);
                    }
                } else {
                    V2.f318762a.c("MsgEntityConverter", "Unknown message body: " + messageBody, null);
                    fromUser = new MessageBody.Unknown("unknown", null, 2, null);
                }
            }
        } else {
            AttributedText fallbackText = platformSupport != null ? platformSupport.getFallbackText() : null;
            if (fallbackText == null) {
                return new MessageBody.Unknown("platform_not_supported", null, 2, null);
            }
            List listSingletonList = Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(fallbackText));
            fromUser = messageBody instanceof MessageBody.SystemMessageBody.Platform.FromUser ? new MessageBody.SystemMessageBody.Platform.FromUser(listSingletonList, null, null, null, null, 30, null) : new MessageBody.SystemMessageBody.Platform.FromAvito(listSingletonList, null, null, null, null, 30, null);
        }
        return fromUser;
    }
}
