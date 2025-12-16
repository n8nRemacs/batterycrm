package kotlin.reflect.jvm.internal.impl.name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FqNamesUtil.kt */
/* loaded from: classes8.dex */
final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f409286b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f409287c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f409288d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f409289e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409290f;

    static {
        k kVar = new k("BEGINNING", 0);
        f409286b = kVar;
        k kVar2 = new k("MIDDLE", 1);
        f409287c = kVar2;
        k kVar3 = new k("AFTER_DOT", 2);
        f409288d = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        f409289e = kVarArr;
        f409290f = kotlin.enums.c.a(kVarArr);
    }

    public k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f409289e.clone();
    }
}
