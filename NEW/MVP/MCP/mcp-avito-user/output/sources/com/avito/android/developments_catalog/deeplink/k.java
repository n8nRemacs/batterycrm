package com.avito.android.developments_catalog.deeplink;

import Y41.p;
import com.avito.android.deep_linking.links.DevelopmentsCatalogPhoneLink;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import lx.InterfaceC43844a;
import nx.C44486a;

/* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lnx/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_catalog.deeplink.DevelopmentsCatalogPhoneLinkHandler$doHandleSuspend$2", f = "DevelopmentsCatalogPhoneLinkHandler.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super TypedResult<C44486a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f139114q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f139115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DevelopmentsCatalogPhoneLink f139116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, DevelopmentsCatalogPhoneLink developmentsCatalogPhoneLink, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f139115r = iVar;
        this.f139116s = developmentsCatalogPhoneLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f139115r, this.f139116s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C44486a>> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f139114q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43844a interfaceC43844a = this.f139115r.f139105i;
            DevelopmentsCatalogPhoneLink developmentsCatalogPhoneLink = this.f139116s;
            long j12 = Long.parseLong(developmentsCatalogPhoneLink.f133251b);
            this.f139114q = 1;
            obj = interfaceC43844a.a(j12, developmentsCatalogPhoneLink.f133252c, developmentsCatalogPhoneLink.f133253d, this);
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
