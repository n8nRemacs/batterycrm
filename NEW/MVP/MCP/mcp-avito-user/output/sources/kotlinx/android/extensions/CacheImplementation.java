package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheImplementation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "a", "kotlin-android-extensions-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CacheImplementation {

    /* renamed from: b, reason: collision with root package name */
    public static final CacheImplementation f410668b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CacheImplementation[] f410669c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410670d;

    /* compiled from: CacheImplementation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$a;", "", "<init>", "()V", "kotlin-android-extensions-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("SPARSE_ARRAY", 0);
        CacheImplementation cacheImplementation2 = new CacheImplementation("HASH_MAP", 1);
        f410668b = cacheImplementation2;
        CacheImplementation[] cacheImplementationArr = {cacheImplementation, cacheImplementation2, new CacheImplementation("NO_CACHE", 2)};
        f410669c = cacheImplementationArr;
        f410670d = c.a(cacheImplementationArr);
        new a(null);
    }

    public CacheImplementation() {
        throw null;
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) f410669c.clone();
    }
}
