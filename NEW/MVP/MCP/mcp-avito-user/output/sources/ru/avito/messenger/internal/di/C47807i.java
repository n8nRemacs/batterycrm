package ru.avito.messenger.internal.di;

import com.avito.android.C30277e1;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import k91.AbstractC42547e;
import l91.C43606b;
import m91.InterfaceC43936c;
import ru.avito.messenger.api.entity.BodyImagesResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.ReadOnlyState;
import ru.avito.messenger.api.entity.body.MessageBody;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import ru.avito.messenger.api.entity.body.notification.NotificationBody;
import ru.avito.messenger.api.entity.context.ChannelContext;
import ru.avito.messenger.internal.gson.adapter.BodyImagesResponseTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.BodyItemTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.ChannelContextTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.ImageTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.MessageBodyTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.MessageTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.MessageUpdateTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.NotificationBodyTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.QuoteTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.ReadOnlyStateTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.SocketEventMessageTypeAdapter;
import ru.avito.messenger.internal.gson.adapter.SystemMessageTypeAdapter;

/* compiled from: GsonModule_ProvideGsonFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47807i implements dagger.internal.h<Gson> {

    /* renamed from: a, reason: collision with root package name */
    public final C47805g f431638a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431639b;

    public C47807i(C47805g c47805g, dagger.internal.u uVar) {
        this.f431638a = c47805g;
        this.f431639b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43936c interfaceC43936c = (InterfaceC43936c) this.f431639b.get();
        C47805g c47805g = this.f431638a;
        c47805g.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(ChatMessage.class, new MessageTypeAdapter());
        dVar.b(Quote.class, new QuoteTypeAdapter());
        dVar.b(ChatMessageUpdate.class, new MessageUpdateTypeAdapter());
        LinkedHashMap linkedHashMap = c47805g.f431628a;
        dVar.b(MessageBody.class, new MessageBodyTypeAdapter(C43606b.b(linkedHashMap), interfaceC43936c));
        LinkedHashMap linkedHashMap2 = c47805g.f431629b;
        dVar.b(ChannelContext.class, new ChannelContextTypeAdapter(C43606b.b(linkedHashMap2), interfaceC43936c));
        dVar.b(ReadOnlyState.class, new ReadOnlyStateTypeAdapter());
        LinkedHashMap linkedHashMap3 = c47805g.f431630c;
        dVar.b(BodyItem.class, new BodyItemTypeAdapter(C43606b.b(linkedHashMap3), interfaceC43936c));
        dVar.b(Image.class, new ImageTypeAdapter());
        LinkedHashMap linkedHashMap4 = c47805g.f431631d;
        dVar.b(NotificationBody.class, new NotificationBodyTypeAdapter(C43606b.b(linkedHashMap4)));
        Set<mx0.c> set = c47805g.f431633f;
        C30277e1 c30277e1 = c47805g.f431635h;
        dVar.b(AbstractC42547e.class, new SystemMessageTypeAdapter(set, c30277e1));
        dVar.b(AbstractC42547e.s.class, new SocketEventMessageTypeAdapter(set, c30277e1));
        dVar.b(BodyImagesResponse.class, new BodyImagesResponseTypeAdapter());
        C43606b.a(dVar, linkedHashMap.values());
        C43606b.a(dVar, linkedHashMap2.values());
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(FontParameter.class);
        runtimeTypeAdapterFactory.b(FontParameter.StyleParameter.class, "fontStyle", null);
        runtimeTypeAdapterFactory.b(FontParameter.ColorParameter.class, "fontColor", null);
        runtimeTypeAdapterFactory.b(FontParameter.StrikethroughParameter.class, "strikeThrough", null);
        runtimeTypeAdapterFactory.b(FontParameter.TextStyleParameter.class, "textStyle", null);
        runtimeTypeAdapterFactory.b(FontParameter.ParagraphSpacingRelativeParameter.class, "paragraphSpacingRelative", null);
        runtimeTypeAdapterFactory.b(FontParameter.UseParagraphingParameter.class, "useParagraphing", null);
        runtimeTypeAdapterFactory.b(FontParameter.UnderlineParameter.class, "underline", null);
        runtimeTypeAdapterFactory.b(FontParameter.TextAlignmentParameter.class, "textAlignment", null);
        runtimeTypeAdapterFactory.b(FontParameter.ParagraphSpacingParameter.class, "paragraphSpacing", null);
        dVar.c(runtimeTypeAdapterFactory);
        C43606b.a(dVar, linkedHashMap3.values());
        C43606b.a(dVar, c47805g.f431632e);
        Iterator it = c47805g.f431634g.iterator();
        while (it.hasNext()) {
            dVar.c((com.google.gson.r) it.next());
        }
        C43606b.a(dVar, linkedHashMap4.values());
        return dVar.a();
    }
}
