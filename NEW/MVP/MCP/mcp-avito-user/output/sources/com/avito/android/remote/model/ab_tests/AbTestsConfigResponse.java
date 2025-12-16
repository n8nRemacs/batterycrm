package com.avito.android.remote.model.ab_tests;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import u3.C48777a;

/* compiled from: AbTestsResponse.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/ab_tests/AbTestsConfigResponse;", "", "", "", "Lu3/a;", "rawValues", "<init>", "(Ljava/util/Map;)V", "", "getAllKeys", "()Ljava/util/Set;", "key", "getAbTest", "(Ljava/lang/String;)Lu3/a;", "Ljava/util/Map;", "getRawValues", "()Ljava/util/Map;", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AbTestsConfigResponse {

    @k
    private final Map<String, C48777a> rawValues;

    public AbTestsConfigResponse(@k Map<String, C48777a> map) {
        this.rawValues = map;
    }

    @l
    public final C48777a getAbTest(@k String key) {
        return this.rawValues.get(key);
    }

    @k
    public final Set<String> getAllKeys() {
        return this.rawValues.keySet();
    }

    @k
    public final Map<String, C48777a> getRawValues() {
        return this.rawValues;
    }
}
