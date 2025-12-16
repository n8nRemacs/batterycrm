package com.avito.android.job.cv_info_actualization.mvi;

import Y41.p;
import com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JsxCvInfoActualizationActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTP/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "<anonymous>", "(LTP/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_info_actualization.mvi.JsxCvInfoActualizationActor$process$1", f = "JsxCvInfoActualizationActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<TP.a, Continuation<? super InterfaceC43160i<? extends JsxCvInfoActualizationInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f174110q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f174111r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<TP.d> f174112s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Y41.a<TP.d> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f174111r = eVar;
        this.f174112s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f174111r, this.f174112s, continuation);
        cVar.f174110q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(TP.a aVar, Continuation<? super InterfaceC43160i<? extends JsxCvInfoActualizationInternalAction>> continuation) {
        return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f174111r.b((TP.a) this.f174110q, this.f174112s.invoke());
    }
}
