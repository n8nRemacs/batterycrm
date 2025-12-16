package com.avito.android.rating_form.step.dialog.mvi;

import Y41.p;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import gh0.InterfaceC40682a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.dialog.mvi.DialogActor$process$1", f = "DialogActor.kt", i = {0, 2}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 32, 37, 39, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super DialogInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249418q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40682a f249420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f249421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC40682a interfaceC40682a, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f249420s = interfaceC40682a;
        this.f249421t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f249420s, this.f249421t, continuation);
        bVar.f249419r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[RETURN] */
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
            int r1 = r10.f249418q
            gh0.a r2 = r10.f249420s
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L39
            if (r1 == r7) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L23
            if (r1 == r4) goto L2c
            if (r1 != r3) goto L1b
            goto L2c
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.Object r1 = r10.f249419r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto La9
        L2c:
            kotlin.C42729a0.b(r11)
            goto Lc7
        L31:
            java.lang.Object r1 = r10.f249419r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L5a
        L39:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f249419r
            r1 = r11
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            r11 = r2
            gh0.a$h r11 = (gh0.InterfaceC40682a.h) r11
            com.avito.android.deep_linking.links.DeepLink r11 = r11.getF396710b()
            if (r11 == 0) goto L5a
            com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction$OpenDeeplink r9 = new com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction$OpenDeeplink
            r9.<init>(r11)
            r10.f249419r = r1
            r10.f249418q = r7
            java.lang.Object r11 = r1.emit(r9, r10)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            r11 = r2
            gh0.a$h r11 = (gh0.InterfaceC40682a.h) r11
            boolean r7 = r11 instanceof gh0.InterfaceC40682a.g
            com.avito.android.rating_form.step.dialog.mvi.d r9 = r10.f249421t
            if (r7 == 0) goto L72
            gh0.a$g r2 = (gh0.InterfaceC40682a.g) r2
            java.util.ArrayList r11 = r2.f396709a
            r10.f249419r = r8
            r10.f249418q = r6
            java.lang.Object r11 = com.avito.android.rating_form.step.dialog.mvi.d.c(r9, r1, r11, r10)
            if (r11 != r0) goto Lc7
            return r0
        L72:
            boolean r6 = r11 instanceof gh0.InterfaceC40682a.b
            if (r6 == 0) goto Lb6
            gh0.a$b r2 = (gh0.InterfaceC40682a.b) r2
            gh0.a$c r11 = r2.f396702a
            if (r11 == 0) goto La9
            r10.f249419r = r1
            r10.f249418q = r5
            com.avito.android.rating_form.step.RatingFormStepArguments r2 = r9.f249426a
            com.avito.android.rating_form.StepIdentifier r3 = r2.f249116d
            java.lang.String r3 = r3.f247924c
            java.lang.String r5 = r11.f396705b
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 != 0) goto L91
            kotlin.G0 r11 = kotlin.G0.f406611a
            goto La6
        L91:
            com.avito.android.rating_form.interactor.i r3 = r9.f249428c
            java.lang.String r11 = r11.f396704a
            int r5 = r2.f249115c
            com.avito.android.rating_form.StepIdentifier r2 = r2.f249116d
            java.lang.Object r11 = r3.f(r5, r2, r11, r10)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r2) goto La4
            goto La6
        La4:
            kotlin.G0 r11 = kotlin.G0.f406611a
        La6:
            if (r11 != r0) goto La9
            return r0
        La9:
            com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction$CloseDialog r11 = com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction.CloseDialog.f249432b
            r10.f249419r = r8
            r10.f249418q = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc7
            return r0
        Lb6:
            boolean r11 = r11 instanceof gh0.InterfaceC40682a.C11222a
            if (r11 == 0) goto Lc7
            com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction$StartAuthentication r11 = com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction.StartAuthentication.f249442b
            r10.f249419r = r8
            r10.f249418q = r3
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc7
            return r0
        Lc7:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.dialog.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
