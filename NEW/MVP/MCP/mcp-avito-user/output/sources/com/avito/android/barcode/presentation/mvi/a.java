package com.avito.android.barcode.presentation.mvi;

import Og.InterfaceC14684a;
import Og.InterfaceC14685b;
import Y41.p;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BarcodeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOg/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.barcode.presentation.mvi.BarcodeActor$process$1", f = "BarcodeActor.kt", i = {}, l = {22, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14685b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98718q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14684a f98720s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f98721t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14684a interfaceC14684a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f98720s = interfaceC14684a;
        this.f98721t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f98720s, this.f98721t, continuation);
        aVar.f98719r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14685b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98718q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f98719r;
            InterfaceC14684a interfaceC14684a = this.f98720s;
            if (interfaceC14684a instanceof InterfaceC14684a.b) {
                InterfaceC14685b.a aVar = InterfaceC14685b.a.f12480a;
                this.f98718q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC14684a instanceof InterfaceC14684a.C0801a) {
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.barcode_error_title, new Serializable[0]);
                PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.barcode_error_text, new Serializable[0]);
                b bVar = this.f98721t;
                InterfaceC14685b.C0802b c0802b = new InterfaceC14685b.C0802b(printableTextC, printableTextC2, bVar.f98722a, bVar.f98723b);
                this.f98718q = 2;
                if (interfaceC43172j.emit(c0802b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
