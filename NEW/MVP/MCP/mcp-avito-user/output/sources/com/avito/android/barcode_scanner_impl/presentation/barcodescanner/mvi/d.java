package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.AbstractC25650c;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BarcodeScannerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.BarcodeScannerActor$process$4", f = "BarcodeScannerActor.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BarcodeScannerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98971q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98972r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC25650c f98973s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC25650c abstractC25650c, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f98973s = abstractC25650c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f98973s, continuation);
        dVar.f98972r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BarcodeScannerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98971q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f98972r;
            if (this.f98973s instanceof AbstractC25650c.e) {
                BarcodeScannerInternalAction.UnbindScannerUI unbindScannerUI = BarcodeScannerInternalAction.UnbindScannerUI.f98989b;
                this.f98971q = 1;
                if (interfaceC43172j.emit(unbindScannerUI, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
