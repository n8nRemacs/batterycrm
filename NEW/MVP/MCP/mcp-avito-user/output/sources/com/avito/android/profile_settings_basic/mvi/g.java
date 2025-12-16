package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14879b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BasicProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$7", f = "BasicProfileSettingsActor.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC14879b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228878q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f228879r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f228880s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f228881t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Continuation<? super g> continuation) {
        super(3, continuation);
        this.f228881t = jVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        g gVar = new g(this.f228881t, continuation);
        gVar.f228879r = interfaceC43172j;
        gVar.f228880s = th2;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228878q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f228879r;
            if (this.f228880s == null) {
                InterfaceC43160i<InterfaceC14879b> interfaceC43160iB = this.f228881t.f228889a.b(true);
                this.f228879r = null;
                this.f228878q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
