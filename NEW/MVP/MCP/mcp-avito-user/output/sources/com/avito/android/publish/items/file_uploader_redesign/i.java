package com.avito.android.publish.items.file_uploader_redesign;

import Y41.p;
import Y61.l;
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

/* compiled from: FileUploaderRedesignItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.items.file_uploader_redesign.FileUploaderRedesignItemPresenterImpl$bindRedesignView$2$1", f = "FileUploaderRedesignItemPresenter.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236844q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f236845r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f236846s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f236847t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f236845r = fVar;
        this.f236846s = str;
        this.f236847t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f236845r, this.f236846s, this.f236847t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f236844q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f236845r.f236836b;
            a.C5423a c5423a = new a.C5423a(this.f236846s, this.f236847t);
            this.f236844q = 1;
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
