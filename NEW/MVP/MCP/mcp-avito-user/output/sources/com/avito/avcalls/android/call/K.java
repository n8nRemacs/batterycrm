package com.avito.avcalls.android.call;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IncomingCallSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/K;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final K f331439b;

    /* renamed from: c, reason: collision with root package name */
    public static final K f331440c;

    /* renamed from: d, reason: collision with root package name */
    public static final K f331441d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ K[] f331442e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f331443f;

    static {
        K k12 = new K("NotNegotiated", 0);
        f331439b = k12;
        K k13 = new K("Negotiating", 1);
        f331440c = k13;
        K k14 = new K("Negotiated", 2);
        f331441d = k14;
        K[] kArr = {k12, k13, k14};
        f331442e = kArr;
        f331443f = kotlin.enums.c.a(kArr);
    }

    public K() {
        throw null;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f331442e.clone();
    }
}
