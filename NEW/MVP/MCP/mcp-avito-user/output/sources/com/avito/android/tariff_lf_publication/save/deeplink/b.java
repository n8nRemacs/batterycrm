package com.avito.android.tariff_lf_publication.save.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffLfPublicationSaveDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LTD0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_lf_publication.save.deeplink.TariffLfPublicationSaveDeeplinkHandler$doHandleSuspend$2", f = "TariffLfPublicationSaveDeeplinkHandler.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<TD0.a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301139q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f301140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TariffLfPublicationSaveLink f301141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Long f301142t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Long f301143u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f301144v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, TariffLfPublicationSaveLink tariffLfPublicationSaveLink, Long l12, Long l13, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f301140r = cVar;
        this.f301141s = tariffLfPublicationSaveLink;
        this.f301142t = l12;
        this.f301143u = l13;
        this.f301144v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f301140r, this.f301141s, this.f301142t, this.f301143u, this.f301144v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<TD0.a>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301139q;
        if (i12 == 0) {
            C42729a0.b(obj);
            OD0.a aVar = this.f301140r.f301145g;
            String str = this.f301141s.f301132b;
            this.f301139q = 1;
            obj = aVar.b(str, this.f301142t, this.f301143u, this.f301144v, this);
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
