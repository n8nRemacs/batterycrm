package com.akita.compose.theme.re23.preview;

import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;

/* compiled from: DatePickerPreviewImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\r²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "show", "isLoading", "highlightWeekend", "enableBackgroundForDisabledDates", "showDisabledDates", "showSpecialDates", "showSkipBottomButton", "isEmptyDatesAvailable", "minDaysEnabled", "", "Lkotlin/ranges/o;", "selectedDates", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C1 {

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65270l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f65270l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f65270l.setValue(Boolean.TRUE);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.date_picker.F> f65271l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.date_picker.C f65272m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<List<kotlin.ranges.o>> f65273n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65274o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<kotlin.ranges.o, Boolean> f65275p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f65276q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65277r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f65278s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.Q<String, com.akita.compose.component.date_picker.F> q12, com.akita.compose.component.date_picker.C c12, InterfaceC22204y1<List<kotlin.ranges.o>> interfaceC22204y1, InterfaceC22204y1<Boolean> interfaceC22204y12, Y41.l<? super kotlin.ranges.o, Boolean> lVar, Y41.l<? super Long, Boolean> lVar2, InterfaceC22204y1<Boolean> interfaceC22204y13, Context context) {
            super(3);
            this.f65271l = q12;
            this.f65272m = c12;
            this.f65273n = interfaceC22204y1;
            this.f65274o = interfaceC22204y12;
            this.f65275p = lVar;
            this.f65276q = lVar2;
            this.f65277r = interfaceC22204y13;
            this.f65278s = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r21, androidx.compose.runtime.A r22, java.lang.Integer r23) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                androidx.compose.foundation.layout.J r1 = (androidx.compose.foundation.layout.J) r1
                r1 = r22
                androidx.compose.runtime.A r1 = (androidx.compose.runtime.A) r1
                r2 = r23
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r2 = r2 & 81
                r3 = 16
                if (r2 != r3) goto L24
                boolean r2 = r1.c()
                if (r2 != 0) goto L1f
                goto L24
            L1f:
                r1.f()
                goto Lb8
            L24:
                androidx.compose.runtime.y1<java.lang.Boolean> r2 = r0.f65274o
                java.lang.Object r3 = r2.getF42167b()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto Lb8
                kotlin.Q<java.lang.String, com.akita.compose.component.date_picker.F> r3 = r0.f65271l
                B r3 = r3.f406620c
                r9 = r3
                com.akita.compose.component.date_picker.F r9 = (com.akita.compose.component.date_picker.F) r9
                androidx.compose.runtime.y1<java.lang.Boolean> r3 = r0.f65277r
                java.lang.Object r3 = r3.getF42167b()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r11 = r3.booleanValue()
                r3 = -141708543(0xfffffffff78db301, float:-5.748004E33)
                r1.C(r3)
                androidx.compose.runtime.y1<java.util.List<kotlin.ranges.o>> r3 = r0.f65273n
                boolean r4 = r1.B(r3)
                java.lang.Object r5 = r1.t()
                androidx.compose.runtime.A$a r6 = androidx.compose.runtime.A.f37866a
                if (r4 != 0) goto L60
                r6.getClass()
                androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
                if (r5 != r4) goto L68
            L60:
                com.akita.compose.theme.re23.preview.D1 r5 = new com.akita.compose.theme.re23.preview.D1
                r5.<init>(r3)
                r1.H(r5)
            L68:
                r3 = r5
                Y41.l r3 = (Y41.l) r3
                r1.h()
                com.akita.compose.theme.re23.preview.E1 r4 = new com.akita.compose.theme.re23.preview.E1
                android.content.Context r5 = r0.f65278s
                r4.<init>(r5)
                r5 = -141713429(0xfffffffff78d9feb, float:-5.7449795E33)
                r1.C(r5)
                boolean r5 = r1.B(r2)
                java.lang.Object r7 = r1.t()
                if (r5 != 0) goto L8c
                r6.getClass()
                androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
                if (r7 != r5) goto L94
            L8c:
                com.akita.compose.theme.re23.preview.F1 r7 = new com.akita.compose.theme.re23.preview.F1
                r7.<init>(r2)
                r1.H(r7)
            L94:
                r5 = r7
                Y41.a r5 = (Y41.a) r5
                r1.h()
                com.akita.compose.theme.re23.preview.G1 r10 = com.akita.compose.theme.re23.preview.G1.f65337l
                int r2 = com.akita.compose.component.date_picker.F.f61126s
                int r2 = r2 << 21
                r6 = 100663296(0x6000000, float:2.4074124E-35)
                r18 = r2 | r6
                com.akita.compose.component.date_picker.C r2 = r0.f65272m
                Y41.l<kotlin.ranges.o, java.lang.Boolean> r7 = r0.f65275p
                Y41.l<java.lang.Long, java.lang.Boolean> r8 = r0.f65276q
                r14 = 1
                r19 = 27664(0x6c10, float:3.8766E-41)
                r6 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r16 = 0
                r17 = r1
                com.akita.compose.component.date_picker.y.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            Lb8:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.theme.re23.preview.C1.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.date_picker.F> f65279l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65280m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65279l = q12;
            this.f65280m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65280m | 1);
            C1.a(this.f65279l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/o;", "date", "", "invoke", "(Lkotlin/ranges/o;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<kotlin.ranges.o, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ZoneId f65281l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65282m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ZoneId zoneId, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65281l = zoneId;
            this.f65282m = interfaceC22204y1;
        }

        @Override // Y41.l
        public final Boolean invoke(kotlin.ranges.o oVar) {
            kotlin.ranges.o oVar2 = oVar;
            long epochMilli = LocalDate.now().atStartOfDay(this.f65281l).toInstant().toEpochMilli();
            boolean z12 = false;
            if (this.f65282m.getF42167b().booleanValue() && oVar2.f406915b < epochMilli) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65283l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65283l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65284l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65284l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65285l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65285l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65286l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65286l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65287l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65287l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/y1;", "", "Lkotlin/ranges/o;", "invoke", "()Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<InterfaceC22204y1<List<? extends kotlin.ranges.o>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f65288l = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22204y1<List<? extends kotlin.ranges.o>> invoke() {
            return C22126m3.g(C42784z0.f406748b);
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65289l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65289l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/y1;", "", "invoke", "()Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<InterfaceC22204y1<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f65290l = new l();

        public l() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22204y1<Boolean> invoke() {
            return C22126m3.g(Boolean.FALSE);
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65291l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65291l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65291l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65292l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65292l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65292l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "utcMillis", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<Long, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ZoneId f65293l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65294m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ZoneId zoneId, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65293l = zoneId;
            this.f65294m = interfaceC22204y1;
        }

        @Override // Y41.l
        public final Boolean invoke(Long l12) {
            return Boolean.valueOf(this.f65294m.getF42167b().booleanValue() && Instant.ofEpochMilli(l12.longValue()).atZone(this.f65293l).getDayOfWeek() == DayOfWeek.THURSDAY);
        }
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class p {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<DatePickerSelectionType.Key> f65295a = kotlin.enums.c.a(DatePickerSelectionType.Key.values());
    }

    /* compiled from: DatePickerPreviewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class q {
        static {
            int[] iArr = new int[DatePickerSelectionType.Key.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DatePickerSelectionType.Key key = DatePickerSelectionType.Key.f61201b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DatePickerSelectionType.Key key2 = DatePickerSelectionType.Key.f61201b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DatePickerSelectionType.Key key3 = DatePickerSelectionType.Key.f61201b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.date_picker.F> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        DatePickerSelectionType aVar;
        InterfaceC22204y1 interfaceC22204y1;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-569870798);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) androidx.compose.runtime.saveable.j.c(new Object[0], null, l.f65290l, bE2, 3080, 6);
            bE2.C(-916902242);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y13 = (InterfaceC22204y1) objT;
            Object objI = com.akita.compose.component.accordion.s.i(-916900226, bE2, false);
            if (objI == obj) {
                objI = C22126m3.g(Boolean.FALSE);
                bE2.H(objI);
            }
            InterfaceC22204y1 interfaceC22204y14 = (InterfaceC22204y1) objI;
            Object objI2 = com.akita.compose.component.accordion.s.i(-916897698, bE2, false);
            if (objI2 == obj) {
                objI2 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI2);
            }
            InterfaceC22204y1 interfaceC22204y15 = (InterfaceC22204y1) objI2;
            Object objI3 = com.akita.compose.component.accordion.s.i(-916895650, bE2, false);
            if (objI3 == obj) {
                objI3 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI3);
            }
            InterfaceC22204y1 interfaceC22204y16 = (InterfaceC22204y1) objI3;
            Object objI4 = com.akita.compose.component.accordion.s.i(-916893634, bE2, false);
            if (objI4 == obj) {
                objI4 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI4);
            }
            InterfaceC22204y1 interfaceC22204y17 = (InterfaceC22204y1) objI4;
            Object objI5 = com.akita.compose.component.accordion.s.i(-916891490, bE2, false);
            if (objI5 == obj) {
                objI5 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI5);
            }
            InterfaceC22204y1 interfaceC22204y18 = (InterfaceC22204y1) objI5;
            Object objI6 = com.akita.compose.component.accordion.s.i(-916889314, bE2, false);
            if (objI6 == obj) {
                objI6 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI6);
            }
            InterfaceC22204y1 interfaceC22204y19 = (InterfaceC22204y1) objI6;
            Object objI7 = com.akita.compose.component.accordion.s.i(-916887362, bE2, false);
            if (objI7 == obj) {
                objI7 = C22126m3.g(Boolean.FALSE);
                bE2.H(objI7);
            }
            InterfaceC22204y1 interfaceC22204y110 = (InterfaceC22204y1) objI7;
            bE2.X(false);
            ZoneId zoneIdOf = ZoneId.of("UTC");
            d dVar = new d(zoneIdOf, interfaceC22204y16);
            o oVar = new o(zoneIdOf, interfaceC22204y17);
            AbstractC27462u0.b bVarC = C27452s0.c("SelectionType", p.f65295a, DatePickerSelectionType.Key.f61202c, bE2, 0);
            DatePickerSelectionType.Key key = (DatePickerSelectionType.Key) C22126m3.b(bVarC.f65855c, bE2).getF42167b();
            InterfaceC22204y1 interfaceC22204y111 = (InterfaceC22204y1) androidx.compose.runtime.saveable.j.c(new Object[]{key}, null, j.f65288l, bE2, 3080, 6);
            List list = (List) interfaceC22204y111.getF42167b();
            int iOrdinal = key.ordinal();
            if (iOrdinal == 0) {
                aVar = DatePickerSelectionType.c.f61211a;
            } else if (iOrdinal == 1) {
                aVar = new DatePickerSelectionType.a(((Boolean) interfaceC22204y110.getF42167b()).booleanValue() ? 4 : null);
            } else if (iOrdinal == 2) {
                aVar = DatePickerSelectionType.d.f61213a;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = DatePickerSelectionType.b.f61209a;
            }
            com.akita.compose.component.date_picker.C cA2 = com.akita.compose.component.date_picker.E.a(list, null, 3, null, aVar, ((Boolean) interfaceC22204y14.getF42167b()).booleanValue(), ((Boolean) interfaceC22204y15.getF42167b()).booleanValue(), ((Boolean) interfaceC22204y13.getF42167b()).booleanValue(), ((Boolean) interfaceC22204y19.getF42167b()).booleanValue(), bE2, 0);
            boolean zBooleanValue = ((Boolean) interfaceC22204y13.getF42167b()).booleanValue();
            bE2.C(-916817714);
            Object objT2 = bE2.t();
            if (objT2 == obj) {
                objT2 = new h(interfaceC22204y13);
                bE2.H(objT2);
            }
            AbstractC27462u0.d dVarH = com.akita.compose.component.accordion.s.h(bE2, false, "IsLoading", zBooleanValue, (Y41.l) objT2);
            boolean zBooleanValue2 = ((Boolean) interfaceC22204y14.getF42167b()).booleanValue();
            bE2.C(-916811403);
            Object objT3 = bE2.t();
            if (objT3 == obj) {
                objT3 = new f(interfaceC22204y14);
                bE2.H(objT3);
            }
            AbstractC27462u0.d dVarH2 = com.akita.compose.component.accordion.s.h(bE2, false, "HighlightWeekend", zBooleanValue2, (Y41.l) objT3);
            boolean zBooleanValue3 = ((Boolean) interfaceC22204y16.getF42167b()).booleanValue();
            bE2.C(-916803946);
            Object objT4 = bE2.t();
            if (objT4 == obj) {
                objT4 = new m(interfaceC22204y16);
                bE2.H(objT4);
            }
            AbstractC27462u0.d dVarH3 = com.akita.compose.component.accordion.s.h(bE2, false, "ShowDisabledDates \n(for example past days)", zBooleanValue3, (Y41.l) objT4);
            boolean zBooleanValue4 = ((Boolean) interfaceC22204y17.getF42167b()).booleanValue();
            bE2.C(-916796555);
            Object objT5 = bE2.t();
            if (objT5 == obj) {
                objT5 = new n(interfaceC22204y17);
                bE2.H(objT5);
            }
            AbstractC27462u0.d dVarH4 = com.akita.compose.component.accordion.s.h(bE2, false, "ShowSpecialDates \n(for example Thursdays)", zBooleanValue4, (Y41.l) objT5);
            boolean zBooleanValue5 = ((Boolean) interfaceC22204y15.getF42167b()).booleanValue();
            bE2.C(-916788475);
            Object objT6 = bE2.t();
            if (objT6 == obj) {
                objT6 = new e(interfaceC22204y15);
                bE2.H(objT6);
            }
            AbstractC27462u0.d dVarH5 = com.akita.compose.component.accordion.s.h(bE2, false, "EnableBackgroundForDisabledDates", zBooleanValue5, (Y41.l) objT6);
            boolean zBooleanValue6 = ((Boolean) interfaceC22204y18.getF42167b()).booleanValue();
            bE2.C(-916780871);
            Object objT7 = bE2.t();
            if (objT7 == obj) {
                interfaceC22204y1 = interfaceC22204y18;
                objT7 = new k(interfaceC22204y1);
                bE2.H(objT7);
            } else {
                interfaceC22204y1 = interfaceC22204y18;
            }
            InterfaceC22204y1 interfaceC22204y112 = interfaceC22204y1;
            AbstractC27462u0.d dVarH6 = com.akita.compose.component.accordion.s.h(bE2, false, "ShowSkipBottomButton", zBooleanValue6, (Y41.l) objT7);
            boolean zBooleanValue7 = ((Boolean) interfaceC22204y19.getF42167b()).booleanValue();
            bE2.C(-916773734);
            Object objT8 = bE2.t();
            if (objT8 == obj) {
                objT8 = new g(interfaceC22204y19);
                bE2.H(objT8);
            }
            AbstractC27462u0.d dVarH7 = com.akita.compose.component.accordion.s.h(bE2, false, "isEmptyDatesAvailable", zBooleanValue7, (Y41.l) objT8);
            boolean zBooleanValue8 = ((Boolean) interfaceC22204y110.getF42167b()).booleanValue();
            bE2.C(-916765645);
            Object objT9 = bE2.t();
            if (objT9 == obj) {
                objT9 = new i(interfaceC22204y110);
                bE2.H(objT9);
            }
            AbstractC27462u0.d dVarH8 = com.akita.compose.component.accordion.s.h(bE2, false, "minDaysEnabled (for example 4 days, works only with DateInterval)", zBooleanValue8, (Y41.l) objT9);
            String str = q12.f406619b;
            bE2.C(-916748309);
            boolean zB2 = bE2.B(interfaceC22204y12);
            Object objT10 = bE2.t();
            if (zB2 || objT10 == obj) {
                objT10 = new a(interfaceC22204y12);
                bE2.H(objT10);
            }
            bE2.X(false);
            AbstractC27462u0[] abstractC27462u0Arr = {dVarH, dVarH3, dVarH4, dVarH2, dVarH5, bVarC, dVarH6, dVarH7, dVarH8, new AbstractC27462u0.a("Show BottomSheet", (Y41.a) objT10)};
            b12 = bE2;
            C27452s0.a(str, null, null, 0.0f, C42756l.l0(abstractC27462u0Arr), androidx.compose.runtime.internal.r.c(-622763492, new b(q12, cA2, interfaceC22204y111, interfaceC22204y12, dVar, oVar, interfaceC22204y112, context), bE2), b12, 196608, 14);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
