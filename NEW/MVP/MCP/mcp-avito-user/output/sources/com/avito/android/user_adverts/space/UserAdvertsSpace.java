package com.avito.android.user_adverts.space;

import Y61.l;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserAdvertsSpace.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/space/UserAdvertsSpace;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsSpace {

    /* renamed from: c, reason: collision with root package name */
    public static final UserAdvertsSpace f314189c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserAdvertsSpace f314190d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UserAdvertsSpace[] f314191e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f314192f;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f314193b;

    static {
        UserAdvertsSpace userAdvertsSpace = new UserAdvertsSpace("Default", 0, null, 1, null);
        f314189c = userAdvertsSpace;
        UserAdvertsSpace userAdvertsSpace2 = new UserAdvertsSpace("AvitoForBusiness", 1, "avitoForBusiness");
        f314190d = userAdvertsSpace2;
        UserAdvertsSpace[] userAdvertsSpaceArr = {userAdvertsSpace, userAdvertsSpace2};
        f314191e = userAdvertsSpaceArr;
        f314192f = c.a(userAdvertsSpaceArr);
    }

    public UserAdvertsSpace(String str, int i12, String str2) {
        this.f314193b = str2;
    }

    public static UserAdvertsSpace valueOf(String str) {
        return (UserAdvertsSpace) Enum.valueOf(UserAdvertsSpace.class, str);
    }

    public static UserAdvertsSpace[] values() {
        return (UserAdvertsSpace[]) f314191e.clone();
    }

    public /* synthetic */ UserAdvertsSpace(String str, int i12, String str2, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? null : str2);
    }
}
