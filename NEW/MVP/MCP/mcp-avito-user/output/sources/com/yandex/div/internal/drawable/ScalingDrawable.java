package com.yandex.div.internal.drawable;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: ScalingDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "AlignmentHorizontal", "AlignmentVertical", "ScaleType", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ScalingDrawable extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    @l
    public Bitmap f370073d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370076g;

    /* renamed from: j, reason: collision with root package name */
    public float f370079j;

    /* renamed from: k, reason: collision with root package name */
    public float f370080k;

    /* renamed from: a, reason: collision with root package name */
    @k
    public ScaleType f370070a = ScaleType.f370089b;

    /* renamed from: b, reason: collision with root package name */
    @k
    public AlignmentHorizontal f370071b = AlignmentHorizontal.f370081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public AlignmentVertical f370072c = AlignmentVertical.f370085b;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f370074e = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Matrix f370075f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public float f370077h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f370078i = 1.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScalingDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AlignmentHorizontal {

        /* renamed from: b, reason: collision with root package name */
        public static final AlignmentHorizontal f370081b;

        /* renamed from: c, reason: collision with root package name */
        public static final AlignmentHorizontal f370082c;

        /* renamed from: d, reason: collision with root package name */
        public static final AlignmentHorizontal f370083d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AlignmentHorizontal[] f370084e;

        static {
            AlignmentHorizontal alignmentHorizontal = new AlignmentHorizontal("LEFT", 0);
            f370081b = alignmentHorizontal;
            AlignmentHorizontal alignmentHorizontal2 = new AlignmentHorizontal("CENTER", 1);
            f370082c = alignmentHorizontal2;
            AlignmentHorizontal alignmentHorizontal3 = new AlignmentHorizontal("RIGHT", 2);
            f370083d = alignmentHorizontal3;
            f370084e = new AlignmentHorizontal[]{alignmentHorizontal, alignmentHorizontal2, alignmentHorizontal3};
        }

        public AlignmentHorizontal() {
            throw null;
        }

        public static AlignmentHorizontal valueOf(String str) {
            return (AlignmentHorizontal) Enum.valueOf(AlignmentHorizontal.class, str);
        }

        public static AlignmentHorizontal[] values() {
            return (AlignmentHorizontal[]) f370084e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScalingDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AlignmentVertical {

        /* renamed from: b, reason: collision with root package name */
        public static final AlignmentVertical f370085b;

        /* renamed from: c, reason: collision with root package name */
        public static final AlignmentVertical f370086c;

        /* renamed from: d, reason: collision with root package name */
        public static final AlignmentVertical f370087d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AlignmentVertical[] f370088e;

        static {
            AlignmentVertical alignmentVertical = new AlignmentVertical("TOP", 0);
            f370085b = alignmentVertical;
            AlignmentVertical alignmentVertical2 = new AlignmentVertical("CENTER", 1);
            f370086c = alignmentVertical2;
            AlignmentVertical alignmentVertical3 = new AlignmentVertical("BOTTOM", 2);
            f370087d = alignmentVertical3;
            f370088e = new AlignmentVertical[]{alignmentVertical, alignmentVertical2, alignmentVertical3};
        }

        public AlignmentVertical() {
            throw null;
        }

        public static AlignmentVertical valueOf(String str) {
            return (AlignmentVertical) Enum.valueOf(AlignmentVertical.class, str);
        }

        public static AlignmentVertical[] values() {
            return (AlignmentVertical[]) f370088e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScalingDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ScaleType {

        /* renamed from: b, reason: collision with root package name */
        public static final ScaleType f370089b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScaleType f370090c;

        /* renamed from: d, reason: collision with root package name */
        public static final ScaleType f370091d;

        /* renamed from: e, reason: collision with root package name */
        public static final ScaleType f370092e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ScaleType[] f370093f;

        static {
            ScaleType scaleType = new ScaleType("NO_SCALE", 0);
            f370089b = scaleType;
            ScaleType scaleType2 = new ScaleType("FIT", 1);
            f370090c = scaleType2;
            ScaleType scaleType3 = new ScaleType("FILL", 2);
            f370091d = scaleType3;
            ScaleType scaleType4 = new ScaleType("STRETCH", 3);
            f370092e = scaleType4;
            f370093f = new ScaleType[]{scaleType, scaleType2, scaleType3, scaleType4};
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f370093f.clone();
        }
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ScaleType.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            iArr2[1] = 1;
            iArr2[2] = 2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            iArr3[1] = 1;
            iArr3[2] = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(@Y61.k android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.drawable.ScalingDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f370074e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        this.f370076g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f370074e.setAlpha(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
