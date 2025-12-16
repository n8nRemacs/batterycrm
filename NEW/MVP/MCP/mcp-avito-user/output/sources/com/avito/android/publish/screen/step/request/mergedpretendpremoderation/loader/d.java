package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.ApiException;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: BasePretendPremoderationLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.BasePretendPremoderationLoader$premoderation$2", f = "BasePretendPremoderationLoader.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super a.InterfaceC7239a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241783q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f241784r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CategoryParameters f241785s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Navigation f241786t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f241787u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, CategoryParameters categoryParameters, Navigation navigation2, String str, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f241784r = aVar;
        this.f241785s = categoryParameters;
        this.f241786t = navigation2;
        this.f241787u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f241784r, this.f241785s, this.f241786t, this.f241787u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.InterfaceC7239a> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object bVar;
        AdvertProactiveModerationResult advertProactiveModerationResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f241783q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                W wA2 = this.f241784r.f241769c.a(this.f241786t, this.f241785s, this.f241787u);
                this.f241783q = 1;
                obj = C43292o.b(wA2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            advertProactiveModerationResult = (AdvertProactiveModerationResult) obj;
        } catch (Throwable th2) {
            if (th2 instanceof ApiException) {
                ApiError apiError = th2.f318522b;
                if (apiError instanceof ApiError.NetworkIOError) {
                    bVar = new a.InterfaceC7239a.b(((ApiError.NetworkIOError) apiError).getF244063c());
                }
            }
            return a.InterfaceC7239a.c.f241773a;
        }
        if (advertProactiveModerationResult instanceof AdvertProactiveModerationResult.Ok) {
            return a.InterfaceC7239a.c.f241773a;
        }
        if (advertProactiveModerationResult instanceof AdvertProactiveModerationResult.Duplicate) {
            bVar = new a.InterfaceC7239a.C7240a(((AdvertProactiveModerationResult.Duplicate) advertProactiveModerationResult).getDuplicateBody());
        } else {
            if (!(advertProactiveModerationResult instanceof AdvertProactiveModerationResult.WrongCategory)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new a.InterfaceC7239a.d(((AdvertProactiveModerationResult.WrongCategory) advertProactiveModerationResult).getWrongCategorySuggest());
        }
        return bVar;
    }
}
