package com.avito.android.mandatory_verification.items.uploader;

import Y41.p;
import com.avito.android.mandatory_verification.items.uploader.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: MandatoryVerificationUploaderItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItemPresenterImpl$bindView$2$1", f = "MandatoryVerificationUploaderItemPresenterImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184698q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f184699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f184700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f184701t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, String str, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f184699r = kVar;
        this.f184700s = str;
        this.f184701t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f184699r, this.f184700s, this.f184701t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184698q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f184699r.f184703b;
            a.C5423a c5423a = new a.C5423a(this.f184700s, this.f184701t);
            this.f184698q = 1;
            if (e2Var.emit(c5423a, this) == coroutine_suspended) {
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
