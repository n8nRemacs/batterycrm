package com.avito.android.crm_candidates.features.full_filters.logics;

import Rs.InterfaceC15076a;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersInternalAction;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersState;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.full_filters.logics.FiltersActor$process$1", f = "FiltersActor.kt", i = {0, 1, 3, 9}, l = {32, 33, 34, 38, 39, 42, 44, 55, 51, 61, 68, 80}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f129587q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f129588r;

    /* renamed from: s, reason: collision with root package name */
    public int f129589s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f129590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15076a f129591u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f129592v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FiltersState f129593w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC15076a interfaceC15076a, d dVar, FiltersState filtersState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f129591u = interfaceC15076a;
        this.f129592v = dVar;
        this.f129593w = filtersState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f129591u, this.f129592v, this.f129593w, continuation);
        bVar.f129590t = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.full_filters.logics.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
