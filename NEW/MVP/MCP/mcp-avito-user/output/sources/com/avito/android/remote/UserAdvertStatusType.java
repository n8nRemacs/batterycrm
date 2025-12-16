package com.avito.android.remote;

import aW.InterfaceC19823a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserAdvertStatusType.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/UserAdvertStatusType;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserAdvertStatusType {

    /* renamed from: b, reason: collision with root package name */
    public static final UserAdvertStatusType f253053b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ UserAdvertStatusType[] f253054c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253055d;

    static {
        UserAdvertStatusType userAdvertStatusType = new UserAdvertStatusType();
        f253053b = userAdvertStatusType;
        UserAdvertStatusType[] userAdvertStatusTypeArr = {userAdvertStatusType};
        f253054c = userAdvertStatusTypeArr;
        f253055d = kotlin.enums.c.a(userAdvertStatusTypeArr);
    }

    public static UserAdvertStatusType valueOf(String str) {
        return (UserAdvertStatusType) Enum.valueOf(UserAdvertStatusType.class, str);
    }

    public static UserAdvertStatusType[] values() {
        return (UserAdvertStatusType[]) f253054c.clone();
    }
}
