package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain;

import V80.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PositionInfoInteractor.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/i;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/h;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h, com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<P80.a> f220381a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f220382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final KO.a f220383c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.storage.k f220384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f220385e;

    /* compiled from: PositionInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LV80/l;", "<anonymous>", "(Lkotlinx/coroutines/T;)LV80/l;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoInteractorImpl$info$2", f = "PositionInfoInteractor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {35, 38, 39}, m = "invokeSuspend", n = {"infoResponse", "closedBanners", "showCompetitorsInfo", "closedBanners", "showCompetitorsInfo", "isNewCompetitorsShown", "showCompetitorsInfo", "isNewCompetitorsShown"}, s = {"L$0", "L$1", "Z$0", "L$0", "Z$0", "Z$1", "Z$0", "Z$1"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super l>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f220386q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f220387r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f220388s;

        /* renamed from: t, reason: collision with root package name */
        public int f220389t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f220390u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ V80.k f220392w;

        /* compiled from: PositionInfoInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoInteractorImpl$info$2$closedBanners$1", f = "PositionInfoInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i$a$a, reason: collision with other inner class name */
        public static final class C6628a extends SuspendLambda implements p<T, Continuation<? super Set<? extends String>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220393q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ i f220394r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6628a(i iVar, Continuation<? super C6628a> continuation) {
                super(2, continuation);
                this.f220394r = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C6628a(this.f220394r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Set<? extends String>> continuation) {
                return ((C6628a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220393q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f220393q = 1;
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b bVar = this.f220394r.f220385e;
                    obj = C43259k.g(bVar.f220358b.a(), new c(bVar, null), this);
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

        /* compiled from: PositionInfoInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LR80/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoInteractorImpl$info$2$infoResponse$1", f = "PositionInfoInteractor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<R80.c>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220395q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ i f220396r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ V80.k f220397s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, V80.k kVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f220396r = iVar;
                this.f220397s = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new b(this.f220396r, this.f220397s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<R80.c>> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220395q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    P80.a aVar = this.f220396r.f220381a.get();
                    V80.k kVar = this.f220397s;
                    this.f220395q = 1;
                    obj = aVar.b(kVar.f16983a, kVar.f16984b, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V80.k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f220392w = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = i.this.new a(this.f220392w, continuation);
            aVar.f220390u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super l> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 579
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@k h31.e<P80.a> eVar, @k R0 r02, @k KO.a aVar, @k com.avito.android.position_in_search.storage.k kVar, @k b.a aVar2) {
        this.f220381a = eVar;
        this.f220382b = r02;
        this.f220383c = aVar;
        this.f220384d = kVar;
        BannerStorage.Place place = BannerStorage.Place.f221758b;
        this.f220385e = new b(aVar2.f220360a, aVar2.f220361b, place, null);
    }

    @Y61.l
    public final Object a(@k V80.k kVar, @k Continuation<? super l> continuation) {
        return C43259k.g(this.f220382b.a(), new a(kVar, null), continuation);
    }
}
