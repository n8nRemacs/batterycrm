package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import com.avito.android.remote.model.category_parameters.AddressParameter;
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
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$onSelectedAddress$1", f = "RatingFormStepActor.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249600q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f249601r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f249603t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, LinkedHashMap linkedHashMap, String str, Continuation continuation) {
        super(2, continuation);
        this.f249601r = jVar;
        this.f249602s = linkedHashMap;
        this.f249603t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f249601r, this.f249602s, this.f249603t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249600q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f249601r;
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
                    if (L.f(((RatingFormField) next).getSlug(), AddressParameter.TYPE)) {
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
            LinkedHashMap linkedHashMap = this.f249602s;
            j.c(jVar, linkedHashMap, fieldIdentifierK);
            int i13 = ratingFormStepArguments.f249115c;
            FieldIdentifier fieldIdentifierK2 = ratingFormField.k();
            RatingFormField.ValueType.StringValue stringValue = new RatingFormField.ValueType.StringValue(this.f249603t);
            this.f249600q = 1;
            if (jVar.f249609b.c(i13, ratingFormStepArguments.f249116d, fieldIdentifierK2, stringValue, true, linkedHashMap, this) == coroutine_suspended) {
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
