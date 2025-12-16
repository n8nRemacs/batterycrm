package coil.request;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CachePolicy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/CachePolicy;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CachePolicy {

    /* renamed from: d, reason: collision with root package name */
    public static final CachePolicy f58614d;

    /* renamed from: e, reason: collision with root package name */
    public static final CachePolicy f58615e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CachePolicy[] f58616f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f58617g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58618b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58619c;

    static {
        CachePolicy cachePolicy = new CachePolicy("ENABLED", 0, true, true);
        f58614d = cachePolicy;
        CachePolicy cachePolicy2 = new CachePolicy("READ_ONLY", 1, true, false);
        CachePolicy cachePolicy3 = new CachePolicy("WRITE_ONLY", 2, false, true);
        CachePolicy cachePolicy4 = new CachePolicy("DISABLED", 3, false, false);
        f58615e = cachePolicy4;
        CachePolicy[] cachePolicyArr = {cachePolicy, cachePolicy2, cachePolicy3, cachePolicy4};
        f58616f = cachePolicyArr;
        f58617g = kotlin.enums.c.a(cachePolicyArr);
    }

    public CachePolicy(String str, int i12, boolean z12, boolean z13) {
        this.f58618b = z12;
        this.f58619c = z13;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f58616f.clone();
    }
}
