package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: BeduinPersistentParametersStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/storage/f;", "Lcom/avito/android/beduin/common/storage/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f103482a;

    @Inject
    public f(@Y61.k i iVar) {
        this.f103482a = iVar;
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
        i iVar = this.f103482a;
        iVar.f103484a.putString(str, iVar.f103485b.l(linkedHashMap));
    }

    @Override // com.avito.android.beduin.common.storage.c
    @Y61.l
    public final Map<String, Object> get(@Y61.k String str) {
        i iVar = this.f103482a;
        String string = iVar.f103484a.getString(str);
        if (string == null) {
            return null;
        }
        return (Map) iVar.f103485b.e(string, new h().getType());
    }

    @Override // com.avito.android.beduin.common.storage.c
    public final void remove(@Y61.k String str) {
        this.f103482a.f103484a.remove(str);
    }
}
