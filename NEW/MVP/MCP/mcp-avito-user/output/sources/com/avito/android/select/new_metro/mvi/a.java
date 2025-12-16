package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectMetroActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroActor$process$10", f = "SelectMetroActor.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SelectMetroInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f266215q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f266216r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f266217s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f266218t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation<? super a> continuation) {
        super(3, continuation);
        this.f266218t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super SelectMetroInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        a aVar = new a(this.f266218t, continuation);
        aVar.f266216r = interfaceC43172j;
        aVar.f266217s = th2;
        return aVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f266215q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f266216r;
            SelectMetroInternalAction.MetroStationsLoadedError metroStationsLoadedError = new SelectMetroInternalAction.MetroStationsLoadedError(this.f266217s);
            this.f266216r = null;
            this.f266215q = 1;
            if (interfaceC43172j.emit(metroStationsLoadedError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        G0 g02 = G0.f406611a;
        e eVar = this.f266218t;
        SelectMetroParams selectMetroParams = eVar.f266228a;
        if (selectMetroParams.f265945g) {
            eVar.f266229b.i(selectMetroParams.f265944f);
        }
        return G0.f406611a;
    }
}
