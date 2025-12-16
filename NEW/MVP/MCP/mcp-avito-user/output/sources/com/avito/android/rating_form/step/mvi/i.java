package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$onSelectedDevelopment$1", f = "RatingFormStepActor.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f249605r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249606s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f249607t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, LinkedHashMap linkedHashMap, long j12, Continuation continuation) {
        super(2, continuation);
        this.f249605r = jVar;
        this.f249606s = linkedHashMap;
        this.f249607t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f249605r, this.f249606s, this.f249607t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249604q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f249605r;
            com.avito.android.rating_form.m mVar = jVar.f249612e;
            RatingFormStepArguments ratingFormStepArguments = jVar.f249608a;
            ArrayList arrayListY = mVar.y(ratingFormStepArguments.f249116d);
            RatingFormField ratingFormField = null;
            if (arrayListY != null) {
                Iterator it = arrayListY.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (L.f(((RatingFormField) next).getSlug(), "developmentSuggest")) {
                        ratingFormField = next;
                        break;
                    }
                }
                ratingFormField = ratingFormField;
            }
            if (ratingFormField == null) {
                return G0.f406611a;
            }
            FieldIdentifier fieldIdentifierK = ratingFormField.k();
            LinkedHashMap linkedHashMap = this.f249606s;
            j.c(jVar, linkedHashMap, fieldIdentifierK);
            int i13 = ratingFormStepArguments.f249115c;
            FieldIdentifier fieldIdentifierK2 = ratingFormField.k();
            RatingFormField.ValueType.LongValue longValue = new RatingFormField.ValueType.LongValue(this.f249607t);
            this.f249604q = 1;
            if (jVar.f249609b.c(i13, ratingFormStepArguments.f249116d, fieldIdentifierK2, longValue, true, linkedHashMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
