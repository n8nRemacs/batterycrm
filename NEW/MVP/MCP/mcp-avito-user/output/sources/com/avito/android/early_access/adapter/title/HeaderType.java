package com.avito.android.early_access.adapter.title;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyAccessTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/title/HeaderType;", "", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderType {

    /* renamed from: b, reason: collision with root package name */
    public static final HeaderType f145253b;

    /* renamed from: c, reason: collision with root package name */
    public static final HeaderType f145254c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ HeaderType[] f145255d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145256e;

    static {
        HeaderType headerType = new HeaderType("LARGE", 0);
        f145253b = headerType;
        HeaderType headerType2 = new HeaderType("MEDIUM", 1);
        f145254c = headerType2;
        HeaderType[] headerTypeArr = {headerType, headerType2};
        f145255d = headerTypeArr;
        f145256e = kotlin.enums.c.a(headerTypeArr);
    }

    public HeaderType() {
        throw null;
    }

    public static HeaderType valueOf(String str) {
        return (HeaderType) Enum.valueOf(HeaderType.class, str);
    }

    public static HeaderType[] values() {
        return (HeaderType[]) f145255d.clone();
    }
}
