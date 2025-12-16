package com.avito.android.developments_advice.mvi;

import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mw.InterfaceC44144a;

/* compiled from: DevelopmentsAdviceActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_advice.mvi.DevelopmentsAdviceActor$process$1", f = "DevelopmentsAdviceActor.kt", i = {3, 3}, l = {30, 37, 42, 46, 50, 49}, m = "invokeSuspend", n = {"$this$flow", "phone"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DevelopmentsAdviceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f136125q;

    /* renamed from: r, reason: collision with root package name */
    public int f136126r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136127s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44144a f136128t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f136129u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC44144a interfaceC44144a, f fVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f136128t = interfaceC44144a;
        this.f136129u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f136128t, this.f136129u, continuation);
        aVar.f136127s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DevelopmentsAdviceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_advice.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
