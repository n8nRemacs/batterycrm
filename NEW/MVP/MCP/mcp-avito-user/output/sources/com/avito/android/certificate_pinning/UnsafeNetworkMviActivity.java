package com.avito.android.certificate_pinning;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import com.avito.android.certificate_pinning.perf_cost.UnsafeNetworkScreen;
import com.avito.android.certificate_pinning.t;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35853n2;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import ho.InterfaceC40967c;
import io.InterfaceC41432a;
import io.InterfaceC41433b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: UnsafeNetworkMviActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/certificate_pinning/UnsafeNetworkMviActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnsafeNetworkMviActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f117755q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C35853n2 f117756m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public t.a f117757n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f117758o = new O0(m0.f406844a.b(t.class), new e(), new d(new g()), new f());

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f117759p;

    /* compiled from: UnsafeNetworkMviActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$onCreate$1", f = "UnsafeNetworkMviActivity.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f117760q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ s f117762s;

        /* compiled from: UnsafeNetworkMviActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$onCreate$1$1", f = "UnsafeNetworkMviActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$a$a, reason: collision with other inner class name */
        public static final class C3422a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f117763q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ s f117764r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ UnsafeNetworkMviActivity f117765s;

            /* compiled from: UnsafeNetworkMviActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$onCreate$1$1$1", f = "UnsafeNetworkMviActivity.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$a$a$a, reason: collision with other inner class name */
            public static final class C3423a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f117766q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ s f117767r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ UnsafeNetworkMviActivity f117768s;

                /* compiled from: UnsafeNetworkMviActivity.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C3424a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UnsafeNetworkMviActivity f117769b;

                    public C3424a(UnsafeNetworkMviActivity unsafeNetworkMviActivity) {
                        this.f117769b = unsafeNetworkMviActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        int i12 = UnsafeNetworkMviActivity.f117755q;
                        ((t) this.f117769b.f117758o.getValue()).accept(InterfaceC41432a.b.f398769a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3423a(UnsafeNetworkMviActivity unsafeNetworkMviActivity, s sVar, Continuation continuation) {
                    super(2, continuation);
                    this.f117767r = sVar;
                    this.f117768s = unsafeNetworkMviActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3423a(this.f117768s, this.f117767r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3423a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f117766q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43160i interfaceC43160iA = y.a(com.avito.android.lib.deprecated_design.button.g.a(this.f117767r.f117862g));
                        C3424a c3424a = new C3424a(this.f117768s);
                        this.f117766q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c3424a, this) == coroutine_suspended) {
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

            /* compiled from: UnsafeNetworkMviActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$onCreate$1$1$2", f = "UnsafeNetworkMviActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f117770q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ s f117771r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ UnsafeNetworkMviActivity f117772s;

                /* compiled from: UnsafeNetworkMviActivity.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.certificate_pinning.UnsafeNetworkMviActivity$a$a$b$a, reason: collision with other inner class name */
                public static final class C3425a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UnsafeNetworkMviActivity f117773b;

                    public C3425a(UnsafeNetworkMviActivity unsafeNetworkMviActivity) {
                        this.f117773b = unsafeNetworkMviActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        int i12 = UnsafeNetworkMviActivity.f117755q;
                        ((t) this.f117773b.f117758o.getValue()).accept(InterfaceC41432a.C11394a.f398768a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(UnsafeNetworkMviActivity unsafeNetworkMviActivity, s sVar, Continuation continuation) {
                    super(2, continuation);
                    this.f117771r = sVar;
                    this.f117772s = unsafeNetworkMviActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f117772s, this.f117771r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f117770q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43160i interfaceC43160iA = y.a(com.avito.android.lib.deprecated_design.button.g.a(this.f117771r.f117863h));
                        C3425a c3425a = new C3425a(this.f117772s);
                        this.f117770q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c3425a, this) == coroutine_suspended) {
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
            public C3422a(UnsafeNetworkMviActivity unsafeNetworkMviActivity, s sVar, Continuation continuation) {
                super(2, continuation);
                this.f117764r = sVar;
                this.f117765s = unsafeNetworkMviActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C3422a c3422a = new C3422a(this.f117765s, this.f117764r, continuation);
                c3422a.f117763q = obj;
                return c3422a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3422a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f117763q;
                s sVar = this.f117764r;
                UnsafeNetworkMviActivity unsafeNetworkMviActivity = this.f117765s;
                C43259k.d(t12, null, null, new C3423a(unsafeNetworkMviActivity, sVar, null), 3);
                C43259k.d(t12, null, null, new b(unsafeNetworkMviActivity, sVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f117762s = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return UnsafeNetworkMviActivity.this.new a(this.f117762s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f117760q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                s sVar = this.f117762s;
                UnsafeNetworkMviActivity unsafeNetworkMviActivity = UnsafeNetworkMviActivity.this;
                C3422a c3422a = new C3422a(unsafeNetworkMviActivity, sVar, null);
                this.f117760q = 1;
                if (C23056p0.b(unsafeNetworkMviActivity, state, c3422a, this) == coroutine_suspended) {
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

    /* compiled from: UnsafeNetworkMviActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC41433b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC41433b interfaceC41433b) {
            InterfaceC41433b interfaceC41433b2 = interfaceC41433b;
            UnsafeNetworkMviActivity unsafeNetworkMviActivity = (UnsafeNetworkMviActivity) this.receiver;
            int i12 = UnsafeNetworkMviActivity.f117755q;
            unsafeNetworkMviActivity.getClass();
            if (interfaceC41433b2 instanceof InterfaceC41433b.C11395b) {
                InterfaceC41433b.C11395b c11395b = (InterfaceC41433b.C11395b) interfaceC41433b2;
                C35853n2 c35853n2 = unsafeNetworkMviActivity.f117756m;
                if (c35853n2 == null) {
                    c35853n2 = null;
                }
                Intent intentT = c35853n2.t(Uri.parse(c11395b.f398771a));
                C35974x2.d(intentT);
                try {
                    unsafeNetworkMviActivity.startActivity(intentT);
                } catch (Exception unused) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, unsafeNetworkMviActivity.findViewById(R.id.container), com.avito.android.printable_text.a.a(R.string.no_application_installed_to_perform_this_action), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                }
            } else if (interfaceC41433b2 instanceof InterfaceC41433b.a) {
                unsafeNetworkMviActivity.finish();
            } else if (interfaceC41433b2 instanceof InterfaceC41433b.c) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, unsafeNetworkMviActivity.findViewById(R.id.container), ((InterfaceC41433b.c) interfaceC41433b2).f398772a, null, null, null, null, 0, null, null, false, false, null, null, 4094);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UnsafeNetworkMviActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<UnsafeNetworkState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f117774l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar) {
            super(1);
            this.f117774l = sVar;
        }

        @Override // Y41.l
        public final G0 invoke(UnsafeNetworkState unsafeNetworkState) {
            UnsafeNetworkState unsafeNetworkState2 = unsafeNetworkState;
            s sVar = this.f117774l;
            View view = sVar.f117858c;
            if (unsafeNetworkState2.f117818d) {
                D6.H(view);
            } else {
                D6.w(view);
            }
            UnsafeNetworkState.ViewState viewState = unsafeNetworkState2.f117819e;
            if (viewState instanceof UnsafeNetworkState.ViewState.UnsafeNetwork) {
                sVar.b();
            } else if (viewState instanceof UnsafeNetworkState.ViewState.AuthorizationRequired) {
                sVar.a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f117776m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f117776m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(UnsafeNetworkMviActivity.this, this.f117776m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return UnsafeNetworkMviActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return UnsafeNetworkMviActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: UnsafeNetworkMviActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/certificate_pinning/t;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/certificate_pinning/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<C23060r0, t> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final t invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            t.a aVar = UnsafeNetworkMviActivity.this.f117757n;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((InterfaceC40967c.a) C29972i.a(C29972i.b(this), InterfaceC40967c.a.class)).fe().a(new C28478k(UnsafeNetworkScreen.f117854d, com.avito.android.analytics.screens.s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f117759p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        ((t) this.f117758o.getValue()).accept(InterfaceC41432a.b.f398769a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f117759p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.unsafe_network_screen);
        s sVar = new s(findViewById(R.id.container));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new a(sVar, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f117759p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (t) this.f117758o.getValue(), new b(1, this, UnsafeNetworkMviActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkOneTimeEvent;)V", 0), new c(sVar));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f117759p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
