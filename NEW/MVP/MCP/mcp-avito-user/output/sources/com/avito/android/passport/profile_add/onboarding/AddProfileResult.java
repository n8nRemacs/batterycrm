package com.avito.android.passport.profile_add.onboarding;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PassportOnboardingActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/AddProfileResult;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddProfileResult {

    /* renamed from: b, reason: collision with root package name */
    public static final AddProfileResult f213540b;

    /* renamed from: c, reason: collision with root package name */
    public static final AddProfileResult f213541c;

    /* renamed from: d, reason: collision with root package name */
    public static final AddProfileResult f213542d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AddProfileResult[] f213543e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f213544f;

    static {
        AddProfileResult addProfileResult = new AddProfileResult("CREATE_SUCCESS", 0);
        f213540b = addProfileResult;
        AddProfileResult addProfileResult2 = new AddProfileResult("MERGE_SUCCESS", 1);
        f213541c = addProfileResult2;
        AddProfileResult addProfileResult3 = new AddProfileResult("CANCELLED", 2);
        f213542d = addProfileResult3;
        AddProfileResult[] addProfileResultArr = {addProfileResult, addProfileResult2, addProfileResult3};
        f213543e = addProfileResultArr;
        f213544f = kotlin.enums.c.a(addProfileResultArr);
    }

    public AddProfileResult() {
        throw null;
    }

    public static AddProfileResult valueOf(String str) {
        return (AddProfileResult) Enum.valueOf(AddProfileResult.class, str);
    }

    public static AddProfileResult[] values() {
        return (AddProfileResult[]) f213543e.clone();
    }
}
