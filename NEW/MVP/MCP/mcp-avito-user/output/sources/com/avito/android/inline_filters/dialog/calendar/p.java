package com.avito.android.inline_filters.dialog.calendar;

import androidx.view.C23038g0;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerType;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import com.avito.android.inline_filters.dialog.calendar.o;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/p;", "LKN/b;", "Lcom/avito/android/inline_filters/dialog/calendar/o;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p extends KN.b implements o {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f171281s0 = 0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final KN.f f171282S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final KN.c f171283T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f171284U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.view.h f171285V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final CalendarPickerConstraints f171286W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final HN.a<List<MN.c>> f171287X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerConfig f171288Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerUiConfig f171289Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DateRange> f171290a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f171291b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<PrintableText> f171292c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Integer> f171293d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f171294e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f171295f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f171296g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f171297h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171298i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171299j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171300k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171301l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171302m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171303n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f171304o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f171305p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f171306q0;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f171307r0;

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/p$a;", "", "<init>", "()V", "", "THROTTLE_TIME_MS", "J", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[FiltersCalendarPickerType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FiltersCalendarPickerType filtersCalendarPickerType = FiltersCalendarPickerType.f171050b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = p.f171281s0;
            p pVar = p.this;
            HN.h hVar = pVar.f9436R;
            if (hVar != null) {
                hVar.b();
            }
            C23038g0<FlexDatesState> c23038g0 = pVar.f9429K;
            FlexDatesState value = c23038g0.getValue();
            if (value != null) {
                c23038g0.setValue(pVar.f171283T.b(value));
            }
            Boolean bool = Boolean.FALSE;
            pVar.f171304o0.accept(bool);
            pVar.f171305p0.accept(bool);
            pVar.me();
        }
    }

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            p pVar = p.this;
            pVar.f9433O.postValue(pVar.f171285V.getF171340b());
            pVar.ne();
        }
    }

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "date", "Lkotlin/G0;", "accept", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Date date = (Date) obj;
            int i12 = p.f171281s0;
            p pVar = p.this;
            HN.h hVar = pVar.f9436R;
            if (hVar != null ? hVar.a(date) : false) {
                pVar.f171304o0.accept(Boolean.TRUE);
            }
            pVar.me();
        }
    }

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            p pVar = p.this;
            pVar.f9433O.postValue(pVar.f171285V.getF171340b());
            pVar.oe();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(@Y61.k KN.f r18, @Y61.k KN.c r19, @Y61.k com.avito.android.util.InterfaceC35745a5 r20, @Y61.k com.avito.android.inline_filters.dialog.calendar.view.h r21, @Y61.k com.avito.android.analytics.InterfaceC28373a r22, @Y61.l com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints r23, @Y61.k HN.a<java.util.List<MN.c>> r24, @Y61.k com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig r25, @Y61.k com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig r26) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.calendar.p.<init>(KN.f, KN.c, com.avito.android.util.a5, com.avito.android.inline_filters.dialog.calendar.view.h, com.avito.android.analytics.a, com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints, HN.a, com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig, com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig):void");
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: A6, reason: from getter */
    public final C23038g0 getF171296g0() {
        return this.f171296g0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: E1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF171293d0() {
        return this.f171293d0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.k
    public final o.a K2() {
        HN.h hVar = this.f9436R;
        if (hVar == null) {
            return new o.a(null, null);
        }
        Date f7063g = hVar.getF7063g();
        DateRange f7064h = hVar.getF7064h();
        if (f7064h != null) {
            return new o.a(f7064h.f286636b, f7064h.f286637c);
        }
        return f7063g != null ? new o.a(f7063g, null) : new o.a(null, null);
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: L2, reason: from getter */
    public final C23038g0 getF171295f0() {
        return this.f171295f0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.k
    /* renamed from: b1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171302m0() {
        return this.f171302m0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.k
    /* renamed from: c2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171300k0() {
        return this.f171300k0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.l
    public final Integer de() {
        FlexDatesState value;
        if (this.f171288Y.f171047e == null || (value = this.f9429K.getValue()) == null) {
            return null;
        }
        return Integer.valueOf(value.f171273d);
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: ld, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF171294e0() {
        return this.f171294e0;
    }

    public final void le() {
        this.f171297h0.b(this.f171282S.a(this.f171286W).j0(this.f171284U.e()).v0(new v(this), new w(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: ma, reason: from getter */
    public final C23038g0 getF171292c0() {
        return this.f171292c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void me() {
        /*
            r7 = this;
            com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig r0 = r7.f171288Y
            com.avito.android.inline_filters.calendar.FiltersCalendarPickerType r0 = r0.f171045c
            int r0 = r0.ordinal()
            com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig r1 = r7.f171289Z
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L50
            if (r0 != r4) goto L4a
            boolean r0 = r7.f171307r0
            HN.h r5 = r7.f9436R
            if (r5 == 0) goto L1c
            com.avito.android.str_calendar.common.models.DateRange r5 = r5.getF7064h()
            goto L1d
        L1c:
            r5 = r3
        L1d:
            if (r5 == 0) goto L21
            r5 = r4
            goto L22
        L21:
            r5 = r2
        L22:
            HN.h r6 = r7.f9436R
            if (r6 == 0) goto L2a
            java.util.Date r3 = r6.getF7063g()
        L2a:
            if (r3 != 0) goto L2e
            r3 = r4
            goto L2f
        L2e:
            r3 = r2
        L2f:
            com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode r1 = r1.f171055c
            boolean r6 = r1 instanceof com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode.Normal
            if (r6 == 0) goto L3e
            if (r0 == 0) goto L38
            goto L42
        L38:
            if (r5 != 0) goto L3c
            if (r3 == 0) goto L81
        L3c:
            r2 = r4
            goto L81
        L3e:
            boolean r0 = r1 instanceof com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode.Strict
            if (r0 == 0) goto L44
        L42:
            r2 = r5
            goto L81
        L44:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L4a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L50:
            boolean r0 = r7.f171307r0
            HN.h r5 = r7.f9436R
            if (r5 == 0) goto L5b
            java.util.Date r5 = r5.getF7063g()
            goto L5c
        L5b:
            r5 = r3
        L5c:
            if (r5 == 0) goto L60
            r5 = r4
            goto L61
        L60:
            r5 = r2
        L61:
            HN.h r6 = r7.f9436R
            if (r6 == 0) goto L69
            java.util.Date r3 = r6.getF7063g()
        L69:
            if (r3 != 0) goto L6d
            r3 = r4
            goto L6e
        L6d:
            r3 = r2
        L6e:
            com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode r1 = r1.f171055c
            boolean r6 = r1 instanceof com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode.Normal
            if (r6 == 0) goto L7c
            if (r0 == 0) goto L77
            goto L80
        L77:
            if (r5 != 0) goto L3c
            if (r3 == 0) goto L81
            goto L3c
        L7c:
            boolean r0 = r1 instanceof com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode.Strict
            if (r0 == 0) goto L8b
        L80:
            goto L42
        L81:
            androidx.lifecycle.g0<java.lang.Boolean> r0 = r7.f171296g0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r1)
            return
        L8b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.calendar.p.me():void");
    }

    public final void ne() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.jakewharton.rxrelay3.c cVar = this.f171299j0;
        cVar.getClass();
        this.f171297h0.b(cVar.C0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f171284U.e()).v0(new c(), new d(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.k
    /* renamed from: o6, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171303n0() {
        return this.f171303n0;
    }

    public final void oe() {
        this.f171297h0.b(this.f171298i0.j0(this.f171284U.e()).v0(new e(), new f(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f171297h0.e();
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    @Y61.k
    /* renamed from: r1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171301l0() {
        return this.f171301l0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: t1, reason: from getter */
    public final C23038g0 getF171291b0() {
        return this.f171291b0;
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.o
    /* renamed from: v6, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF171290a0() {
        return this.f171290a0;
    }
}
