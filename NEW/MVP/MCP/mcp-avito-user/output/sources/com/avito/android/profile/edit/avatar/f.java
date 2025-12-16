package com.avito.android.profile.edit.avatar;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.Avatar;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.MultipartBody;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/Avatar;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/Avatar;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.edit.avatar.AvatarInteractorImpl$uploadAvatar$2$1", f = "AvatarInteractor.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super Avatar>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f222060q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f222061r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f222062s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, MultipartBody.Part part, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f222061r = dVar;
        this.f222062s = part;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f222061r, this.f222062s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Avatar> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f222060q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC34401z0 interfaceC34401z0 = this.f222061r.f222052a;
            this.f222060q = 1;
            obj = interfaceC34401z0.l(this.f222062s, this);
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
