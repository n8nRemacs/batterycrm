package com.avito.android.lib.design.gradient;

import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.b;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoLinearGradientDrawable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable;", "Lcom/avito/android/lib/design/gradient/b;", "Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable$a;", "a", "Orientation", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvitoLinearGradientDrawable extends com.avito.android.lib.design.gradient.b<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f179234c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoLinearGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable$Orientation;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Orientation {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Orientation[] f179235b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179236c;

        static {
            Orientation[] orientationArr = {new Orientation("HORIZONTAL", 0), new Orientation("VERTICAL", 1)};
            f179235b = orientationArr;
            f179236c = kotlin.enums.c.a(orientationArr);
        }

        public Orientation() {
            throw null;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) f179235b.clone();
        }
    }

    /* compiled from: AvitoLinearGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable$a;", "Lcom/avito/android/lib/design/gradient/b$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f179237a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179238b;

        /* renamed from: c, reason: collision with root package name */
        public final float f179239c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Orientation f179240d;

        /* renamed from: e, reason: collision with root package name */
        public final int f179241e;

        /* compiled from: AvitoLinearGradientDrawable.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable$a$a;", "Lcom/avito/android/lib/design/gradient/b$a$a;", "Lcom/avito/android/lib/design/gradient/AvitoLinearGradientDrawable$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable$a$a, reason: collision with other inner class name */
        public static final class C5275a extends b.a.AbstractC5278a<a> {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Context f179242b;

            /* renamed from: c, reason: collision with root package name */
            public final int f179243c;

            /* renamed from: d, reason: collision with root package name */
            public final int f179244d;

            public /* synthetic */ C5275a(Context context, int i12, int i13, int i14, C42822w c42822w) {
                this(context, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @k
            public final a a() {
                TypedArray typedArrayObtainStyledAttributes = this.f179242b.obtainStyledAttributes(null, d.n.f178909A, this.f179243c, this.f179244d);
                a aVar = new a(typedArrayObtainStyledAttributes.getColor(3, 0), typedArrayObtainStyledAttributes.getColor(0, 0), typedArrayObtainStyledAttributes.getFloat(1, 0.0f), (Orientation) Orientation.f179236c.get(typedArrayObtainStyledAttributes.getInt(2, 0)), this.f179264a, null);
                typedArrayObtainStyledAttributes.recycle();
                return aVar;
            }

            public C5275a(@k Context context, @InterfaceC42150f int i12, @f0 int i13) {
                this.f179242b = context;
                this.f179243c = i12;
                this.f179244d = i13;
            }
        }

        public a(int i12, int i13, float f12, Orientation orientation, int i14, C42822w c42822w) {
            this.f179237a = i12;
            this.f179238b = i13;
            this.f179239c = f12;
            this.f179240d = orientation;
            this.f179241e = i14;
        }
    }

    /* compiled from: AvitoLinearGradientDrawable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation[] orientationArr = Orientation.f179235b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AvitoLinearGradientDrawable(@k a aVar) {
        this.f179234c = aVar;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final b.a a() {
        return this.f179234c;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final Drawable b(b.a aVar) {
        GradientDrawable.Orientation orientation;
        a aVar2 = (a) aVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iOrdinal = aVar2.f179240d.ordinal();
        if (iOrdinal == 0) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setCornerRadius(aVar2.f179241e);
        int[] iArr = {aVar2.f179237a, aVar2.f179238b};
        if (Build.VERSION.SDK_INT >= 29) {
            float f12 = aVar2.f179239c;
            gradientDrawable.setColors(iArr, new float[]{f12, 1 - f12});
        } else {
            gradientDrawable.setColors(iArr);
        }
        return gradientDrawable;
    }
}
