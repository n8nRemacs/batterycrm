package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import Sz0.C15273b;
import Tz0.C15433g;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$buildCalendarDatesCache$2", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {0}, l = {96}, m = "invokeSuspend", n = {"filteredOrderItems"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<? extends C15273b>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290705q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f290706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290707s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f290708t;

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$buildCalendarDatesCache$2$datesInfo$1$1", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super List<? extends C15273b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290709q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C15433g f290710r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, C15433g c15433g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f290709q = strOrdersCalendarRedesignItemsCacheHandlerImpl;
            this.f290710r = c15433g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f290709q, this.f290710r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super List<? extends C15273b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C15433g c15433g = this.f290710r;
            return StrOrdersCalendarRedesignItemsCacheHandlerImpl.g(this.f290709q, c15433g.f16054a, c15433g.f16057d, c15433g.f16058e, c15433g.f16056c, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f290707s = strOrdersCalendarRedesignItemsCacheHandlerImpl;
        this.f290708t = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f290707s, this.f290708t, continuation);
        cVar.f290706r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<? extends C15273b>>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290705q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f290706r;
            StrOrdersCalendarRedesignItemsCacheHandlerImpl.Companion companion = StrOrdersCalendarRedesignItemsCacheHandlerImpl.f290670b;
            ArrayList arrayList = this.f290708t;
            StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl = this.f290707s;
            strOrdersCalendarRedesignItemsCacheHandlerImpl.getClass();
            ArrayList arrayListI = StrOrdersCalendarRedesignItemsCacheHandlerImpl.i(arrayList);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                arrayList2.add(C43259k.b(t12, null, new a(strOrdersCalendarRedesignItemsCacheHandlerImpl, (C15433g) it.next(), null), 3));
            }
            this.f290706r = arrayListI;
            this.f290705q = 1;
            obj = C43225h.a(arrayList2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayListI;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.f290706r;
            C42729a0.b(obj);
        }
        List list2 = (List) obj;
        List list3 = list;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C15433g) it2.next()).f16054a);
        }
        return P0.p(C42745f0.T0(arrayList3, list2));
    }
}
