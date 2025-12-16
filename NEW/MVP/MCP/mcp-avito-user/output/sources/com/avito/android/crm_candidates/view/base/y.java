package com.avito.android.crm_candidates.view.base;

import Vs.c;
import com.avito.android.crm_candidates.features.list_filter.entity.JobCrmListFilterState;
import com.avito.android.crm_candidates.features.list_filter.entity.ResetState;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$startListItemPickerFeature$4$1", f = "JobCrmCandidatesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f129945q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129946r;

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$startListItemPickerFeature$4$1$1", f = "JobCrmCandidatesFragment.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f129947q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JobCrmCandidatesFragment f129948r;

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.crm_candidates.view.base.y$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3854a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129949b;

            public C3854a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                this.f129949b = jobCrmCandidatesFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129949b;
                if (((Vs.c) obj) instanceof c.a) {
                    N0 n02 = jobCrmCandidatesFragment.f129803L0;
                    if (n02 != null) {
                        ((V0) n02).c(null);
                    }
                    com.avito.android.crm_candidates.view.dialogs.b bVar = jobCrmCandidatesFragment.f129804M0;
                    if (bVar != null) {
                        bVar.dismiss();
                    }
                    jobCrmCandidatesFragment.t5();
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f129949b, JobCrmCandidatesFragment.class, "handleListFilterEvent", "handleListFilterEvent(Lcom/avito/android/crm_candidates/features/list_filter/entity/JobCrmListFilterOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f129948r = jobCrmCandidatesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f129948r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f129947q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129948r;
                InterfaceC43160i<Vs.c> events = ((com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmCandidatesFragment.f129811s0.getValue()).getEvents();
                C3854a c3854a = new C3854a(jobCrmCandidatesFragment);
                this.f129947q = 1;
                if (events.collect(c3854a, this) == coroutine_suspended) {
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

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$startListItemPickerFeature$4$1$2", f = "JobCrmCandidatesFragment.kt", i = {}, l = {409}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f129950q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JobCrmCandidatesFragment f129951r;

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/entity/JobCrmListFilterState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/crm_candidates/features/list_filter/entity/JobCrmListFilterState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129952b;

            public a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                this.f129952b = jobCrmCandidatesFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                JobCrmListFilterState jobCrmListFilterState = (JobCrmListFilterState) obj;
                com.avito.android.crm_candidates.view.dialogs.b bVar = this.f129952b.f129804M0;
                if (bVar != null) {
                    if (jobCrmListFilterState.f129673c.isEmpty()) {
                        bVar.X();
                        bVar.W(false);
                        bVar.V(ResetState.f129677b);
                    } else {
                        bVar.Y(jobCrmListFilterState.f129674d);
                        bVar.W(jobCrmListFilterState.f129675e);
                        bVar.V(jobCrmListFilterState.f129676f);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f129951r = jobCrmCandidatesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f129951r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f129950q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129951r;
                n2<JobCrmListFilterState> state = ((com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmCandidatesFragment.f129811s0.getValue()).getState();
                a aVar = new a(jobCrmCandidatesFragment);
                this.f129950q = 1;
                if (state.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f129946r = jobCrmCandidatesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f129946r, continuation);
        yVar.f129945q = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f129945q;
        JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129946r;
        C43259k.d(t12, null, null, new a(jobCrmCandidatesFragment, null), 3);
        C43259k.d(t12, null, null, new b(jobCrmCandidatesFragment, null), 3);
        return G0.f406611a;
    }
}
