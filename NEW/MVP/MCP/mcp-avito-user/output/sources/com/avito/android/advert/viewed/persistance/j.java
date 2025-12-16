package com.avito.android.advert.viewed.persistance;

import java.util.ArrayList;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ViewedAdvertsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/j;", "", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface j {
    boolean a(@Y61.k String str);

    @Y61.k
    Set b(@Y61.k ArrayList arrayList);

    @Y61.l
    Object c(@Y61.k String str, @Y61.k Continuation<? super G0> continuation);
}
