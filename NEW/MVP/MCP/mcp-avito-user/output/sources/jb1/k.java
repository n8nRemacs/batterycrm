package jb1;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pb1.C47049a;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushTokenUseCase$invoke$2", f = "RegisterPushTokenUseCase.kt", i = {}, l = {21, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class k extends SuspendLambda implements Y41.l<Continuation<? super Z<? extends C47049a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f405700q;

    /* renamed from: r, reason: collision with root package name */
    public int f405701r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f405702s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f405703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, Continuation<? super k> continuation) {
        super(1, continuation);
        this.f405702s = lVar;
        this.f405703t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new k(this.f405702s, this.f405703t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super Z<? extends C47049a>> continuation) {
        return new k(this.f405702s, this.f405703t, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f405701r;
        l lVar = this.f405702s;
        if (i12 == 0) {
            C42729a0.b(obj);
            ab1.n nVar = lVar.f405704a;
            this.f405701r = 1;
            objA = nVar.a(this.f405703t, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f405700q;
                C42729a0.b(obj);
                return Z.a(obj2);
            }
            C42729a0.b(obj);
            objA = ((Z) obj).f406625b;
        }
        Throwable thB = Z.b(objA);
        if (thB != null && (thB instanceof HostIsNotMasterException)) {
            lVar.f405707d.a("Register for pushes has failed, received HostIsNotMasterException", null);
            this.f405700q = objA;
            this.f405701r = 2;
            Object objB = lVar.f405706c.f21043a.b(this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = G0.f406611a;
            }
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        obj2 = objA;
        return Z.a(obj2);
    }
}
