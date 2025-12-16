package ru.tinkoff.core.tinkoffId;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TinkoffIdStatusCode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/TinkoffIdStatusCode;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TinkoffIdStatusCode {

    /* renamed from: b, reason: collision with root package name */
    public static final TinkoffIdStatusCode f437020b;

    /* renamed from: c, reason: collision with root package name */
    public static final TinkoffIdStatusCode f437021c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TinkoffIdStatusCode[] f437022d;

    static {
        TinkoffIdStatusCode tinkoffIdStatusCode = new TinkoffIdStatusCode("SUCCESS", 0);
        f437020b = tinkoffIdStatusCode;
        TinkoffIdStatusCode tinkoffIdStatusCode2 = new TinkoffIdStatusCode("CANCELLED_BY_USER", 1);
        f437021c = tinkoffIdStatusCode2;
        f437022d = new TinkoffIdStatusCode[]{tinkoffIdStatusCode, tinkoffIdStatusCode2};
    }

    public TinkoffIdStatusCode() {
        throw null;
    }

    public static TinkoffIdStatusCode valueOf(String str) {
        return (TinkoffIdStatusCode) Enum.valueOf(TinkoffIdStatusCode.class, str);
    }

    public static TinkoffIdStatusCode[] values() {
        return (TinkoffIdStatusCode[]) f437022d.clone();
    }
}
