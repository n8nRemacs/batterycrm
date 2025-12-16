package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13390a;
import De0.InterfaceC13391b;
import Y41.p;
import android.net.Uri;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: VinScannerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.mvi.VinScannerActor$process$1", f = "VinScannerActor.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC13391b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f239483q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f239484r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f239485s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13390a f239486t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, InterfaceC13390a interfaceC13390a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f239485s = eVar;
        this.f239486t = interfaceC13390a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f239485s, this.f239486t, continuation);
        aVar.f239484r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC13391b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f239483q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f239484r;
            InterfaceC13390a.f fVar = (InterfaceC13390a.f) this.f239486t;
            Uri uri = fVar.f3316a;
            Navigation navigation2 = fVar.f3317b;
            CategoryParameters categoryParameters = fVar.f3318c;
            e eVar = this.f239485s;
            InterfaceC43160i interfaceC43160iI = C43175k.I(eVar.f239505c.a(), new C43152f0(new C43137a0(new c(uri, eVar, null), C43175k.B(new b(uri, eVar, null), y.a(eVar.f239503a.a(uri, navigation2, categoryParameters)))), new d(eVar, null)));
            this.f239483q = 1;
            if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
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
