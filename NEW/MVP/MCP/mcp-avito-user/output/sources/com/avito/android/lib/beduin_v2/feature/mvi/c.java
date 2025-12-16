package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$3", f = "BeduinActor.kt", i = {0, 1}, l = {59, 67, 69}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinInternalAction.ForReducer>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f176225q;

    /* renamed from: r, reason: collision with root package name */
    public int f176226r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f176227s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f176228t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40047a f176229u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, InterfaceC40047a interfaceC40047a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f176228t = gVar;
        this.f176229u = interfaceC40047a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f176228t, this.f176229u, continuation);
        cVar.f176227s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BeduinInternalAction.ForReducer> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:(1:(1:(3:7|32|33)(2:8|9))(6:10|26|27|(2:29|(1:31))|32|33))(1:11))(2:12|(1:14))|15|34|16|20|(2:22|(1:24)(2:25|26))|27|(0)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r5 = kotlin.Z.f406624c;
        r4 = new kotlin.Z.b(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f176226r
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.C42729a0.b(r10)
            goto La7
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f176225q
            java.lang.Object r3 = r9.f176227s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r10)
            goto L8c
        L28:
            java.lang.Object r1 = r9.f176227s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            r10 = r1
            goto L45
        L31:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f176227s
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$StartParsing r1 = com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction.StartParsing.f176266b
            r9.f176227s = r10
            r9.f176226r = r4
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L45
            return r0
        L45:
            com.avito.android.lib.beduin_v2.feature.mvi.g r1 = r9.f176228t
            com.avito.android.lib.beduin_v2.feature.tracker.c r4 = r1.f176290f
            eT.a r5 = r9.f176229u
            r6 = r5
            eT.a$e r6 = (kotlin.InterfaceC40047a.e) r6
            ZS.b r7 = r6.f395209b
            r4.a(r7)
            int r4 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L60
            com.avito.beduin.v2.avito.parser.b r4 = r1.f176285a     // Catch: java.lang.Throwable -> L60
            eT.a$e r5 = (kotlin.InterfaceC40047a.e) r5     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r5.f395208a     // Catch: java.lang.Throwable -> L60
            com.avito.beduin.v2.avito.parser.a r4 = r4.h(r5)     // Catch: java.lang.Throwable -> L60
            goto L69
        L60:
            r4 = move-exception
            int r5 = kotlin.Z.f406624c
            kotlin.Z$b r5 = new kotlin.Z$b
            r5.<init>(r4)
            r4 = r5
        L69:
            boolean r5 = r4 instanceof kotlin.Z.b
            if (r5 != 0) goto L8e
            r5 = r4
            com.avito.beduin.v2.avito.parser.a r5 = (com.avito.beduin.v2.avito.parser.a) r5
            ZS.b r6 = r6.f395209b
            java.lang.String r6 = r6.f20171d
            java.lang.String r7 = r5.f335461a
            gT.a r8 = r1.f176291g
            r8.f396481a = r6
            r8.f396482b = r7
            r9.f176227s = r10
            r9.f176225q = r4
            r9.f176226r = r3
            java.lang.Object r1 = com.avito.android.lib.beduin_v2.feature.mvi.g.c(r1, r5, r9)
            if (r1 != r0) goto L8a
            return r0
        L8a:
            r3 = r10
            r1 = r4
        L8c:
            r4 = r1
            r10 = r3
        L8e:
            java.lang.Throwable r1 = kotlin.Z.b(r4)
            if (r1 == 0) goto La7
            com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowError r3 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowError
            r3.<init>(r1)
            r9.f176227s = r4
            r1 = 0
            r9.f176225q = r1
            r9.f176226r = r2
            java.lang.Object r10 = r10.emit(r3, r9)
            if (r10 != r0) goto La7
            return r0
        La7:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
