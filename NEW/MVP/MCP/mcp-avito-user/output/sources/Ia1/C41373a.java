package ia1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.o;
import y91.InterfaceC50089b;
import z91.e;
import z91.s;

/* renamed from: ia1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C41373a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f398562q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.error.c f398563r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41373a(ru.mts.biometry.sdk.feature.recognition.ui.error.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f398563r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C41373a(this.f398563r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C41373a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398562q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f398563r.requireContext();
            s sVar = e.f443908b;
            if (sVar == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            o oVar = sVar.a().f436313b;
            this.f398562q = 1;
            InterfaceC50089b interfaceC50089b = oVar.f436354c;
            if (interfaceC50089b == null) {
                interfaceC50089b = null;
            }
            Object objD = interfaceC50089b.d(this);
            if (objD != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objD = G0.f406611a;
            }
            if (objD == coroutine_suspended) {
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
