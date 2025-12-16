package com.avito.android.inline_filters;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFiltersSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/InlineFiltersSource;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InlineFiltersSource {

    /* renamed from: b, reason: collision with root package name */
    public static final InlineFiltersSource f170993b;

    /* renamed from: c, reason: collision with root package name */
    public static final InlineFiltersSource f170994c;

    /* renamed from: d, reason: collision with root package name */
    public static final InlineFiltersSource f170995d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InlineFiltersSource[] f170996e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170997f;

    static {
        InlineFiltersSource inlineFiltersSource = new InlineFiltersSource("SEARCH", 0);
        f170993b = inlineFiltersSource;
        InlineFiltersSource inlineFiltersSource2 = new InlineFiltersSource("PROFILE", 1);
        f170994c = inlineFiltersSource2;
        InlineFiltersSource inlineFiltersSource3 = new InlineFiltersSource("PROFILE_SX", 2);
        f170995d = inlineFiltersSource3;
        InlineFiltersSource[] inlineFiltersSourceArr = {inlineFiltersSource, inlineFiltersSource2, inlineFiltersSource3};
        f170996e = inlineFiltersSourceArr;
        f170997f = kotlin.enums.c.a(inlineFiltersSourceArr);
    }

    public InlineFiltersSource() {
        throw null;
    }

    public static InlineFiltersSource valueOf(String str) {
        return (InlineFiltersSource) Enum.valueOf(InlineFiltersSource.class, str);
    }

    public static InlineFiltersSource[] values() {
        return (InlineFiltersSource[]) f170996e.clone();
    }
}
