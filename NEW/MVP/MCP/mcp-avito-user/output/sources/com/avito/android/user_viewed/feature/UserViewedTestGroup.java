package com.avito.android.user_viewed.feature;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserViewedTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/feature/UserViewedTestGroup;", "", "Lu3/j;", "_avito_user-viewed_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserViewedTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final UserViewedTestGroup f318387c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserViewedTestGroup f318388d;

    /* renamed from: e, reason: collision with root package name */
    public static final UserViewedTestGroup f318389e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ UserViewedTestGroup[] f318390f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f318391g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318392b;

    static {
        UserViewedTestGroup userViewedTestGroup = new UserViewedTestGroup("NONE", 0, "");
        f318387c = userViewedTestGroup;
        UserViewedTestGroup userViewedTestGroup2 = new UserViewedTestGroup("CONTROL", 1, "control");
        UserViewedTestGroup userViewedTestGroup3 = new UserViewedTestGroup("BW_BUTTONS", 2, "bw_buttons");
        f318388d = userViewedTestGroup3;
        UserViewedTestGroup userViewedTestGroup4 = new UserViewedTestGroup("COLORED_BUTTONS", 3, "colored_buttons");
        f318389e = userViewedTestGroup4;
        UserViewedTestGroup[] userViewedTestGroupArr = {userViewedTestGroup, userViewedTestGroup2, userViewedTestGroup3, userViewedTestGroup4};
        f318390f = userViewedTestGroupArr;
        f318391g = c.a(userViewedTestGroupArr);
    }

    public UserViewedTestGroup(String str, int i12, String str2) {
        this.f318392b = str2;
    }

    public static UserViewedTestGroup valueOf(String str) {
        return (UserViewedTestGroup) Enum.valueOf(UserViewedTestGroup.class, str);
    }

    public static UserViewedTestGroup[] values() {
        return (UserViewedTestGroup[]) f318390f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF318392b() {
        return this.f318392b;
    }
}
