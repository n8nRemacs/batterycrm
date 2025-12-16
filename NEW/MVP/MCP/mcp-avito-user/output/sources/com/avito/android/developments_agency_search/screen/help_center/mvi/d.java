package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HelpCenterActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LGw/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.help_center.mvi.HelpCenterActor$process$4", f = "HelpCenterActor.kt", i = {0, 1}, l = {55, 58, 59, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super Gw.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138006q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138007r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f138008s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f138008s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f138008s, continuation);
        dVar.f138007r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Gw.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f138006q
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.C42729a0.b(r9)
            goto La6
        L23:
            java.lang.Object r1 = r8.f138007r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L6e
        L2b:
            java.lang.Object r1 = r8.f138007r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L4c
        L33:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f138007r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.developments_agency_search.screen.help_center.mvi.e r1 = r8.f138008s
            Qw.a r1 = r1.f138010b
            r8.f138007r = r9
            r8.f138006q = r6
            java.lang.Object r1 = r1.c(r8)
            if (r1 != r0) goto L49
            return r0
        L49:
            r7 = r1
            r1 = r9
            r9 = r7
        L4c:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r6 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L7b
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            Sw.a r9 = (Sw.C15246a) r9
            Gw.b$d r3 = new Gw.b$d
            java.lang.String r9 = r9.getChatId()
            r3.<init>(r9)
            r8.f138007r = r1
            r8.f138006q = r5
            java.lang.Object r9 = r1.emit(r3, r8)
            if (r9 != r0) goto L6e
            return r0
        L6e:
            Gw.b$b r9 = Gw.b.C0383b.f6785a
            r8.f138007r = r2
            r8.f138006q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto La6
            return r0
        L7b:
            boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto La9
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r4 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.C35936s.a(r4, r9)
            Gw.b$i r9 = new Gw.b$i
            r4 = 0
            java.io.Serializable[] r4 = new java.io.Serializable[r4]
            r5 = 2131953465(0x7f130739, float:1.9543402E38)
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.c(r5, r4)
            r9.<init>(r4)
            r8.f138007r = r2
            r8.f138006q = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto La6
            return r0
        La6:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        La9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.help_center.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
