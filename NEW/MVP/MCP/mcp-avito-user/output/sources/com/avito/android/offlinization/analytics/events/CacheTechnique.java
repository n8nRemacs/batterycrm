package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkDataRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/CacheTechnique;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheTechnique {

    /* renamed from: c, reason: collision with root package name */
    public static final CacheTechnique f208495c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CacheTechnique[] f208496d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f208497e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208498b;

    static {
        CacheTechnique cacheTechnique = new CacheTechnique("BUFFER", 0, "buffer");
        f208495c = cacheTechnique;
        CacheTechnique[] cacheTechniqueArr = {cacheTechnique, new CacheTechnique("CONTEXTUAL", 1, "contextual")};
        f208496d = cacheTechniqueArr;
        f208497e = c.a(cacheTechniqueArr);
    }

    public CacheTechnique(String str, int i12, String str2) {
        this.f208498b = str2;
    }

    public static CacheTechnique valueOf(String str) {
        return (CacheTechnique) Enum.valueOf(CacheTechnique.class, str);
    }

    public static CacheTechnique[] values() {
        return (CacheTechnique[]) f208496d.clone();
    }
}
