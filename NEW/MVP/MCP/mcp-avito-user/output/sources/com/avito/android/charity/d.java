package com.avito.android.charity;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.charity.pub.generated.api.universal_prepare_charity_popup.Source;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import oo.InterfaceC44830a;
import po.C47118a;

/* compiled from: CharityInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lpo/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.charity.CharityInteractorImpl$requestDialog$1$1", f = "CharityInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super TypedResult<C47118a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118055q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f118056r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f118057s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharitySource f118058t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, c cVar, CharitySource charitySource, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f118056r = str;
        this.f118057s = cVar;
        this.f118058t = charitySource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f118056r, this.f118057s, this.f118058t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C47118a>> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Source source;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f118055q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Long lZ02 = C43066x.z0(this.f118056r);
            InterfaceC44830a interfaceC44830a = this.f118057s.f118054b.get();
            int iOrdinal = this.f118058t.ordinal();
            if (iOrdinal == 0) {
                source = Source.Soa;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                source = Source.Publish;
            }
            this.f118055q = 1;
            obj = interfaceC44830a.a(source, lZ02, this);
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
