package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "bodyItems", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32298y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<C32275m.a> f194876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32275m f194877c;

    public C32298y(C32275m c32275m, List list) {
        this.f194876b = list;
        this.f194877c = c32275m;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C43025h c43025hM = C43033p.m(new kotlin.sequences.o0(new C42770s0((List) obj), new C32292v(this.f194877c)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C43025h.a aVar = new C43025h.a(c43025hM);
        while (aVar.hasNext()) {
            MessageBody.Item item = (MessageBody.Item) aVar.next();
            linkedHashMap.put(item.getId(), item);
        }
        List<C32275m.a> list = this.f194876b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C32275m.a aVar2 : list) {
            MessageBody.Item item2 = (MessageBody.Item) linkedHashMap.get(((MessageBody.ItemReference) aVar2.f194813c).getItemId());
            arrayList.add(item2 != null ? aVar2.b(item2) : aVar2.a());
        }
        return arrayList;
    }
}
