package com.avito.android.early_access_advert.feedback_screen;

import Ca1.ViewOnTouchListenerC13234a;
import Cd.C13243a;
import Ux.C15581c;
import Ux.C15582d;
import Ux.InterfaceC15579a;
import Ux.InterfaceC15580b;
import Y41.l;
import Y41.p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EarlyAccessAdvertFeedbackScreen;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/EarlyAccessAdvertFeedbackFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessAdvertFeedbackFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.early_access_advert.feedback_screen.e f145622n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f145623o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f145624p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f145625q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f145626r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f145621t0 = {m0.f406844a.e(new Y(EarlyAccessAdvertFeedbackFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/early_access_advert/feedback_screen/EarlyAccessAdvertFeedbackViewHolder;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f145620s0 = new a(null);

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/EarlyAccessAdvertFeedbackFragment$a;", "", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC15580b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15580b interfaceC15580b) {
            com.avito.android.early_access_advert.h hVar;
            InterfaceC15580b interfaceC15580b2 = interfaceC15580b;
            EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment = (EarlyAccessAdvertFeedbackFragment) this.receiver;
            a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
            earlyAccessAdvertFeedbackFragment.getClass();
            boolean z12 = interfaceC15580b2 instanceof InterfaceC15580b.a;
            InterfaceC42726C interfaceC42726C = earlyAccessAdvertFeedbackFragment.f145625q0;
            if (z12) {
                com.avito.android.early_access_advert.h hVar2 = (com.avito.android.early_access_advert.h) interfaceC42726C.getValue();
                if (hVar2 != null) {
                    hVar2.o8();
                }
            } else if ((interfaceC15580b2 instanceof InterfaceC15580b.C1156b) && (hVar = (com.avito.android.early_access_advert.h) interfaceC42726C.getValue()) != null) {
                hVar.n8(((InterfaceC15580b.C1156b) interfaceC15580b2).f16787a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUx/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LUx/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<C15581c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C15581c c15581c) {
            a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
            C47313c c47313c = EarlyAccessAdvertFeedbackFragment.this.f145626r0;
            n<Object> nVar = EarlyAccessAdvertFeedbackFragment.f145621t0[0];
            com.avito.android.early_access_advert.feedback_screen.c cVar = (com.avito.android.early_access_advert.feedback_screen.c) c47313c.a();
            C15582d c15582d = c15581c.f16794f;
            I5.a(cVar.f145645b, c15582d.f16795a, false);
            I5.a(cVar.f145646c, c15582d.f16796b, false);
            I5.a(cVar.f145647d, c15582d.f16797c, false);
            Button button = cVar.f145649f;
            com.avito.android.lib.design.button.b.a(button, c15582d.f16800f, false);
            button.setVisibility(c15582d.f16802h ? 0 : 8);
            button.setLoading(c15582d.f16801g);
            String str = c15582d.f16798d;
            Input input = cVar.f145648e;
            input.setHint(str);
            String deformattedText = input.getDeformattedText();
            String str2 = c15582d.f16799e;
            if (!L.f(deformattedText, str2)) {
                Input.t(input, str2, false, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$onCreateView$3", f = "EarlyAccessAdvertFeedbackFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145628q;

        /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$onCreateView$3$1", f = "EarlyAccessAdvertFeedbackFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f145630q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ EarlyAccessAdvertFeedbackFragment f145631r;

            /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$onCreateView$3$1$1", f = "EarlyAccessAdvertFeedbackFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$d$a$a, reason: collision with other inner class name */
            public static final class C4234a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f145632q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ EarlyAccessAdvertFeedbackFragment f145633r;

                /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$onCreateView$3$1$1$1", f = "EarlyAccessAdvertFeedbackFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C4235a extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f145634q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ EarlyAccessAdvertFeedbackFragment f145635r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4235a(EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment, Continuation<? super C4235a> continuation) {
                        super(2, continuation);
                        this.f145635r = earlyAccessAdvertFeedbackFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        C4235a c4235a = new C4235a(this.f145635r, continuation);
                        c4235a.f145634q = obj;
                        return c4235a;
                    }

                    @Override // Y41.p
                    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
                        return ((C4235a) create(bool, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        C42729a0.b(obj);
                        Boolean bool = (Boolean) this.f145634q;
                        a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
                        ((com.avito.android.early_access_advert.feedback_screen.d) this.f145635r.f145623o0.getValue()).accept(new InterfaceC15579a.c(bool.booleanValue()));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4234a(EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment, Continuation<? super C4234a> continuation) {
                    super(2, continuation);
                    this.f145633r = earlyAccessAdvertFeedbackFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C4234a c4234a = new C4234a(this.f145633r, continuation);
                    c4234a.f145632q = obj;
                    return c4234a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4234a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    T t12 = (T) this.f145632q;
                    EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment = this.f145633r;
                    C43175k.K(new C43197r1(new C4235a(earlyAccessAdvertFeedbackFragment, null), y.a(K2.h(earlyAccessAdvertFeedbackFragment.requireActivity()))), t12);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f145631r = earlyAccessAdvertFeedbackFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f145631r, continuation);
                aVar.f145630q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((T) this.f145630q, null, null, new C4234a(this.f145631r, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EarlyAccessAdvertFeedbackFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145628q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment = EarlyAccessAdvertFeedbackFragment.this;
                a aVar = new a(earlyAccessAdvertFeedbackFragment, null);
                this.f145628q = 1;
                if (C23056p0.b(earlyAccessAdvertFeedbackFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/h;", "invoke", "()Lcom/avito/android/early_access_advert/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.early_access_advert.h> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.early_access_advert.h invoke() {
            InterfaceC23487e parentFragment = EarlyAccessAdvertFeedbackFragment.this.getParentFragment();
            if (parentFragment instanceof com.avito.android.early_access_advert.h) {
                return (com.avito.android.early_access_advert.h) parentFragment;
            }
            return null;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f145637l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f145637l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f145637l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EarlyAccessAdvertFeedbackFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f145639l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f145639l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f145639l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145640l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145640l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f145640l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145641l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145641l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f145641l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/early_access_advert/feedback_screen/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.early_access_advert.feedback_screen.d> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.early_access_advert.feedback_screen.d invoke() {
            com.avito.android.early_access_advert.feedback_screen.e eVar = EarlyAccessAdvertFeedbackFragment.this.f145622n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.early_access_advert.feedback_screen.d) eVar.get();
        }
    }

    public EarlyAccessAdvertFeedbackFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f145623o0 = new O0(m0.f406844a.b(com.avito.android.early_access_advert.feedback_screen.d.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f145625q0 = C42727D.c(new e());
        this.f145626r0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f145624p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.early_access_advert_feedback_fragment, viewGroup, false);
        com.avito.android.early_access_advert.feedback_screen.c cVar = new com.avito.android.early_access_advert.feedback_screen.c(viewInflate);
        C47313c c47313c = this.f145626r0;
        n<Object> nVar = f145621t0[0];
        c47313c.b(this, cVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f145624p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, (com.avito.android.early_access_advert.feedback_screen.d) this.f145623o0.getValue(), new b(1, this, EarlyAccessAdvertFeedbackFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackOneTimeEvent;)V", 0), new c());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145624p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C47313c c47313c = this.f145626r0;
        n<Object> nVar = f145621t0[0];
        com.avito.android.early_access_advert.feedback_screen.c cVar = (com.avito.android.early_access_advert.feedback_screen.c) c47313c.a();
        cVar.f145649f.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 4));
        com.avito.android.early_access_advert.feedback_screen.a aVar = new com.avito.android.early_access_advert.feedback_screen.a(this);
        Input input = cVar.f145648e;
        com.avito.android.lib.design.input.n.c(input, aVar);
        input.setOnFocusChangeListener(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.k(1));
        cVar.f145644a.setOnTouchListener(new ViewOnTouchListenerC13234a(cVar, 7));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("advert_id");
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        EarlyAccessFeedback earlyAccessFeedback = (EarlyAccessFeedback) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("early_access_feedback_key", EarlyAccessFeedback.class) : bundleRequireArguments.getParcelable("early_access_feedback_key"));
        Bundle bundleRequireArguments2 = requireArguments();
        com.avito.android.early_access_advert.di.b.a().a((com.avito.android.early_access_advert.di.e) C29972i.a(C29972i.b(this), com.avito.android.early_access_advert.di.e.class), new C28478k(EarlyAccessAdvertFeedbackScreen.f90345d, s.c(this), null, 4, null), string, (EarlyAccessAdvertFeedbackType) (i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("early_access_feedback_type_key", EarlyAccessAdvertFeedbackType.class) : bundleRequireArguments2.getParcelable("early_access_feedback_type_key")), earlyAccessFeedback).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145624p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
