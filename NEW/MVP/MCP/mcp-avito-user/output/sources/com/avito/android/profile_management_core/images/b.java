package com.avito.android.profile_management_core.images;

import Y41.p;
import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.avito.android.remote.model.extended.modification.UploadImageModification;
import com.avito.android.util.ApiException;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: ProfileManagementImageInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/profile_management_core/images/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/profile_management_core/images/a$b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$deleteImage$2", f = "ProfileManagementImageInteractor.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super a.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226629q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UploadImage f226630r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f226631s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UploadImage uploadImage, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f226630r = uploadImage;
        this.f226631s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f226630r, this.f226631s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.b> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226629q;
        UploadImage uploadImage = this.f226630r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                boolean z12 = uploadImage.getF226677c() instanceof com.avito.android.profile_management_core.images.entity.a;
                d dVar = this.f226631s;
                if (!z12) {
                    N0 n02 = (N0) dVar.f226648i.get(uploadImage.getF226676b());
                    if (n02 != null) {
                        n02.c(null);
                    }
                    dVar.f226648i.remove(uploadImage.getF226676b());
                    return new a.b.C6878b(uploadImage);
                }
                String strL = dVar.f226646g.get().l(new ModificationBody(Collections.singletonList(new UploadImageModification(uploadImage.getF226678d(), Collections.singletonList(new UploadImageModification.Operation(uploadImage.getF226676b(), UploadImageModification.OperationType.REMOVE, null, null)), null, 4, null))));
                D0 d02 = dVar.f226640a.get();
                this.f226629q = 1;
                obj = d02.e(strL, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult.Success success = obj instanceof TypedResult.Success ? (TypedResult.Success) obj : null;
            if ((success != null ? (ModificationResult) success.getResult() : null) instanceof ModificationResult.Ok) {
                return new a.b.C6878b(uploadImage);
            }
            throw new ApiException(com.avito.android.remote.error.j.d(3, null), null, 2, null);
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            return new a.b.C6877a(uploadImage, th2);
        }
    }
}
