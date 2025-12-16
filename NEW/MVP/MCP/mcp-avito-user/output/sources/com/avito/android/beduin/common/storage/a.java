package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: BeduinAppScopeParametersStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/storage/a;", "Lcom/avito/android/beduin/common/storage/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f103477a = new LinkedHashMap();

    @Inject
    public a() {
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f103477a.put(str, linkedHashMap);
    }

    @Override // com.avito.android.beduin.common.storage.c
    @Y61.l
    public final Map<String, Object> get(@Y61.k String str) {
        return (Map) this.f103477a.get(str);
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void remove(@Y61.k String str) {
        this.f103477a.remove(str);
    }
}
