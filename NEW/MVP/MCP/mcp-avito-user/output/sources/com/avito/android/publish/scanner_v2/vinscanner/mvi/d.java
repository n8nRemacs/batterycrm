package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13391b;
import Y41.q;
import com.avito.android.error.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VinScannerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDe0/b;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.mvi.VinScannerActor$processStsImage$3", f = "VinScannerActor.kt", i = {0, 0}, l = {96, 97}, m = "invokeSuspend", n = {"$this$catch", "throwable"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC13391b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f239499q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f239500r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f239501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f239502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f239502t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC13391b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f239502t, continuation);
        dVar.f239500r = interfaceC43172j;
        dVar.f239501s = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Throwable th2;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f239499q;
        e eVar = this.f239502t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f239500r;
            th2 = this.f239501s;
            InterfaceC13391b.c cVar = new InterfaceC13391b.c(eVar.f239504b.getTitle());
            this.f239500r = interfaceC43172j2;
            this.f239501s = th2;
            this.f239499q = 1;
            if (interfaceC43172j2.emit(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            th2 = this.f239501s;
            interfaceC43172j = this.f239500r;
            C42729a0.b(obj);
        }
        String strJ = z.j(th2);
        if (strJ == null) {
            strJ = eVar.f239504b.getFailPage().getTitle();
        }
        InterfaceC13391b.g gVar = new InterfaceC13391b.g(strJ);
        this.f239500r = null;
        this.f239501s = null;
        this.f239499q = 2;
        if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
