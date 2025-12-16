package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import Sz0.C15273b;
import Tz0.C15433g;
import Uz0.C15589a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$addDatesFromPaginationLoad$2", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<C15273b>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290694q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f290695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290696s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f290697t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<C15273b>> f290698u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C15589a f290699v;

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$addDatesFromPaginationLoad$2$1$1", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends List<C15273b>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<C15273b> f290700q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f290701r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290702s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C15433g f290703t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C15589a f290704u;

        /* compiled from: Comparisons.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.b$a$a, reason: collision with other inner class name */
        public static final class C8792a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t12, T t13) {
                Date date = ((C15273b) t12).f15246j;
                Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
                Date date2 = ((C15273b) t13).f15246j;
                return kotlin.comparisons.a.b(lValueOf, date2 != null ? Long.valueOf(date2.getTime()) : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C15273b> list, String str, StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, C15433g c15433g, C15589a c15589a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f290700q = list;
            this.f290701r = str;
            this.f290702s = strOrdersCalendarRedesignItemsCacheHandlerImpl;
            this.f290703t = c15433g;
            this.f290704u = c15589a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f290700q, this.f290701r, this.f290702s, this.f290703t, this.f290704u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Q<? extends String, ? extends List<C15273b>>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ArrayList arrayList = new ArrayList(this.f290700q);
            C15433g c15433g = this.f290703t;
            arrayList.addAll(StrOrdersCalendarRedesignItemsCacheHandlerImpl.g(this.f290702s, c15433g.f16054a, c15433g.f16057d, c15433g.f16058e, c15433g.f16056c, this.f290704u));
            if (arrayList.size() > 1) {
                C42745f0.z0(arrayList, new C8792a());
            }
            return new Q(this.f290701r, arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, ArrayList arrayList, Map map, C15589a c15589a, Continuation continuation) {
        super(2, continuation);
        this.f290696s = strOrdersCalendarRedesignItemsCacheHandlerImpl;
        this.f290697t = arrayList;
        this.f290698u = map;
        this.f290699v = c15589a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f290696s, this.f290697t, this.f290698u, this.f290699v, continuation);
        bVar.f290695r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<C15273b>>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objA;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290694q;
        int i13 = 1;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f290695r;
            StrOrdersCalendarRedesignItemsCacheHandlerImpl.Companion companion = StrOrdersCalendarRedesignItemsCacheHandlerImpl.f290670b;
            ArrayList arrayList = this.f290697t;
            this.f290696s.getClass();
            ArrayList arrayListI = StrOrdersCalendarRedesignItemsCacheHandlerImpl.i(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, List<C15273b>> entry : this.f290698u.entrySet()) {
                String key = entry.getKey();
                List<C15273b> value = entry.getValue();
                Iterator it = arrayListI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((C15433g) next).f16054a, key)) {
                        break;
                    }
                }
                C15433g c15433g = (C15433g) next;
                InterfaceC43076a0 interfaceC43076a0B = c15433g != null ? C43259k.b(t12, null, new a(value, key, this.f290696s, c15433g, this.f290699v, null), 3) : null;
                if (interfaceC43076a0B != null) {
                    arrayList2.add(interfaceC43076a0B);
                }
                i13 = 1;
            }
            this.f290694q = i13;
            objA = C43225h.a(arrayList2, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        return P0.p((Iterable) objA);
    }
}
