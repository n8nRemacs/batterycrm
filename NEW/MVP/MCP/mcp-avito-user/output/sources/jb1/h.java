package jb1;

import android.app.Activity;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushClickActivityCallbackUseCase$onActivityCreated$1", f = "RegisterPushClickActivityCallbackUseCase.kt", i = {0, 0, 1, 2}, l = {33, 37, 40}, m = "invokeSuspend", n = {"extras", "action", "action", "action"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f405687q;

    /* renamed from: r, reason: collision with root package name */
    public String f405688r;

    /* renamed from: s, reason: collision with root package name */
    public int f405689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f405690t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f405691u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f405690t = activity;
        this.f405691u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new h(this.f405690t, this.f405691u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return new h(this.f405690t, this.f405691u, continuation).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
