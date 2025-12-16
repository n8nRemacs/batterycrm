package com.avito.avcalls.call;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IncomingCallSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/P;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class P {

    /* renamed from: b, reason: collision with root package name */
    public static final P f332606b;

    /* renamed from: c, reason: collision with root package name */
    public static final P f332607c;

    /* renamed from: d, reason: collision with root package name */
    public static final P f332608d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ P[] f332609e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f332610f;

    static {
        P p12 = new P("NotNegotiated", 0);
        f332606b = p12;
        P p13 = new P("Negotiating", 1);
        f332607c = p13;
        P p14 = new P("Negotiated", 2);
        f332608d = p14;
        P[] pArr = {p12, p13, p14};
        f332609e = pArr;
        f332610f = kotlin.enums.c.a(pArr);
    }

    public P() {
        throw null;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f332609e.clone();
    }
}
