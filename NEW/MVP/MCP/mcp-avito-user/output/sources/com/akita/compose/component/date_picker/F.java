package com.akita.compose.component.date_picker;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.l;
import com.akita.compose.component.bottom_sheet.O;
import com.akita.compose.component.date_picker.data.DayRangeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002#$B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/akita/compose/component/date_picker/F;", "", "Lcom/akita/compose/component/date_picker/F$a;", "dayStyle", "Lcom/akita/compose/component/date_picker/F$b;", "skeletonSizesData", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Lcom/akita/compose/foundation/r;", "monthTextStyle", "weekDayTextStyle", "Landroidx/compose/ui/unit/h;", "horizontalPadding", "monthTitleBottomPadding", "daysRowPaddingBottom", "monthVerticalPadding", "Lcom/akita/compose/component/skeleton/d;", "skeletonStyleData", "Lcom/akita/compose/component/bottom_sheet/O;", "bottomSheetStyle", "Lcom/akita/compose/component/navbar/u;", "navBarStyle", "Landroidx/compose/foundation/layout/T1;", "navBarPaddings", "", "closeButtonIcon", "Lcom/akita/compose/component/floating_container/c;", "floatingContainerStyle", "Lcom/akita/compose/component/button/t;", "buttonPrimaryStyle", "buttonSecondaryStyle", "Lcom/akita/compose/component/toast_bar/J;", "toastBarStyle", "<init>", "(Lcom/akita/compose/component/date_picker/F$a;Lcom/akita/compose/component/date_picker/F$b;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;FFFFLcom/akita/compose/component/skeleton/d;Lcom/akita/compose/component/bottom_sheet/O;Lcom/akita/compose/component/navbar/u;Landroidx/compose/foundation/layout/T1;ILcom/akita/compose/component/floating_container/c;Lcom/akita/compose/component/button/t;Lcom/akita/compose/component/button/t;Lcom/akita/compose/component/toast_bar/J;Lkotlin/jvm/internal/w;)V", "a", "b", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class F {

    /* renamed from: s, reason: collision with root package name */
    public static final int f61126s;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f61127a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f61128b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f61129c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f61130d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f61131e;

    /* renamed from: f, reason: collision with root package name */
    public final float f61132f;

    /* renamed from: g, reason: collision with root package name */
    public final float f61133g;

    /* renamed from: h, reason: collision with root package name */
    public final float f61134h;

    /* renamed from: i, reason: collision with root package name */
    public final float f61135i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.skeleton.d f61136j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final O f61137k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.navbar.u f61138l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final T1 f61139m;

    /* renamed from: n, reason: collision with root package name */
    public final int f61140n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.floating_container.c f61141o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.button.t f61142p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.button.t f61143q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.toast_bar.J f61144r;

    /* compiled from: DatePickerStyle.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/akita/compose/component/date_picker/F$a;", "", "Lcom/akita/compose/foundation/r;", "dayTextStyle", "Landroidx/compose/ui/unit/h;", "dayCornerRadius", "Lcom/akita/compose/foundation/p;", "todayBorderColor", "todayBorderWidth", "specialDisabledDotColor", "specialDotRadius", "specialDotColor", "defaultDayTextColor", "selectedDayTextColor", "disabledDayTextColor", "weekendDayTextColor", "defaultDayBackgroundColor", "selectedDayBackgroundColor", "pressedDayBackgroundColor", "disabledDayBackgroundColor", "Landroidx/compose/ui/unit/l;", "cellSize", "<init>", "(Lcom/akita/compose/foundation/r;FLcom/akita/compose/foundation/p;FLcom/akita/compose/foundation/p;FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;JLkotlin/jvm/internal/w;)V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.r f61145a;

        /* renamed from: b, reason: collision with root package name */
        public final float f61146b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61147c;

        /* renamed from: d, reason: collision with root package name */
        public final float f61148d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61149e;

        /* renamed from: f, reason: collision with root package name */
        public final float f61150f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61151g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61152h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61153i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61154j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61155k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61156l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61157m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61158n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.foundation.p f61159o;

        /* renamed from: p, reason: collision with root package name */
        public final long f61160p;

        public a(com.akita.compose.foundation.r rVar, float f12, com.akita.compose.foundation.p pVar, float f13, com.akita.compose.foundation.p pVar2, float f14, com.akita.compose.foundation.p pVar3, com.akita.compose.foundation.p pVar4, com.akita.compose.foundation.p pVar5, com.akita.compose.foundation.p pVar6, com.akita.compose.foundation.p pVar7, com.akita.compose.foundation.p pVar8, com.akita.compose.foundation.p pVar9, com.akita.compose.foundation.p pVar10, com.akita.compose.foundation.p pVar11, long j12, C42822w c42822w) {
            this.f61145a = rVar;
            this.f61146b = f12;
            this.f61147c = pVar;
            this.f61148d = f13;
            this.f61149e = pVar2;
            this.f61150f = f14;
            this.f61151g = pVar3;
            this.f61152h = pVar4;
            this.f61153i = pVar5;
            this.f61154j = pVar6;
            this.f61155k = pVar7;
            this.f61156l = pVar8;
            this.f61157m = pVar9;
            this.f61158n = pVar10;
            this.f61159o = pVar11;
            this.f61160p = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f61145a, aVar.f61145a) && androidx.compose.ui.unit.h.b(this.f61146b, aVar.f61146b) && kotlin.jvm.internal.L.f(this.f61147c, aVar.f61147c) && androidx.compose.ui.unit.h.b(this.f61148d, aVar.f61148d) && kotlin.jvm.internal.L.f(this.f61149e, aVar.f61149e) && androidx.compose.ui.unit.h.b(this.f61150f, aVar.f61150f) && kotlin.jvm.internal.L.f(this.f61151g, aVar.f61151g) && kotlin.jvm.internal.L.f(this.f61152h, aVar.f61152h) && kotlin.jvm.internal.L.f(this.f61153i, aVar.f61153i) && kotlin.jvm.internal.L.f(this.f61154j, aVar.f61154j) && kotlin.jvm.internal.L.f(this.f61155k, aVar.f61155k) && kotlin.jvm.internal.L.f(this.f61156l, aVar.f61156l) && kotlin.jvm.internal.L.f(this.f61157m, aVar.f61157m) && kotlin.jvm.internal.L.f(this.f61158n, aVar.f61158n) && kotlin.jvm.internal.L.f(this.f61159o, aVar.f61159o) && androidx.compose.ui.unit.l.b(this.f61160p, aVar.f61160p);
        }

        public final int hashCode() {
            int iHashCode = this.f61145a.hashCode() * 31;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            int iB2 = com.akita.compose.component.accordion.s.b(this.f61159o, com.akita.compose.component.accordion.s.b(this.f61158n, com.akita.compose.component.accordion.s.b(this.f61157m, com.akita.compose.component.accordion.s.b(this.f61156l, com.akita.compose.component.accordion.s.b(this.f61155k, com.akita.compose.component.accordion.s.b(this.f61154j, com.akita.compose.component.accordion.s.b(this.f61153i, com.akita.compose.component.accordion.s.b(this.f61152h, com.akita.compose.component.accordion.s.b(this.f61151g, androidx.appcompat.app.r.d(this.f61150f, com.akita.compose.component.accordion.s.b(this.f61149e, androidx.appcompat.app.r.d(this.f61148d, com.akita.compose.component.accordion.s.b(this.f61147c, androidx.appcompat.app.r.d(this.f61146b, iHashCode, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            l.a aVar2 = androidx.compose.ui.unit.l.f42859b;
            return Long.hashCode(this.f61160p) + iB2;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayStyle(dayTextStyle=");
            sb2.append(this.f61145a);
            sb2.append(", dayCornerRadius=");
            androidx.compose.foundation.H.u(this.f61146b, ", todayBorderColor=", sb2);
            sb2.append(this.f61147c);
            sb2.append(", todayBorderWidth=");
            androidx.compose.foundation.H.u(this.f61148d, ", specialDisabledDotColor=", sb2);
            sb2.append(this.f61149e);
            sb2.append(", specialDotRadius=");
            androidx.compose.foundation.H.u(this.f61150f, ", specialDotColor=", sb2);
            sb2.append(this.f61151g);
            sb2.append(", defaultDayTextColor=");
            sb2.append(this.f61152h);
            sb2.append(", selectedDayTextColor=");
            sb2.append(this.f61153i);
            sb2.append(", disabledDayTextColor=");
            sb2.append(this.f61154j);
            sb2.append(", weekendDayTextColor=");
            sb2.append(this.f61155k);
            sb2.append(", defaultDayBackgroundColor=");
            sb2.append(this.f61156l);
            sb2.append(", selectedDayBackgroundColor=");
            sb2.append(this.f61157m);
            sb2.append(", pressedDayBackgroundColor=");
            sb2.append(this.f61158n);
            sb2.append(", disabledDayBackgroundColor=");
            sb2.append(this.f61159o);
            sb2.append(", cellSize=");
            sb2.append((Object) androidx.compose.ui.unit.l.e(this.f61160p));
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: DatePickerStyle.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/akita/compose/component/date_picker/F$b;", "", "Landroidx/compose/ui/unit/h;", "monthRadius", "dayRadius", "Landroidx/compose/ui/unit/l;", "monthSize", "daySize", "<init>", "(FFJJLkotlin/jvm/internal/w;)V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f61161a;

        /* renamed from: b, reason: collision with root package name */
        public final float f61162b;

        /* renamed from: c, reason: collision with root package name */
        public final long f61163c;

        /* renamed from: d, reason: collision with root package name */
        public final long f61164d;

        public b(float f12, float f13, long j12, long j13, C42822w c42822w) {
            this.f61161a = f12;
            this.f61162b = f13;
            this.f61163c = j12;
            this.f61164d = j13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return androidx.compose.ui.unit.h.b(this.f61161a, bVar.f61161a) && androidx.compose.ui.unit.h.b(this.f61162b, bVar.f61162b) && androidx.compose.ui.unit.l.b(this.f61163c, bVar.f61163c) && androidx.compose.ui.unit.l.b(this.f61164d, bVar.f61164d);
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            int iD2 = androidx.appcompat.app.r.d(this.f61162b, Float.hashCode(this.f61161a) * 31, 31);
            l.a aVar2 = androidx.compose.ui.unit.l.f42859b;
            return Long.hashCode(this.f61164d) + androidx.appcompat.app.r.g(iD2, 31, this.f61163c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SkeletonSizesData(monthRadius=");
            androidx.compose.foundation.H.u(this.f61161a, ", dayRadius=", sb2);
            androidx.compose.foundation.H.u(this.f61162b, ", monthSize=", sb2);
            sb2.append((Object) androidx.compose.ui.unit.l.e(this.f61163c));
            sb2.append(", daySize=");
            sb2.append((Object) androidx.compose.ui.unit.l.e(this.f61164d));
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: DatePickerStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[DayRangeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DayRangeType dayRangeType = DayRangeType.f61215b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DayRangeType dayRangeType2 = DayRangeType.f61215b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DayRangeType dayRangeType3 = DayRangeType.f61215b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        int i12 = com.akita.compose.component.floating_container.c.f61576e;
        f61126s = 8;
    }

    public F(a aVar, b bVar, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.r rVar, com.akita.compose.foundation.r rVar2, float f12, float f13, float f14, float f15, com.akita.compose.component.skeleton.d dVar, O o12, com.akita.compose.component.navbar.u uVar, T1 t12, int i12, com.akita.compose.component.floating_container.c cVar, com.akita.compose.component.button.t tVar, com.akita.compose.component.button.t tVar2, com.akita.compose.component.toast_bar.J j12, C42822w c42822w) {
        this.f61127a = aVar;
        this.f61128b = bVar;
        this.f61129c = pVar;
        this.f61130d = rVar;
        this.f61131e = rVar2;
        this.f61132f = f12;
        this.f61133g = f13;
        this.f61134h = f14;
        this.f61135i = f15;
        this.f61136j = dVar;
        this.f61137k = o12;
        this.f61138l = uVar;
        this.f61139m = t12;
        this.f61140n = i12;
        this.f61141o = cVar;
        this.f61142p = tVar;
        this.f61143q = tVar2;
        this.f61144r = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return kotlin.jvm.internal.L.f(this.f61127a, f12.f61127a) && kotlin.jvm.internal.L.f(this.f61128b, f12.f61128b) && kotlin.jvm.internal.L.f(this.f61129c, f12.f61129c) && kotlin.jvm.internal.L.f(this.f61130d, f12.f61130d) && kotlin.jvm.internal.L.f(this.f61131e, f12.f61131e) && androidx.compose.ui.unit.h.b(this.f61132f, f12.f61132f) && androidx.compose.ui.unit.h.b(this.f61133g, f12.f61133g) && androidx.compose.ui.unit.h.b(this.f61134h, f12.f61134h) && androidx.compose.ui.unit.h.b(this.f61135i, f12.f61135i) && kotlin.jvm.internal.L.f(this.f61136j, f12.f61136j) && kotlin.jvm.internal.L.f(this.f61137k, f12.f61137k) && kotlin.jvm.internal.L.f(this.f61138l, f12.f61138l) && kotlin.jvm.internal.L.f(this.f61139m, f12.f61139m) && this.f61140n == f12.f61140n && kotlin.jvm.internal.L.f(this.f61141o, f12.f61141o) && kotlin.jvm.internal.L.f(this.f61142p, f12.f61142p) && kotlin.jvm.internal.L.f(this.f61143q, f12.f61143q) && kotlin.jvm.internal.L.f(this.f61144r, f12.f61144r);
    }

    public final int hashCode() {
        int iA2 = com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.b(this.f61129c, (this.f61128b.hashCode() + (this.f61127a.hashCode() * 31)) * 31, 31), 31, this.f61130d), 31, this.f61131e);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f61144r.hashCode() + ((this.f61143q.hashCode() + ((this.f61142p.hashCode() + ((this.f61141o.hashCode() + androidx.appcompat.app.r.e(this.f61140n, (this.f61139m.hashCode() + ((this.f61138l.hashCode() + ((this.f61137k.hashCode() + ((this.f61136j.hashCode() + androidx.appcompat.app.r.d(this.f61135i, androidx.appcompat.app.r.d(this.f61134h, androidx.appcompat.app.r.d(this.f61133g, androidx.appcompat.app.r.d(this.f61132f, iA2, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatePickerStyle(dayStyle=");
        sb2.append(this.f61127a);
        sb2.append(", skeletonSizesData=");
        sb2.append(this.f61128b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f61129c);
        sb2.append(", monthTextStyle=");
        sb2.append(this.f61130d);
        sb2.append(", weekDayTextStyle=");
        sb2.append(this.f61131e);
        sb2.append(", horizontalPadding=");
        androidx.compose.foundation.H.u(this.f61132f, ", monthTitleBottomPadding=", sb2);
        androidx.compose.foundation.H.u(this.f61133g, ", daysRowPaddingBottom=", sb2);
        androidx.compose.foundation.H.u(this.f61134h, ", monthVerticalPadding=", sb2);
        androidx.compose.foundation.H.u(this.f61135i, ", skeletonStyleData=", sb2);
        sb2.append(this.f61136j);
        sb2.append(", bottomSheetStyle=");
        sb2.append(this.f61137k);
        sb2.append(", navBarStyle=");
        sb2.append(this.f61138l);
        sb2.append(", navBarPaddings=");
        sb2.append(this.f61139m);
        sb2.append(", closeButtonIcon=");
        sb2.append(this.f61140n);
        sb2.append(", floatingContainerStyle=");
        sb2.append(this.f61141o);
        sb2.append(", buttonPrimaryStyle=");
        sb2.append(this.f61142p);
        sb2.append(", buttonSecondaryStyle=");
        sb2.append(this.f61143q);
        sb2.append(", toastBarStyle=");
        sb2.append(this.f61144r);
        sb2.append(')');
        return sb2.toString();
    }
}
