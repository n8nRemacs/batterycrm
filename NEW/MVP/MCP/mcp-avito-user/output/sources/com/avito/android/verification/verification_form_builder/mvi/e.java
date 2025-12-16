package com.avito.android.verification.verification_form_builder.mvi;

import TM0.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor$process$1", f = "FormBuilderActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FormBuilderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f325430q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TM0.a f325431r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, TM0.a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f325430q = gVar;
        this.f325431r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f325430q, this.f325431r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FormBuilderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f325430q.f325454b, ((a.b) this.f325431r).f15611a, null, null, 6);
        return G0.f406611a;
    }
}
