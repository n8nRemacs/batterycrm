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
@DebugMetadata(c = "com.avito.android.personal_filters.filters_change_dialog.mvi.PersonalFiltersChangeDialogActor$process$1", f = "PersonalFiltersChangeDialogActor.kt", i = {0, 1}, l = {32, 33, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super g70.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215734q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f215735r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f215736s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40541a f215737t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, InterfaceC40541a interfaceC40541a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f215736s = eVar;
        this.f215737t = interfaceC40541a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f215736s, this.f215737t, continuation);
        aVar.f215735r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super g70.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
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
            int r1 = r9.f215734q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            g70.a r6 = r9.f215737t
            com.avito.android.personal_filters.filters_change_dialog.mvi.e r7 = r9.f215736s
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.C42729a0.b(r10)
            goto L74
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.f215735r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L5b
        L2a:
            java.lang.Object r1 = r9.f215735r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L47
        L32:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f215735r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            g70.b$b r1 = g70.b.C11193b.f396328a
            r9.f215735r = r10
            r9.f215734q = r5
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r10
        L47:
            e70.g r10 = r7.f215746a
            r5 = r6
            g70.a$a r5 = (g70.InterfaceC40541a.C11192a) r5
            boolean r8 = r5.f396323a
            java.util.LinkedHashMap r5 = r5.f396324b
            r9.f215735r = r1
            r9.f215734q = r4
            java.lang.Object r10 = r10.a(r8, r5, r9)
            if (r10 != r0) goto L5b
            return r0
        L5b:
            e70.a r10 = r7.f215747b
            com.avito.android.personal_filters.ButtonType r4 = com.avito.android.personal_filters.ButtonType.f215698d
            r5 = r6
            g70.a$a r5 = (g70.InterfaceC40541a.C11192a) r5
            boolean r5 = r5.f396323a
            r10.a(r4, r5)
            g70.b$c r10 = g70.b.c.f396329a
            r9.f215735r = r2
            r9.f215734q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            com.avito.android.deeplink_handler.handler.composite.a r10 = r7.f215749d
            g70.a$a r6 = (g70.InterfaceC40541a.C11192a) r6
            com.avito.android.deep_linking.links.DeepLink r0 = r6.f396325c
            r1 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r10, r0, r2, r2, r1)
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.personal_filters.filters_change_dialog.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
