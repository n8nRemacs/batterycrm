package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LF00/a;", "privateState", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$scrollToNextError$1", f = "PersonFormActor.kt", i = {}, l = {642}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32662n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, com.avito.android.arch.mvi.utils.l<F00.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201275q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f201276r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f201277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G00.c f201278t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32649a f201279u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32662n(G00.c cVar, C32649a c32649a, Continuation<? super C32662n> continuation) {
        super(3, continuation);
        this.f201278t = cVar;
        this.f201279u = c32649a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<F00.a> lVar, Continuation<? super G0> continuation) {
        C32662n c32662n = new C32662n(this.f201278t, this.f201279u, continuation);
        c32662n.f201276r = interfaceC43172j;
        c32662n.f201277s = lVar;
        return c32662n.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f201275q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r14)
            goto La6
        L10:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L18:
            kotlin.C42729a0.b(r14)
            kotlinx.coroutines.flow.j r14 = r13.f201276r
            com.avito.android.arch.mvi.utils.l r1 = r13.f201277s
            G00.c r3 = r13.f201278t
            G00.e r3 = r3.f6159q
            boolean r4 = r3 instanceof G00.e.a
            if (r4 != 0) goto L2a
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        L2a:
            java.lang.Object r4 = r1.getValue()
            F00.a r4 = (F00.a) r4
            G00.a r4 = r4.f4471b
            r5 = 0
            com.avito.android.mortgage.person_form.mvi.a r6 = r13.f201279u
            if (r4 == 0) goto L4f
            r6.getClass()
            int r7 = r4.f6134a
            if (r7 == 0) goto L40
            r8 = r2
            goto L41
        L40:
            r8 = r5
        L41:
            int r9 = r4.f6135b
            if (r9 >= r7) goto L47
            r10 = r2
            goto L48
        L47:
            r10 = r5
        L48:
            if (r8 == 0) goto L4f
            if (r10 == 0) goto L4f
            int r9 = r9 + r2
            int r9 = r9 % r7
            goto L50
        L4f:
            r9 = r5
        L50:
            G00.e$a r3 = (G00.e.a) r3
            java.util.List<com.avito.android.mortgage.person_form.list.items.PersonFormItem> r7 = r3.f6165b
            r6.getClass()
            int r6 = r7.size()
            r8 = -1
            r10 = r5
            r11 = r8
        L5e:
            if (r10 >= r6) goto L75
            java.lang.Object r12 = r7.get(r10)
            com.avito.android.mortgage.person_form.list.items.PersonFormItem r12 = (com.avito.android.mortgage.person_form.list.items.PersonFormItem) r12
            boolean r12 = r12.getHasError()
            if (r12 == 0) goto L72
            int r11 = r11 + 1
            if (r11 != r9) goto L72
            r8 = r10
            goto L75
        L72:
            int r10 = r10 + 1
            goto L5e
        L75:
            java.lang.Object r6 = r1.getValue()
            F00.a r6 = (F00.a) r6
            r7 = 0
            if (r4 == 0) goto L84
            r10 = 5
            G00.a r4 = G00.a.a(r4, r5, r9, r5, r10)
            goto L85
        L84:
            r4 = r7
        L85:
            F00.a r4 = F00.a.a(r6, r7, r4, r2)
            r1.setValue(r4)
            if (r8 < 0) goto La6
            java.util.List<com.avito.android.mortgage.person_form.list.items.PersonFormItem> r1 = r3.f6165b
            int r1 = r1.size()
            if (r8 >= r1) goto La6
            com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$ScrollTo r1 = new com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$ScrollTo
            r1.<init>(r8)
            r13.f201276r = r7
            r13.f201275q = r2
            java.lang.Object r14 = r14.emit(r1, r13)
            if (r14 != r0) goto La6
            return r0
        La6:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32662n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
