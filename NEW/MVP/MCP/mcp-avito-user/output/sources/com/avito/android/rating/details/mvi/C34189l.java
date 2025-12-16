package com.avito.android.rating.details.mvi;

import android.net.Uri;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$12", f = "RatingDetailsActor.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating.details.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34189l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247466q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247467r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34175a f247469t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34189l(C34175a c34175a, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247468s = bVar;
        this.f247469t = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34189l c34189l = new C34189l(this.f247469t, this.f247468s, continuation);
        c34189l.f247467r = obj;
        return c34189l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34189l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247466q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247467r;
            Uri uri = this.f247468s.f247421d;
            if (uri != null) {
                InterfaceC43160i<RatingDetailsInternalAction> interfaceC43160iF = this.f247469t.f247272a.f(uri);
                this.f247466q = 1;
                if (C43175k.u(this, interfaceC43160iF, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
