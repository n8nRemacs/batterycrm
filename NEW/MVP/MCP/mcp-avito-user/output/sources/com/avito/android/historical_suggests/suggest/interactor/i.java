package com.avito.android.historical_suggests.suggest.interactor;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.I0;

/* compiled from: HistoricalSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$loadCoordinates$1", f = "HistoricalSuggestsInteractor.kt", i = {0, 1, 2, 3}, l = {53, 55, 58, 63, 66}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "$this$channelFlow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes13.dex */
final class i extends SuspendLambda implements p<I0<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f162064q;

    /* renamed from: r, reason: collision with root package name */
    public int f162065r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f162066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f162067t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Long f162068u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f162069v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Long l12, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f162067t = mVar;
        this.f162068u = l12;
        this.f162069v = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f162067t, this.f162068u, this.f162069v, continuation);
        iVar.f162066s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<?> i02, Continuation<? super G0> continuation) {
        return ((i) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.interactor.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
