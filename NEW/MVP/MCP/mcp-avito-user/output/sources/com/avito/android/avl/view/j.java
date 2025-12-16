package com.avito.android.avl.view;

import com.avito.android.util.R0;
import com.google.android.exoplayer2.O;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: AvlPlayerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.view.AvlPlayerActivity$preloadNextVideo$1$1", f = "AvlPlayerActivity.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98391q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AvlPlayerActivity f98392r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f98393s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f98394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12, AvlPlayerActivity avlPlayerActivity, O o12, Continuation continuation) {
        super(2, continuation);
        this.f98392r = avlPlayerActivity;
        this.f98393s = o12;
        this.f98394t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f98394t, this.f98392r, this.f98393s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98391q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f98391q = 1;
            AvlPlayerActivity avlPlayerActivity = this.f98392r;
            R0 r02 = avlPlayerActivity.f98319x;
            if (r02 == null) {
                r02 = null;
            }
            Object objG = C43259k.g(r02.a(), new h(this.f98394t, avlPlayerActivity, this.f98393s, null), this);
            if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objG = G0.f406611a;
            }
            if (objG == coroutine_suspended) {
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
