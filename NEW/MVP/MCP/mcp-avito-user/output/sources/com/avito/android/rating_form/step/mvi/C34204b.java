package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$handleChangeCheckBox$1", f = "RatingFormStepActor.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating_form.step.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34204b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249544q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f249545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f249546s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249547t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249548u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34204b(FieldIdentifier fieldIdentifier, j jVar, LinkedHashMap linkedHashMap, List list, Continuation continuation) {
        super(2, continuation);
        this.f249545r = list;
        this.f249546s = jVar;
        this.f249547t = linkedHashMap;
        this.f249548u = fieldIdentifier;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        LinkedHashMap linkedHashMap = this.f249547t;
        return new C34204b(this.f249548u, this.f249546s, linkedHashMap, this.f249545r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34204b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249544q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Iterable iterable = (Iterable) this.f249545r;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((CheckableGroupItem.a) obj2).f248295d) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer numY0 = C43066x.y0(((CheckableGroupItem.a) it.next()).f248294c);
                if (numY0 != null) {
                    arrayList2.add(numY0);
                }
            }
            RatingFormField.ValueType.IntArrayValue intArrayValue = new RatingFormField.ValueType.IntArrayValue(arrayList2);
            LinkedHashMap linkedHashMap = this.f249547t;
            FieldIdentifier fieldIdentifier = this.f249548u;
            j jVar = this.f249546s;
            boolean zC2 = j.c(jVar, linkedHashMap, fieldIdentifier);
            RatingFormStepArguments ratingFormStepArguments = jVar.f249608a;
            int i13 = ratingFormStepArguments.f249115c;
            this.f249544q = 1;
            if (jVar.f249609b.c(i13, ratingFormStepArguments.f249116d, fieldIdentifier, intArrayValue, zC2, linkedHashMap, this) == coroutine_suspended) {
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
