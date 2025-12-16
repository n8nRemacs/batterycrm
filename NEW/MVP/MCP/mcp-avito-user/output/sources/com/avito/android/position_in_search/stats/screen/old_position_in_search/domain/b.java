package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: BannerInfoRepository.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/a;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<BannerStorage> f220357a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f220358b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BannerStorage.Place f220359c;

    /* compiled from: BannerInfoRepository.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/b$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h31.e<BannerStorage> f220360a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final R0 f220361b;

        @Inject
        public a(@k R0 r02, @k h31.e eVar) {
            this.f220360a = eVar;
            this.f220361b = r02;
        }
    }

    /* compiled from: BannerInfoRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PlacedBannerInfoRepository$closeBanner$2", f = "BannerInfoRepository.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b$b, reason: collision with other inner class name */
    public static final class C6626b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220362q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f220364s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6626b(String str, Continuation<? super C6626b> continuation) {
            super(2, continuation);
            this.f220364s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C6626b(this.f220364s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C6626b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220362q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                BannerStorage bannerStorage = bVar.f220357a.get();
                this.f220362q = 1;
                if (bannerStorage.a(bVar.f220359c, this.f220364s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public b() {
        throw null;
    }

    public b(h31.e eVar, R0 r02, BannerStorage.Place place, C42822w c42822w) {
        this.f220357a = eVar;
        this.f220358b = r02;
        this.f220359c = place;
    }

    @l
    public final Object a(@k String str, @k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f220358b.a(), new C6626b(str, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
