package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a;
import java.util.Date;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: LoadBookingsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/usecase/a$a$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/usecase/a$a$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.LoadBookingsUseCase$invoke$2", f = "LoadBookingsUseCase.kt", i = {0, 0, 0}, l = {50}, m = "invokeSuspend", n = {"lastBookingId", "error", "itemIdToBookingsMap"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super a.C8797a.C8798a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f290800q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f290801r;

    /* renamed from: s, reason: collision with root package name */
    public Map f290802s;

    /* renamed from: t, reason: collision with root package name */
    public int f290803t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f290804u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Date f290805v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Date f290806w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Date date, Date date2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f290804u = aVar;
        this.f290805v = date;
        this.f290806w = date2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f290804u, this.f290805v, this.f290806w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.C8797a.C8798a> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.avito.android.util.ApiException, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x007c -> B:12:0x007f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
