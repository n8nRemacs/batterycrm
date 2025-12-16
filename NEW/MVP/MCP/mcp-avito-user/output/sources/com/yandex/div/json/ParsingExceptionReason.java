package com.yandex.div.json;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParsingExceptionReason.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/json/ParsingExceptionReason;", "", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ParsingExceptionReason {

    /* renamed from: b, reason: collision with root package name */
    public static final ParsingExceptionReason f370544b;

    /* renamed from: c, reason: collision with root package name */
    public static final ParsingExceptionReason f370545c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParsingExceptionReason f370546d;

    /* renamed from: e, reason: collision with root package name */
    public static final ParsingExceptionReason f370547e;

    /* renamed from: f, reason: collision with root package name */
    public static final ParsingExceptionReason f370548f;

    /* renamed from: g, reason: collision with root package name */
    public static final ParsingExceptionReason f370549g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ParsingExceptionReason[] f370550h;

    static {
        ParsingExceptionReason parsingExceptionReason = new ParsingExceptionReason("MISSING_TEMPLATE", 0);
        f370544b = parsingExceptionReason;
        ParsingExceptionReason parsingExceptionReason2 = new ParsingExceptionReason("MISSING_VALUE", 1);
        f370545c = parsingExceptionReason2;
        ParsingExceptionReason parsingExceptionReason3 = new ParsingExceptionReason("MISSING_VARIABLE", 2);
        f370546d = parsingExceptionReason3;
        ParsingExceptionReason parsingExceptionReason4 = new ParsingExceptionReason("TYPE_MISMATCH", 3);
        f370547e = parsingExceptionReason4;
        ParsingExceptionReason parsingExceptionReason5 = new ParsingExceptionReason("INVALID_VALUE", 4);
        f370548f = parsingExceptionReason5;
        ParsingExceptionReason parsingExceptionReason6 = new ParsingExceptionReason("DEPENDENCY_FAILED", 5);
        f370549g = parsingExceptionReason6;
        f370550h = new ParsingExceptionReason[]{parsingExceptionReason, parsingExceptionReason2, parsingExceptionReason3, parsingExceptionReason4, parsingExceptionReason5, parsingExceptionReason6};
    }

    public ParsingExceptionReason() {
        throw null;
    }

    public static ParsingExceptionReason valueOf(String str) {
        return (ParsingExceptionReason) Enum.valueOf(ParsingExceptionReason.class, str);
    }

    public static ParsingExceptionReason[] values() {
        return (ParsingExceptionReason[]) f370550h.clone();
    }
}
