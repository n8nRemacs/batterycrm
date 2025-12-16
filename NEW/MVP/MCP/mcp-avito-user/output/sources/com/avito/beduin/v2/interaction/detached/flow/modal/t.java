package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.avito.beduin.v2.logger.LogLevel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ShowModalInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.detached.flow.modal.ShowModalInteractionHandler$handle$2", f = "ShowModalInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.q<InterfaceC43172j<? super dU0.f>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f337386q;

    public t() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        t tVar = new t(3, continuation);
        tVar.f337386q = th2;
        return tVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f337386q;
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (1 >= RU0.b.f14469c) {
            RU0.c cVar = RU0.b.f14468b;
            String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":ShowModalInteractionHandler");
            StringBuilder sb2 = new StringBuilder("onDismiss (by ");
            sb2.append(th2 != null ? "DisposeInteractionScope" : "User");
            sb2.append(')');
            cVar.d(strS, sb2.toString());
        }
        return G0.f406611a;
    }
}
