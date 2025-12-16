package yc1;

import Y41.p;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import sberid.sdk.app_token.domain.models.models.TypeAuth;

/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f443391q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TypeAuth f443392r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f443393s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, TypeAuth typeAuth, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f443391q = str;
        this.f443392r = typeAuth;
        this.f443393s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f443391q, this.f443392r, this.f443393s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((B81.k) this.f443393s.f443394a).b(new Kb1.b("", "", this.f443391q, new Date().getTime(), this.f443392r));
        return G0.f406611a;
    }
}
