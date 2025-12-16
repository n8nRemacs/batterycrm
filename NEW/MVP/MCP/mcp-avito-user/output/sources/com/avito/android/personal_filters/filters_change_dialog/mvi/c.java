package com.avito.android.personal_filters.filters_change_dialog.mvi;

import Y41.p;
import g70.InterfaceC40541a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonalFiltersChangeDialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lg70/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_filters.filters_change_dialog.mvi.PersonalFiltersChangeDialogActor$process$3", f = "PersonalFiltersChangeDialogActor.kt", i = {0, 1}, l = {47, 49, 55, 58}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super g70.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215740q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f215741r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40541a f215742s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f215743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, InterfaceC40541a interfaceC40541a, Continuation continuation) {
        super(2, continuation);
        this.f215742s = interfaceC40541a;
        this.f215743t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f215743t, this.f215742s, continuation);
        cVar.f215741r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super g70.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
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
            int r1 = r7.f215740q
            r2 = 4
            r3 = 3
            r4 = 2
            com.avito.android.personal_filters.filters_change_dialog.mvi.e r5 = r7.f215743t
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.C42729a0.b(r8)
            goto L89
        L23:
            java.lang.Object r1 = r7.f215741r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L61
        L2b:
            java.lang.Object r1 = r7.f215741r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L50
        L33:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f215741r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            g70.a r1 = r7.f215742s
            g70.a$b r1 = (g70.InterfaceC40541a.b) r1
            boolean r1 = r1.f396326a
            if (r1 == 0) goto L76
            g70.b$b r1 = g70.b.C11193b.f396328a
            r7.f215741r = r8
            r7.f215740q = r6
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r1 = r8
        L50:
            e70.g r8 = r5.f215746a
            java.util.Map r2 = kotlin.collections.P0.c()
            r7.f215741r = r1
            r7.f215740q = r4
            java.lang.Object r8 = r8.a(r6, r2, r7)
            if (r8 != r0) goto L61
            return r0
        L61:
            e70.a r8 = r5.f215747b
            com.avito.android.personal_filters.ButtonType r2 = com.avito.android.personal_filters.ButtonType.f215697c
            r8.a(r2, r6)
            g70.b$c r8 = g70.b.c.f396329a
            r2 = 0
            r7.f215741r = r2
            r7.f215740q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L89
            return r0
        L76:
            e70.a r1 = r5.f215747b
            com.avito.android.personal_filters.ButtonType r3 = com.avito.android.personal_filters.ButtonType.f215697c
            r4 = 0
            r1.a(r3, r4)
            g70.b$c r1 = g70.b.c.f396329a
            r7.f215740q = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L89
            return r0
        L89:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.personal_filters.filters_change_dialog.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
