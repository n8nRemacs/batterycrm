package com.avito.android.safety.tfa_disable_password;

import Y41.p;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wo0.InterfaceC49659a;

/* compiled from: TfaDisablePasswordFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment$setupCallbacks$2", f = "TfaDisablePasswordFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TfaDisablePasswordFragment f258104q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TfaDisablePasswordFragment tfaDisablePasswordFragment, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f258104q = tfaDisablePasswordFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f258104q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((j) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC49659a.b bVar = InterfaceC49659a.b.f441781a;
        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
        this.f258104q.r5(bVar);
        return G0.f406611a;
    }
}
