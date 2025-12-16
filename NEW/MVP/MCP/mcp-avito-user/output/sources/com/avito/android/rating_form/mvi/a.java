package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.api.remote.model.a;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Loading;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.mvi.RatingFormActor$process$1", f = "RatingFormActor.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormInternalAction.Loading>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f248693q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f248694r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f248695s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f248695s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f248695s, continuation);
        aVar.f248694r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormInternalAction.Loading> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object c7450b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f248693q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f248694r;
            RatingFormInternalAction.Loading loading = new RatingFormInternalAction.Loading();
            this.f248693q = 1;
            if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        d dVar = this.f248695s;
        com.avito.android.rating_form.interactor.i iVar = dVar.f248704b;
        RatingFormArguments ratingFormArguments = dVar.f248703a;
        if (ratingFormArguments instanceof RatingFormArguments.RatingModelArguments) {
            RatingFormArguments.RatingModelArguments ratingModelArguments = (RatingFormArguments.RatingModelArguments) ratingFormArguments;
            c7450b = new a.b.C7448a(new a.b.C7448a.C7449a(ratingModelArguments.f247905c, ratingModelArguments.f247906d, ratingModelArguments.f247907e));
        } else {
            if (!(ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments)) {
                throw new NoWhenBranchMatchedException();
            }
            c7450b = new a.b.C7450b(((RatingFormArguments.RatingSellerArguments) ratingFormArguments).f247910c);
        }
        List listSingletonList = Collections.singletonList(c7450b);
        this.f248693q = 2;
        if (iVar.b(listSingletonList, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, new LinkedHashMap(), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
