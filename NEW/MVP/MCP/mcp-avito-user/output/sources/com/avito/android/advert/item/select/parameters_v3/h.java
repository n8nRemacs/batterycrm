package com.avito.android.advert.item.select.parameters_v3;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import yi0.C50255a;

/* compiled from: AutoSelectParametersV3Presenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.select.parameters_v3.AutoSelectParametersV3PresenterImpl$loadContactInfo$1", f = "AutoSelectParametersV3Presenter.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f79577q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C28201d f79578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f79579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C28201d c28201d, z zVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f79578r = c28201d;
        this.f79579s = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f79578r, this.f79579s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f79577q;
        C28201d c28201d = this.f79578r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f79577q = 1;
            obj = c28201d.f79568d.b(c28201d.f79566b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        C50255a c50255a = (C50255a) obj;
        if (c50255a != null) {
            String strSubstring = c50255a.f443476b.substring(1);
            int i13 = C28201d.f79565j;
            c28201d.f79573i = strSubstring;
            this.f79579s.Mb(strSubstring);
        }
        return G0.f406611a;
    }
}
