package com.avito.android.support_bottom_sheet.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportSheetButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/support_bottom_sheet/analytics/SupportRequestType;", "", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportRequestType {

    /* renamed from: c, reason: collision with root package name */
    public static final SupportRequestType f292398c;

    /* renamed from: d, reason: collision with root package name */
    public static final SupportRequestType f292399d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SupportRequestType[] f292400e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f292401f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f292402b;

    static {
        SupportRequestType supportRequestType = new SupportRequestType("CHAT", 0, "chat");
        f292398c = supportRequestType;
        SupportRequestType supportRequestType2 = new SupportRequestType("CALL", 1, "call");
        f292399d = supportRequestType2;
        SupportRequestType[] supportRequestTypeArr = {supportRequestType, supportRequestType2};
        f292400e = supportRequestTypeArr;
        f292401f = c.a(supportRequestTypeArr);
    }

    public SupportRequestType(String str, int i12, String str2) {
        this.f292402b = str2;
    }

    public static SupportRequestType valueOf(String str) {
        return (SupportRequestType) Enum.valueOf(SupportRequestType.class, str);
    }

    public static SupportRequestType[] values() {
        return (SupportRequestType[]) f292400e.clone();
    }
}
