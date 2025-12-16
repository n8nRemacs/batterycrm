package com.avito.android.tariff.cpx.info.mvi;

import com.adjust.sdk.Constants;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import com.avito.android.tariff.deeplink.TariffCpxInfoRefreshLink;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxInfoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b$a;", Constants.DEEPLINK, "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "<anonymous>", "(Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.info.mvi.TariffCpxInfoActor$process$terminalResult$2", f = "TariffCpxInfoActor.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<TariffCpxInfoRefreshLink.b.a, Continuation<? super InterfaceC43160i<? extends TariffCpxInfoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f296717q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f296718r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f296719s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f296719s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f296719s, continuation);
        fVar.f296718r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(TariffCpxInfoRefreshLink.b.a aVar, Continuation<? super InterfaceC43160i<? extends TariffCpxInfoInternalAction>> continuation) {
        return ((f) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f296717q;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (((TariffCpxInfoRefreshLink.b.a) this.f296718r).f297386b != null) {
                long millis = TimeUnit.SECONDS.toMillis(r6.intValue());
                this.f296717q = 1;
                if (C43131e0.b(millis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return this.f296719s.f296720a.a(false);
    }
}
