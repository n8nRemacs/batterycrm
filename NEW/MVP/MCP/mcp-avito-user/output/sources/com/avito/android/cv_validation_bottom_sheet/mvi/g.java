package com.avito.android.cv_validation_bottom_sheet.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CvValidationBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/m;", "<anonymous>", "(Lcom/avito/android/cv_validation_bottom_sheet/mvi/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_validation_bottom_sheet.mvi.CvValidationBottomSheetActor$process$4", f = "CvValidationBottomSheetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements Y41.p<a, Continuation<? super InterfaceC43160i<? extends m>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f131895q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f131896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<s> f131897s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Y41.a<s> aVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f131896r = hVar;
        this.f131897s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f131896r, this.f131897s, continuation);
        gVar.f131895q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(a aVar, Continuation<? super InterfaceC43160i<? extends m>> continuation) {
        return ((g) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        a aVar = (a) this.f131895q;
        this.f131897s.invoke();
        return this.f131896r.c(aVar);
    }
}
