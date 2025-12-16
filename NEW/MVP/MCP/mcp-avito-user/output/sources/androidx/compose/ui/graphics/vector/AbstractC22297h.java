package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathNode.kt */
@H0
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Landroidx/compose/ui/graphics/vector/h$a;", "Landroidx/compose/ui/graphics/vector/h$b;", "Landroidx/compose/ui/graphics/vector/h$c;", "Landroidx/compose/ui/graphics/vector/h$d;", "Landroidx/compose/ui/graphics/vector/h$e;", "Landroidx/compose/ui/graphics/vector/h$f;", "Landroidx/compose/ui/graphics/vector/h$g;", "Landroidx/compose/ui/graphics/vector/h$h;", "Landroidx/compose/ui/graphics/vector/h$i;", "Landroidx/compose/ui/graphics/vector/h$j;", "Landroidx/compose/ui/graphics/vector/h$k;", "Landroidx/compose/ui/graphics/vector/h$l;", "Landroidx/compose/ui/graphics/vector/h$m;", "Landroidx/compose/ui/graphics/vector/h$n;", "Landroidx/compose/ui/graphics/vector/h$o;", "Landroidx/compose/ui/graphics/vector/h$p;", "Landroidx/compose/ui/graphics/vector/h$q;", "Landroidx/compose/ui/graphics/vector/h$r;", "Landroidx/compose/ui/graphics/vector/h$s;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22297h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39936a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39937b;

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$a;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$a */
    public static final /* data */ class a extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39938c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39939d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39940e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f39941f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f39942g;

        /* renamed from: h, reason: collision with root package name */
        public final float f39943h;

        /* renamed from: i, reason: collision with root package name */
        public final float f39944i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f12, float f13, float f14, boolean z12, boolean z13, float f15, float f16) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f39938c = f12;
            this.f39939d = f13;
            this.f39940e = f14;
            this.f39941f = z12;
            this.f39942g = z13;
            this.f39943h = f15;
            this.f39944i = f16;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f39938c, aVar.f39938c) == 0 && Float.compare(this.f39939d, aVar.f39939d) == 0 && Float.compare(this.f39940e, aVar.f39940e) == 0 && this.f39941f == aVar.f39941f && this.f39942g == aVar.f39942g && Float.compare(this.f39943h, aVar.f39943h) == 0 && Float.compare(this.f39944i, aVar.f39944i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39944i) + androidx.appcompat.app.r.d(this.f39943h, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f39940e, androidx.appcompat.app.r.d(this.f39939d, Float.hashCode(this.f39938c) * 31, 31), 31), 31, this.f39941f), 31, this.f39942g), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f39938c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f39939d);
            sb2.append(", theta=");
            sb2.append(this.f39940e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f39941f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f39942g);
            sb2.append(", arcStartX=");
            sb2.append(this.f39943h);
            sb2.append(", arcStartY=");
            return androidx.appcompat.app.r.k(')', this.f39944i, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$b;", "Landroidx/compose/ui/graphics/vector/h;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$b */
    public static final class b extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f39945c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z12 = false;
            super(z12, z12, 3, null);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$c;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$c */
    public static final /* data */ class c extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39946c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39947d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39948e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39949f;

        /* renamed from: g, reason: collision with root package name */
        public final float f39950g;

        /* renamed from: h, reason: collision with root package name */
        public final float f39951h;

        public c(float f12, float f13, float f14, float f15, float f16, float f17) {
            super(true, false, 2, null);
            this.f39946c = f12;
            this.f39947d = f13;
            this.f39948e = f14;
            this.f39949f = f15;
            this.f39950g = f16;
            this.f39951h = f17;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f39946c, cVar.f39946c) == 0 && Float.compare(this.f39947d, cVar.f39947d) == 0 && Float.compare(this.f39948e, cVar.f39948e) == 0 && Float.compare(this.f39949f, cVar.f39949f) == 0 && Float.compare(this.f39950g, cVar.f39950g) == 0 && Float.compare(this.f39951h, cVar.f39951h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39951h) + androidx.appcompat.app.r.d(this.f39950g, androidx.appcompat.app.r.d(this.f39949f, androidx.appcompat.app.r.d(this.f39948e, androidx.appcompat.app.r.d(this.f39947d, Float.hashCode(this.f39946c) * 31, 31), 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f39946c);
            sb2.append(", y1=");
            sb2.append(this.f39947d);
            sb2.append(", x2=");
            sb2.append(this.f39948e);
            sb2.append(", y2=");
            sb2.append(this.f39949f);
            sb2.append(", x3=");
            sb2.append(this.f39950g);
            sb2.append(", y3=");
            return androidx.appcompat.app.r.k(')', this.f39951h, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$d;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$d */
    public static final /* data */ class d extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39952c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f12) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39952c = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f39952c, ((d) obj).f39952c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39952c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f39952c, new StringBuilder("HorizontalTo(x="));
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$e;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$e */
    public static final /* data */ class e extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39953c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39954d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39953c = f12;
            this.f39954d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f39953c, eVar.f39953c) == 0 && Float.compare(this.f39954d, eVar.f39954d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39954d) + (Float.hashCode(this.f39953c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f39953c);
            sb2.append(", y=");
            return androidx.appcompat.app.r.k(')', this.f39954d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$f;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$f */
    public static final /* data */ class f extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39955c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39956d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39955c = f12;
            this.f39956d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f39955c, fVar.f39955c) == 0 && Float.compare(this.f39956d, fVar.f39956d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39956d) + (Float.hashCode(this.f39955c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f39955c);
            sb2.append(", y=");
            return androidx.appcompat.app.r.k(')', this.f39956d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$g;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$g */
    public static final /* data */ class g extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39957c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39958d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39959e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39960f;

        public g(float f12, float f13, float f14, float f15) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f39957c = f12;
            this.f39958d = f13;
            this.f39959e = f14;
            this.f39960f = f15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f39957c, gVar.f39957c) == 0 && Float.compare(this.f39958d, gVar.f39958d) == 0 && Float.compare(this.f39959e, gVar.f39959e) == 0 && Float.compare(this.f39960f, gVar.f39960f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39960f) + androidx.appcompat.app.r.d(this.f39959e, androidx.appcompat.app.r.d(this.f39958d, Float.hashCode(this.f39957c) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f39957c);
            sb2.append(", y1=");
            sb2.append(this.f39958d);
            sb2.append(", x2=");
            sb2.append(this.f39959e);
            sb2.append(", y2=");
            return androidx.appcompat.app.r.k(')', this.f39960f, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$h;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$h, reason: collision with other inner class name */
    public static final /* data */ class C1662h extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39961c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39962d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39963e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39964f;

        public C1662h(float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f39961c = f12;
            this.f39962d = f13;
            this.f39963e = f14;
            this.f39964f = f15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1662h)) {
                return false;
            }
            C1662h c1662h = (C1662h) obj;
            return Float.compare(this.f39961c, c1662h.f39961c) == 0 && Float.compare(this.f39962d, c1662h.f39962d) == 0 && Float.compare(this.f39963e, c1662h.f39963e) == 0 && Float.compare(this.f39964f, c1662h.f39964f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39964f) + androidx.appcompat.app.r.d(this.f39963e, androidx.appcompat.app.r.d(this.f39962d, Float.hashCode(this.f39961c) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f39961c);
            sb2.append(", y1=");
            sb2.append(this.f39962d);
            sb2.append(", x2=");
            sb2.append(this.f39963e);
            sb2.append(", y2=");
            return androidx.appcompat.app.r.k(')', this.f39964f, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$i;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$i */
    public static final /* data */ class i extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39965c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39966d;

        public i(float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f39965c = f12;
            this.f39966d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f39965c, iVar.f39965c) == 0 && Float.compare(this.f39966d, iVar.f39966d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39966d) + (Float.hashCode(this.f39965c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f39965c);
            sb2.append(", y=");
            return androidx.appcompat.app.r.k(')', this.f39966d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$j;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$j */
    public static final /* data */ class j extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39967c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39968d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39969e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f39970f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f39971g;

        /* renamed from: h, reason: collision with root package name */
        public final float f39972h;

        /* renamed from: i, reason: collision with root package name */
        public final float f39973i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f12, float f13, float f14, boolean z12, boolean z13, float f15, float f16) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f39967c = f12;
            this.f39968d = f13;
            this.f39969e = f14;
            this.f39970f = z12;
            this.f39971g = z13;
            this.f39972h = f15;
            this.f39973i = f16;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f39967c, jVar.f39967c) == 0 && Float.compare(this.f39968d, jVar.f39968d) == 0 && Float.compare(this.f39969e, jVar.f39969e) == 0 && this.f39970f == jVar.f39970f && this.f39971g == jVar.f39971g && Float.compare(this.f39972h, jVar.f39972h) == 0 && Float.compare(this.f39973i, jVar.f39973i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39973i) + androidx.appcompat.app.r.d(this.f39972h, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f39969e, androidx.appcompat.app.r.d(this.f39968d, Float.hashCode(this.f39967c) * 31, 31), 31), 31, this.f39970f), 31, this.f39971g), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f39967c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f39968d);
            sb2.append(", theta=");
            sb2.append(this.f39969e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f39970f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f39971g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f39972h);
            sb2.append(", arcStartDy=");
            return androidx.appcompat.app.r.k(')', this.f39973i, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$k;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$k */
    public static final /* data */ class k extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39974c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39975d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39976e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39977f;

        /* renamed from: g, reason: collision with root package name */
        public final float f39978g;

        /* renamed from: h, reason: collision with root package name */
        public final float f39979h;

        public k(float f12, float f13, float f14, float f15, float f16, float f17) {
            super(true, false, 2, null);
            this.f39974c = f12;
            this.f39975d = f13;
            this.f39976e = f14;
            this.f39977f = f15;
            this.f39978g = f16;
            this.f39979h = f17;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f39974c, kVar.f39974c) == 0 && Float.compare(this.f39975d, kVar.f39975d) == 0 && Float.compare(this.f39976e, kVar.f39976e) == 0 && Float.compare(this.f39977f, kVar.f39977f) == 0 && Float.compare(this.f39978g, kVar.f39978g) == 0 && Float.compare(this.f39979h, kVar.f39979h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39979h) + androidx.appcompat.app.r.d(this.f39978g, androidx.appcompat.app.r.d(this.f39977f, androidx.appcompat.app.r.d(this.f39976e, androidx.appcompat.app.r.d(this.f39975d, Float.hashCode(this.f39974c) * 31, 31), 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f39974c);
            sb2.append(", dy1=");
            sb2.append(this.f39975d);
            sb2.append(", dx2=");
            sb2.append(this.f39976e);
            sb2.append(", dy2=");
            sb2.append(this.f39977f);
            sb2.append(", dx3=");
            sb2.append(this.f39978g);
            sb2.append(", dy3=");
            return androidx.appcompat.app.r.k(')', this.f39979h, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$l;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$l */
    public static final /* data */ class l extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39980c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f12) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39980c = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f39980c, ((l) obj).f39980c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39980c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f39980c, new StringBuilder("RelativeHorizontalTo(dx="));
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$m;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$m */
    public static final /* data */ class m extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39981c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39982d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39981c = f12;
            this.f39982d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f39981c, mVar.f39981c) == 0 && Float.compare(this.f39982d, mVar.f39982d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39982d) + (Float.hashCode(this.f39981c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f39981c);
            sb2.append(", dy=");
            return androidx.appcompat.app.r.k(')', this.f39982d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$n;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$n */
    public static final /* data */ class n extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39983c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39984d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39983c = f12;
            this.f39984d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f39983c, nVar.f39983c) == 0 && Float.compare(this.f39984d, nVar.f39984d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39984d) + (Float.hashCode(this.f39983c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f39983c);
            sb2.append(", dy=");
            return androidx.appcompat.app.r.k(')', this.f39984d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$o;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$o */
    public static final /* data */ class o extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39985c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39986d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39987e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39988f;

        public o(float f12, float f13, float f14, float f15) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f39985c = f12;
            this.f39986d = f13;
            this.f39987e = f14;
            this.f39988f = f15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f39985c, oVar.f39985c) == 0 && Float.compare(this.f39986d, oVar.f39986d) == 0 && Float.compare(this.f39987e, oVar.f39987e) == 0 && Float.compare(this.f39988f, oVar.f39988f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39988f) + androidx.appcompat.app.r.d(this.f39987e, androidx.appcompat.app.r.d(this.f39986d, Float.hashCode(this.f39985c) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f39985c);
            sb2.append(", dy1=");
            sb2.append(this.f39986d);
            sb2.append(", dx2=");
            sb2.append(this.f39987e);
            sb2.append(", dy2=");
            return androidx.appcompat.app.r.k(')', this.f39988f, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$p;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$p */
    public static final /* data */ class p extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39989c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39990d;

        /* renamed from: e, reason: collision with root package name */
        public final float f39991e;

        /* renamed from: f, reason: collision with root package name */
        public final float f39992f;

        public p(float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f39989c = f12;
            this.f39990d = f13;
            this.f39991e = f14;
            this.f39992f = f15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f39989c, pVar.f39989c) == 0 && Float.compare(this.f39990d, pVar.f39990d) == 0 && Float.compare(this.f39991e, pVar.f39991e) == 0 && Float.compare(this.f39992f, pVar.f39992f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39992f) + androidx.appcompat.app.r.d(this.f39991e, androidx.appcompat.app.r.d(this.f39990d, Float.hashCode(this.f39989c) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f39989c);
            sb2.append(", dy1=");
            sb2.append(this.f39990d);
            sb2.append(", dx2=");
            sb2.append(this.f39991e);
            sb2.append(", dy2=");
            return androidx.appcompat.app.r.k(')', this.f39992f, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$q;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$q */
    public static final /* data */ class q extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39993c;

        /* renamed from: d, reason: collision with root package name */
        public final float f39994d;

        public q(float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f39993c = f12;
            this.f39994d = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f39993c, qVar.f39993c) == 0 && Float.compare(this.f39994d, qVar.f39994d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39994d) + (Float.hashCode(this.f39993c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f39993c);
            sb2.append(", dy=");
            return androidx.appcompat.app.r.k(')', this.f39994d, sb2);
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$r;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$r */
    public static final /* data */ class r extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39995c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f12) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39995c = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f39995c, ((r) obj).f39995c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39995c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f39995c, new StringBuilder("RelativeVerticalTo(dy="));
        }
    }

    /* compiled from: PathNode.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$s;", "Landroidx/compose/ui/graphics/vector/h;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.h$s */
    public static final /* data */ class s extends AbstractC22297h {

        /* renamed from: c, reason: collision with root package name */
        public final float f39996c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f12) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f39996c = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f39996c, ((s) obj).f39996c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f39996c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f39996c, new StringBuilder("VerticalTo(y="));
        }
    }

    public AbstractC22297h(boolean z12, boolean z13, C42822w c42822w) {
        this.f39936a = z12;
        this.f39937b = z13;
    }

    public /* synthetic */ AbstractC22297h(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, null);
    }
}
