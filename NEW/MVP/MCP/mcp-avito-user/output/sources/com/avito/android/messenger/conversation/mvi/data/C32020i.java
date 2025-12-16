package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageBodySerializer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/i;", "Lcom/avito/android/messenger/conversation/mvi/data/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.data.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32020i implements InterfaceC32019h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f190475a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f190476b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f190477c;

    public C32020i(@Y61.k Gson gson) {
        this.f190475a = gson;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f190476b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f190477c = linkedHashMap2;
        if (linkedHashMap.containsKey("text") || linkedHashMap2.containsKey(MessageBody.Text.Regular.class)) {
            throw new IllegalStateException("Type is already registered: type = text, clazz = ".concat(MessageBody.Text.Regular.class.getName()));
        }
        linkedHashMap.put("text", MessageBody.Text.Regular.class);
        linkedHashMap2.put(MessageBody.Text.Regular.class, "text");
        if (linkedHashMap.containsKey(MessageBody.Text.Reaction.TYPE) || linkedHashMap2.containsKey(MessageBody.Text.Reaction.class)) {
            throw new IllegalStateException("Type is already registered: type = text/reaction, clazz = ".concat(MessageBody.Text.Reaction.class.getName()));
        }
        linkedHashMap.put(MessageBody.Text.Reaction.TYPE, MessageBody.Text.Reaction.class);
        linkedHashMap2.put(MessageBody.Text.Reaction.class, MessageBody.Text.Reaction.TYPE);
        if (linkedHashMap.containsKey("image") || linkedHashMap2.containsKey(MessageBody.ImageBody.class)) {
            throw new IllegalStateException("Type is already registered: type = image, clazz = ".concat(MessageBody.ImageBody.class.getName()));
        }
        linkedHashMap.put("image", MessageBody.ImageBody.class);
        linkedHashMap2.put(MessageBody.ImageBody.class, "image");
        if (linkedHashMap.containsKey("item") || linkedHashMap2.containsKey(MessageBody.Item.class)) {
            throw new IllegalStateException("Type is already registered: type = item, clazz = ".concat(MessageBody.Item.class.getName()));
        }
        linkedHashMap.put("item", MessageBody.Item.class);
        linkedHashMap2.put(MessageBody.Item.class, "item");
        if (linkedHashMap.containsKey(MessageBody.Call.TYPE) || linkedHashMap2.containsKey(MessageBody.Call.class)) {
            throw new IllegalStateException("Type is already registered: type = missed_call, clazz = ".concat(MessageBody.Call.class.getName()));
        }
        linkedHashMap.put(MessageBody.Call.TYPE, MessageBody.Call.class);
        linkedHashMap2.put(MessageBody.Call.class, MessageBody.Call.TYPE);
        if (linkedHashMap.containsKey(MessageBody.AppCall.TYPE) || linkedHashMap2.containsKey(MessageBody.AppCall.class)) {
            throw new IllegalStateException("Type is already registered: type = appCall, clazz = ".concat(MessageBody.AppCall.class.getName()));
        }
        linkedHashMap.put(MessageBody.AppCall.TYPE, MessageBody.AppCall.class);
        linkedHashMap2.put(MessageBody.AppCall.class, MessageBody.AppCall.TYPE);
        if (linkedHashMap.containsKey("link") || linkedHashMap2.containsKey(MessageBody.Link.class)) {
            throw new IllegalStateException("Type is already registered: type = link, clazz = ".concat(MessageBody.Link.class.getName()));
        }
        linkedHashMap.put("link", MessageBody.Link.class);
        linkedHashMap2.put(MessageBody.Link.class, "link");
        if (linkedHashMap.containsKey("file") || linkedHashMap2.containsKey(MessageBody.File.class)) {
            throw new IllegalStateException("Type is already registered: type = file, clazz = ".concat(MessageBody.File.class.getName()));
        }
        linkedHashMap.put("file", MessageBody.File.class);
        linkedHashMap2.put(MessageBody.File.class, "file");
        if (linkedHashMap.containsKey("video") || linkedHashMap2.containsKey(MessageBody.Video.class)) {
            throw new IllegalStateException("Type is already registered: type = video, clazz = ".concat(MessageBody.Video.class.getName()));
        }
        linkedHashMap.put("video", MessageBody.Video.class);
        linkedHashMap2.put(MessageBody.Video.class, "video");
        if (linkedHashMap.containsKey("voice") || linkedHashMap2.containsKey(MessageBody.Voice.class)) {
            throw new IllegalStateException("Type is already registered: type = voice, clazz = ".concat(MessageBody.Voice.class.getName()));
        }
        linkedHashMap.put("voice", MessageBody.Voice.class);
        linkedHashMap2.put(MessageBody.Voice.class, "voice");
        if (linkedHashMap.containsKey("location") || linkedHashMap2.containsKey(MessageBody.Location.class)) {
            throw new IllegalStateException("Type is already registered: type = location, clazz = ".concat(MessageBody.Location.class.getName()));
        }
        linkedHashMap.put("location", MessageBody.Location.class);
        linkedHashMap2.put(MessageBody.Location.class, "location");
        if (linkedHashMap.containsKey("deleted") || linkedHashMap2.containsKey(MessageBody.Deleted.class)) {
            throw new IllegalStateException("Type is already registered: type = deleted, clazz = ".concat(MessageBody.Deleted.class.getName()));
        }
        linkedHashMap.put("deleted", MessageBody.Deleted.class);
        linkedHashMap2.put(MessageBody.Deleted.class, "deleted");
        if (linkedHashMap.containsKey(MessageBody.LocalImage.TYPE) || linkedHashMap2.containsKey(MessageBody.LocalImage.class)) {
            throw new IllegalStateException("Type is already registered: type = local_image, clazz = ".concat(MessageBody.LocalImage.class.getName()));
        }
        linkedHashMap.put(MessageBody.LocalImage.TYPE, MessageBody.LocalImage.class);
        linkedHashMap2.put(MessageBody.LocalImage.class, MessageBody.LocalImage.TYPE);
        if (linkedHashMap.containsKey(MessageBody.ImageReference.TYPE) || linkedHashMap2.containsKey(MessageBody.ImageReference.class)) {
            throw new IllegalStateException("Type is already registered: type = image_ref, clazz = ".concat(MessageBody.ImageReference.class.getName()));
        }
        linkedHashMap.put(MessageBody.ImageReference.TYPE, MessageBody.ImageReference.class);
        linkedHashMap2.put(MessageBody.ImageReference.class, MessageBody.ImageReference.TYPE);
        if (linkedHashMap.containsKey(MessageBody.ItemReference.TYPE) || linkedHashMap2.containsKey(MessageBody.ItemReference.class)) {
            throw new IllegalStateException("Type is already registered: type = item_ref, clazz = ".concat(MessageBody.ItemReference.class.getName()));
        }
        linkedHashMap.put(MessageBody.ItemReference.TYPE, MessageBody.ItemReference.class);
        linkedHashMap2.put(MessageBody.ItemReference.class, MessageBody.ItemReference.TYPE);
        if (linkedHashMap.containsKey("unknown") || linkedHashMap2.containsKey(MessageBody.Unknown.class)) {
            throw new IllegalStateException("Type is already registered: type = unknown, clazz = ".concat(MessageBody.Unknown.class.getName()));
        }
        linkedHashMap.put("unknown", MessageBody.Unknown.class);
        linkedHashMap2.put(MessageBody.Unknown.class, "unknown");
        if (linkedHashMap.containsKey(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE) || linkedHashMap2.containsKey(MessageBody.SystemMessageBody.Platform.FromAvito.class)) {
            throw new IllegalStateException("Type is already registered: type = system/platform, clazz = ".concat(MessageBody.SystemMessageBody.Platform.FromAvito.class.getName()));
        }
        linkedHashMap.put(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE, MessageBody.SystemMessageBody.Platform.FromAvito.class);
        linkedHashMap2.put(MessageBody.SystemMessageBody.Platform.FromAvito.class, MessageBody.SystemMessageBody.Platform.FromAvito.TYPE);
        if (linkedHashMap.containsKey(MessageBody.SystemMessageBody.Platform.FromUser.TYPE) || linkedHashMap2.containsKey(MessageBody.SystemMessageBody.Platform.FromUser.class)) {
            throw new IllegalStateException("Type is already registered: type = system/platformFromUser, clazz = ".concat(MessageBody.SystemMessageBody.Platform.FromUser.class.getName()));
        }
        linkedHashMap.put(MessageBody.SystemMessageBody.Platform.FromUser.TYPE, MessageBody.SystemMessageBody.Platform.FromUser.class);
        linkedHashMap2.put(MessageBody.SystemMessageBody.Platform.FromUser.class, MessageBody.SystemMessageBody.Platform.FromUser.TYPE);
        if (linkedHashMap.containsKey(MessageBody.SystemMessageBody.Text.TYPE) || linkedHashMap2.containsKey(MessageBody.SystemMessageBody.Text.class)) {
            throw new IllegalStateException("Type is already registered: type = system/text, clazz = ".concat(MessageBody.SystemMessageBody.Text.class.getName()));
        }
        linkedHashMap.put(MessageBody.SystemMessageBody.Text.TYPE, MessageBody.SystemMessageBody.Text.class);
        linkedHashMap2.put(MessageBody.SystemMessageBody.Text.class, MessageBody.SystemMessageBody.Text.TYPE);
        if (linkedHashMap.containsKey(MessageBody.SystemMessageBody.Unknown.TYPE) || linkedHashMap2.containsKey(MessageBody.SystemMessageBody.Unknown.class)) {
            throw new IllegalStateException("Type is already registered: type = system/unknown, clazz = ".concat(MessageBody.SystemMessageBody.Unknown.class.getName()));
        }
        linkedHashMap.put(MessageBody.SystemMessageBody.Unknown.TYPE, MessageBody.SystemMessageBody.Unknown.class);
        linkedHashMap2.put(MessageBody.SystemMessageBody.Unknown.class, MessageBody.SystemMessageBody.Unknown.TYPE);
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h
    @Y61.k
    public final MessageBody a(@Y61.k String str, @Y61.k String str2) {
        Class cls = (Class) this.f190476b.get(str);
        if (cls != null) {
            return (MessageBody) this.f190475a.d(cls, str2);
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Cannot deserialize type '", str, "': json=", str2));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h
    @Y61.k
    public final String b(@Y61.k MessageBody messageBody) {
        return this.f190475a.l(messageBody);
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h
    @Y61.k
    public final String c(@Y61.k MessageBody messageBody) {
        String str = (String) this.f190477c.get(messageBody.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unregistered body type, class = " + messageBody.getClass() + ", " + messageBody);
    }
}
