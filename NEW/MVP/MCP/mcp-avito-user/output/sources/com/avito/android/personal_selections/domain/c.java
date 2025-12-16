package com.avito.android.personal_selections.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonalSelectionsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ll70/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_selections.domain.PersonalSelectionsInteractorImpl$getPersonalSelectionsItemInfo$2", f = "PersonalSelectionsInteractor.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 38, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super l70.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215786q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f215787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f215788s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f215788s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f215788s, continuation);
        cVar.f215787r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super l70.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f215786q
            r3 = 0
            com.avito.android.personal_selections.domain.d r4 = r0.f215788s
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L36
            if (r2 == r7) goto L2c
            if (r2 == r6) goto L23
            if (r2 != r5) goto L1b
            kotlin.C42729a0.b(r19)
            goto Lb9
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.Object r2 = r0.f215787r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r19)
            goto La6
        L2c:
            java.lang.Object r2 = r0.f215787r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r19)
            r7 = r19
            goto L50
        L36:
            kotlin.C42729a0.b(r19)
            java.lang.Object r2 = r0.f215787r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            h31.e<n70.a> r8 = r4.f215790b
            java.lang.Object r8 = r8.get()
            n70.a r8 = (n70.InterfaceC44207a) r8
            r0.f215787r = r2
            r0.f215786q = r7
            java.lang.Object r7 = r8.a(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto Lb9
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            o70.a r7 = (o70.C44597a) r7
            o70.b r7 = r7.getSnippetContent()
            if (r7 == 0) goto La9
            com.avito.android.analytics.a r8 = r4.f215791c
            j70.b r9 = new j70.b
            com.avito.android.personal_selections.mvi.a r4 = r4.f215792d
            r4.getClass()
            long r10 = r7.getAvailableItemsCount()
            r9.<init>(r10)
            r8.c(r9)
            l70.b$a r4 = new l70.b$a
            java.lang.String r9 = r7.getTitle()
            java.lang.String r10 = r7.getSubtitle()
            java.util.List r11 = r7.b()
            long r13 = r7.getAvailableItemsCount()
            com.avito.android.deep_linking.links.DeepLink r12 = r7.getOpenLink()
            com.avito.android.personal_selections.view.PersonalSelectionsItem r7 = new com.avito.android.personal_selections.view.PersonalSelectionsItem
            r17 = 0
            r15 = 0
            r16 = 32
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r17)
            r4.<init>(r7)
            r0.f215787r = r2
            r0.f215786q = r6
            java.lang.Object r4 = r2.emit(r4, r0)
            if (r4 != r1) goto La6
            return r1
        La6:
            kotlin.G0 r4 = kotlin.G0.f406611a
            goto Laa
        La9:
            r4 = r3
        Laa:
            if (r4 != 0) goto Lb9
            l70.b$b r4 = l70.b.C11776b.f413539a
            r0.f215787r = r3
            r0.f215786q = r5
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lb9
            return r1
        Lb9:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.personal_selections.domain.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
