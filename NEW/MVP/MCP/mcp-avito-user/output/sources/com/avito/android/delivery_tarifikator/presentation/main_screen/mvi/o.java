package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TarifikatorMainActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LOv/p;", "uiData", "LOv/n;", "settings", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$UpdateScreenContent;", "<anonymous>", "(LOv/p;LOv/n;)Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$UpdateScreenContent;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$screenUpdatesFlow$1", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class o extends SuspendLambda implements Y41.q<Ov.p, Ov.n, Continuation<? super TarifikatorMainInternalAction.UpdateScreenContent>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Ov.p f135699q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Ov.n f135700r;

    public o() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(Ov.p pVar, Ov.n nVar, Continuation<? super TarifikatorMainInternalAction.UpdateScreenContent> continuation) {
        o oVar = new o(3, continuation);
        oVar.f135699q = pVar;
        oVar.f135700r = nVar;
        return oVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new TarifikatorMainInternalAction.UpdateScreenContent(this.f135699q, this.f135700r);
    }
}
