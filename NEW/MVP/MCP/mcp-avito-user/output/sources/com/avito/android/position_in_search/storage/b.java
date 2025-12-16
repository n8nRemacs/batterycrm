package com.avito.android.position_in_search.storage;

import Y41.p;
import com.avito.android.position_in_search.storage.BannerStorage;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BannerPreference.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.storage.BannerPreference$closedBannersByPlace$2", f = "BannerPreference.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super Set<? extends String>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f221770q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BannerStorage.Place f221771r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, BannerStorage.Place place, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f221770q = aVar;
        this.f221771r = place;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f221770q, this.f221771r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Set<? extends String>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AK0.l lVar = this.f221770q.f221762a.get();
        int iOrdinal = this.f221771r.ordinal();
        if (iOrdinal == 0) {
            str = "position_in_search_closed_banners_info";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "position_in_search_closed_banners_period";
        }
        Set<String> setF = lVar.f(str);
        return setF == null ? B0.f406639b : setF;
    }
}
