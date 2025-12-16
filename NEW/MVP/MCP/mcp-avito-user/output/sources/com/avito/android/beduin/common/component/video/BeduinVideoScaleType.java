package com.avito.android.beduin.common.component.video;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinVideoModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "SCALE", "FILL", "FIT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinVideoScaleType {

    @com.google.gson.annotations.c("fill")
    public static final BeduinVideoScaleType FILL;

    @com.google.gson.annotations.c("fit")
    public static final BeduinVideoScaleType FIT;

    @com.google.gson.annotations.c("scale")
    public static final BeduinVideoScaleType SCALE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinVideoScaleType[] f102876b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102877c;

    /* compiled from: BeduinVideoModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102878a;

        static {
            int[] iArr = new int[BeduinVideoScaleType.values().length];
            try {
                iArr[BeduinVideoScaleType.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinVideoScaleType.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinVideoScaleType.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102878a = iArr;
        }
    }

    static {
        BeduinVideoScaleType beduinVideoScaleType = new BeduinVideoScaleType("SCALE", 0);
        SCALE = beduinVideoScaleType;
        BeduinVideoScaleType beduinVideoScaleType2 = new BeduinVideoScaleType("FILL", 1);
        FILL = beduinVideoScaleType2;
        BeduinVideoScaleType beduinVideoScaleType3 = new BeduinVideoScaleType("FIT", 2);
        FIT = beduinVideoScaleType3;
        BeduinVideoScaleType[] beduinVideoScaleTypeArr = {beduinVideoScaleType, beduinVideoScaleType2, beduinVideoScaleType3};
        f102876b = beduinVideoScaleTypeArr;
        f102877c = kotlin.enums.c.a(beduinVideoScaleTypeArr);
    }

    private BeduinVideoScaleType(String str, int i12) {
    }

    public static BeduinVideoScaleType valueOf(String str) {
        return (BeduinVideoScaleType) Enum.valueOf(BeduinVideoScaleType.class, str);
    }

    public static BeduinVideoScaleType[] values() {
        return (BeduinVideoScaleType[]) f102876b.clone();
    }
}
