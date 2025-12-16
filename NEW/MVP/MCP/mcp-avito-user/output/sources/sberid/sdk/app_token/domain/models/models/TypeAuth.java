package sberid.sdk.app_token.domain.models.models;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/app_token/domain/models/models/TypeAuth;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeAuth {

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAuth f437743c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypeAuth f437744d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TypeAuth[] f437745e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f437746f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437747b;

    static {
        TypeAuth typeAuth = new TypeAuth("APP_2_APP", 0, "app2app");
        f437743c = typeAuth;
        TypeAuth typeAuth2 = new TypeAuth("OIDC_2_APP", 1, "oidc2app");
        TypeAuth typeAuth3 = new TypeAuth("APP_2_WEB", 2, "app2web");
        f437744d = typeAuth3;
        TypeAuth[] typeAuthArr = {typeAuth, typeAuth2, typeAuth3};
        f437745e = typeAuthArr;
        f437746f = c.a(typeAuthArr);
    }

    public TypeAuth(String str, int i12, String str2) {
        this.f437747b = str2;
    }

    public static TypeAuth valueOf(String str) {
        return (TypeAuth) Enum.valueOf(TypeAuth.class, str);
    }

    public static TypeAuth[] values() {
        return (TypeAuth[]) f437745e.clone();
    }
}
