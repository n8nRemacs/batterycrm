package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: FilesInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "uploadId", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractorImpl$observeFilesDeleted$5", f = "FilesInteractor.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class I extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f148665q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f148666r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f148667s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j12, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f148667s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(this.f148667s, continuation);
        i12.f148666r = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((I) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f148665q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                String str = (String) this.f148666r;
                J j12 = this.f148667s;
                io.reactivex.rxjava3.core.I<String> iE2 = j12.f148669b.e(j12.f148668a.f148723b, str);
                this.f148665q = 1;
                if (C43292o.b(iE2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Exception e12) {
            V2.f318762a.f(e12);
        }
        return G0.f406611a;
    }
}
