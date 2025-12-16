package com.avito.android.wallet_biometry;

import Y41.p;
import androidx.biometric.o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: WalletPinBiometryAuthenticator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryAuthenticator$canAuthenticate$2", f = "WalletPinBiometryAuthenticator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f329470q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f329470q = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f329470q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean(((o) this.f329470q.f329473c.getValue()).a(15) == 0);
    }
}
