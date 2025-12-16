package com.avito.android.onboarding.dialog;

import C40.b;
import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.OnboardingDialogScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogState;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import iR.C41336a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: OnboardingDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/dialog/OnboardingDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f208709q0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding.dialog.f f208710h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f208711i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f208712j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public A40.a f208713k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public D40.e f208714l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f208715m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public x f208716n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public R0 f208717o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public com.avito.android.onboarding.dialog.b f208718p0;

    /* compiled from: OnboardingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/OnboardingDialogFragment$a;", "", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: OnboardingDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.onboarding.dialog.OnboardingDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C6225a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f208719l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f208720m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f208721n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f208722o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6225a(String str, String str2, String str3, String str4) {
                super(1);
                this.f208719l = str;
                this.f208720m = str2;
                this.f208721n = str3;
                this.f208722o = str4;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("onboarding_id", this.f208719l);
                bundle2.putString("location_id", this.f208720m);
                bundle2.putString("event_encoded", this.f208721n);
                bundle2.putString("onboarding_context", this.f208722o);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static OnboardingDialogFragment a(@l String str, @l String str2, @l String str3, @l String str4) {
            OnboardingDialogFragment onboardingDialogFragment = new OnboardingDialogFragment();
            C35966w1.a(onboardingDialogFragment, 1, new C6225a(str, str2, str3, str4));
            return onboardingDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: OnboardingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.OnboardingDialogFragment$onCreateView$1", f = "OnboardingDialogFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208723q;

        /* compiled from: OnboardingDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.onboarding.dialog.OnboardingDialogFragment$onCreateView$1$1", f = "OnboardingDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f208725q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ OnboardingDialogFragment f208726r;

            /* compiled from: OnboardingDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.onboarding.dialog.OnboardingDialogFragment$onCreateView$1$1$1", f = "OnboardingDialogFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.onboarding.dialog.OnboardingDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C6226a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f208727q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ OnboardingDialogFragment f208728r;

                /* compiled from: OnboardingDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.onboarding.dialog.OnboardingDialogFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C6227a extends N implements Y41.l<OnboardingDialogState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ OnboardingDialogFragment f208729l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6227a(OnboardingDialogFragment onboardingDialogFragment) {
                        super(1);
                        this.f208729l = onboardingDialogFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(OnboardingDialogState onboardingDialogState) throws Resources.NotFoundException {
                        com.avito.android.onboarding.dialog.b bVar;
                        a aVar = OnboardingDialogFragment.f208709q0;
                        OnboardingDialogFragment onboardingDialogFragment = this.f208729l;
                        OnboardingResultItem onboardingResultItem = onboardingDialogState.f208912c;
                        if (onboardingResultItem != null && (bVar = onboardingDialogFragment.f208718p0) != null) {
                            boolean z12 = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultPreviewItem;
                            boolean z13 = bVar.getContext().getResources().getBoolean(R.bool.is_tablet);
                            boolean z14 = bVar.f208752J;
                            D40.e eVar = bVar.f208748F;
                            if (z14 && !z13 && z12) {
                                eVar.a();
                                bVar.dismiss();
                            } else {
                                ViewGroup viewGroup = bVar.f208749G;
                                if (viewGroup != null) {
                                    viewGroup.performHapticFeedback(17);
                                }
                                eVar.d(viewGroup, bVar, z14);
                                eVar.c(onboardingResultItem);
                                D6.w(bVar.f208751I);
                                D6.w(bVar.f208750H);
                                com.avito.android.lib.util.g.a(bVar);
                                bVar.s();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6226a(OnboardingDialogFragment onboardingDialogFragment, Continuation<? super C6226a> continuation) {
                    super(2, continuation);
                    this.f208728r = onboardingDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C6226a(this.f208728r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6226a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f208727q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = OnboardingDialogFragment.f208709q0;
                        OnboardingDialogFragment onboardingDialogFragment = this.f208728r;
                        n2<OnboardingDialogState> state = ((com.avito.android.onboarding.dialog.e) onboardingDialogFragment.f208711i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = onboardingDialogFragment.f208712j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6227a c6227a = new C6227a(onboardingDialogFragment);
                        this.f208727q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6227a, this) == coroutine_suspended) {
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

            /* compiled from: OnboardingDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.onboarding.dialog.OnboardingDialogFragment$onCreateView$1$1$2", f = "OnboardingDialogFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.onboarding.dialog.OnboardingDialogFragment$b$a$b, reason: collision with other inner class name */
            public static final class C6228b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f208730q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ OnboardingDialogFragment f208731r;

                /* compiled from: OnboardingDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.onboarding.dialog.OnboardingDialogFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6229a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OnboardingDialogFragment f208732b;

                    public C6229a(OnboardingDialogFragment onboardingDialogFragment) {
                        this.f208732b = onboardingDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C40.b bVar = (C40.b) obj;
                        a aVar = OnboardingDialogFragment.f208709q0;
                        OnboardingDialogFragment onboardingDialogFragment = this.f208732b;
                        if (bVar instanceof b.a) {
                            C41336a.C11375a.a();
                            onboardingDialogFragment.dismiss();
                        } else if (bVar instanceof b.e) {
                            String str = ((b.e) bVar).f1921a;
                            Fragment parentFragment = onboardingDialogFragment.getParentFragment();
                            if (parentFragment != null) {
                                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, parentFragment, com.avito.android.printable_text.b.f(str), null, null, null, 0, ToastBarPosition.f181046d, 958);
                            }
                        } else if (bVar instanceof b.d) {
                            String str2 = ((b.d) bVar).f1920a;
                            Fragment parentFragment2 = onboardingDialogFragment.getParentFragment();
                            if (parentFragment2 != null) {
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                                f.c.f125255c.getClass();
                                com.avito.android.component.toast.c.c(cVar, parentFragment2, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
                            }
                        } else if (bVar instanceof b.f) {
                            com.avito.android.onboarding.dialog.b bVar2 = onboardingDialogFragment.f208718p0;
                            if (bVar2 != null) {
                                bVar2.f208748F.b();
                            }
                        } else if (bVar instanceof b.g) {
                            com.avito.android.onboarding.dialog.b bVar3 = onboardingDialogFragment.f208718p0;
                            if (bVar3 != null) {
                                bVar3.f208748F.f();
                            }
                        } else if (bVar instanceof b.h) {
                            com.avito.android.onboarding.dialog.b bVar4 = onboardingDialogFragment.f208718p0;
                            if (bVar4 != null) {
                                bVar4.f208748F.e();
                            }
                        } else if (bVar instanceof b.C0089b) {
                            OnboardingDialogFragment.f5(onboardingDialogFragment, ((b.C0089b) bVar).f1918a, null, 2);
                            C41336a.C11375a.a();
                            onboardingDialogFragment.dismiss();
                        } else if (bVar instanceof b.c) {
                            Uri uri = ((b.c) bVar).f1919a;
                            C41336a.C11375a.a();
                            x xVar = onboardingDialogFragment.f208716n0;
                            if (xVar == null) {
                                xVar = null;
                            }
                            DeepLink deepLinkE = xVar.e(uri);
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = onboardingDialogFragment.f208715m0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, deepLinkE, null, null, 6);
                        } else if (bVar instanceof b.i) {
                            OnboardingDialogFragment.f5(onboardingDialogFragment, null, ((b.i) bVar).f1925a, 1);
                            C41336a.C11375a.a();
                            onboardingDialogFragment.dismiss();
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
                        return new C42801a(2, this.f208732b, OnboardingDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6228b(OnboardingDialogFragment onboardingDialogFragment, Continuation<? super C6228b> continuation) {
                    super(2, continuation);
                    this.f208731r = onboardingDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C6228b(this.f208731r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6228b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f208730q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = OnboardingDialogFragment.f208709q0;
                        OnboardingDialogFragment onboardingDialogFragment = this.f208731r;
                        InterfaceC43160i<C40.b> events = ((com.avito.android.onboarding.dialog.e) onboardingDialogFragment.f208711i0.getValue()).getEvents();
                        C6229a c6229a = new C6229a(onboardingDialogFragment);
                        this.f208730q = 1;
                        if (events.collect(c6229a, this) == coroutine_suspended) {
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
            public a(OnboardingDialogFragment onboardingDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f208726r = onboardingDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f208726r, continuation);
                aVar.f208725q = obj;
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
                T t12 = (T) this.f208725q;
                OnboardingDialogFragment onboardingDialogFragment = this.f208726r;
                R0 r02 = onboardingDialogFragment.f208717o0;
                if (r02 == null) {
                    r02 = null;
                }
                C43259k.d(t12, r02.b(), null, new C6226a(onboardingDialogFragment, null), 2);
                R0 r03 = onboardingDialogFragment.f208717o0;
                if (r03 == null) {
                    r03 = null;
                }
                C43259k.d(t12, r03.b(), null, new C6228b(onboardingDialogFragment, null), 2);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return OnboardingDialogFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208723q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                OnboardingDialogFragment onboardingDialogFragment = OnboardingDialogFragment.this;
                a aVar = new a(onboardingDialogFragment, null);
                this.f208723q = 1;
                if (C23056p0.b(onboardingDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: OnboardingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC40/a;", "it", "Lkotlin/G0;", "invoke", "(LC40/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C40.a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C40.a aVar) {
            a aVar2 = OnboardingDialogFragment.f208709q0;
            ((com.avito.android.onboarding.dialog.e) OnboardingDialogFragment.this.f208711i0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f208734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f208734l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f208734l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return OnboardingDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f208736l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f208736l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f208736l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f208737l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f208737l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f208737l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f208738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f208738l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f208738l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: OnboardingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/onboarding/dialog/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.onboarding.dialog.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.onboarding.dialog.e invoke() {
            com.avito.android.onboarding.dialog.f fVar = OnboardingDialogFragment.this.f208710h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.onboarding.dialog.e) fVar.get();
        }
    }

    public OnboardingDialogFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f208711i0 = new O0(m0.f406844a.b(com.avito.android.onboarding.dialog.e.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    public static void f5(OnboardingDialogFragment onboardingDialogFragment, Uri uri, ToastMessageLink toastMessageLink, int i12) {
        if ((i12 & 1) != 0) {
            uri = null;
        }
        if ((i12 & 2) != 0) {
            toastMessageLink = null;
        }
        String tag = onboardingDialogFragment.getTag();
        if (tag == null) {
            tag = "";
        }
        Bundle bundle = new Bundle(1);
        if (uri != null) {
            bundle.putParcelable("key_onboarding_uri", uri);
        }
        if (toastMessageLink != null) {
            bundle.putParcelable("key_onboarding_toast_link", toastMessageLink);
        }
        Bundle arguments = onboardingDialogFragment.getArguments();
        bundle.putString("key_onboarding_id", arguments != null ? arguments.getString("onboarding_id") : null);
        Bundle arguments2 = onboardingDialogFragment.getArguments();
        bundle.putString("key_onboarding_context", arguments2 != null ? arguments2.getString("onboarding_context") : null);
        onboardingDialogFragment.getParentFragmentManager().o0(bundle, tag);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("location_id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("onboarding_id") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("event_encoded") : null;
        Bundle arguments4 = getArguments();
        com.avito.android.onboarding.dialog.di.a.a().a(string2, string, string3, arguments4 != null ? arguments4.getString("onboarding_context") : null, getResources(), new c(), new C28478k(OnboardingDialogScreen.f90437d, s.b(this), null, 4, null), (com.avito.android.onboarding.dialog.di.g) C29972i.a(C29972i.b(this), com.avito.android.onboarding.dialog.di.g.class), cv.c.b(this), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208712j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f208712j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Context contextRequireContext = requireContext();
        int theme = getTheme();
        A40.a aVar = this.f208713k0;
        if (aVar == null) {
            aVar = null;
        }
        D40.e eVar = this.f208714l0;
        com.avito.android.onboarding.dialog.b bVar = new com.avito.android.onboarding.dialog.b(contextRequireContext, theme, aVar, eVar != null ? eVar : null);
        this.f208718p0 = bVar;
        return bVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (((com.avito.android.onboarding.dialog.e) this.f208711i0.getValue()).getState().getValue().f208913d) {
            f5(this, null, null, 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208712j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
