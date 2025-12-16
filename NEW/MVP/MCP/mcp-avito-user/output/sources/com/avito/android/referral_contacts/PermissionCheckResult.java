package com.avito.android.referral_contacts;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReferralContactsPermissionRequester.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/PermissionCheckResult;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PermissionCheckResult {

    /* renamed from: b, reason: collision with root package name */
    public static final PermissionCheckResult f252364b;

    /* renamed from: c, reason: collision with root package name */
    public static final PermissionCheckResult f252365c;

    /* renamed from: d, reason: collision with root package name */
    public static final PermissionCheckResult f252366d;

    /* renamed from: e, reason: collision with root package name */
    public static final PermissionCheckResult f252367e;

    /* renamed from: f, reason: collision with root package name */
    public static final PermissionCheckResult f252368f;

    /* renamed from: g, reason: collision with root package name */
    public static final PermissionCheckResult f252369g;

    /* renamed from: h, reason: collision with root package name */
    public static final PermissionCheckResult f252370h;

    /* renamed from: i, reason: collision with root package name */
    public static final PermissionCheckResult f252371i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ PermissionCheckResult[] f252372j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f252373k;

    static {
        PermissionCheckResult permissionCheckResult = new PermissionCheckResult("ALREADY_GRANTED", 0);
        f252364b = permissionCheckResult;
        PermissionCheckResult permissionCheckResult2 = new PermissionCheckResult("REQUESTED_AND_GRANTED", 1);
        f252365c = permissionCheckResult2;
        PermissionCheckResult permissionCheckResult3 = new PermissionCheckResult("REQUESTED_AND_NOT_GRANTED", 2);
        f252366d = permissionCheckResult3;
        PermissionCheckResult permissionCheckResult4 = new PermissionCheckResult("CUSTOM_SETTINGS_POPUP_DISPLAYED", 3);
        f252367e = permissionCheckResult4;
        PermissionCheckResult permissionCheckResult5 = new PermissionCheckResult("CUSTOM_SETTINGS_POPUP_ACCEPTED", 4);
        f252368f = permissionCheckResult5;
        PermissionCheckResult permissionCheckResult6 = new PermissionCheckResult("CUSTOM_SETTINGS_POPUP_DENIED", 5);
        f252369g = permissionCheckResult6;
        PermissionCheckResult permissionCheckResult7 = new PermissionCheckResult("RETURNED_FROM_SETTINGS_AND_GRANTED", 6);
        f252370h = permissionCheckResult7;
        PermissionCheckResult permissionCheckResult8 = new PermissionCheckResult("RETURNED_FROM_SETTINGS_AND_NOT_GRANTED", 7);
        f252371i = permissionCheckResult8;
        PermissionCheckResult[] permissionCheckResultArr = {permissionCheckResult, permissionCheckResult2, permissionCheckResult3, permissionCheckResult4, permissionCheckResult5, permissionCheckResult6, permissionCheckResult7, permissionCheckResult8};
        f252372j = permissionCheckResultArr;
        f252373k = kotlin.enums.c.a(permissionCheckResultArr);
    }

    public PermissionCheckResult() {
        throw null;
    }

    public static PermissionCheckResult valueOf(String str) {
        return (PermissionCheckResult) Enum.valueOf(PermissionCheckResult.class, str);
    }

    public static PermissionCheckResult[] values() {
        return (PermissionCheckResult[]) f252372j.clone();
    }
}
