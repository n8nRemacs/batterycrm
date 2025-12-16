package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$handleChangeRating$1", f = "RatingFormStepActor.kt", i = {}, l = {403, 412}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249555q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f249557s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f249558t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249559u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249560v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Integer num, j jVar, LinkedHashMap linkedHashMap, FieldIdentifier fieldIdentifier, Continuation continuation) {
        super(2, continuation);
        this.f249557s = num;
        this.f249558t = jVar;
        this.f249559u = linkedHashMap;
        this.f249560v = fieldIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f249557s, this.f249558t, this.f249559u, this.f249560v, continuation);
        dVar.f249556r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249555q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249556r;
            RatingFormField.ValueType.LongValue longValue = this.f249557s != null ? new RatingFormField.ValueType.LongValue(r1.intValue()) : null;
            if (longValue != null) {
                LinkedHashMap linkedHashMap = this.f249559u;
                FieldIdentifier fieldIdentifier = this.f249560v;
                j jVar = this.f249558t;
                boolean zC2 = j.c(jVar, linkedHashMap, fieldIdentifier);
                RatingFormStepArguments ratingFormStepArguments = jVar.f249608a;
                int i13 = ratingFormStepArguments.f249115c;
                this.f249555q = 1;
                if (jVar.f249609b.c(i13, ratingFormStepArguments.f249116d, fieldIdentifier, longValue, zC2, linkedHashMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                RatingFormStepInternalAction.Empty empty = RatingFormStepInternalAction.Empty.f249573b;
                this.f249555q = 2;
                if (interfaceC43172j.emit(empty, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
