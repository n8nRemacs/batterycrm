package com.avito.android.autoteka.helpers;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSearchType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/helpers/AutoSearchType;", "", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSearchType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AutoSearchType[] f96643b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f96644c;

    static {
        AutoSearchType[] autoSearchTypeArr = {new AutoSearchType("ITEM_ID", 0), new AutoSearchType("VIN", 1)};
        f96643b = autoSearchTypeArr;
        f96644c = kotlin.enums.c.a(autoSearchTypeArr);
    }

    public static AutoSearchType valueOf(String str) {
        return (AutoSearchType) Enum.valueOf(AutoSearchType.class, str);
    }

    public static AutoSearchType[] values() {
        return (AutoSearchType[]) f96643b.clone();
    }
}
