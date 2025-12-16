package com.avito.android.service_orders.mvi.domain;

import Su0.C15230f;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceOrdersListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OpenDeepLink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl$getInitActions$1", f = "ServiceOrdersListInteractor.kt", i = {0, 0}, l = {177}, m = "invokeSuspend", n = {"$this$flow", "action"}, s = {"L$0", "L$3"})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrdersListInternalAction.OpenDeepLink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public g f279477q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f279478r;

    /* renamed from: s, reason: collision with root package name */
    public C15230f f279479s;

    /* renamed from: t, reason: collision with root package name */
    public int f279480t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f279481u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<C15230f> f279482v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f279483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<C15230f> list, g gVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f279482v = list;
        this.f279483w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f279482v, this.f279483w, continuation);
        eVar.f279481u = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction.OpenDeepLink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:19:0x006f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f279480t
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            Su0.f r1 = r7.f279479s
            java.util.Iterator r3 = r7.f279478r
            com.avito.android.service_orders.mvi.domain.g r4 = r7.f279477q
            java.lang.Object r5 = r7.f279481u
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kotlin.C42729a0.b(r8)
            goto L6f
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f279481u
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            java.util.List<Su0.f> r1 = r7.f279482v
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            com.avito.android.service_orders.mvi.domain.g r3 = r7.f279483w
            r5 = r8
            r4 = r3
            r3 = r1
        L35:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r3.next()
            r1 = r8
            Su0.f r1 = (Su0.C15230f) r1
            Ju0.a r8 = r4.f279497f
            java.lang.String r6 = r1.getId()
            boolean r8 = r8.b(r6)
            if (r8 != 0) goto L35
            com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OpenDeepLink r8 = new com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OpenDeepLink
            com.avito.android.deep_linking.links.DeepLink r6 = r1.getUri()
            if (r6 != 0) goto L5b
            com.avito.android.deep_linking.links.NoMatchLink r6 = new com.avito.android.deep_linking.links.NoMatchLink
            r6.<init>()
        L5b:
            r8.<init>(r6)
            r7.f279481u = r5
            r7.f279477q = r4
            r7.f279478r = r3
            r7.f279479s = r1
            r7.f279480t = r2
            java.lang.Object r8 = r5.emit(r8, r7)
            if (r8 != r0) goto L6f
            return r0
        L6f:
            java.lang.Boolean r8 = r1.getSaveShown()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            boolean r8 = kotlin.jvm.internal.L.f(r8, r6)
            if (r8 == 0) goto L35
            Ju0.a r8 = r4.f279497f
            java.lang.String r1 = r1.getId()
            r8.a(r1)
            goto L35
        L87:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_orders.mvi.domain.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
