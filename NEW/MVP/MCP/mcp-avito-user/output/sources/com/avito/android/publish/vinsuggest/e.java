package com.avito.android.publish.vinsuggest;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VinSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.vinsuggest.VinSuggestInteractor$getVinSuggest$1", f = "VinSuggestInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements q<InterfaceC43172j<? super AbstractC35806h3<? super CategoryParameters>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f245757q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f245758r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Continuation<? super e> continuation) {
        super(3, continuation);
        this.f245758r = cVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AbstractC35806h3<? super CategoryParameters>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(this.f245758r, continuation);
        eVar.f245757q = th2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        V2.f318762a.e("Failed to load parameters by VIN", this.f245757q);
        c.g();
        return G0.f406611a;
    }
}
