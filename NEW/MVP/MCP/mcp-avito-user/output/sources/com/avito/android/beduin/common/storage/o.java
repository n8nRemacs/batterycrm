package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import ni.InterfaceC44429b;

/* compiled from: BeduinV1StorageAdapterImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/storage/o;", "Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f103502a;

    @Inject
    public o(@Y61.k @InterfaceC44429b c cVar) {
        this.f103502a = cVar;
    }

    @Override // com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.f
    public final void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f103502a.a(linkedHashMap, str);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.f
    @Y61.l
    public final Map<String, Object> get(@Y61.k String str) {
        return this.f103502a.get(str);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.f
    public final void remove(@Y61.k String str) {
        this.f103502a.remove(str);
    }
}
