package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.Image;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lru/avito/messenger/api/entity/Image;", "imageById", "", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "apply", "(Ljava/util/Map;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<C32275m.a> f194577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32275m f194578c;

    public A(C32275m c32275m, List list) {
        this.f194577b = list;
        this.f194578c = c32275m;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        List<C32275m.a> list = this.f194577b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C32275m.a aVar : list) {
            Image image = (Image) map.get(((MessageBody.ImageReference) aVar.f194813c).getImageId());
            MessageBody.ImageBody imageBodyE = image != null ? this.f194578c.f194809b.e(image) : null;
            arrayList.add(imageBodyE != null ? aVar.b(imageBodyE) : aVar.a());
        }
        return arrayList;
    }
}
