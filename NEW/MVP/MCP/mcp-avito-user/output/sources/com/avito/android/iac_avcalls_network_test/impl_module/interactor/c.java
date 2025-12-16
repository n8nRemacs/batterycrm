package com.avito.android.iac_avcalls_network_test.impl_module.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AvCallsNetworkTestInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_avcalls_network_test.impl_module.interactor.AvCallsNetworkTestInteractorImpl$startTest$1", f = "AvCallsNetworkTestInteractor.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"networkType"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f164658q;

    /* renamed from: r, reason: collision with root package name */
    public int f164659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f164660s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f164661t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f164660s = bVar;
        this.f164661t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f164660s, this.f164661t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f164659r;
        b bVar = this.f164660s;
        if (i12 == 0) {
            C42729a0.b(obj);
            bVar.f164637k.set(true);
            bVar.f164638l.set(false);
            String strA = bVar.f164636j.a();
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTestInteractor", "Start test", null);
            AvCallsNetworkTestScenario[] avCallsNetworkTestScenarioArr = AvCallsNetworkTestScenario.f164625b;
            this.f164658q = strA;
            this.f164659r = 1;
            Object objA = bVar.f164628b.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strA;
            obj = objA;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f164658q;
            C42729a0.b(obj);
            str = str2;
        }
        KJ.b bVar2 = (KJ.b) obj;
        bVar.f164630d.a(Boxing.boxLong(this.f164661t));
        bVar.f164630d.d(bVar2.f9390a);
        boolean z12 = bVar.f164638l.get();
        bVar.f164629c.c(new OJ.a(bVar2.f9390a, "app_foreground", bVar2.f9391b, bVar2.f9392c, str, true, z12));
        bVar.f164637k.set(false);
        return G0.f406611a;
    }
}
