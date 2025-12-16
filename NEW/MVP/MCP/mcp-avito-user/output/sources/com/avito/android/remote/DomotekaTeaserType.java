package com.avito.android.remote;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DomotekaTeaserResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/DomotekaTeaserType;", "", "(Ljava/lang/String;I)V", "TEASER", "STUB", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DomotekaTeaserType {

    @com.google.gson.annotations.c("stub")
    public static final DomotekaTeaserType STUB;

    @com.google.gson.annotations.c("teaser")
    public static final DomotekaTeaserType TEASER;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DomotekaTeaserType[] f253017b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253018c;

    static {
        DomotekaTeaserType domotekaTeaserType = new DomotekaTeaserType("TEASER", 0);
        TEASER = domotekaTeaserType;
        DomotekaTeaserType domotekaTeaserType2 = new DomotekaTeaserType("STUB", 1);
        STUB = domotekaTeaserType2;
        DomotekaTeaserType[] domotekaTeaserTypeArr = {domotekaTeaserType, domotekaTeaserType2};
        f253017b = domotekaTeaserTypeArr;
        f253018c = kotlin.enums.c.a(domotekaTeaserTypeArr);
    }

    private DomotekaTeaserType(String str, int i12) {
    }

    public static DomotekaTeaserType valueOf(String str) {
        return (DomotekaTeaserType) Enum.valueOf(DomotekaTeaserType.class, str);
    }

    public static DomotekaTeaserType[] values() {
        return (DomotekaTeaserType[]) f253017b.clone();
    }
}
