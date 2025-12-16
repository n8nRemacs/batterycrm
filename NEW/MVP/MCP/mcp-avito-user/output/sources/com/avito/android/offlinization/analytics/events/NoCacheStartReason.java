package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheStartInfoEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/NoCacheStartReason;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoCacheStartReason {

    /* renamed from: c, reason: collision with root package name */
    public static final NoCacheStartReason f208503c;

    /* renamed from: d, reason: collision with root package name */
    public static final NoCacheStartReason f208504d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NoCacheStartReason[] f208505e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f208506f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208507b;

    static {
        NoCacheStartReason noCacheStartReason = new NoCacheStartReason("NOT_ENOUGH_MEMORY", 0, "not enough disk memory");
        f208503c = noCacheStartReason;
        NoCacheStartReason noCacheStartReason2 = new NoCacheStartReason("CACHE_STARTING_IO_FAILURE", 1, "cache_starting_failure");
        f208504d = noCacheStartReason2;
        NoCacheStartReason[] noCacheStartReasonArr = {noCacheStartReason, noCacheStartReason2};
        f208505e = noCacheStartReasonArr;
        f208506f = c.a(noCacheStartReasonArr);
    }

    public NoCacheStartReason(String str, int i12, String str2) {
        this.f208507b = str2;
    }

    public static NoCacheStartReason valueOf(String str) {
        return (NoCacheStartReason) Enum.valueOf(NoCacheStartReason.class, str);
    }

    public static NoCacheStartReason[] values() {
        return (NoCacheStartReason[]) f208505e.clone();
    }
}
