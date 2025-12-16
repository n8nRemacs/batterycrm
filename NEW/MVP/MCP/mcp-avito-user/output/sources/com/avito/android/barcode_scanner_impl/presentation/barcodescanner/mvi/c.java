package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.InterfaceC25648a;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import com.avito.android.util.V2;
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
@DebugMetadata(c = "com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.BarcodeScannerActor$process$3", f = "BarcodeScannerActor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BarcodeScannerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98968q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25648a f98970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC25648a interfaceC25648a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f98970s = interfaceC25648a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f98970s, continuation);
        cVar.f98969r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BarcodeScannerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98968q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f98969r;
            V2.f318762a.e("Scanner internal failure", ((InterfaceC25648a.k) this.f98970s).f57378a);
            BarcodeScannerInternalAction.ScannerInternalFailure scannerInternalFailure = BarcodeScannerInternalAction.ScannerInternalFailure.f98986b;
            this.f98968q = 1;
            if (interfaceC43172j.emit(scannerInternalFailure, this) == coroutine_suspended) {
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
