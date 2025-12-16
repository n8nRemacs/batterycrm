package com.avito.android.social_management;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import hx0.InterfaceC41187a;
import ix0.C42129b;
import ix0.C42130c;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: SocialManagementInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lix0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.social_management.SocialManagementInteractorImpl$loadVkGroupInfo$1", f = "SocialManagementInteractor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.social_management.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C35048o extends SuspendLambda implements Y41.p<T, Continuation<? super List<? extends C42130c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284688q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35046m f284689r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35048o(C35046m c35046m, Continuation<? super C35048o> continuation) {
        super(2, continuation);
        this.f284689r = c35046m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35048o(this.f284689r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends C42130c>> continuation) {
        return ((C35048o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284688q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41187a interfaceC41187a = this.f284689r.f284683b;
            this.f284688q = 1;
            obj = interfaceC41187a.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return ((C42129b) ((TypedResult.Success) typedResult).getResult()).a();
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        throw C35936s.a(error.getError(), error.getCause());
    }
}
