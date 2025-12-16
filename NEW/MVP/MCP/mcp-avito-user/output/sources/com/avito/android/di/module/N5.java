package com.avito.android.di.module;

import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.parse.adapter.MessageBodySystemDeserializer;
import com.avito.android.remote.parse.adapter.MessageBodyTypeAdapter;
import com.avito.android.remote.parse.adapter.messenger.AttachMenuTypeAdapter;
import com.avito.android.remote.parse.adapter.messenger.LinkMessagePreviewTypeAdapter;
import com.avito.android.remote.parse.adapter.messenger.platform.TextMessageChunkTypeAdapter;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: MessengerJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class N5 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* compiled from: MessengerJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final N5 f144080a = new N5();
    }

    public static N5 a() {
        return a.f144080a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = M5.f144061a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(AttachMenu.class, new AttachMenuTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(AttachMenu.class, new AttachMenuTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.Text.Chunk.class, new TextMessageChunkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.Text.Chunk.class, new TextMessageChunkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.Link.Preview.class, new LinkMessagePreviewTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.Link.Preview.class, new LinkMessagePreviewTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.class, new MessageBodyTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(MessageBody.SystemMessageBody.class, new MessageBodySystemDeserializer()));
        return linkedHashSet;
    }
}
