package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$finish$1", f = "RatingFormStepActor.kt", i = {}, l = {168, 170}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating_form.step.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34203a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f249541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249542t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<DialogInfo.Action.UpdateStateAction.NewStateValue> f249543u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34203a(j jVar, LinkedHashMap linkedHashMap, List list, Continuation continuation) {
        super(2, continuation);
        this.f249541s = jVar;
        this.f249542t = linkedHashMap;
        this.f249543u = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34203a c34203a = new C34203a(this.f249541s, this.f249542t, this.f249543u, continuation);
        c34203a.f249540r = obj;
        return c34203a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34203a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[RETURN] */
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
            int r1 = r10.f249539q
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.C42729a0.b(r11)
            goto Lac
        L1c:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f249540r
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.rating_form.step.mvi.j r1 = r10.f249541s
            com.avito.android.rating_form.step.f r4 = r1.f249611d
            kotlinx.coroutines.flow.Z1<java.util.Map<com.avito.android.rating_form.FieldIdentifier, java.util.List<com.avito.android.rating_form.step.e>>> r4 = r4.f249480h
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L43
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L43
            goto L96
        L43:
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L67
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L67
            goto L47
        L67:
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L47
            java.lang.Object r6 = r5.next()
            com.avito.android.rating_form.step.e r6 = (com.avito.android.rating_form.step.e) r6
            com.avito.android.rating_form.step.z r6 = r6.f249471e
            boolean r6 = r6 instanceof com.avito.android.rating_form.step.z.c
            if (r6 == 0) goto L6b
            com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction$ShowErrorToast r1 = new com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction$ShowErrorToast
            r4 = 0
            java.io.Serializable[] r4 = new java.io.Serializable[r4]
            r5 = 2131956349(0x7f13127d, float:1.9549251E38)
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.c(r5, r4)
            r5 = 0
            r1.<init>(r4, r5, r3, r5)
            r10.f249539q = r2
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto Lac
            return r0
        L96:
            com.avito.android.rating_form.step.RatingFormStepArguments r11 = r1.f249608a
            int r5 = r11.f249115c
            r10.f249539q = r3
            java.util.LinkedHashMap r7 = r10.f249542t
            java.util.List<com.avito.android.rating_form.step.dialog.DialogInfo$Action$UpdateStateAction$NewStateValue> r8 = r10.f249543u
            com.avito.android.rating_form.interactor.i r4 = r1.f249609b
            com.avito.android.rating_form.StepIdentifier r6 = r11.f249116d
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r6, r7, r8, r9)
            if (r11 != r0) goto Lac
            return r0
        Lac:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.C34203a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
