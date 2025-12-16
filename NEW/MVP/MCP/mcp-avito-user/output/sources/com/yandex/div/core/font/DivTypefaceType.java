package com.yandex.div.core.font;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DivTypefaceType {

    /* renamed from: b, reason: collision with root package name */
    public static final DivTypefaceType f367531b;

    /* renamed from: c, reason: collision with root package name */
    public static final DivTypefaceType f367532c;

    /* renamed from: d, reason: collision with root package name */
    public static final DivTypefaceType f367533d;

    /* renamed from: e, reason: collision with root package name */
    public static final DivTypefaceType f367534e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DivTypefaceType[] f367535f;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f367536a;

        static {
            int[] iArr = new int[DivTypefaceType.values().length];
            f367536a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f367536a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f367536a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        DivTypefaceType divTypefaceType = new DivTypefaceType("REGULAR", 0);
        f367531b = divTypefaceType;
        DivTypefaceType divTypefaceType2 = new DivTypefaceType("MEDIUM", 1);
        f367532c = divTypefaceType2;
        DivTypefaceType divTypefaceType3 = new DivTypefaceType("BOLD", 2);
        f367533d = divTypefaceType3;
        DivTypefaceType divTypefaceType4 = new DivTypefaceType("LIGHT", 3);
        f367534e = divTypefaceType4;
        f367535f = new DivTypefaceType[]{divTypefaceType, divTypefaceType2, divTypefaceType3, divTypefaceType4};
    }

    public DivTypefaceType() {
        throw null;
    }

    public static DivTypefaceType valueOf(String str) {
        return (DivTypefaceType) Enum.valueOf(DivTypefaceType.class, str);
    }

    public static DivTypefaceType[] values() {
        return (DivTypefaceType[]) f367535f.clone();
    }
}
