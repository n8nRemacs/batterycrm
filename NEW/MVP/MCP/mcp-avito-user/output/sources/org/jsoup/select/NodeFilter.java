package org.jsoup.select;

/* loaded from: classes7.dex */
public interface NodeFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterResult {

        /* renamed from: b, reason: collision with root package name */
        public static final FilterResult f421357b;

        /* renamed from: c, reason: collision with root package name */
        public static final FilterResult f421358c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterResult f421359d;

        /* renamed from: e, reason: collision with root package name */
        public static final FilterResult f421360e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FilterResult[] f421361f;

        static {
            FilterResult filterResult = new FilterResult("CONTINUE", 0);
            f421357b = filterResult;
            FilterResult filterResult2 = new FilterResult("SKIP_CHILDREN", 1);
            f421358c = filterResult2;
            FilterResult filterResult3 = new FilterResult("SKIP_ENTIRELY", 2);
            FilterResult filterResult4 = new FilterResult("REMOVE", 3);
            f421359d = filterResult4;
            FilterResult filterResult5 = new FilterResult("STOP", 4);
            f421360e = filterResult5;
            f421361f = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4, filterResult5};
        }

        public FilterResult() {
            throw null;
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) f421361f.clone();
        }
    }
}
