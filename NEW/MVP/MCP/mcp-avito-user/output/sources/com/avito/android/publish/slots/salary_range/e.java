package com.avito.android.publish.slots.salary_range;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.salary_range.SalaryRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.salary_range.SalaryRangeSlotConfig;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.K;
import l41.o;
import ql0.C47414a;
import yc.C50213a;

/* compiled from: SalaryRangeSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/e;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/salary_range/SalaryRangeSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends k<SalaryRangeSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SalaryRangeSlot f244762b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f244763c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.salary_range.b f244764d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f244765e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SalaryRangeSlotConfig f244766f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AddressParameter f244767g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final CharParameter f244768h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final LegacyRangeIntParameter f244769i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final SelectParameter.Flat f244770j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244771k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244772l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public y f244773m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public C47414a f244774n;

    /* compiled from: SalaryRangeSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lql0/a;", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f244775b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(G0.f406611a);
        }
    }

    /* compiled from: SalaryRangeSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f244776b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(G0.f406611a);
        }
    }

    /* compiled from: SalaryRangeSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lql0/a;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f244778c;

        public c(String str) {
            this.f244778c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            return e.this.l(this.f244778c);
        }
    }

    /* compiled from: SalaryRangeSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lql0/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.this.f244771k.accept(new f.b(SlotType.SALARY_RANGE, null));
        }
    }

    /* compiled from: SalaryRangeSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.salary_range.e$e, reason: collision with other inner class name */
    public static final class C7331e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C7331e<T> f244780b = new C7331e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("SalaryRangeSlotWrapper", "Error while loading market salary: " + ((Throwable) obj));
        }
    }

    @i31.c
    public e(@InterfaceC41220a @Y61.k SalaryRangeSlot salaryRangeSlot, @Y61.k com.avito.android.details.a aVar, @Y61.k C50213a c50213a, @Y61.k com.avito.android.publish.slots.salary_range.b bVar, @Y61.k Q1 q12) {
        this.f244762b = salaryRangeSlot;
        this.f244763c = c50213a;
        this.f244764d = bVar;
        this.f244765e = q12;
        SalaryRangeSlotConfig salaryRangeSlotConfig = (SalaryRangeSlotConfig) salaryRangeSlot.getWidget().getConfig();
        this.f244766f = salaryRangeSlotConfig;
        CategoryParameters categoryParametersC0 = aVar.C0();
        ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(salaryRangeSlotConfig.getAddress()) : null;
        this.f244767g = parameterSlotFindParameter instanceof AddressParameter ? (AddressParameter) parameterSlotFindParameter : null;
        ParameterSlot parameterSlotFindParameter2 = categoryParametersC0 != null ? categoryParametersC0.findParameter(salaryRangeSlotConfig.getVacancyTitle()) : null;
        this.f244768h = parameterSlotFindParameter2 instanceof CharParameter ? (CharParameter) parameterSlotFindParameter2 : null;
        ParameterSlot parameterSlotFindParameter3 = categoryParametersC0 != null ? categoryParametersC0.findParameter(salaryRangeSlotConfig.getRange()) : null;
        this.f244769i = parameterSlotFindParameter3 instanceof LegacyRangeIntParameter ? (LegacyRangeIntParameter) parameterSlotFindParameter3 : null;
        ParameterSlot parameterSlotFindParameter4 = categoryParametersC0 != null ? categoryParametersC0.findParameter(salaryRangeSlotConfig.getPeriod()) : null;
        this.f244770j = parameterSlotFindParameter4 instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlotFindParameter4 : null;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244771k = cVar;
        this.f244772l = cVar;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244772l;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        y yVar = this.f244773m;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getF145164b()
            r1 = 0
            com.avito.android.remote.model.category_parameters.CharParameter r2 = r4.f244768h
            if (r2 == 0) goto Le
            java.lang.String r2 = r2.getId()
            goto Lf
        Le:
            r2 = r1
        Lf:
            boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
            if (r0 == 0) goto L1e
            boolean r0 = r5 instanceof com.avito.android.category_parameters.ParameterElement.p
            if (r0 == 0) goto L1e
            com.avito.android.category_parameters.f$c r5 = r4.m()
            goto L6f
        L1e:
            boolean r0 = r5 instanceof com.avito.android.publish.slots.salary_range.item.c
            if (r0 == 0) goto L6d
            com.avito.android.publish.slots.salary_range.item.c r5 = (com.avito.android.publish.slots.salary_range.item.c) r5
            com.avito.android.publish.slots.salary_range.item.a r0 = r5.f244799f
            java.lang.String r0 = r0.f244786a
            if (r0 == 0) goto L3d
            int r2 = r0.length()
            if (r2 <= 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L3d
            long r2 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L3e
        L3d:
            r0 = r1
        L3e:
            com.avito.android.publish.slots.salary_range.item.a r5 = r5.f244800g
            java.lang.String r5 = r5.f244786a
            if (r5 == 0) goto L56
            int r2 = r5.length()
            if (r2 <= 0) goto L4b
            goto L4c
        L4b:
            r5 = r1
        L4c:
            if (r5 == 0) goto L56
            long r1 = java.lang.Long.parseLong(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L56:
            com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter r5 = r4.f244769i
            if (r5 != 0) goto L5b
            goto L63
        L5b:
            com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter$RangeValue r2 = new com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter$RangeValue
            r2.<init>(r0, r1)
            r5.setValue(r2)
        L63:
            if (r5 == 0) goto L68
            r5.resetErrors()
        L68:
            com.avito.android.category_parameters.f$c r5 = r4.m()
            goto L6f
        L6d:
            com.avito.android.category_parameters.f$c r5 = com.avito.android.category_parameters.f.c.f117644b
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.salary_range.e.d(com.avito.conveyor_item.a):com.avito.android.category_parameters.f");
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244762b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        CharParameter charParameter = this.f244768h;
        String value = charParameter != null ? charParameter.getValue() : null;
        if (value != null && value.length() != 0) {
            return l(value).d0(a.f244775b).m0(b.f244776b);
        }
        this.f244774n = null;
        return z.c0(new P2.b(G0.f406611a));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.salary_range.e.j():java.util.List");
    }

    public final O l(String str) {
        LegacyRangeIntParameter.RangeValue value;
        LegacyRangeIntParameter.RangeValue value2;
        AddressParameter.Value value3;
        AddressParameter.Value value4;
        this.f244774n = null;
        AddressParameter addressParameter = this.f244767g;
        Double dValueOf = (addressParameter == null || (value4 = addressParameter.getValue()) == null) ? null : Double.valueOf(value4.getLat());
        Double dValueOf2 = (addressParameter == null || (value3 = addressParameter.getValue()) == null) ? null : Double.valueOf(value3.getLng());
        LegacyRangeIntParameter legacyRangeIntParameter = this.f244769i;
        Long from = (legacyRangeIntParameter == null || (value2 = legacyRangeIntParameter.getValue()) == null) ? null : value2.getFrom();
        Long to2 = (legacyRangeIntParameter == null || (value = legacyRangeIntParameter.getValue()) == null) ? null : value.getTo();
        SelectParameter.Flat flat = this.f244770j;
        String value5 = flat != null ? flat.getValue() : null;
        String strB = this.f244763c.b();
        com.avito.android.publish.slots.salary_range.b bVar = this.f244764d;
        return K.a(bVar.f244757a.a(), new com.avito.android.publish.slots.salary_range.a(bVar, value5, strB, str, from, to2, dValueOf, dValueOf2, null)).K(new l41.g() { // from class: com.avito.android.publish.slots.salary_range.d
            @Override // l41.g
            public final void accept(Object obj) {
                TypedResult typedResult = (TypedResult) obj;
                e eVar = this.f244761b;
                eVar.getClass();
                if (typedResult instanceof TypedResult.Success) {
                    eVar.f244774n = (C47414a) ((TypedResult.Success) typedResult).getResult();
                }
            }
        });
    }

    public final f.c m() {
        CharParameter charParameter = this.f244768h;
        String value = charParameter != null ? charParameter.getValue() : null;
        if (value != null && value.length() != 0) {
            y yVar = this.f244773m;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            z zVarT = z.F0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).T(new c(value), Integer.MAX_VALUE);
            d dVar = new d();
            l41.g<? super Throwable> gVar = C7331e.f244780b;
            zVarT.getClass();
            this.f244773m = (y) zVarT.v0(dVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
        return f.c.f117644b;
    }
}
