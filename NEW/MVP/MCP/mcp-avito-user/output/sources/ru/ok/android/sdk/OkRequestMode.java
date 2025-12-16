package ru.ok.android.sdk;

import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OkRequestMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/sdk/OkRequestMode;", "", "a", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class OkRequestMode {

    /* renamed from: b, reason: collision with root package name */
    public static final OkRequestMode f436667b;

    /* renamed from: c, reason: collision with root package name */
    public static final OkRequestMode f436668c;

    /* renamed from: d, reason: collision with root package name */
    public static final OkRequestMode f436669d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OkRequestMode[] f436670e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final EnumSet f436671f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f436672g;

    /* compiled from: OkRequestMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/sdk/OkRequestMode$a;", "", "<init>", "()V", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        OkRequestMode okRequestMode = new OkRequestMode("SIGNED", 0);
        f436667b = okRequestMode;
        OkRequestMode okRequestMode2 = new OkRequestMode("UNSIGNED", 1);
        OkRequestMode okRequestMode3 = new OkRequestMode("SDK_SESSION", 2);
        f436668c = okRequestMode3;
        OkRequestMode okRequestMode4 = new OkRequestMode("NO_PLATFORM_REPORTING", 3);
        f436669d = okRequestMode4;
        f436670e = new OkRequestMode[]{okRequestMode, okRequestMode2, okRequestMode3, okRequestMode4};
        f436672g = new a(null);
        f436671f = EnumSet.of(okRequestMode);
    }

    public OkRequestMode() {
        throw null;
    }

    public static OkRequestMode valueOf(String str) {
        return (OkRequestMode) Enum.valueOf(OkRequestMode.class, str);
    }

    public static OkRequestMode[] values() {
        return (OkRequestMode[]) f436670e.clone();
    }
}
