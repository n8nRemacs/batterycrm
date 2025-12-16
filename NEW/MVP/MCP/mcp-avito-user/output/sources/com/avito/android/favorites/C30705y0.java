package com.avito.android.favorites;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.FavoritesListPresenterImpl$attachView$15", f = "FavoritesListPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.favorites.y0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30705y0 extends SuspendLambda implements Y41.p<Boolean, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f157625q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x1 f157626r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30705y0(x1 x1Var, Continuation continuation) {
        super(2, continuation);
        this.f157626r = x1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30705y0 c30705y0 = new C30705y0(this.f157626r, continuation);
        c30705y0.f157625q = ((Boolean) obj).booleanValue();
        return c30705y0;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super kotlin.G0> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C30705y0) create(bool2, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f157626r.p(this.f157625q);
        return kotlin.G0.f406611a;
    }
}
