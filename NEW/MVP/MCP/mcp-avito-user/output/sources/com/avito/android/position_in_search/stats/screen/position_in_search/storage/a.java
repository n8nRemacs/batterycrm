package com.avito.android.position_in_search.stats.screen.position_in_search.storage;

import AK0.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import com.avito.android.util.R0;
import h31.e;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PositionInSearchStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/storage/a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/storage/PositionInSearchStorage;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements PositionInSearchStorage {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<l> f221567a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f221568b;

    /* compiled from: PositionInSearchStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.storage.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6703a {
        static {
            int[] iArr = new int[PositionInSearchStorage.Place.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInSearchStorage.Place place = PositionInSearchStorage.Place.f221563b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: PositionInSearchStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorageImpl$setClosedBannerId$2", f = "PositionInSearchStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PositionInSearchStorage.Place f221570r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f221571s;

        /* compiled from: PositionInSearchStorage.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.storage.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C6704a {
            static {
                int[] iArr = new int[PositionInSearchStorage.Place.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PositionInSearchStorage.Place place = PositionInSearchStorage.Place.f221563b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PositionInSearchStorage.Place place, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f221570r = place;
            this.f221571s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return a.this.new b(this.f221570r, this.f221571s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            PositionInSearchStorage.Place place = this.f221570r;
            a aVar = a.this;
            LinkedHashSet linkedHashSetI = b1.i(aVar.b(place), this.f221571s);
            int iOrdinal = place.ordinal();
            e<l> eVar = aVar.f221567a;
            if (iOrdinal == 0) {
                eVar.get().putStringSet("position_in_search_closed_banners_info", linkedHashSetI);
            } else if (iOrdinal == 1) {
                eVar.get().putStringSet("position_in_search_closed_banners_period", linkedHashSetI);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k R0 r02, @k e eVar) {
        this.f221567a = eVar;
        this.f221568b = r02;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage
    @Y61.l
    public final Object a(@k PositionInSearchStorage.Place place, @k String str, @k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f221568b.a(), new b(place, str, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage
    @k
    public final Set<String> b(@k PositionInSearchStorage.Place place) {
        int iOrdinal = place.ordinal();
        e<l> eVar = this.f221567a;
        if (iOrdinal == 0) {
            Set<String> setF = eVar.get().f("position_in_search_closed_banners_info");
            return setF == null ? B0.f406639b : setF;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Set<String> setF2 = eVar.get().f("position_in_search_closed_banners_period");
        return setF2 == null ? B0.f406639b : setF2;
    }
}
