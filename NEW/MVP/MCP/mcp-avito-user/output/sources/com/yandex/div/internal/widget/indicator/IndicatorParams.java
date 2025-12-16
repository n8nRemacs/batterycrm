package com.yandex.div.internal.widget.indicator;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IndicatorParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams;", "", "<init>", "()V", "Animation", "a", "b", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class IndicatorParams {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IndicatorParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Animation {

        /* renamed from: b, reason: collision with root package name */
        public static final Animation f370282b;

        /* renamed from: c, reason: collision with root package name */
        public static final Animation f370283c;

        /* renamed from: d, reason: collision with root package name */
        public static final Animation f370284d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Animation[] f370285e;

        static {
            Animation animation = new Animation("SCALE", 0);
            f370282b = animation;
            Animation animation2 = new Animation("WORM", 1);
            f370283c = animation2;
            Animation animation3 = new Animation("SLIDER", 2);
            f370284d = animation3;
            f370285e = new Animation[]{animation, animation2, animation3};
        }

        public Animation() {
            throw null;
        }

        public static Animation valueOf(String str) {
            return (Animation) Enum.valueOf(Animation.class, str);
        }

        public static Animation[] values() {
            return (Animation[]) f370285e.clone();
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a;", "", "a", "b", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a$a;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a$a;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.widget.indicator.IndicatorParams$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10930a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final float f370286a;

            public C10930a(float f12) {
                this.f370286a = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10930a) && Float.valueOf(this.f370286a).equals(Float.valueOf(((C10930a) obj).f370286a));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370286a);
            }

            @k
            public final String toString() {
                return r.k(')', this.f370286a, new StringBuilder("Default(spaceBetweenCenters="));
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a$b;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final float f370287a;

            /* renamed from: b, reason: collision with root package name */
            public final int f370288b;

            public b(float f12, int i12) {
                this.f370287a = f12;
                this.f370288b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Float.valueOf(this.f370287a).equals(Float.valueOf(bVar.f370287a)) && this.f370288b == bVar.f370288b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f370288b) + (Float.hashCode(this.f370287a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Stretch(itemSpacing=");
                sb2.append(this.f370287a);
                sb2.append(", maxVisibleItems=");
                return r.t(sb2, this.f370288b, ')');
            }
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b$b;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b {

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b$a;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public float f370289a;

            public a(float f12) {
                super(null);
                this.f370289a = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Float.valueOf(this.f370289a).equals(Float.valueOf(((a) obj).f370289a));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370289a);
            }

            @k
            public final String toString() {
                return r.k(')', this.f370289a, new StringBuilder("Circle(radius="));
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b$b;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.widget.indicator.IndicatorParams$b$b, reason: collision with other inner class name */
        public static final /* data */ class C10931b extends b {

            /* renamed from: a, reason: collision with root package name */
            public float f370290a;

            /* renamed from: b, reason: collision with root package name */
            public float f370291b;

            /* renamed from: c, reason: collision with root package name */
            public final float f370292c;

            public C10931b(float f12, float f13, float f14) {
                super(null);
                this.f370290a = f12;
                this.f370291b = f13;
                this.f370292c = f14;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10931b)) {
                    return false;
                }
                C10931b c10931b = (C10931b) obj;
                return Float.valueOf(this.f370290a).equals(Float.valueOf(c10931b.f370290a)) && Float.valueOf(this.f370291b).equals(Float.valueOf(c10931b.f370291b)) && Float.valueOf(this.f370292c).equals(Float.valueOf(c10931b.f370292c));
            }

            public final int hashCode() {
                return Float.hashCode(this.f370292c) + r.d(this.f370291b, Float.hashCode(this.f370290a) * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RoundedRect(itemWidth=");
                sb2.append(this.f370290a);
                sb2.append(", itemHeight=");
                sb2.append(this.f370291b);
                sb2.append(", cornerRadius=");
                return r.k(')', this.f370292c, sb2);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public final float a() {
            if (this instanceof C10931b) {
                return ((C10931b) this).f370291b;
            }
            if (this instanceof a) {
                return ((a) this).f370289a * 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final float b() {
            if (this instanceof C10931b) {
                return ((C10931b) this).f370290a;
            }
            if (this instanceof a) {
                return ((a) this).f370289a * 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        public b() {
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c$b;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c {

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c$a;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f370293a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final b.a f370294b;

            public a(int i12, @k b.a aVar) {
                super(null);
                this.f370293a = i12;
                this.f370294b = aVar;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.c
            /* renamed from: a, reason: from getter */
            public final int getF370295a() {
                return this.f370293a;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.c
            public final b b() {
                return this.f370294b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f370293a == aVar.f370293a && L.f(this.f370294b, aVar.f370294b);
            }

            public final int hashCode() {
                return Float.hashCode(this.f370294b.f370289a) + (Integer.hashCode(this.f370293a) * 31);
            }

            @k
            public final String toString() {
                return "Circle(color=" + this.f370293a + ", itemSize=" + this.f370294b + ')';
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c$b;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f370295a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final b.C10931b f370296b;

            /* renamed from: c, reason: collision with root package name */
            public final float f370297c;

            /* renamed from: d, reason: collision with root package name */
            public final int f370298d;

            public b(int i12, @k b.C10931b c10931b, float f12, int i13) {
                super(null);
                this.f370295a = i12;
                this.f370296b = c10931b;
                this.f370297c = f12;
                this.f370298d = i13;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.c
            /* renamed from: a, reason: from getter */
            public final int getF370295a() {
                return this.f370295a;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.c
            public final b b() {
                return this.f370296b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f370295a == bVar.f370295a && L.f(this.f370296b, bVar.f370296b) && Float.valueOf(this.f370297c).equals(Float.valueOf(bVar.f370297c)) && this.f370298d == bVar.f370298d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f370298d) + r.d(this.f370297c, (this.f370296b.hashCode() + (Integer.hashCode(this.f370295a) * 31)) * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RoundedRect(color=");
                sb2.append(this.f370295a);
                sb2.append(", itemSize=");
                sb2.append(this.f370296b);
                sb2.append(", strokeWidth=");
                sb2.append(this.f370297c);
                sb2.append(", strokeColor=");
                return r.t(sb2, this.f370298d, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        /* renamed from: a */
        public abstract int getF370295a();

        @k
        public abstract b b();

        public c() {
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Animation f370299a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f370300b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c f370301c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final c f370302d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a f370303e;

        public d(@k Animation animation, @k c cVar, @k c cVar2, @k c cVar3, @k a aVar) {
            this.f370299a = animation;
            this.f370300b = cVar;
            this.f370301c = cVar2;
            this.f370302d = cVar3;
            this.f370303e = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f370299a == dVar.f370299a && L.f(this.f370300b, dVar.f370300b) && L.f(this.f370301c, dVar.f370301c) && L.f(this.f370302d, dVar.f370302d) && L.f(this.f370303e, dVar.f370303e);
        }

        public final int hashCode() {
            return this.f370303e.hashCode() + ((this.f370302d.hashCode() + ((this.f370301c.hashCode() + ((this.f370300b.hashCode() + (this.f370299a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Style(animation=" + this.f370299a + ", activeShape=" + this.f370300b + ", inactiveShape=" + this.f370301c + ", minimumShape=" + this.f370302d + ", itemsPlacement=" + this.f370303e + ')';
        }
    }
}
