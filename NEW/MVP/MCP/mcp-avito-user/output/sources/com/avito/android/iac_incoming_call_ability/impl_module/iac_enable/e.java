package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import DL.a;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacOptionsInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/e;", "LNL/d;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class e implements NL.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f168294g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f168295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NL.e f168297c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NL.f f168298d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168299e = C42727D.c(b.f168301l);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168300f = C42727D.c(c.f168302l);

    /* compiled from: IacOptionsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/e$a;", "", "<init>", "()V", "", "DEFAULT_IAC_ENABLE", "Z", "", "TAG", "Ljava/lang/String;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacOptionsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f168301l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
        }
    }

    /* compiled from: IacOptionsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f168302l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm", Locale.US);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k NL.e eVar, @Y61.k NL.f fVar) {
        this.f168295a = aVar;
        this.f168296b = interfaceC35745a5;
        this.f168297c = eVar;
        this.f168298d = fVar;
    }

    @Override // NL.d
    @Y61.k
    public final C42019q a() {
        return g1.a(this.f168295a.c(null).z(this.f168296b.a())).r(new f(this)).k(new g(this)).i(h.f168305b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NL.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.l java.lang.Boolean r5, @Y61.l java.lang.Boolean r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.i
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.i r0 = (com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.i) r0
            int r1 = r0.f168309t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168309t = r1
            goto L18
        L13:
            com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.i r0 = new com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f168307r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f168309t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.e r5 = r0.f168306q
            kotlin.C42729a0.b(r7)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            r0.f168306q = r4
            r0.f168309t = r3
            com.avito.android.iac_incoming_call_ability.impl_module.api.a r7 = r4.f168295a
            java.lang.Object r7 = r7.d(r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L69
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            DL.a r6 = (DL.a) r6
            NL.c r6 = r5.c(r6)
            NL.e r7 = r5.f168297c
            boolean r0 = r6.f11379a
            r7.b(r0)
            org.threeten.bp.g r7 = r6.f11380b
            org.threeten.bp.g r0 = r6.f11381c
            NL.f r5 = r5.f168298d
            r5.d(r7, r0)
            int r5 = kotlin.Z.f406624c
            goto L82
        L69:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L83
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            int r6 = kotlin.Z.f406624c
            kotlin.Z$b r6 = new kotlin.Z$b
            r6.<init>(r5)
        L82:
            return r6
        L83:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.e.b(java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public final NL.c c(DL.a aVar) throws ParseException {
        ArrayList arrayList;
        ?? arrayList2;
        Boolean iacEnabled = aVar.getIacEnabled();
        boolean zBooleanValue = iacEnabled != null ? iacEnabled.booleanValue() : true;
        String availableTimeFrom = aVar.getAvailableTimeFrom();
        InterfaceC42726C interfaceC42726C = this.f168299e;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) interfaceC42726C.getValue();
        InterfaceC42726C interfaceC42726C2 = this.f168300f;
        org.threeten.bp.g gVarA = u.a(availableTimeFrom, simpleDateFormat, (SimpleDateFormat) interfaceC42726C2.getValue());
        org.threeten.bp.g gVarA2 = u.a(aVar.getAvailableTimeTo(), (SimpleDateFormat) interfaceC42726C.getValue(), (SimpleDateFormat) interfaceC42726C2.getValue());
        Boolean iacMandatory = aVar.getIacMandatory();
        a.c workSchedule = aVar.getWorkSchedule();
        if (workSchedule == null) {
            arrayList = C42784z0.f406748b;
        } else {
            List<a.b> listA = workSchedule.a();
            arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (a.b bVar : listA) {
                arrayList.add(new ScheduleOption(bVar.getValue(), bVar.getLabel(), bVar.getDescription(), L.f(bVar.getValue(), workSchedule.getValue())));
            }
        }
        List<a.C0169a> listF = aVar.f();
        if (listF != null) {
            List<a.C0169a> list = listF;
            arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (a.C0169a c0169a : list) {
                arrayList2.add(new NL.b(c0169a.getDeviceName(), c0169a.getDeviceId(), c0169a.getItemsCounter(), c0169a.getDeviceSlug()));
            }
        } else {
            arrayList2 = C42784z0.f406748b;
        }
        Boolean availableTimeDisabled = aVar.getAvailableTimeDisabled();
        return new NL.c(zBooleanValue, gVarA, gVarA2, arrayList2, iacMandatory, arrayList, availableTimeDisabled != null ? availableTimeDisabled.booleanValue() : false);
    }
}
