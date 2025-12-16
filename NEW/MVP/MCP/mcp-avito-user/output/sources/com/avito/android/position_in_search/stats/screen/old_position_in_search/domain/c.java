package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BannerInfoRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PlacedBannerInfoRepository$closedBanners$2", f = "BannerInfoRepository.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super Set<? extends String>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220365q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f220366r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f220366r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f220366r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Set<? extends String>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220365q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f220366r;
            BannerStorage bannerStorage = bVar.f220357a.get();
            this.f220365q = 1;
            obj = bannerStorage.b(bVar.f220359c, this);
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
