package ru.avito.messenger.internal.gson.adapter;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.BodyImagesResponse;
import ru.avito.messenger.api.entity.Image;

/* compiled from: BodyImagesResponseTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/BodyImagesResponseTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/BodyImagesResponse;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BodyImagesResponseTypeAdapter implements h<BodyImagesResponse> {
    @Override // com.google.gson.h
    public final BodyImagesResponse deserialize(i iVar, Type type, g gVar) {
        if (iVar instanceof j) {
            return null;
        }
        if (!(iVar instanceof k)) {
            throw new IllegalArgumentException("Expected object or null, found: " + iVar);
        }
        Set<Map.Entry<String, i>> setEntrySet = iVar.i().f362194b.entrySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Q(entry.getKey(), gVar.b((i) entry.getValue(), Image.class)));
        }
        return new BodyImagesResponse(P0.p(arrayList));
    }
}
