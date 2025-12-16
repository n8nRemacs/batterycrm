package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import Sz0.C15273b;
import Sz0.InterfaceC15272a;
import Tz0.C15428b;
import Tz0.C15429c;
import Tz0.C15433g;
import Tz0.i;
import Tz0.j;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$updateReloadedDates$2", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super Map<String, List<? extends C15273b>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290711q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f290712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<C15273b>> f290713s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, ArrayList arrayList, Map map, Continuation continuation) {
        super(2, continuation);
        this.f290711q = strOrdersCalendarRedesignItemsCacheHandlerImpl;
        this.f290712r = arrayList;
        this.f290713s = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f290711q, this.f290712r, this.f290713s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Map<String, List<? extends C15273b>>> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        StrOrdersCalendarRedesignItemsCacheHandlerImpl.Companion companion = StrOrdersCalendarRedesignItemsCacheHandlerImpl.f290670b;
        ArrayList arrayList = this.f290712r;
        this.f290711q.getClass();
        ArrayList arrayListI = StrOrdersCalendarRedesignItemsCacheHandlerImpl.i(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f290713s);
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            C15433g c15433g = (C15433g) it.next();
            String str = c15433g.f16054a;
            List list = (List) linkedHashMap.get(str);
            if (list != null) {
                List<C15428b> list2 = c15433g.f16056c;
                int iF2 = P0.f(C42745f0.q(list2, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
                for (Object obj2 : list2) {
                    linkedHashMap2.put(((C15428b) obj2).f16037a, obj2);
                }
                List<C15273b> list3 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                for (C15273b c15273bA : list3) {
                    C15428b c15428b = (C15428b) linkedHashMap2.get(c15273bA.f15237a);
                    if (c15428b != null) {
                        InterfaceC15272a interfaceC15272aH = StrOrdersCalendarRedesignItemsCacheHandlerImpl.h(c15428b.f16038b, c15433g.f16057d);
                        j jVar = c15428b.f16040d;
                        i iVar = c15428b.f16039c;
                        Integer numBoxInt = Boxing.boxInt(iVar.f16064b);
                        C15429c c15429c = iVar.f16063a;
                        c15273bA = C15273b.a(c15273bA, interfaceC15272aH, jVar.f16065a, jVar.f16066b, numBoxInt, c15429c.f16041a, c15429c.f16042b, c15429c.f16043c, false, 3587);
                    }
                    arrayList2.add(c15273bA);
                }
                linkedHashMap.put(str, arrayList2);
            }
        }
        return linkedHashMap;
    }
}
