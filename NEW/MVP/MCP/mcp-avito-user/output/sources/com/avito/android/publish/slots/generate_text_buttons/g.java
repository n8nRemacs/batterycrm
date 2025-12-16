package com.avito.android.publish.slots.generate_text_buttons;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: GenerateTextButtonsSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.generate_text_buttons.GenerateTextButtonsSlotWrapper$regenerateText$1", f = "GenerateTextButtonsSlotWrapper.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243972q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f243973r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f243973r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f243973r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f243972q
            r2 = 1
            r3 = 0
            com.avito.android.publish.slots.generate_text_buttons.c r4 = r11.f243973r
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r12)
            goto L56
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.C42729a0.b(r12)
            com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem$State r12 = com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem.State.f243986e
            r4.f243955l = r12
            com.avito.android.category_parameters.f$b r12 = new com.avito.android.category_parameters.f$b
            com.avito.android.remote.model.category_parameters.slot.SlotType r1 = com.avito.android.remote.model.category_parameters.slot.SlotType.GENERATE_TEXT_BUTTONS
            r12.<init>(r1, r3)
            com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> r1 = r4.f243952i
            r1.accept(r12)
            java.lang.String r9 = r4.f243954k
            com.avito.android.remote.model.category_parameters.CharParameter r12 = r4.f243950g
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L3b
            java.lang.String r12 = ""
        L3b:
            r8 = r12
            com.avito.android.remote.model.category_parameters.CharParameter r12 = r4.f243951h
            if (r12 == 0) goto L48
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7 = r12
            goto L49
        L48:
            r7 = r3
        L49:
            r11.f243972q = r2
            r6 = 1
            dl0.a r5 = r4.f243946c
            r10 = r11
            java.lang.Object r12 = r5.i(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L56
            return r0
        L56:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L9b
            r1 = r12
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r2 = r1.getResult()
            pl0.a r2 = (pl0.C47109a) r2
            java.lang.String r2 = r2.getGenerateError()
            if (r2 == 0) goto L71
            int r2 = r2.length()
            if (r2 != 0) goto L9b
        L71:
            com.avito.android.remote.model.category_parameters.CharParameter r12 = r4.f243950g
            r12.setError(r3)
            java.lang.Object r12 = r1.getResult()
            pl0.a r12 = (pl0.C47109a) r12
            java.lang.String r12 = r12.getText()
            com.avito.android.remote.model.category_parameters.CharParameter r0 = r4.f243950g
            r0.setValue(r12)
            java.lang.Object r12 = r1.getResult()
            pl0.a r12 = (pl0.C47109a) r12
            java.lang.String r12 = r12.getText()
            if (r12 == 0) goto Ld6
            java.util.LinkedHashSet r0 = r4.f243957n
            boolean r12 = r0.add(r12)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
            goto Ld6
        L9b:
            if (r0 == 0) goto Lc3
            r0 = r12
            com.avito.android.remote.model.TypedResult$Success r0 = (com.avito.android.remote.model.TypedResult.Success) r0
            java.lang.Object r1 = r0.getResult()
            pl0.a r1 = (pl0.C47109a) r1
            java.lang.String r1 = r1.getGenerateError()
            if (r1 == 0) goto Lc3
            int r1 = r1.length()
            if (r1 != 0) goto Lb3
            goto Lc3
        Lb3:
            com.avito.android.remote.model.category_parameters.CharParameter r12 = r4.f243950g
            java.lang.Object r0 = r0.getResult()
            pl0.a r0 = (pl0.C47109a) r0
            java.lang.String r0 = r0.getGenerateError()
            r12.setErrorMessage(r0)
            goto Ld6
        Lc3:
            boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Ld6
            com.avito.android.remote.model.category_parameters.CharParameter r0 = r4.f243950g
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r12 = r12.getError()
            java.lang.String r12 = r12.getF244063c()
            r0.setErrorMessage(r12)
        Ld6:
            com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem$State r12 = com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem.State.f243985d
            r4.f243955l = r12
            com.avito.android.category_parameters.f$b r12 = new com.avito.android.category_parameters.f$b
            com.avito.android.remote.model.category_parameters.slot.SlotType r0 = com.avito.android.remote.model.category_parameters.slot.SlotType.GENERATE_TEXT_BUTTONS
            r12.<init>(r0, r3)
            com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> r0 = r4.f243952i
            r0.accept(r12)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.generate_text_buttons.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
