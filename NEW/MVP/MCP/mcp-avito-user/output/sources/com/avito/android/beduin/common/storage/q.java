package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ListenableBeduinParameterStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/storage/q;", "Lcom/avito/android/beduin/common/storage/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f103504a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f103505b;

    public q(@Y61.k a aVar, @Y61.k r rVar) {
        this.f103504a = aVar;
        this.f103505b = rVar;
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f103504a.a(linkedHashMap, str);
        this.f103505b.b(linkedHashMap, str);
    }

    @Override // com.avito.android.beduin.common.storage.c
    @Y61.l
    public final Map<String, Object> get(@Y61.k String str) {
        return this.f103504a.get(str);
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void remove(@Y61.k String str) {
        this.f103504a.remove(str);
        this.f103505b.b(null, str);
    }
}
