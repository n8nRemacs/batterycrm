package com.google.gson;

/* loaded from: classes6.dex */
public interface ReflectionAccessFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterResult {

        /* renamed from: b, reason: collision with root package name */
        public static final FilterResult f361975b;

        /* renamed from: c, reason: collision with root package name */
        public static final FilterResult f361976c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterResult f361977d;

        /* renamed from: e, reason: collision with root package name */
        public static final FilterResult f361978e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FilterResult[] f361979f;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            f361975b = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            f361976c = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            f361977d = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            f361978e = filterResult4;
            f361979f = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public FilterResult() {
            throw null;
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) f361979f.clone();
        }
    }

    public class a implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class<?> cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.f361977d : FilterResult.f361976c;
        }
    }

    public class b implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class<?> cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.f361978e : FilterResult.f361976c;
        }
    }

    public class c implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class<?> cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.f361978e : FilterResult.f361976c;
        }
    }

    public class d implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class<?> cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) ? FilterResult.f361978e : FilterResult.f361976c;
        }
    }

    FilterResult a(Class<?> cls);
}
