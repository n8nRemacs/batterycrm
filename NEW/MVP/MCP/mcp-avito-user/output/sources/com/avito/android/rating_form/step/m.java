package com.avito.android.rating_form.step;

import com.avito.android.rating_form.FieldIdentifier;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RatingFormFileInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$uploadFile$job$1$fileRequestBody$1$1$1", f = "RatingFormFileInteractor.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249524q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f249525r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249526s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f249527t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f249528u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(FieldIdentifier fieldIdentifier, e eVar, f fVar, z zVar, Continuation continuation) {
        super(2, continuation);
        this.f249525r = fVar;
        this.f249526s = fieldIdentifier;
        this.f249527t = eVar;
        this.f249528u = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = this.f249527t;
        z zVar = this.f249528u;
        return new m(this.f249526s, eVar, this.f249525r, zVar, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249524q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f249524q = 1;
            int i13 = f.f249472j;
            if (this.f249525r.e(this.f249526s, this.f249527t, this.f249528u, this) == coroutine_suspended) {
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
