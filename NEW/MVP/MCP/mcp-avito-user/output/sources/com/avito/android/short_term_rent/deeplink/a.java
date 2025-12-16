package com.avito.android.short_term_rent.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.StrIncreasedCashbackApplyResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.short_term_rent.deeplink.StrIncreasedCashbackApplyLink;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: StrIncreasedCashbackApplyLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.deeplink.StrIncreasedCashbackApplyLinkHandler$doHandle$1$1", f = "StrIncreasedCashbackApplyLinkHandler.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282252q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f282253r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f282253r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f282253r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282252q;
        c cVar = this.f282253r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f282252q = 1;
            obj = cVar.f282255f.a(this);
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
            a.i.C4057a.d(cVar.f282256g, com.avito.android.printable_text.b.f(((StrIncreasedCashbackApplyResponse) ((TypedResult.Success) typedResult).getResult()).getMessage()), null, null, null, 0, null, null, null, 2046);
            cVar.j(StrIncreasedCashbackApplyLink.b.C8424b.f282251b);
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(C35936s.a(error.getError(), error.getCause())));
            f.c.f125255c.getClass();
            a.i.C4057a.d(cVar.f282256g, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
            cVar.j(StrIncreasedCashbackApplyLink.b.a.f282250b);
        }
        return G0.f406611a;
    }
}
