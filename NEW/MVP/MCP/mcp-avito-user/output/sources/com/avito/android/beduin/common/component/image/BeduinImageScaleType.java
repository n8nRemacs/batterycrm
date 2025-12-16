package com.avito.android.beduin.common.component.image;

import Y61.k;
import com.avito.android.image_loader.ImageRequest;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinImageModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "SCALE", "FILL", "FIT", "FIT_LEFT", "FIT_RIGHT", "CENTER", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinImageScaleType {

    @com.google.gson.annotations.c("center")
    public static final BeduinImageScaleType CENTER;

    @com.google.gson.annotations.c("fill")
    public static final BeduinImageScaleType FILL;

    @com.google.gson.annotations.c("fit")
    public static final BeduinImageScaleType FIT;

    @com.google.gson.annotations.c("fitLeft")
    public static final BeduinImageScaleType FIT_LEFT;

    @com.google.gson.annotations.c("fitRight")
    public static final BeduinImageScaleType FIT_RIGHT;

    @com.google.gson.annotations.c("scale")
    public static final BeduinImageScaleType SCALE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinImageScaleType[] f101447b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101448c;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101449a;

        static {
            int[] iArr = new int[BeduinImageScaleType.values().length];
            try {
                iArr[BeduinImageScaleType.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinImageScaleType.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinImageScaleType.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinImageScaleType.FIT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinImageScaleType.FIT_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeduinImageScaleType.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f101449a = iArr;
        }
    }

    static {
        BeduinImageScaleType beduinImageScaleType = new BeduinImageScaleType("SCALE", 0);
        SCALE = beduinImageScaleType;
        BeduinImageScaleType beduinImageScaleType2 = new BeduinImageScaleType("FILL", 1);
        FILL = beduinImageScaleType2;
        BeduinImageScaleType beduinImageScaleType3 = new BeduinImageScaleType("FIT", 2);
        FIT = beduinImageScaleType3;
        BeduinImageScaleType beduinImageScaleType4 = new BeduinImageScaleType("FIT_LEFT", 3);
        FIT_LEFT = beduinImageScaleType4;
        BeduinImageScaleType beduinImageScaleType5 = new BeduinImageScaleType("FIT_RIGHT", 4);
        FIT_RIGHT = beduinImageScaleType5;
        BeduinImageScaleType beduinImageScaleType6 = new BeduinImageScaleType("CENTER", 5);
        CENTER = beduinImageScaleType6;
        BeduinImageScaleType[] beduinImageScaleTypeArr = {beduinImageScaleType, beduinImageScaleType2, beduinImageScaleType3, beduinImageScaleType4, beduinImageScaleType5, beduinImageScaleType6};
        f101447b = beduinImageScaleTypeArr;
        f101448c = kotlin.enums.c.a(beduinImageScaleTypeArr);
    }

    private BeduinImageScaleType(String str, int i12) {
    }

    public static BeduinImageScaleType valueOf(String str) {
        return (BeduinImageScaleType) Enum.valueOf(BeduinImageScaleType.class, str);
    }

    public static BeduinImageScaleType[] values() {
        return (BeduinImageScaleType[]) f101447b.clone();
    }

    @k
    public final s.a a() {
        s.c cVar;
        switch (a.f101449a[ordinal()]) {
            case 1:
                cVar = s.c.f340129a;
                break;
            case 2:
                cVar = s.c.f340137i;
                break;
            case 3:
                cVar = s.c.f340133e;
                break;
            case 4:
                cVar = s.c.f340132d;
                break;
            case 5:
                cVar = s.c.f340134f;
                break;
            case 6:
                cVar = s.c.f340135g;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (s.a) cVar;
    }

    @k
    public final ImageRequest.ScaleType b() {
        switch (a.f101449a[ordinal()]) {
            case 1:
                return ImageRequest.ScaleType.f169471b;
            case 2:
                return ImageRequest.ScaleType.f169472c;
            case 3:
                return ImageRequest.ScaleType.f169473d;
            case 4:
                return ImageRequest.ScaleType.f169473d;
            case 5:
                return ImageRequest.ScaleType.f169473d;
            case 6:
                return ImageRequest.ScaleType.f169474e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
