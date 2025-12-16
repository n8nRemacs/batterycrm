package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$onAcceptButtonClick$1", f = "RecallMeActor.kt", i = {0}, l = {95, 98, 103, 105, 105}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RecallMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252135q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252136r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c.a f252137s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f252138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC13405c.a aVar, a aVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f252137s = aVar;
        this.f252138t = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f252137s, this.f252138t, continuation);
        dVar.f252136r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f252135q
            Di0.c$a r2 = r10.f252137s
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L3d
            if (r1 == r8) goto L35
            if (r1 == r7) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            goto L2c
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.Object r1 = r10.f252136r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto Lb1
        L2c:
            kotlin.C42729a0.b(r11)
            goto Lbe
        L31:
            kotlin.C42729a0.b(r11)
            goto L76
        L35:
            java.lang.Object r1 = r10.f252136r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L5c
        L3d:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f252136r
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            boolean r1 = r2.f3401c
            if (r1 == 0) goto L4b
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L4b:
            com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction$OnLoadingChanged r1 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction$OnLoadingChanged
            r1.<init>(r8)
            r10.f252136r = r11
            r10.f252135q = r8
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L5b
            return r0
        L5b:
            r1 = r11
        L5c:
            java.lang.String r11 = r2.f3406h
            int r8 = r11.length()
            r9 = 10
            if (r8 == r9) goto L79
            com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction$OnPhoneInputErrorChanged r11 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction$OnPhoneInputErrorChanged
            r11.<init>()
            r10.f252136r = r3
            r10.f252135q = r7
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L76
            return r0
        L76:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L79:
            java.lang.Object r7 = r2.f3408j
            boolean r11 = r7.contains(r11)
            com.avito.android.recall_me_v2.presentation.recallme.mvi.a r7 = r10.f252138t
            if (r11 == 0) goto L9c
            java.util.Set<java.lang.Integer> r11 = com.avito.android.recall_me_v2.presentation.recallme.mvi.a.f252119e
            r7.getClass()
            com.avito.android.recall_me_v2.presentation.recallme.mvi.g r11 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.g
            r11.<init>(r2, r7, r3)
            kotlinx.coroutines.flow.i r11 = kotlinx.coroutines.flow.C43175k.G(r11)
            r10.f252136r = r3
            r10.f252135q = r6
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto Lbe
            return r0
        L9c:
            r10.f252136r = r1
            r10.f252135q = r5
            java.util.Set<java.lang.Integer> r11 = com.avito.android.recall_me_v2.presentation.recallme.mvi.a.f252119e
            r7.getClass()
            com.avito.android.recall_me_v2.presentation.recallme.mvi.i r11 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.i
            r11.<init>(r2, r7, r3)
            kotlinx.coroutines.flow.i r11 = kotlinx.coroutines.flow.C43175k.G(r11)
            if (r11 != r0) goto Lb1
            return r0
        Lb1:
            kotlinx.coroutines.flow.i r11 = (kotlinx.coroutines.flow.InterfaceC43160i) r11
            r10.f252136r = r3
            r10.f252135q = r4
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto Lbe
            return r0
        Lbe:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
