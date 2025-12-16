package com.avito.android.lib.design.tab_group;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabGroupStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tab_group/e;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f180739j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f180740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180741b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C35763c0 f180742c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f180743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180744e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180745f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f180746g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f180747h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f180748i;

    /* compiled from: TabGroupStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tab_group/e$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static e a(@k TypedArray typedArray, @k Context context) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 4);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 0);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(2, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(6, 0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedArray.getResourceId(7, 0), d.n.f178934M0);
            try {
                com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
                dVar.getClass();
                n nVarA = com.avito.android.lib.design.text_view.d.a(resourceId, context);
                ColorStateList colorStateListA3 = x.a(typedArrayObtainStyledAttributes, context, 7);
                if (colorStateListA3 == null) {
                    colorStateListA3 = ColorStateList.valueOf(0);
                }
                ColorStateList colorStateList = colorStateListA3;
                n nVarA2 = com.avito.android.lib.design.text_view.d.a(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
                int color = typedArrayObtainStyledAttributes.getColor(1, 0);
                int color2 = typedArrayObtainStyledAttributes.getColor(0, 0);
                int color3 = typedArrayObtainStyledAttributes.getColor(4, 0);
                int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                g.a aVar = g.f178395r;
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
                aVar.getClass();
                b bVar = new b(nVarA, colorStateList, nVarA2, color, color2, color3, dimensionPixelSize5, g.a.b(resourceId2, context), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0)));
                typedArrayObtainStyledAttributes.recycle();
                return new e(dimensionPixelSize, dimensionPixelSize2, c35763c0B, c35763c0B2, dimensionPixelSize3, dimensionPixelSize4, bVar, Integer.valueOf(typedArray.getDimensionPixelSize(1, D6.i(2, context))), Integer.valueOf(typedArray.getDimensionPixelSize(5, D6.i(3, context))));
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }

        public a() {
        }
    }

    public e(int i12, int i13, @l C35763c0 c35763c0, @l C35763c0 c35763c02, int i14, int i15, @k b bVar, @l Integer num, @l Integer num2) {
        this.f180740a = i12;
        this.f180741b = i13;
        this.f180742c = c35763c0;
        this.f180743d = c35763c02;
        this.f180744e = i14;
        this.f180745f = i15;
        this.f180746g = bVar;
        this.f180747h = num;
        this.f180748i = num2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f180740a == eVar.f180740a && this.f180741b == eVar.f180741b && L.f(this.f180742c, eVar.f180742c) && L.f(this.f180743d, eVar.f180743d) && this.f180744e == eVar.f180744e && this.f180745f == eVar.f180745f && L.f(this.f180746g, eVar.f180746g) && L.f(this.f180747h, eVar.f180747h) && L.f(this.f180748i, eVar.f180748i);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f180741b, Integer.hashCode(this.f180740a) * 31, 31);
        C35763c0 c35763c0 = this.f180742c;
        int iHashCode = (iE2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f180743d;
        int iHashCode2 = (this.f180746g.hashCode() + r.e(this.f180745f, r.e(this.f180744e, (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31), 31)) * 31;
        Integer num = this.f180747h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f180748i;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupStyle(verticalPadding=");
        sb2.append(this.f180740a);
        sb2.append(", horizontalPadding=");
        sb2.append(this.f180741b);
        sb2.append(", selectedLineColor=");
        sb2.append(this.f180742c);
        sb2.append(", bottomLineColor=");
        sb2.append(this.f180743d);
        sb2.append(", compensation=");
        sb2.append(this.f180744e);
        sb2.append(", spacing=");
        sb2.append(this.f180745f);
        sb2.append(", tabStyle=");
        sb2.append(this.f180746g);
        sb2.append(", bottomLineSize=");
        sb2.append(this.f180747h);
        sb2.append(", selectedLineSize=");
        return s.j(sb2, this.f180748i, ')');
    }

    /* compiled from: TabGroupStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/e$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final n f180749a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ColorStateList f180750b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final n f180751c;

        /* renamed from: d, reason: collision with root package name */
        public final int f180752d;

        /* renamed from: e, reason: collision with root package name */
        public final int f180753e;

        /* renamed from: f, reason: collision with root package name */
        public final int f180754f;

        /* renamed from: g, reason: collision with root package name */
        public final int f180755g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final g f180756h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f180757i;

        public b(@k n nVar, @k ColorStateList colorStateList, @k n nVar2, int i12, int i13, int i14, int i15, @k g gVar, @l Integer num) {
            this.f180749a = nVar;
            this.f180750b = colorStateList;
            this.f180751c = nVar2;
            this.f180752d = i12;
            this.f180753e = i13;
            this.f180754f = i14;
            this.f180755g = i15;
            this.f180756h = gVar;
            this.f180757i = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f180749a, bVar.f180749a) && L.f(this.f180750b, bVar.f180750b) && L.f(this.f180751c, bVar.f180751c) && this.f180752d == bVar.f180752d && this.f180753e == bVar.f180753e && this.f180754f == bVar.f180754f && this.f180755g == bVar.f180755g && L.f(this.f180756h, bVar.f180756h) && L.f(this.f180757i, bVar.f180757i);
        }

        public final int hashCode() {
            int iHashCode = (this.f180756h.hashCode() + r.e(this.f180755g, r.e(this.f180754f, r.e(this.f180753e, r.e(this.f180752d, (this.f180751c.hashCode() + ((this.f180750b.hashCode() + (this.f180749a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31;
            Integer num = this.f180757i;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabStyle(titleStyle=");
            sb2.append(this.f180749a);
            sb2.append(", titleColor=");
            sb2.append(this.f180750b);
            sb2.append(", counterStyle=");
            sb2.append(this.f180751c);
            sb2.append(", counterStandardColor=");
            sb2.append(this.f180752d);
            sb2.append(", counterProminentColor=");
            sb2.append(this.f180753e);
            sb2.append(", notificationColor=");
            sb2.append(this.f180754f);
            sb2.append(", height=");
            sb2.append(this.f180755g);
            sb2.append(", badgeStyle=");
            sb2.append(this.f180756h);
            sb2.append(", subItemSpacing=");
            return s.j(sb2, this.f180757i, ')');
        }

        public /* synthetic */ b(n nVar, ColorStateList colorStateList, n nVar2, int i12, int i13, int i14, int i15, g gVar, Integer num, int i16, C42822w c42822w) {
            this(nVar, colorStateList, nVar2, i12, i13, i14, i15, gVar, (i16 & 256) != 0 ? null : num);
        }
    }

    public /* synthetic */ e(int i12, int i13, C35763c0 c35763c0, C35763c0 c35763c02, int i14, int i15, b bVar, Integer num, Integer num2, int i16, C42822w c42822w) {
        this(i12, i13, (i16 & 4) != 0 ? null : c35763c0, (i16 & 8) != 0 ? null : c35763c02, i14, i15, bVar, (i16 & 128) != 0 ? null : num, (i16 & 256) != 0 ? null : num2);
    }
}
