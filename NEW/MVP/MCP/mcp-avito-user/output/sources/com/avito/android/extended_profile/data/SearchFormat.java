package com.avito.android.extended_profile.data;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/SearchFormat;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final SearchFormat f149460b;

    /* renamed from: c, reason: collision with root package name */
    public static final SearchFormat f149461c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SearchFormat[] f149462d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f149463e;

    static {
        SearchFormat searchFormat = new SearchFormat("COMMON", 0);
        f149460b = searchFormat;
        SearchFormat searchFormat2 = new SearchFormat("JOB", 1);
        f149461c = searchFormat2;
        SearchFormat[] searchFormatArr = {searchFormat, searchFormat2};
        f149462d = searchFormatArr;
        f149463e = kotlin.enums.c.a(searchFormatArr);
    }

    public SearchFormat() {
        throw null;
    }

    public static SearchFormat valueOf(String str) {
        return (SearchFormat) Enum.valueOf(SearchFormat.class, str);
    }

    public static SearchFormat[] values() {
        return (SearchFormat[]) f149462d.clone();
    }
}
