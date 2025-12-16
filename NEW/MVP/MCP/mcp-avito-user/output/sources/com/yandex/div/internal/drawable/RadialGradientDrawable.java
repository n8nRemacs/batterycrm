package com.yandex.div.internal.drawable;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: RadialGradientDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "a", "b", "Radius", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class RadialGradientDrawable extends Drawable {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f370046g = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Radius f370047a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f370048b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f370049c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final int[] f370050d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f370051e = new Paint();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RectF f370052f = new RectF();

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "", "<init>", "()V", "a", "Relative", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Radius {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Type", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class Relative extends Radius {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Type f370053a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: RadialGradientDrawable.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Type {

                /* renamed from: b, reason: collision with root package name */
                public static final Type f370054b;

                /* renamed from: c, reason: collision with root package name */
                public static final Type f370055c;

                /* renamed from: d, reason: collision with root package name */
                public static final Type f370056d;

                /* renamed from: e, reason: collision with root package name */
                public static final Type f370057e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ Type[] f370058f;

                static {
                    Type type = new Type("NEAREST_CORNER", 0);
                    f370054b = type;
                    Type type2 = new Type("FARTHEST_CORNER", 1);
                    f370055c = type2;
                    Type type3 = new Type("NEAREST_SIDE", 2);
                    f370056d = type3;
                    Type type4 = new Type("FARTHEST_SIDE", 3);
                    f370057e = type4;
                    f370058f = new Type[]{type, type2, type3, type4};
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) f370058f.clone();
                }
            }

            public Relative(@k Type type) {
                super(null);
                this.f370053a = type;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.f370053a == ((Relative) obj).f370053a;
            }

            public final int hashCode() {
                return this.f370053a.hashCode();
            }

            @k
            public final String toString() {
                return "Relative(type=" + this.f370053a + ')';
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$a;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class a extends Radius {

            /* renamed from: a, reason: collision with root package name */
            public final float f370059a;

            public a(float f12) {
                super(null);
                this.f370059a = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Float.valueOf(this.f370059a).equals(Float.valueOf(((a) obj).f370059a));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370059a);
            }

            @k
            public final String toString() {
                return r.k(')', this.f370059a, new StringBuilder("Fixed(value="));
            }
        }

        public /* synthetic */ Radius(C42822w c42822w) {
            this();
        }

        public Radius() {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a$b;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a$a;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.drawable.RadialGradientDrawable$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10924a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final float f370060a;

            public C10924a(float f12) {
                super(null);
                this.f370060a = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10924a) && Float.valueOf(this.f370060a).equals(Float.valueOf(((C10924a) obj).f370060a));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370060a);
            }

            @k
            public final String toString() {
                return r.k(')', this.f370060a, new StringBuilder("Fixed(value="));
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a$b;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final float f370061a;

            public b(float f12) {
                super(null);
                this.f370061a = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Float.valueOf(this.f370061a).equals(Float.valueOf(((b) obj).f370061a));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370061a);
            }

            @k
            public final String toString() {
                return r.k(')', this.f370061a, new StringBuilder("Relative(value="));
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$b;", "", "<init>", "()V", "", "MIN_GRADIENT_RADIUS", "F", "", "distancesToCorners", "distancesToSides", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.drawable.RadialGradientDrawable$b$b, reason: collision with other inner class name */
        public static final class C10925b extends N implements Y41.a<Float[]> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ float f370062l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ float f370063m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ float f370064n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ float f370065o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10925b(float f12, float f13, float f14, float f15) {
                super(0);
                this.f370062l = f12;
                this.f370063m = f13;
                this.f370064n = f14;
                this.f370065o = f15;
            }

            @Override // Y41.a
            public final Float[] invoke() {
                float f12 = this.f370064n;
                float f13 = this.f370065o;
                Float fValueOf = Float.valueOf(b.a(f12, f13, 0.0f, 0.0f));
                float f14 = this.f370062l;
                Float fValueOf2 = Float.valueOf(b.a(f12, f13, f14, 0.0f));
                float f15 = this.f370063m;
                return new Float[]{fValueOf, fValueOf2, Float.valueOf(b.a(f12, f13, f14, f15)), Float.valueOf(b.a(f12, f13, 0.0f, f15))};
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class c extends N implements Y41.a<Float[]> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ float f370066l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ float f370067m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ float f370068n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ float f370069o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f12, float f13, float f14, float f15) {
                super(0);
                this.f370066l = f12;
                this.f370067m = f13;
                this.f370068n = f14;
                this.f370069o = f15;
            }

            @Override // Y41.a
            public final Float[] invoke() {
                float f12 = this.f370068n;
                Float fValueOf = Float.valueOf(Math.abs(f12 - 0.0f));
                Float fValueOf2 = Float.valueOf(Math.abs(f12 - this.f370066l));
                float f13 = this.f370069o;
                return new Float[]{fValueOf, fValueOf2, Float.valueOf(Math.abs(f13 - this.f370067m)), Float.valueOf(Math.abs(f13 - 0.0f))};
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public static final float a(float f12, float f13, float f14, float f15) {
            double d12 = 2;
            return (float) Math.sqrt(((float) Math.pow(f12 - f14, d12)) + ((float) Math.pow(f13 - f15, d12)));
        }

        @k
        public static RadialGradient b(@k Radius radius, @k a aVar, @k a aVar2, @k int[] iArr, int i12, int i13) {
            float f12;
            float f13;
            float fFloatValue;
            if (aVar instanceof a.C10924a) {
                f12 = ((a.C10924a) aVar).f370060a;
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = ((a.b) aVar).f370061a * i12;
            }
            float f14 = f12;
            if (aVar2 instanceof a.C10924a) {
                f13 = ((a.C10924a) aVar2).f370060a;
            } else {
                if (!(aVar2 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = ((a.b) aVar2).f370061a * i13;
            }
            float f15 = f13;
            float f16 = i12;
            float f17 = i13;
            InterfaceC42726C interfaceC42726CC = C42727D.c(new C10925b(f16, f17, f14, f15));
            InterfaceC42726C interfaceC42726CC2 = C42727D.c(new c(f16, f17, f14, f15));
            if (radius instanceof Radius.a) {
                fFloatValue = ((Radius.a) radius).f370059a;
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iOrdinal = ((Radius.Relative) radius).f370053a.ordinal();
                if (iOrdinal == 0) {
                    fFloatValue = C42756l.U((Float[]) interfaceC42726CC.getValue()).floatValue();
                } else if (iOrdinal == 1) {
                    fFloatValue = C42756l.S((Float[]) interfaceC42726CC.getValue()).floatValue();
                } else if (iOrdinal == 2) {
                    fFloatValue = C42756l.U((Float[]) interfaceC42726CC2.getValue()).floatValue();
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fFloatValue = C42756l.S((Float[]) interfaceC42726CC2.getValue()).floatValue();
                }
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(f14, f15, fFloatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }

        public b() {
        }
    }

    public RadialGradientDrawable(@k Radius radius, @k a aVar, @k a aVar2, @k int[] iArr) {
        this.f370047a = radius;
        this.f370048b = aVar;
        this.f370049c = aVar2;
        this.f370050d = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        canvas.drawRect(this.f370052f, this.f370051e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f370051e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        Paint paint = this.f370051e;
        int iWidth = rect.width();
        int iHeight = rect.height();
        Radius radius = this.f370047a;
        a aVar = this.f370048b;
        a aVar2 = this.f370049c;
        int[] iArr = this.f370050d;
        f370046g.getClass();
        paint.setShader(b.b(radius, aVar, aVar2, iArr, iWidth, iHeight));
        this.f370052f.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f370051e.setAlpha(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
