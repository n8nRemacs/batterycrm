package com.avito.android.tariff_cpt.info.mvi;

import com.adjust.sdk.Constants;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoRefreshLink;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
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

/* compiled from: CptInfoV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b$a;", Constants.DEEPLINK, "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "<anonymous>", "(Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_cpt.info.mvi.CptInfoV2Actor$process$terminalResult$2", f = "CptInfoV2Actor.kt", i = {0}, l = {84}, m = "invokeSuspend", n = {Constants.DEEPLINK}, s = {"L$0"})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<TariffCptInfoRefreshLink.b.a, Continuation<? super InterfaceC43160i<? extends CptInfoV2InternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f298236q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f298237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f298238s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f298238s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f298238s, continuation);
        eVar.f298237r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(TariffCptInfoRefreshLink.b.a aVar, Continuation<? super InterfaceC43160i<? extends CptInfoV2InternalAction>> continuation) {
        return ((e) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        TariffCptInfoRefreshLink.b.a aVar;
        TariffCptInfoRefreshLink.b.a aVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f298236q;
        if (i12 == 0) {
            C42729a0.b(obj);
            aVar = (TariffCptInfoRefreshLink.b.a) this.f298237r;
            if (aVar.f298147c != null) {
                long millis = TimeUnit.SECONDS.toMillis(r1.intValue());
                this.f298237r = aVar;
                this.f298236q = 1;
                if (C43131e0.b(millis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
            }
            return this.f298238s.f298247a.a(aVar.f298146b, true);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar2 = (TariffCptInfoRefreshLink.b.a) this.f298237r;
        C42729a0.b(obj);
        aVar = aVar2;
        return this.f298238s.f298247a.a(aVar.f298146b, true);
    }
}
