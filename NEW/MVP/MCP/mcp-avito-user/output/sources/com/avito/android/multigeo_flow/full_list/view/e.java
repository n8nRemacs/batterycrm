package com.avito.android.multigeo_flow.full_list.view;

import Q20.a;
import Q20.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import java.io.Serializable;
import java.util.List;
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
import kotlin.jvm.internal.D;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;

/* compiled from: JobMultiGeoFullListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment$subscribeToFeature$1", f = "JobMultiGeoFullListFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206954q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoFullListFragment f206955r;

    /* compiled from: JobMultiGeoFullListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment$subscribeToFeature$1$1", f = "JobMultiGeoFullListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f206956q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JobMultiGeoFullListFragment f206957r;

        /* compiled from: JobMultiGeoFullListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment$subscribeToFeature$1$1$1", f = "JobMultiGeoFullListFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.multigeo_flow.full_list.view.e$a$a, reason: collision with other inner class name */
        public static final class C6167a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f206958q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobMultiGeoFullListFragment f206959r;

            /* compiled from: JobMultiGeoFullListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.multigeo_flow.full_list.view.e$a$a$a, reason: collision with other inner class name */
            public static final class C6168a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ JobMultiGeoFullListFragment f206960b;

                public C6168a(JobMultiGeoFullListFragment jobMultiGeoFullListFragment) {
                    this.f206960b = jobMultiGeoFullListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    final int i12 = 0;
                    final int i13 = 1;
                    JobMultiGeoState jobMultiGeoState = (JobMultiGeoState) obj;
                    JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
                    final JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206960b;
                    boolean z12 = jobMultiGeoState.f207003f;
                    List<AddressItem> list = jobMultiGeoState.f207001d;
                    if (z12) {
                        D6.w(jobMultiGeoFullListFragment.f206931u0);
                        D6.H(jobMultiGeoFullListFragment.f206932v0);
                    } else {
                        D6.H(jobMultiGeoFullListFragment.f206931u0);
                        D6.w(jobMultiGeoFullListFragment.f206932v0);
                        Integer num = jobMultiGeoFullListFragment.q5().f206945f;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Button button = jobMultiGeoFullListFragment.f206930t0;
                            if (button != null) {
                                button.setEnabled(list.size() < iIntValue);
                            }
                        }
                    }
                    com.avito.konveyor.adapter.d dVar = jobMultiGeoFullListFragment.f206925o0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(list, null);
                    ActivityC22955m activityC22955mRequireActivity = jobMultiGeoFullListFragment.requireActivity();
                    Intent intent = new Intent();
                    intent.putExtra("ARG_RESULT_JWT", jobMultiGeoState.f206999b);
                    G0 g02 = G0.f406611a;
                    activityC22955mRequireActivity.setResult(-1, intent);
                    View view = jobMultiGeoFullListFragment.f206929s0;
                    if (view != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.multigeo_flow.full_list.view.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                JobMultiGeoFullListFragment jobMultiGeoFullListFragment2 = jobMultiGeoFullListFragment;
                                switch (i12) {
                                    case 0:
                                        JobMultiGeoFullListFragment.a aVar2 = JobMultiGeoFullListFragment.f206922x0;
                                        jobMultiGeoFullListFragment2.r5().accept(a.d.f13426a);
                                        break;
                                    default:
                                        JobMultiGeoFullListFragment.a aVar3 = JobMultiGeoFullListFragment.f206922x0;
                                        jobMultiGeoFullListFragment2.r5().accept(a.b.f13424a);
                                        break;
                                }
                            }
                        });
                    }
                    Button button2 = jobMultiGeoFullListFragment.f206930t0;
                    if (button2 != null) {
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.multigeo_flow.full_list.view.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                JobMultiGeoFullListFragment jobMultiGeoFullListFragment2 = jobMultiGeoFullListFragment;
                                switch (i13) {
                                    case 0:
                                        JobMultiGeoFullListFragment.a aVar2 = JobMultiGeoFullListFragment.f206922x0;
                                        jobMultiGeoFullListFragment2.r5().accept(a.d.f13426a);
                                        break;
                                    default:
                                        JobMultiGeoFullListFragment.a aVar3 = JobMultiGeoFullListFragment.f206922x0;
                                        jobMultiGeoFullListFragment2.r5().accept(a.b.f13424a);
                                        break;
                                }
                            }
                        });
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6167a(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, Continuation<? super C6167a> continuation) {
                super(2, continuation);
                this.f206959r = jobMultiGeoFullListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C6167a(this.f206959r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C6167a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f206958q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
                    JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206959r;
                    n2<JobMultiGeoState> state = jobMultiGeoFullListFragment.r5().getState();
                    C6168a c6168a = new C6168a(jobMultiGeoFullListFragment);
                    this.f206958q = 1;
                    if (state.collect(c6168a, this) == coroutine_suspended) {
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

        /* compiled from: JobMultiGeoFullListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment$subscribeToFeature$1$1$2", f = "JobMultiGeoFullListFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f206961q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobMultiGeoFullListFragment f206962r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f206962r = jobMultiGeoFullListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f206962r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f206961q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f206961q = 1;
                    JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206962r;
                    com.avito.android.deeplink_handler.handler.composite.a aVar = jobMultiGeoFullListFragment.f206926p0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    Object objCollect = ((AbstractC43168f) y.a(aVar.d9())).collect(new com.avito.android.multigeo_flow.full_list.view.b(jobMultiGeoFullListFragment), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect == coroutine_suspended) {
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

        /* compiled from: JobMultiGeoFullListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment$subscribeToFeature$1$1$3", f = "JobMultiGeoFullListFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f206963q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobMultiGeoFullListFragment f206964r;

            /* compiled from: JobMultiGeoFullListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.multigeo_flow.full_list.view.e$a$c$a, reason: collision with other inner class name */
            public /* synthetic */ class C6169a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ JobMultiGeoFullListFragment f206965b;

                public C6169a(JobMultiGeoFullListFragment jobMultiGeoFullListFragment) {
                    this.f206965b = jobMultiGeoFullListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Q20.b bVar = (Q20.b) obj;
                    JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
                    JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206965b;
                    if (bVar instanceof b.d) {
                        com.avito.android.user_address.e.b(jobMultiGeoFullListFragment.requireView(), null, ((b.d) bVar).f13434a, jobMultiGeoFullListFragment.getResources().getString(R.string.multigeo_address_added));
                    } else if (bVar instanceof b.f) {
                        com.avito.android.user_address.e.b(jobMultiGeoFullListFragment.requireView(), null, ((b.f) bVar).f13436a, jobMultiGeoFullListFragment.getResources().getString(R.string.multigeo_address_edited));
                    } else if (bVar instanceof b.e) {
                        com.avito.android.user_address.e.b(jobMultiGeoFullListFragment.requireView(), null, ((b.e) bVar).f13435a, jobMultiGeoFullListFragment.getResources().getString(R.string.multigeo_address_deleted));
                    } else if (bVar instanceof b.g) {
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.error_text, new Serializable[0]);
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.c(cVar, jobMultiGeoFullListFragment, printableTextC, null, null, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                    } else if (bVar instanceof b.a) {
                        jobMultiGeoFullListFragment.requireActivity().getF21241d().c();
                    } else if (bVar instanceof b.C0882b) {
                        com.avito.android.multigeo_flow.edit_address.a aVar2 = jobMultiGeoFullListFragment.f206933w0;
                        if (aVar2 != null) {
                            aVar2.r();
                        }
                    } else if (bVar instanceof b.c) {
                        AddressItem addressItem = ((b.c) bVar).f13433a;
                        com.avito.android.multigeo_flow.edit_address.a aVar3 = new com.avito.android.multigeo_flow.edit_address.a(jobMultiGeoFullListFragment.requireContext(), addressItem, new com.avito.android.multigeo_flow.full_list.view.c(jobMultiGeoFullListFragment, addressItem), new d(jobMultiGeoFullListFragment, addressItem), null, 16, null);
                        jobMultiGeoFullListFragment.f206933w0 = aVar3;
                        com.avito.android.lib.util.g.a(aVar3);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f206965b, JobMultiGeoFullListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/multigeo_flow/mvi/entity/OneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f206964r = jobMultiGeoFullListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new c(this.f206964r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f206963q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
                    JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206964r;
                    InterfaceC43160i<Q20.b> events = jobMultiGeoFullListFragment.r5().getEvents();
                    C6169a c6169a = new C6169a(jobMultiGeoFullListFragment);
                    this.f206963q = 1;
                    if (events.collect(c6169a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206957r = jobMultiGeoFullListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f206957r, continuation);
            aVar.f206956q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f206956q;
            JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206957r;
            C43259k.d(t12, null, null, new C6167a(jobMultiGeoFullListFragment, null), 3);
            C43259k.d(t12, null, null, new b(jobMultiGeoFullListFragment, null), 3);
            C43259k.d(t12, null, null, new c(jobMultiGeoFullListFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f206955r = jobMultiGeoFullListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f206955r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206954q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46681d;
            JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206955r;
            a aVar = new a(jobMultiGeoFullListFragment, null);
            this.f206954q = 1;
            if (C23056p0.b(jobMultiGeoFullListFragment, state, aVar, this) == coroutine_suspended) {
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
