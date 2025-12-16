package com.avito.android.comparison.remote.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/remote/model/FromPage;", "", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f124197b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f124198c;

    static {
        FromPage[] fromPageArr = {new FromPage("ADVERT", 0), new FromPage("COMPARISON", 1)};
        f124197b = fromPageArr;
        f124198c = c.a(fromPageArr);
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f124197b.clone();
    }
}
