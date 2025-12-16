package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinRetention.kt */
/* loaded from: classes8.dex */
public final class KotlinRetention {

    /* renamed from: b, reason: collision with root package name */
    public static final KotlinRetention f407467b;

    /* renamed from: c, reason: collision with root package name */
    public static final KotlinRetention f407468c;

    /* renamed from: d, reason: collision with root package name */
    public static final KotlinRetention f407469d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KotlinRetention[] f407470e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407471f;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        f407467b = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        f407468c = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        f407469d = kotlinRetention3;
        KotlinRetention[] kotlinRetentionArr = {kotlinRetention, kotlinRetention2, kotlinRetention3};
        f407470e = kotlinRetentionArr;
        f407471f = kotlin.enums.c.a(kotlinRetentionArr);
    }

    public KotlinRetention() {
        throw null;
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) f407470e.clone();
    }
}
