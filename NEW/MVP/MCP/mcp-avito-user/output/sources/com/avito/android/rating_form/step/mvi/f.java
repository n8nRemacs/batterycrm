package com.avito.android.rating_form.step.mvi;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.select.Arguments;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartSelectBottomSheet;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$onSelectClick$1", f = "RatingFormStepActor.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction.StartSelectBottomSheet>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249592q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249593r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating_form.item.select.a f249594s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.rating_form.item.select.a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f249594s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f249594s, continuation);
        fVar.f249593r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction.StartSelectBottomSheet> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C42784z0 c42784z0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249592q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249593r;
            com.avito.android.rating_form.item.select.a aVar = this.f249594s;
            ArrayList<RatingFormField.Value> arrayList = aVar.f248587j;
            String str = aVar.f248580c.f247886c;
            if (str == null) {
                return G0.f406611a;
            }
            List<RatingFormField.Value> list = aVar.f248586i;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (RatingFormField.Value value : list) {
                arrayList2.add(new SelectParameter.Value(value.getValue(), value.getLabel(), null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null));
            }
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
                for (RatingFormField.Value value2 : arrayList) {
                    arrayList3.add(new SelectParameter.Value(value2.getValue(), value2.getLabel(), null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null));
                }
                c42784z0 = arrayList3;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            String str2 = aVar.f248581d;
            if (str2 == null) {
                str2 = "";
            }
            RatingFormStepInternalAction.StartSelectBottomSheet startSelectBottomSheet = new RatingFormStepInternalAction.StartSelectBottomSheet(new Arguments(false, str, null, arrayList2, c42784z0, str2, null, aVar.f248589l, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -134225599, 255, null));
            this.f249592q = 1;
            if (interfaceC43172j.emit(startSelectBottomSheet, this) == coroutine_suspended) {
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
