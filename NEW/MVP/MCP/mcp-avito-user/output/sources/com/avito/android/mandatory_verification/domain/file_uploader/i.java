package com.avito.android.mandatory_verification.domain.file_uploader;

import Y41.q;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$uploadFile$2", f = "FileUploaderInteractor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class i extends SuspendLambda implements q<InterfaceC43172j<? super P2<? super FileUploadResult>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184556q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f184557r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f184558s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f184559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, Continuation<? super i> continuation) {
        super(3, continuation);
        this.f184559t = cVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super P2<? super FileUploadResult>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        i iVar = new i(this.f184559t, continuation);
        iVar.f184557r = interfaceC43172j;
        iVar.f184558s = th2;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184556q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f184557r;
            Throwable th3 = this.f184558s;
            ApiError apiErrorN = z.n(th3);
            this.f184559t.getClass();
            if ((apiErrorN instanceof ApiError.UnknownError) && (th2 = ((ApiError.UnknownError) apiErrorN).f253395c) != null && (th2 instanceof n)) {
                throw th2;
            }
            P2.a aVar = new P2.a(z.n(th3));
            this.f184557r = null;
            this.f184556q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
