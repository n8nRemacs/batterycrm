package com.avito.android.mortgage.document_upload.interactor;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FilesInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$deleteFile$2", f = "FilesInteractor.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f199344q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f199345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f199346s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f199347t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f199348u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, String str2, String str3, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f199345r = fVar;
        this.f199346s = str;
        this.f199347t = str2;
        this.f199348u = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f199345r, this.f199346s, this.f199347t, this.f199348u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f199344q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f199345r;
            this.f199344q = 1;
            obj = fVar.f199232c.f199225a.get().s(this.f199347t, this.f199348u, this.f199346s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
