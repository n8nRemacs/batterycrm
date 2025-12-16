package db1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.component.TopicComponentImpl$unsubscribeFromTopic$$inlined$wrapInTask$1$1", f = "TopicComponentImpl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class w extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f393970q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f.b f393971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f393972s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f.b bVar, Continuation continuation, v vVar) {
        super(2, continuation);
        this.f393971r = bVar;
        this.f393972s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new w(this.f393971r, continuation, this.f393972s);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f393970q;
        if (i12 == 0) {
            C42729a0.b(obj);
            jb1.t tVar = this.f393972s.f393968b;
            this.f393970q = 1;
            objA = tVar.a("ru.vk.store_ads", this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = ((Z) obj).f406625b;
        }
        int i13 = Z.f406624c;
        boolean z12 = objA instanceof Z.b;
        f.b bVar = this.f393971r;
        if (!z12) {
            bVar.b(objA);
        }
        Throwable thB = Z.b(objA);
        if (thB != null) {
            bVar.a(thB);
        }
        return G0.f406611a;
    }
}
