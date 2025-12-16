package com.avito.android.timestamp_storage.domain;

import Y41.p;
import java.util.LinkedHashMap;
import java.util.Set;
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
import vE0.AbstractC49202b;
import xE0.C49826a;

/* compiled from: TimestampStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorageImpl$save$3", f = "TimestampStorageImpl.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f301513r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC49202b f301514s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set<String> f301515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, AbstractC49202b abstractC49202b, Set<String> set, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f301513r = jVar;
        this.f301514s = abstractC49202b;
        this.f301515t = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f301513r, this.f301514s, this.f301515t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301512q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f301513r;
            long jCurrent = jVar.f301504b.current();
            AbstractC49202b abstractC49202b = this.f301514s;
            String str = abstractC49202b.f440546a;
            String strA = jVar.f301505c.a(abstractC49202b);
            Set<String> set = this.f301515t;
            if (set != null) {
                Set<String> set2 = set;
                int iF2 = P0.f(C42745f0.q(set2, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                linkedHashMap = new LinkedHashMap(iF2);
                for (Object obj2 : set2) {
                    linkedHashMap.put(obj2, Boxing.boxLong(jCurrent));
                }
            } else {
                linkedHashMap = null;
            }
            C49826a c49826a = new C49826a(jCurrent, str, strA, linkedHashMap == null ? P0.c() : linkedHashMap);
            this.f301512q = 1;
            if (jVar.f301503a.d(c49826a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
