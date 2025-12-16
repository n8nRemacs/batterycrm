package com.avito.android.installments.form.loader;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.Loader;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DomainToLoaderMapManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/loader/b;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f172704a;

    public b(@l Map<String, Loader> map) {
        Map mapC;
        if (map != null) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            mapC = treeMap;
        } else {
            mapC = P0.c();
        }
        this.f172704a = mapC;
    }
}
