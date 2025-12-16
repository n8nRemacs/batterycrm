package com.avito.android.sx_address.new_address.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SxNewAddressAnalyticsDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FormInputFieldName {

    /* renamed from: b, reason: collision with root package name */
    public static final FormInputFieldName f293565b;

    /* renamed from: c, reason: collision with root package name */
    public static final FormInputFieldName f293566c;

    /* renamed from: d, reason: collision with root package name */
    public static final FormInputFieldName f293567d;

    /* renamed from: e, reason: collision with root package name */
    public static final FormInputFieldName f293568e;

    /* renamed from: f, reason: collision with root package name */
    public static final FormInputFieldName f293569f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ FormInputFieldName[] f293570g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293571h;

    static {
        FormInputFieldName formInputFieldName = new FormInputFieldName("ADDRESS", 0);
        f293565b = formInputFieldName;
        FormInputFieldName formInputFieldName2 = new FormInputFieldName("ADDRESS_NAME", 1);
        f293566c = formInputFieldName2;
        FormInputFieldName formInputFieldName3 = new FormInputFieldName("ADDRESS_TYPE", 2);
        f293567d = formInputFieldName3;
        FormInputFieldName formInputFieldName4 = new FormInputFieldName("IS_FOR_BUYER", 3);
        f293568e = formInputFieldName4;
        FormInputFieldName formInputFieldName5 = new FormInputFieldName("IS_FOR_DELIVERY", 4);
        FormInputFieldName formInputFieldName6 = new FormInputFieldName("IS_FOR_PICKUP", 5);
        FormInputFieldName formInputFieldName7 = new FormInputFieldName("WORKING_HOURS", 6);
        f293569f = formInputFieldName7;
        FormInputFieldName[] formInputFieldNameArr = {formInputFieldName, formInputFieldName2, formInputFieldName3, formInputFieldName4, formInputFieldName5, formInputFieldName6, formInputFieldName7};
        f293570g = formInputFieldNameArr;
        f293571h = kotlin.enums.c.a(formInputFieldNameArr);
    }

    public FormInputFieldName() {
        throw null;
    }

    public static FormInputFieldName valueOf(String str) {
        return (FormInputFieldName) Enum.valueOf(FormInputFieldName.class, str);
    }

    public static FormInputFieldName[] values() {
        return (FormInputFieldName[]) f293570g.clone();
    }
}
