package com.yandex.div.core.view2.divs;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div2.AbstractC38386j1;
import com.yandex.div2.C38371h6;
import com.yandex.div2.C38374i;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.F;
import com.yandex.div2.F4;
import com.yandex.div2.G4;
import com.yandex.div2.I4;
import com.yandex.div2.M4;
import com.yandex.div2.S3;
import com.yandex.div2.Y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivBackgroundBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/q;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37989q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v21.c f368613a;

    /* compiled from: DivBackgroundBinder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/yandex/div/core/view2/divs/q$a$b;", "Lcom/yandex/div/core/view2/divs/q$a$d;", "Lcom/yandex/div/core/view2/divs/q$a$a;", "Lcom/yandex/div/core/view2/divs/q$a$e;", "Lcom/yandex/div/core/view2/divs/q$a$c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.q$a */
    public static abstract class a {

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$a;", "Lcom/yandex/div/core/view2/divs/q$a;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10877a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final double f368614a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DivAlignmentHorizontal f368615b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final DivAlignmentVertical f368616c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Uri f368617d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f368618e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final DivImageScale f368619f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final ArrayList f368620g;

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$a$a;", "", "<init>", "()V", "a", "Lcom/yandex/div/core/view2/divs/q$a$a$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: com.yandex.div.core.view2.divs.q$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC10878a {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$a$a$a;", "Lcom/yandex/div/core/view2/divs/q$a$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$a$a$a, reason: collision with other inner class name */
                public static final /* data */ class C10879a extends AbstractC10878a {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f368621a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final AbstractC38386j1.a f368622b;

                    public C10879a(int i12, @Y61.k AbstractC38386j1.a aVar) {
                        super(null);
                        this.f368621a = i12;
                        this.f368622b = aVar;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C10879a)) {
                            return false;
                        }
                        C10879a c10879a = (C10879a) obj;
                        return this.f368621a == c10879a.f368621a && kotlin.jvm.internal.L.f(this.f368622b, c10879a.f368622b);
                    }

                    public final int hashCode() {
                        return this.f368622b.hashCode() + (Integer.hashCode(this.f368621a) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "Blur(radius=" + this.f368621a + ", div=" + this.f368622b + ')';
                    }
                }

                public /* synthetic */ AbstractC10878a(C42822w c42822w) {
                    this();
                }

                public AbstractC10878a() {
                }
            }

            public C10877a(double d12, @Y61.k DivAlignmentHorizontal divAlignmentHorizontal, @Y61.k DivAlignmentVertical divAlignmentVertical, @Y61.k Uri uri, boolean z12, @Y61.k DivImageScale divImageScale, @Y61.l ArrayList arrayList) {
                super(null);
                this.f368614a = d12;
                this.f368615b = divAlignmentHorizontal;
                this.f368616c = divAlignmentVertical;
                this.f368617d = uri;
                this.f368618e = z12;
                this.f368619f = divImageScale;
                this.f368620g = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10877a)) {
                    return false;
                }
                C10877a c10877a = (C10877a) obj;
                return Double.valueOf(this.f368614a).equals(Double.valueOf(c10877a.f368614a)) && this.f368615b == c10877a.f368615b && this.f368616c == c10877a.f368616c && kotlin.jvm.internal.L.f(this.f368617d, c10877a.f368617d) && this.f368618e == c10877a.f368618e && this.f368619f == c10877a.f368619f && kotlin.jvm.internal.L.f(this.f368620g, c10877a.f368620g);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int hashCode() {
                int iE2 = androidx.media3.exoplayer.analytics.m.e(this.f368617d, (this.f368616c.hashCode() + ((this.f368615b.hashCode() + (Double.hashCode(this.f368614a) * 31)) * 31)) * 31, 31);
                boolean z12 = this.f368618e;
                int i12 = z12;
                if (z12 != 0) {
                    i12 = 1;
                }
                int iHashCode = (this.f368619f.hashCode() + ((iE2 + i12) * 31)) * 31;
                ArrayList arrayList = this.f368620g;
                return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Image(alpha=");
                sb2.append(this.f368614a);
                sb2.append(", contentAlignmentHorizontal=");
                sb2.append(this.f368615b);
                sb2.append(", contentAlignmentVertical=");
                sb2.append(this.f368616c);
                sb2.append(", imageUrl=");
                sb2.append(this.f368617d);
                sb2.append(", preloadRequired=");
                sb2.append(this.f368618e);
                sb2.append(", scale=");
                sb2.append(this.f368619f);
                sb2.append(", filters=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f368620g, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$b;", "Lcom/yandex/div/core/view2/divs/q$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f368623a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<Integer> f368624b;

            public b(int i12, @Y61.k List<Integer> list) {
                super(null);
                this.f368623a = i12;
                this.f368624b = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f368623a == bVar.f368623a && kotlin.jvm.internal.L.f(this.f368624b, bVar.f368624b);
            }

            public final int hashCode() {
                return this.f368624b.hashCode() + (Integer.hashCode(this.f368623a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LinearGradient(angle=");
                sb2.append(this.f368623a);
                sb2.append(", colors=");
                return androidx.compose.foundation.H.p(sb2, this.f368624b, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$c;", "Lcom/yandex/div/core/view2/divs/q$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q$a$c */
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Uri f368625a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Rect f368626b;

            public c(@Y61.k Uri uri, @Y61.k Rect rect) {
                super(null);
                this.f368625a = uri;
                this.f368626b = rect;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.L.f(this.f368625a, cVar.f368625a) && kotlin.jvm.internal.L.f(this.f368626b, cVar.f368626b);
            }

            public final int hashCode() {
                return this.f368626b.hashCode() + (this.f368625a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "NinePatch(imageUrl=" + this.f368625a + ", insets=" + this.f368626b + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d;", "Lcom/yandex/div/core/view2/divs/q$a;", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q$a$d */
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AbstractC10880a f368627a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AbstractC10880a f368628b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final List<Integer> f368629c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final b f368630d;

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$a;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/core/view2/divs/q$a$d$a$b;", "Lcom/yandex/div/core/view2/divs/q$a$d$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: com.yandex.div.core.view2.divs.q$a$d$a, reason: collision with other inner class name */
            public static abstract class AbstractC10880a {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$a$a;", "Lcom/yandex/div/core/view2/divs/q$a$d$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$d$a$a, reason: collision with other inner class name */
                public static final /* data */ class C10881a extends AbstractC10880a {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f368631a;

                    public C10881a(float f12) {
                        super(null);
                        this.f368631a = f12;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C10881a) && Float.valueOf(this.f368631a).equals(Float.valueOf(((C10881a) obj).f368631a));
                    }

                    public final int hashCode() {
                        return Float.hashCode(this.f368631a);
                    }

                    @Y61.k
                    public final String toString() {
                        return androidx.appcompat.app.r.k(')', this.f368631a, new StringBuilder("Fixed(valuePx="));
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$a$b;", "Lcom/yandex/div/core/view2/divs/q$a$d$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$d$a$b */
                public static final /* data */ class b extends AbstractC10880a {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f368632a;

                    public b(float f12) {
                        super(null);
                        this.f368632a = f12;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && Float.valueOf(this.f368632a).equals(Float.valueOf(((b) obj).f368632a));
                    }

                    public final int hashCode() {
                        return Float.hashCode(this.f368632a);
                    }

                    @Y61.k
                    public final String toString() {
                        return androidx.appcompat.app.r.k(')', this.f368632a, new StringBuilder("Relative(value="));
                    }
                }

                public /* synthetic */ AbstractC10880a(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final RadialGradientDrawable.a a() {
                    if (this instanceof C10881a) {
                        return new RadialGradientDrawable.a.C10924a(((C10881a) this).f368631a);
                    }
                    if (this instanceof b) {
                        return new RadialGradientDrawable.a.b(((b) this).f368632a);
                    }
                    throw new NoWhenBranchMatchedException();
                }

                public AbstractC10880a() {
                }
            }

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$b;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/core/view2/divs/q$a$d$b$b;", "Lcom/yandex/div/core/view2/divs/q$a$d$b$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: com.yandex.div.core.view2.divs.q$a$d$b */
            public static abstract class b {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$b$a;", "Lcom/yandex/div/core/view2/divs/q$a$d$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$d$b$a, reason: collision with other inner class name */
                public static final /* data */ class C10882a extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f368633a;

                    public C10882a(float f12) {
                        super(null);
                        this.f368633a = f12;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C10882a) && Float.valueOf(this.f368633a).equals(Float.valueOf(((C10882a) obj).f368633a));
                    }

                    public final int hashCode() {
                        return Float.hashCode(this.f368633a);
                    }

                    @Y61.k
                    public final String toString() {
                        return androidx.appcompat.app.r.k(')', this.f368633a, new StringBuilder("Fixed(valuePx="));
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$d$b$b;", "Lcom/yandex/div/core/view2/divs/q$a$d$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$d$b$b, reason: collision with other inner class name */
                public static final /* data */ class C10883b extends b {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final DivRadialGradientRelativeRadius.Value f368634a;

                    public C10883b(@Y61.k DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        this.f368634a = value;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C10883b) && this.f368634a == ((C10883b) obj).f368634a;
                    }

                    public final int hashCode() {
                        return this.f368634a.hashCode();
                    }

                    @Y61.k
                    public final String toString() {
                        return "Relative(value=" + this.f368634a + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.yandex.div.core.view2.divs.q$a$d$b$c */
                public /* synthetic */ class c {
                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        iArr[1] = 1;
                        iArr[0] = 2;
                        iArr[3] = 3;
                        iArr[2] = 4;
                    }
                }

                public /* synthetic */ b(C42822w c42822w) {
                    this();
                }

                public b() {
                }
            }

            public d(@Y61.k AbstractC10880a abstractC10880a, @Y61.k AbstractC10880a abstractC10880a2, @Y61.k List<Integer> list, @Y61.k b bVar) {
                super(null);
                this.f368627a = abstractC10880a;
                this.f368628b = abstractC10880a2;
                this.f368629c = list;
                this.f368630d = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.L.f(this.f368627a, dVar.f368627a) && kotlin.jvm.internal.L.f(this.f368628b, dVar.f368628b) && kotlin.jvm.internal.L.f(this.f368629c, dVar.f368629c) && kotlin.jvm.internal.L.f(this.f368630d, dVar.f368630d);
            }

            public final int hashCode() {
                return this.f368630d.hashCode() + androidx.compose.foundation.H.e((this.f368628b.hashCode() + (this.f368627a.hashCode() * 31)) * 31, 31, this.f368629c);
            }

            @Y61.k
            public final String toString() {
                return "RadialGradient(centerX=" + this.f368627a + ", centerY=" + this.f368628b + ", colors=" + this.f368629c + ", radius=" + this.f368630d + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q$a$e;", "Lcom/yandex/div/core/view2/divs/q$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q$a$e */
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f368635a;

            public e(int i12) {
                super(null);
                this.f368635a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f368635a == ((e) obj).f368635a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f368635a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("Solid(color="), this.f368635a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public C37989q(@Y61.k v21.c cVar) {
        this.f368613a = cVar;
    }

    public static final a a(C37989q c37989q, com.yandex.div2.F f12, DisplayMetrics displayMetrics, com.yandex.div.json.expressions.e eVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        a.d.b c10883b;
        int i17;
        c37989q.getClass();
        if (f12 instanceof F.d) {
            F.d dVar = (F.d) f12;
            long jLongValue = dVar.f372266c.f373506a.a(eVar).longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i17 = (int) jLongValue;
            } else {
                int i18 = com.yandex.div.internal.n.f370123a;
                i17 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            return new a.b(i17, dVar.f372266c.f373507b.a(eVar));
        }
        if (f12 instanceof F.f) {
            F.f fVar = (F.f) f12;
            a.d.AbstractC10880a abstractC10880aE = e(fVar.f372268c.f372276a, displayMetrics, eVar);
            F4 f42 = fVar.f372268c;
            a.d.AbstractC10880a abstractC10880aE2 = e(f42.f372277b, displayMetrics, eVar);
            List<Integer> listA = f42.f372278c.a(eVar);
            M4 m42 = f42.f372279d;
            if (m42 instanceof M4.c) {
                c10883b = new a.d.b.C10882a(C37931a.R(((M4.c) m42).f372802c, displayMetrics, eVar));
            } else {
                if (!(m42 instanceof M4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c10883b = new a.d.b.C10883b(((M4.d) m42).f372803c.f371864a.a(eVar));
            }
            return new a.d(abstractC10880aE, abstractC10880aE2, listA, c10883b);
        }
        if (f12 instanceof F.c) {
            F.c cVar = (F.c) f12;
            double dDoubleValue = cVar.f372265c.f372220a.a(eVar).doubleValue();
            com.yandex.div2.E2 e22 = cVar.f372265c;
            DivAlignmentHorizontal divAlignmentHorizontalA = e22.f372221b.a(eVar);
            DivAlignmentVertical divAlignmentVerticalA = e22.f372222c.a(eVar);
            Uri uriA = e22.f372224e.a(eVar);
            boolean zBooleanValue = e22.f372225f.a(eVar).booleanValue();
            DivImageScale divImageScaleA = e22.f372226g.a(eVar);
            List<AbstractC38386j1> list = e22.f372223d;
            if (list == null) {
                arrayList = null;
            } else {
                List<AbstractC38386j1> list2 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (AbstractC38386j1 abstractC38386j1 : list2) {
                    if (!(abstractC38386j1 instanceof AbstractC38386j1.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC38386j1.a aVar = (AbstractC38386j1.a) abstractC38386j1;
                    long jLongValue2 = aVar.f375416c.f372541a.a(eVar).longValue();
                    long j13 = jLongValue2 >> 31;
                    if (j13 == 0 || j13 == -1) {
                        i16 = (int) jLongValue2;
                    } else {
                        int i19 = com.yandex.div.internal.n.f370123a;
                        i16 = jLongValue2 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
                    }
                    arrayList2.add(new a.C10877a.AbstractC10878a.C10879a(i16, aVar));
                }
                arrayList = arrayList2;
            }
            return new a.C10877a(dDoubleValue, divAlignmentHorizontalA, divAlignmentVerticalA, uriA, zBooleanValue, divImageScaleA, arrayList);
        }
        if (f12 instanceof F.g) {
            return new a.e(((F.g) f12).f372269c.f375275a.a(eVar).intValue());
        }
        if (!(f12 instanceof F.e)) {
            throw new NoWhenBranchMatchedException();
        }
        F.e eVar2 = (F.e) f12;
        Uri uriA2 = eVar2.f372267c.f374045a.a(eVar);
        Y3 y32 = eVar2.f372267c;
        long jLongValue3 = y32.f374046b.f375298b.a(eVar).longValue();
        long j14 = jLongValue3 >> 31;
        if (j14 == 0 || j14 == -1) {
            i12 = (int) jLongValue3;
        } else {
            int i22 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue3 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        C38374i c38374i = y32.f374046b;
        long jLongValue4 = c38374i.f375300d.a(eVar).longValue();
        long j15 = jLongValue4 >> 31;
        if (j15 == 0 || j15 == -1) {
            i13 = (int) jLongValue4;
        } else {
            int i23 = com.yandex.div.internal.n.f370123a;
            i13 = jLongValue4 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        long jLongValue5 = c38374i.f375299c.a(eVar).longValue();
        long j16 = jLongValue5 >> 31;
        if (j16 == 0 || j16 == -1) {
            i14 = (int) jLongValue5;
        } else {
            int i24 = com.yandex.div.internal.n.f370123a;
            i14 = jLongValue5 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        long jLongValue6 = c38374i.f375297a.a(eVar).longValue();
        long j17 = jLongValue6 >> 31;
        if (j17 == 0 || j17 == -1) {
            i15 = (int) jLongValue6;
        } else {
            int i25 = com.yandex.div.internal.n.f370123a;
            i15 = jLongValue6 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        return new a.c(uriA2, new Rect(i12, i13, i14, i15));
    }

    public static final LayerDrawable b(C37989q c37989q, List list, View view, C38029k c38029k, Drawable drawable, com.yandex.div.json.expressions.e eVar) {
        RadialGradientDrawable.Radius relative;
        RadialGradientDrawable.Radius.Relative.Type type;
        Drawable radialGradientDrawable;
        c37989q.getClass();
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable == null) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{drawable});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            boolean z12 = aVar instanceof a.C10877a;
            v21.c cVar = c37989q.f368613a;
            if (z12) {
                a.C10877a c10877a = (a.C10877a) aVar;
                ScalingDrawable scalingDrawable = new ScalingDrawable();
                c38029k.h(cVar.loadImage(c10877a.f368617d.toString(), new r(c38029k, view, c10877a, eVar, scalingDrawable)));
                radialGradientDrawable = scalingDrawable;
            } else if (aVar instanceof a.c) {
                a.c cVar2 = (a.c) aVar;
                com.yandex.div.internal.drawable.c cVar3 = new com.yandex.div.internal.drawable.c();
                c38029k.h(cVar.loadImage(cVar2.f368625a.toString(), new C37994s(c38029k, cVar3, cVar2)));
                radialGradientDrawable = cVar3;
            } else if (aVar instanceof a.e) {
                radialGradientDrawable = new ColorDrawable(((a.e) aVar).f368635a);
            } else if (aVar instanceof a.b) {
                radialGradientDrawable = new com.yandex.div.internal.drawable.b(r0.f368623a, C42745f0.L0(((a.b) aVar).f368624b));
            } else {
                if (!(aVar instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.d dVar = (a.d) aVar;
                a.d.b bVar = dVar.f368630d;
                bVar.getClass();
                if (bVar instanceof a.d.b.C10882a) {
                    relative = new RadialGradientDrawable.Radius.a(((a.d.b.C10882a) bVar).f368633a);
                } else {
                    if (!(bVar instanceof a.d.b.C10883b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iOrdinal = ((a.d.b.C10883b) bVar).f368634a.ordinal();
                    if (iOrdinal == 0) {
                        type = RadialGradientDrawable.Radius.Relative.Type.f370054b;
                    } else if (iOrdinal == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.f370055c;
                    } else if (iOrdinal == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.f370056d;
                    } else {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.f370057e;
                    }
                    relative = new RadialGradientDrawable.Radius.Relative(type);
                }
                radialGradientDrawable = new RadialGradientDrawable(relative, dVar.f368627a.a(), dVar.f368628b.a(), C42745f0.L0(dVar.f368629c));
            }
            Drawable drawableMutate = radialGradientDrawable.mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (drawable != null) {
            arrayList2.add(drawable);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Object[] array = arrayList2.toArray(new Drawable[0]);
        if (array != null) {
            return new LayerDrawable((Drawable[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final void c(C37989q c37989q, View view, Drawable drawable) {
        boolean z12;
        c37989q.getClass();
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        Object[] array = arrayList.toArray(new Drawable[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        view.setBackground(new LayerDrawable((Drawable[]) array));
        if (z12) {
            Drawable background2 = view.getBackground();
            if (background2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) background2;
            Drawable background3 = view.getBackground();
            if (background3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            }
            layerDrawable2.setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R.drawable.native_animation_background);
        }
    }

    public static void d(List list, com.yandex.div.json.expressions.e eVar, F21.b bVar, Y41.l lVar) {
        com.yandex.div.json.b bVar2;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.yandex.div2.F f12 = (com.yandex.div2.F) it.next();
            f12.getClass();
            if (f12 instanceof F.d) {
                bVar2 = ((F.d) f12).f372266c;
            } else if (f12 instanceof F.f) {
                bVar2 = ((F.f) f12).f372268c;
            } else if (f12 instanceof F.c) {
                bVar2 = ((F.c) f12).f372265c;
            } else if (f12 instanceof F.g) {
                bVar2 = ((F.g) f12).f372269c;
            } else {
                if (!(f12 instanceof F.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = ((F.e) f12).f372267c;
            }
            if (bVar2 instanceof C38371h6) {
                bVar.e(((C38371h6) bVar2).f375275a.d(eVar, lVar));
            } else if (bVar2 instanceof S3) {
                S3 s32 = (S3) bVar2;
                bVar.e(s32.f373506a.d(eVar, lVar));
                bVar.e(s32.f373507b.b(eVar, lVar));
            } else if (bVar2 instanceof F4) {
                F4 f42 = (F4) bVar2;
                C37931a.B(f42.f372276a, eVar, bVar, lVar);
                C37931a.B(f42.f372277b, eVar, bVar, lVar);
                C37931a.C(f42.f372279d, eVar, bVar, lVar);
                bVar.e(f42.f372278c.b(eVar, lVar));
            } else if (bVar2 instanceof com.yandex.div2.E2) {
                com.yandex.div2.E2 e22 = (com.yandex.div2.E2) bVar2;
                bVar.e(e22.f372220a.d(eVar, lVar));
                bVar.e(e22.f372224e.d(eVar, lVar));
                bVar.e(e22.f372221b.d(eVar, lVar));
                bVar.e(e22.f372222c.d(eVar, lVar));
                bVar.e(e22.f372225f.d(eVar, lVar));
                bVar.e(e22.f372226g.d(eVar, lVar));
                List<AbstractC38386j1> list2 = e22.f372223d;
                if (list2 == null) {
                    list2 = C42784z0.f406748b;
                }
                for (AbstractC38386j1 abstractC38386j1 : list2) {
                    if (abstractC38386j1 instanceof AbstractC38386j1.a) {
                        bVar.e(((AbstractC38386j1.a) abstractC38386j1).f375416c.f372541a.d(eVar, lVar));
                    }
                }
            }
        }
    }

    public static a.d.AbstractC10880a e(G4 g42, DisplayMetrics displayMetrics, com.yandex.div.json.expressions.e eVar) {
        if (g42 instanceof G4.c) {
            I4 i42 = ((G4.c) g42).f372485c;
            return new a.d.AbstractC10880a.C10881a(C37931a.t(i42.f372588b.a(eVar).longValue(), i42.f372587a.a(eVar), displayMetrics));
        }
        if (g42 instanceof G4.d) {
            return new a.d.AbstractC10880a.b((float) ((G4.d) g42).f372486c.f373132a.a(eVar).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
