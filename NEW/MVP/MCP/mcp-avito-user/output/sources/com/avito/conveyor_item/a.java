package com.avito.conveyor_item;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Item.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/conveyor_item/a;", "LTV0/a;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a extends TV0.a {

    /* compiled from: Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.conveyor_item.a$a, reason: collision with other inner class name */
    public static final class C10492a {
        public static long a(@k a aVar) {
            return aVar.getStringId().hashCode();
        }
    }

    @k
    String getStringId();
}
