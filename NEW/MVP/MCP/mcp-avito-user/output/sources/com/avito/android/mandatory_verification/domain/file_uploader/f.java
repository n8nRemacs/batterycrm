package com.avito.android.mandatory_verification.domain.file_uploader;

import Y41.q;
import com.avito.android.mandatory_verification.domain.file_uploader.l;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$deleteFile$3", f = "FileUploaderInteractor.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements q<InterfaceC43172j<? super l>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184530q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f184531r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f184532s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f184533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, Continuation<? super f> continuation) {
        super(3, continuation);
        this.f184533t = cVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super l> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        f fVar = new f(this.f184533t, continuation);
        fVar.f184531r = interfaceC43172j;
        fVar.f184532s = th2;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184530q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f184531r;
            l.c cVar = new l.c(InterfaceC35741a1.a.a(this.f184533t.f184510c, this.f184532s, null, null, 6));
            this.f184531r = null;
            this.f184530q = 1;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
