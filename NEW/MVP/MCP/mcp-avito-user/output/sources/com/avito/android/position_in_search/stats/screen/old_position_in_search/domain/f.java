package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain;

import V80.c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ActionType;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.SortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PositionInfoByPeriodInteractor.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e, com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f220367a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<P80.a> f220368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final KO.a f220369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f220370d;

    /* compiled from: PositionInfoByPeriodInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LV80/j;", "<anonymous>", "(Lkotlinx/coroutines/T;)LV80/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoByPeriodInteractorImpl$info$2", f = "PositionInfoByPeriodInteractor.kt", i = {0}, l = {52, 53}, m = "invokeSuspend", n = {"closedBanners"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super V80.j>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220371q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220372r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V80.i f220374t;

        /* compiled from: PositionInfoByPeriodInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LV80/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)LV80/c;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoByPeriodInteractorImpl$info$2$closedBanners$1", f = "PositionInfoByPeriodInteractor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f$a$a, reason: collision with other inner class name */
        public static final class C6627a extends SuspendLambda implements p<T, Continuation<? super V80.c>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220375q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f f220376r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ V80.i f220377s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6627a(f fVar, V80.i iVar, Continuation<? super C6627a> continuation) {
                super(2, continuation);
                this.f220376r = fVar;
                this.f220377s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C6627a(this.f220376r, this.f220377s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super V80.c> continuation) {
                return ((C6627a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220375q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    f fVar = this.f220376r;
                    fVar.getClass();
                    if (this.f220377s.f16975c != null) {
                        return c.a.f16941a;
                    }
                    this.f220375q = 1;
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b bVar = fVar.f220370d;
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
                return new c.b((Set) obj);
            }
        }

        /* compiled from: PositionInfoByPeriodInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LQ80/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.PositionInfoByPeriodInteractorImpl$info$2$response$1", f = "PositionInfoByPeriodInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<Q80.d>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220378q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f f220379r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ V80.i f220380s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, V80.i iVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f220379r = fVar;
                this.f220380s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f220379r, this.f220380s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<Q80.d>> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                ActionType actionType;
                SortDirection sortDirection;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220378q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    P80.a aVar = this.f220379r.f220368b.get();
                    V80.i iVar = this.f220380s;
                    int iOrdinal = iVar.f16976d.ordinal();
                    if (iOrdinal == 0) {
                        actionType = ActionType.Init;
                    } else if (iOrdinal == 1) {
                        actionType = ActionType.PeriodChange;
                    } else if (iOrdinal == 2) {
                        actionType = ActionType.QueriesPortion;
                    } else {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        actionType = ActionType.QueriesSorting;
                    }
                    ActionType actionType2 = actionType;
                    PeriodSortDirection periodSortDirection = iVar.f16978f;
                    if (periodSortDirection != null) {
                        int iOrdinal2 = periodSortDirection.ordinal();
                        if (iOrdinal2 == 0) {
                            sortDirection = SortDirection.Asc;
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sortDirection = SortDirection.Desc;
                        }
                    } else {
                        sortDirection = null;
                    }
                    SortDirection sortDirection2 = sortDirection;
                    this.f220378q = 1;
                    obj = aVar.a(iVar.f16973a, iVar.f16974b, iVar.f16975c, actionType2, iVar.f16977e, sortDirection2, this);
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
        public a(V80.i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f220374t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f220374t, continuation);
            aVar.f220372r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super V80.j> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final java.lang.Object invokeSuspend(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
    }

    @Inject
    public f(@k R0 r02, @k h31.e<P80.a> eVar, @k KO.a aVar, @k b.a aVar2) {
        this.f220367a = r02;
        this.f220368b = eVar;
        this.f220369c = aVar;
        BannerStorage.Place place = BannerStorage.Place.f221759c;
        this.f220370d = new b(aVar2.f220360a, aVar2.f220361b, place, null);
    }

    @l
    public final Object a(@k V80.i iVar, @k Continuation<? super V80.j> continuation) {
        return C43259k.g(this.f220367a.a(), new a(iVar, null), continuation);
    }
}
