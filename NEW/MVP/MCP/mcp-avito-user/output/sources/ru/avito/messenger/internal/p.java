package ru.avito.messenger.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import ru.avito.messenger.api.entity.body.item.Item;

/* compiled from: MessengerClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/avito/messenger/api/entity/body/item/Item;", "items", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final p<T, R> f431763b = new p<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Item) ((BodyItem) it.next()));
        }
        return arrayList;
    }
}
