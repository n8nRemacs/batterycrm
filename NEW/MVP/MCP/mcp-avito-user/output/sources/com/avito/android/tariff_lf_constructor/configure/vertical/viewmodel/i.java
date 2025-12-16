package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import Y41.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConstructorConfigureVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.ConstructorConfigureVerticalViewModelKt$throttleFirst$1", f = "ConstructorConfigureVerticalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements q<InterfaceC43172j<Object>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0.h<N0> f300687q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l0.h<N0> hVar, Continuation<? super i> continuation) {
        super(3, continuation);
        this.f300687q = hVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        return new i(this.f300687q, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f300687q.f406842b.c(null);
        return G0.f406611a;
    }
}
