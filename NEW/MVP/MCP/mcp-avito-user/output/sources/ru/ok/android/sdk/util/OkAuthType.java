package ru.ok.android.sdk.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OkAuthType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/util/OkAuthType;", "", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class OkAuthType {

    /* renamed from: b, reason: collision with root package name */
    public static final OkAuthType f436706b;

    /* renamed from: c, reason: collision with root package name */
    public static final OkAuthType f436707c;

    /* renamed from: d, reason: collision with root package name */
    public static final OkAuthType f436708d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OkAuthType[] f436709e;

    static {
        OkAuthType okAuthType = new OkAuthType("NATIVE_SSO", 0);
        f436706b = okAuthType;
        OkAuthType okAuthType2 = new OkAuthType("WEBVIEW_OAUTH", 1);
        f436707c = okAuthType2;
        OkAuthType okAuthType3 = new OkAuthType("ANY", 2);
        f436708d = okAuthType3;
        f436709e = new OkAuthType[]{okAuthType, okAuthType2, okAuthType3};
    }

    public OkAuthType() {
        throw null;
    }

    public static OkAuthType valueOf(String str) {
        return (OkAuthType) Enum.valueOf(OkAuthType.class, str);
    }

    public static OkAuthType[] values() {
        return (OkAuthType[]) f436709e.clone();
    }
}
