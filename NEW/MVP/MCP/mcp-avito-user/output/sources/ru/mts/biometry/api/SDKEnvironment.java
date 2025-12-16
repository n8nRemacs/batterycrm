package ru.mts.biometry.api;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDKEnvironment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/api/SDKEnvironment;", "", "Lru/mts/biometry/api/i;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class SDKEnvironment implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f436293b;

    /* renamed from: c, reason: collision with root package name */
    public static final SDKEnvironment f436294c;

    /* renamed from: d, reason: collision with root package name */
    public static final SDKEnvironment f436295d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SDKEnvironment[] f436296e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f436297f;

    /* compiled from: SDKEnvironment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/api/SDKEnvironment$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SDKEnvironment sDKEnvironment = new SDKEnvironment() { // from class: ru.mts.biometry.api.SDKEnvironment.d

            /* renamed from: g, reason: collision with root package name */
            @k
            public final String f436302g = "v3";

            /* renamed from: h, reason: collision with root package name */
            @k
            public final String f436303h = "m";

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: a, reason: from getter */
            public final String getF436302g() {
                return this.f436302g;
            }

            @Override // ru.mts.biometry.api.i
            @k
            public final String b() {
                return "https://rim-rc.idscan.mts.ru";
            }

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: getType, reason: from getter */
            public final String getF436303h() {
                return this.f436303h;
            }
        };
        f436294c = sDKEnvironment;
        SDKEnvironment sDKEnvironment2 = new SDKEnvironment() { // from class: ru.mts.biometry.api.SDKEnvironment.c

            /* renamed from: g, reason: collision with root package name */
            @k
            public final String f436300g = "v3";

            /* renamed from: h, reason: collision with root package name */
            @k
            public final String f436301h = "m";

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: a, reason: from getter */
            public final String getF436302g() {
                return this.f436300g;
            }

            @Override // ru.mts.biometry.api.i
            @k
            public final String b() {
                return "https://rim.idscan.mts.ru";
            }

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: getType, reason: from getter */
            public final String getF436303h() {
                return this.f436301h;
            }
        };
        f436295d = sDKEnvironment2;
        SDKEnvironment[] sDKEnvironmentArr = {sDKEnvironment, sDKEnvironment2, new SDKEnvironment() { // from class: ru.mts.biometry.api.SDKEnvironment.b

            /* renamed from: g, reason: collision with root package name */
            @k
            public final String f436298g = "v3";

            /* renamed from: h, reason: collision with root package name */
            @k
            public final String f436299h = "m";

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: a, reason: from getter */
            public final String getF436302g() {
                return this.f436298g;
            }

            @Override // ru.mts.biometry.api.i
            @k
            public final String b() {
                return "https://rim.dev.insider.mts.ru";
            }

            @Override // ru.mts.biometry.api.i
            @k
            /* renamed from: getType, reason: from getter */
            public final String getF436303h() {
                return this.f436299h;
            }
        }};
        f436296e = sDKEnvironmentArr;
        f436297f = kotlin.enums.c.a(sDKEnvironmentArr);
        f436293b = new a(null);
    }

    public SDKEnvironment() {
        throw null;
    }

    public SDKEnvironment(String str, int i12, C42822w c42822w) {
    }

    public static SDKEnvironment valueOf(String str) {
        return (SDKEnvironment) Enum.valueOf(SDKEnvironment.class, str);
    }

    public static SDKEnvironment[] values() {
        return (SDKEnvironment[]) f436296e.clone();
    }
}
