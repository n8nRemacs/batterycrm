package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import gh0.C40684c;
import gh0.InterfaceC40682a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DialogActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lgh0/a;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lgh0/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC40682a, DialogInternalAction, C40684c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepArguments f249426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DialogInfo f249427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f249428c;

    @Inject
    public d(@Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k DialogInfo dialogInfo, @Y61.k com.avito.android.rating_form.interactor.i iVar) {
        this.f249426a = ratingFormStepArguments;
        this.f249427b = dialogInfo;
        this.f249428c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.rating_form.step.dialog.mvi.d r7, kotlinx.coroutines.flow.InterfaceC43172j r8, java.util.List r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.avito.android.rating_form.step.dialog.mvi.a
            if (r0 == 0) goto L17
            r0 = r10
            com.avito.android.rating_form.step.dialog.mvi.a r0 = (com.avito.android.rating_form.step.dialog.mvi.a) r0
            int r1 = r0.f249417u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f249417u = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.avito.android.rating_form.step.dialog.mvi.a r0 = new com.avito.android.rating_form.step.dialog.mvi.a
            r0.<init>(r7, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r6.f249415s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f249417u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.C42729a0.b(r10)
            goto L75
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.util.List r7 = r6.f249414r
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            com.avito.android.rating_form.step.dialog.mvi.d r7 = r6.f249413q
            kotlin.C42729a0.b(r10)
        L43:
            r5 = r9
            goto L5a
        L45:
            kotlin.C42729a0.b(r10)
            com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction$ProceedSendAnyway r10 = com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction.ProceedSendAnyway.f249440b
            r6.f249413q = r7
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            r6.f249414r = r1
            r6.f249417u = r3
            java.lang.Object r8 = r8.emit(r10, r6)
            if (r8 != r0) goto L43
            goto L77
        L5a:
            com.avito.android.rating_form.interactor.i r1 = r7.f249428c
            com.avito.android.rating_form.step.RatingFormStepArguments r8 = r7.f249426a
            int r9 = r8.f249115c
            com.avito.android.rating_form.step.dialog.DialogInfo r7 = r7.f249427b
            java.util.Map<com.avito.android.rating_form.FieldIdentifier, com.avito.android.rating_form.step.validations.ValidationInfo> r4 = r7.f249347h
            r7 = 0
            r6.f249413q = r7
            r6.f249414r = r7
            r6.f249417u = r2
            com.avito.android.rating_form.StepIdentifier r3 = r8.f249116d
            r2 = r9
            java.lang.Object r7 = r1.a(r2, r3, r4, r5, r6)
            if (r7 != r0) goto L75
            goto L77
        L75:
            kotlin.G0 r0 = kotlin.G0.f406611a
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.dialog.mvi.d.c(com.avito.android.rating_form.step.dialog.mvi.d, kotlinx.coroutines.flow.j, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DialogInternalAction> b(InterfaceC40682a interfaceC40682a, C40684c c40684c) {
        InterfaceC40682a interfaceC40682a2 = interfaceC40682a;
        if (interfaceC40682a2 instanceof InterfaceC40682a.h) {
            return C43175k.G(new b(interfaceC40682a2, this, null));
        }
        if (interfaceC40682a2 instanceof InterfaceC40682a.e) {
            return new C43210w(new DialogInternalAction.OpenDeeplink(((InterfaceC40682a.e) interfaceC40682a2).f396707a));
        }
        if (interfaceC40682a2 instanceof InterfaceC40682a.f) {
            return new C43210w(new DialogInternalAction.OpenUrl(((InterfaceC40682a.f) interfaceC40682a2).f396708a));
        }
        if (interfaceC40682a2 instanceof InterfaceC40682a.d) {
            return C43175k.G(new c(interfaceC40682a2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
