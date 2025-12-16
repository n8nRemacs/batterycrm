package com.avito.android.comfortable_deal.api.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserRole.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/UserRole;", "", "(Ljava/lang/String;I)V", "Agent", "Seller", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserRole {

    @c("AGENT")
    public static final UserRole Agent;

    @c("SELLER")
    public static final UserRole Seller;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ UserRole[] f119779b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f119780c;

    static {
        UserRole userRole = new UserRole("Agent", 0);
        Agent = userRole;
        UserRole userRole2 = new UserRole("Seller", 1);
        Seller = userRole2;
        UserRole[] userRoleArr = {userRole, userRole2};
        f119779b = userRoleArr;
        f119780c = kotlin.enums.c.a(userRoleArr);
    }

    private UserRole(String str, int i12) {
    }

    public static UserRole valueOf(String str) {
        return (UserRole) Enum.valueOf(UserRole.class, str);
    }

    public static UserRole[] values() {
        return (UserRole[]) f119779b.clone();
    }
}
