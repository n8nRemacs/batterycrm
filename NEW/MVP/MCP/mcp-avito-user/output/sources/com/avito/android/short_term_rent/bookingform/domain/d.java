package com.avito.android.short_term_rent.bookingform.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import aw0.C24185a;
import aw0.C24186b;
import aw0.C24187c;
import aw0.C24188d;
import com.avito.android.short_term_rent.bookingform.domain.a;
import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import java.util.Date;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateBookingRequestUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/domain/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.domain.CreateBookingRequestUseCase$invoke$1", f = "CreateBookingRequestUseCase.kt", i = {}, l = {61, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281345q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281346r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C24186b f281347s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f281348t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p<String, String, G0> f281349u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(C24186b c24186b, b bVar, p<? super String, ? super String, G0> pVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f281347s = c24186b;
        this.f281348t = bVar;
        this.f281349u = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f281347s, this.f281348t, this.f281349u, continuation);
        dVar.f281346r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281345q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281346r;
        C24186b c24186b = this.f281347s;
        C24185a c24185a = c24186b.f56782f;
        String str = c24185a != null ? c24185a.f56775a : null;
        Long lBoxLong = c24185a != null ? Boxing.boxLong(c24185a.f56776b) : null;
        C24188d c24188d = c24186b.f56779c;
        int iIntValue = (c24188d == null || (num = c24188d.f56791a) == null) ? 0 : num.intValue();
        b bVar = this.f281348t;
        bVar.getClass();
        String strL = bVar.f281334c.l(new GuestsDetailedValue(c24188d != null ? c24188d.f56795e : null, Integer.valueOf(iIntValue), c24188d != null ? c24188d.f56792b : null, c24188d != null ? c24188d.f56794d : null, c24188d != null ? c24188d.f56793c : null));
        C24187c c24187c = c24186b.f56778b;
        Date date = c24187c != null ? c24187c.f56788a : null;
        String strB = date != null ? com.avito.android.short_term_rent.utils.j.b(date) : null;
        Date date2 = c24187c != null ? c24187c.f56789b : null;
        String strB2 = date2 != null ? com.avito.android.short_term_rent.utils.j.b(date2) : null;
        if (strB == null || strB2 == null) {
            a.InterfaceC8380a.b bVar2 = new a.InterfaceC8380a.b("DateRange missing");
            this.f281345q = 1;
            if (interfaceC43172j.emit(bVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        Boolean bool = c24186b.f56785i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        InputType inputType = InputType.f281325d;
        bVar.f281332a.getClass();
        Map<String, aw0.e> map = c24186b.f56780d;
        aw0.e eVarA = g.a(map, inputType);
        String str2 = eVarA != null ? eVarA.f56797a : null;
        aw0.e eVarA2 = g.a(map, InputType.f281323b);
        String str3 = eVarA2 != null ? eVarA2.f56797a : null;
        aw0.e eVarA3 = g.a(map, InputType.f281324c);
        Il0.g gVar = new Il0.g(str2, str3, eVarA3 != null ? eVarA3.f56797a : null);
        this.f281345q = 2;
        if (b.a(this.f281348t, interfaceC43172j, c24186b.f56777a, strB, strB2, iIntValue, strL, gVar, str, lBoxLong, c24186b.f56781e, c24186b.f56783g, c24186b.f56784h, c24186b.f56786j, c24186b.f56787k, this.f281349u, zBooleanValue, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
