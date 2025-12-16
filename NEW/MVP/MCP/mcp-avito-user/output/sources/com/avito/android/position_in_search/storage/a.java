package com.avito.android.position_in_search.storage;

import Y41.p;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: BannerPreference.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/storage/a;", "Lcom/avito/android/position_in_search/storage/BannerStorage;", "_avito_position-in-search_storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements BannerStorage {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f221762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f221763b;

    /* compiled from: BannerPreference.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.storage.BannerPreference$addClosed$2", f = "BannerPreference.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.position_in_search.storage.a$a, reason: collision with other inner class name */
    public static final class C6707a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public AK0.l f221764q;

        /* renamed from: r, reason: collision with root package name */
        public String f221765r;

        /* renamed from: s, reason: collision with root package name */
        public int f221766s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ BannerStorage.Place f221768u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f221769v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6707a(BannerStorage.Place place, String str, Continuation<? super C6707a> continuation) {
            super(2, continuation);
            this.f221768u = place;
            this.f221769v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new C6707a(this.f221768u, this.f221769v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C6707a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            AK0.l lVar;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221766s;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = a.this;
                lVar = aVar.f221762a.get();
                BannerStorage.Place place = this.f221768u;
                int iOrdinal = place.ordinal();
                if (iOrdinal == 0) {
                    str = "position_in_search_closed_banners_info";
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "position_in_search_closed_banners_period";
                }
                this.f221764q = lVar;
                this.f221765r = str;
                this.f221766s = 1;
                obj = aVar.b(place, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.f221765r;
                lVar = this.f221764q;
                C42729a0.b(obj);
            }
            lVar.putStringSet(str2, b1.i((Set) obj, this.f221769v));
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f221762a = eVar;
        this.f221763b = r02;
    }

    @Override // com.avito.android.position_in_search.storage.BannerStorage
    @Y61.l
    public final Object a(@Y61.k BannerStorage.Place place, @Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f221763b.a(), new C6707a(place, str, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.position_in_search.storage.BannerStorage
    @Y61.l
    public final Object b(@Y61.k BannerStorage.Place place, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f221763b.a(), new b(this, place, null), suspendLambda);
    }
}
