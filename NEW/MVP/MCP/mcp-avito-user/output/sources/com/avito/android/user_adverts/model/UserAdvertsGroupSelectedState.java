package com.avito.android.user_adverts.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserAdvertsGroupData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsGroupSelectedState;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsGroupSelectedState {

    /* renamed from: b, reason: collision with root package name */
    public static final UserAdvertsGroupSelectedState f312187b;

    /* renamed from: c, reason: collision with root package name */
    public static final UserAdvertsGroupSelectedState f312188c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserAdvertsGroupSelectedState f312189d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UserAdvertsGroupSelectedState[] f312190e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f312191f;

    static {
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = new UserAdvertsGroupSelectedState("CHECKED", 0);
        f312187b = userAdvertsGroupSelectedState;
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState2 = new UserAdvertsGroupSelectedState("INTERMEDIATE", 1);
        f312188c = userAdvertsGroupSelectedState2;
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState3 = new UserAdvertsGroupSelectedState("NOT_CHECKED", 2);
        f312189d = userAdvertsGroupSelectedState3;
        UserAdvertsGroupSelectedState[] userAdvertsGroupSelectedStateArr = {userAdvertsGroupSelectedState, userAdvertsGroupSelectedState2, userAdvertsGroupSelectedState3};
        f312190e = userAdvertsGroupSelectedStateArr;
        f312191f = c.a(userAdvertsGroupSelectedStateArr);
    }

    public UserAdvertsGroupSelectedState() {
        throw null;
    }

    public static UserAdvertsGroupSelectedState valueOf(String str) {
        return (UserAdvertsGroupSelectedState) Enum.valueOf(UserAdvertsGroupSelectedState.class, str);
    }

    public static UserAdvertsGroupSelectedState[] values() {
        return (UserAdvertsGroupSelectedState[]) f312190e.clone();
    }
}
