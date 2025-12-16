package cb1;

import bb1.s;
import eb1.C40084a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.di.ComponentModule$provideValidationComponent$1", f = "ComponentModule.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: cb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27163b extends SuspendLambda implements Y41.l<Continuation<? super Xa1.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f57975q;

    public C27163b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new C27163b(1, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super Xa1.a> continuation) {
        return new C27163b(1, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f57975q;
        if (i12 == 0) {
            C42729a0.b(obj);
            jb1.e eVarA = q.a();
            this.f57975q = 1;
            obj = U.c(new s(eVarA.f405683a.f21043a, false, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return ((C40084a) obj).f395247a;
    }
}
