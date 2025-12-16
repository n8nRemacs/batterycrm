package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.InterfaceC25648a;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BarcodeScannerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.BarcodeScannerActor$process$2", f = "BarcodeScannerActor.kt", i = {0, 1, 3, 3, 4, 4}, l = {62, 68, 69, 71, 72, 73}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "resultValue", "$this$flow", "resultValue"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BarcodeScannerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f98963q;

    /* renamed from: r, reason: collision with root package name */
    public int f98964r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f98965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f98966t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25648a f98967u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, InterfaceC25648a interfaceC25648a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f98966t = fVar;
        this.f98967u = interfaceC25648a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f98966t, this.f98967u, continuation);
        bVar.f98965s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BarcodeScannerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f98964r
            r2 = 0
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L35;
                case 2: goto L2d;
                case 3: goto L28;
                case 4: goto L1d;
                case 5: goto L12;
                case 6: goto L28;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L12:
            java.lang.String r1 = r6.f98963q
            java.lang.Object r3 = r6.f98965s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r7)
            goto Lb5
        L1d:
            java.lang.String r1 = r6.f98963q
            java.lang.Object r3 = r6.f98965s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r7)
            goto La5
        L28:
            kotlin.C42729a0.b(r7)
            goto Lc8
        L2d:
            java.lang.Object r1 = r6.f98965s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L85
        L35:
            java.lang.Object r1 = r6.f98965s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L77
        L3d:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f98965s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.f r1 = r6.f98966t
            com.avito.android.barcode_scanner_impl.domain.d r3 = r1.f99004d
            bh.a r4 = r6.f98967u
            if (r3 == 0) goto L56
            r5 = r4
            bh.a$b r5 = (bh.InterfaceC25648a.b) r5
            java.lang.String r5 = r5.f57368a
            java.lang.String r3 = r3.a(r5)
            goto L5b
        L56:
            r3 = r4
            bh.a$b r3 = (bh.InterfaceC25648a.b) r3
            java.lang.String r3 = r3.f57368a
        L5b:
            com.avito.android.barcode_scanner_public.BarcodeScannerParams r1 = r1.f99001a
            boolean r1 = r1.f99052d
            if (r1 == 0) goto L93
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$BarcodeDetected r1 = new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$BarcodeDetected
            bh.a$b r4 = (bh.InterfaceC25648a.b) r4
            android.graphics.Bitmap r4 = r4.f57369b
            r1.<init>(r4, r3)
            r6.f98965s = r7
            r3 = 1
            r6.f98964r = r3
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L76
            return r0
        L76:
            r1 = r7
        L77:
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$UnbindScannerUI r7 = com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction.UnbindScannerUI.f98989b
            r6.f98965s = r1
            r3 = 2
            r6.f98964r = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L85
            return r0
        L85:
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$VibrateOneShot r7 = com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction.VibrateOneShot.f98990b
            r6.f98965s = r2
            r2 = 3
            r6.f98964r = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto Lc8
            return r0
        L93:
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$UnbindScannerUI r1 = com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction.UnbindScannerUI.f98989b
            r6.f98965s = r7
            r6.f98963q = r3
            r4 = 4
            r6.f98964r = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto La3
            return r0
        La3:
            r1 = r3
            r3 = r7
        La5:
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$VibrateOneShot r7 = com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction.VibrateOneShot.f98990b
            r6.f98965s = r3
            r6.f98963q = r1
            r4 = 5
            r6.f98964r = r4
            java.lang.Object r7 = r3.emit(r7, r6)
            if (r7 != r0) goto Lb5
            return r0
        Lb5:
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$SubmitResult r7 = new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction$SubmitResult
            r7.<init>(r1)
            r6.f98965s = r2
            r6.f98963q = r2
            r1 = 6
            r6.f98964r = r1
            java.lang.Object r7 = r3.emit(r7, r6)
            if (r7 != r0) goto Lc8
            return r0
        Lc8:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
