package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.Image;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "Lru/avito/messenger/api/entity/Image;", "imagesById", "", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "apply", "(Ljava/util/Map;)Ljava/util/List;", "com/avito/android/messenger/conversation/mvi/sync/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32288t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f194846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32275m f194847c;

    public C32288t(C32275m c32275m, List list) {
        this.f194846b = list;
        this.f194847c = c32275m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.avito.android.remote.model.messenger.message.MessageBody$SystemMessageBody$Platform$Bubble] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.avito.android.remote.model.messenger.message.MessageBody$SystemMessageBody$Platform$Bubble$Image] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        List<C32275m.a> list = this.f194846b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C32275m.a aVar : list) {
            MessageBody.SystemMessageBody.Platform platform = (MessageBody.SystemMessageBody.Platform) aVar.f194813c;
            List<MessageBody.SystemMessageBody.Platform.Bubble> chunks = platform.getChunks();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(chunks, 10));
            Iterator<T> it = chunks.iterator();
            while (it.hasNext()) {
                ?? image = (MessageBody.SystemMessageBody.Platform.Bubble) it.next();
                if (image instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image) {
                    image = (MessageBody.SystemMessageBody.Platform.Bubble.Image) image;
                    Image image2 = (Image) map.get(image.getImageId());
                    if (image2 != null) {
                        image = new MessageBody.SystemMessageBody.Platform.Bubble.Image(image.getImageId(), this.f194847c.f194809b.e(image2).getImage());
                    }
                }
                arrayList2.add(image);
            }
            arrayList.add(aVar.b(new MessageBody.SystemMessageBody.Platform.FromAvito(arrayList2, platform.getContextActions(), platform.getFlow(), platform.getFallbackText(), null, 16, null)));
        }
        return arrayList;
    }
}
