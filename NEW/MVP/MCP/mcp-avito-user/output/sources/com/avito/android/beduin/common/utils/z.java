package com.avito.android.beduin.common.utils;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: RandomUUID.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z {
    @Y61.k
    public static final String a(@Y61.k com.google.gson.k kVar) {
        if (kVar.D("id") instanceof com.google.gson.j) {
            kVar.K("id");
        }
        if (!kVar.f362194b.containsKey("id")) {
            kVar.y("id", UUID.randomUUID().toString());
        }
        return kVar.D("id").s();
    }
}
