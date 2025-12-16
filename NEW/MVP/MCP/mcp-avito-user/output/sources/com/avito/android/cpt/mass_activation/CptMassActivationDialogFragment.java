package com.avito.android.cpt.mass_activation;

import Cd.C13243a;
import Nr.InterfaceC14604a;
import Rh.C15041a;
import Vr.InterfaceC15709a;
import Vr.InterfaceC15710b;
import Wr.C15792a;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment;
import com.avito.android.cpt.mass_activation.di.a;
import com.avito.android.cpt.mass_activation.di.o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: CptMassActivationDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/mass_activation/CptMassActivationDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CptMassActivationDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f126412x0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.cpt.mass_activation.g f126413h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f126414i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f126415j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f126416k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126417l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f126418m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f126419n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f126420o0;

    /* renamed from: p0, reason: collision with root package name */
    public RecyclerView f126421p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f126422q0;

    /* renamed from: r0, reason: collision with root package name */
    public Button f126423r0;

    /* renamed from: s0, reason: collision with root package name */
    public TextView f126424s0;

    /* renamed from: t0, reason: collision with root package name */
    public View f126425t0;

    /* renamed from: u0, reason: collision with root package name */
    public TextView f126426u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public Pr.c f126427v0;

    /* renamed from: w0, reason: collision with root package name */
    public final int f126428w0;

    /* compiled from: CptMassActivationDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpt/mass_activation/CptMassActivationDialogFragment$a;", "", "<init>", "()V", "", "KEY_ITEM_IDS", "Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptMassActivationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$onCreateDialog$1", f = "CptMassActivationDialogFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f126429q;

        /* compiled from: CptMassActivationDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$onCreateDialog$1$1", f = "CptMassActivationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f126431q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CptMassActivationDialogFragment f126432r;

            /* compiled from: CptMassActivationDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$onCreateDialog$1$1$1", f = "CptMassActivationDialogFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C3754a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126433q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CptMassActivationDialogFragment f126434r;

                /* compiled from: CptMassActivationDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3755a extends H implements Y41.l<Vr.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(Vr.c cVar) {
                        Vr.c cVar2 = cVar;
                        CptMassActivationDialogFragment cptMassActivationDialogFragment = (CptMassActivationDialogFragment) this.receiver;
                        a aVar = CptMassActivationDialogFragment.f126412x0;
                        cptMassActivationDialogFragment.getClass();
                        if (cVar2.f17434b) {
                            View view = cptMassActivationDialogFragment.f126425t0;
                            if (view == null) {
                                view = null;
                            }
                            D6.w(view);
                            View view2 = cptMassActivationDialogFragment.f126420o0;
                            if (view2 == null) {
                                view2 = null;
                            }
                            D6.H(view2);
                            RecyclerView recyclerView = cptMassActivationDialogFragment.f126421p0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            D6.w(recyclerView);
                            View view3 = cptMassActivationDialogFragment.f126422q0;
                            D6.w(view3 != null ? view3 : null);
                        } else {
                            ApiException apiException = cVar2.f17435c;
                            if (apiException != null) {
                                View view4 = cptMassActivationDialogFragment.f126425t0;
                                if (view4 == null) {
                                    view4 = null;
                                }
                                D6.H(view4);
                                View view5 = cptMassActivationDialogFragment.f126420o0;
                                if (view5 == null) {
                                    view5 = null;
                                }
                                D6.w(view5);
                                RecyclerView recyclerView2 = cptMassActivationDialogFragment.f126421p0;
                                if (recyclerView2 == null) {
                                    recyclerView2 = null;
                                }
                                D6.w(recyclerView2);
                                View view6 = cptMassActivationDialogFragment.f126422q0;
                                if (view6 == null) {
                                    view6 = null;
                                }
                                D6.w(view6);
                                TextView textView = cptMassActivationDialogFragment.f126426u0;
                                (textView != null ? textView : null).setText(z.l(apiException));
                            } else {
                                View view7 = cptMassActivationDialogFragment.f126425t0;
                                if (view7 == null) {
                                    view7 = null;
                                }
                                D6.w(view7);
                                View view8 = cptMassActivationDialogFragment.f126420o0;
                                if (view8 == null) {
                                    view8 = null;
                                }
                                D6.w(view8);
                                RecyclerView recyclerView3 = cptMassActivationDialogFragment.f126421p0;
                                if (recyclerView3 == null) {
                                    recyclerView3 = null;
                                }
                                D6.H(recyclerView3);
                                com.avito.konveyor.adapter.d dVar = cptMassActivationDialogFragment.f126416k0;
                                if (dVar == null) {
                                    dVar = null;
                                }
                                dVar.l(cVar2.f17436d, null);
                                View view9 = cptMassActivationDialogFragment.f126422q0;
                                if (view9 == null) {
                                    view9 = null;
                                }
                                D6.H(view9);
                                Button button = cptMassActivationDialogFragment.f126423r0;
                                if (button == null) {
                                    button = null;
                                }
                                Or.e.a(button, cVar2.f17437e);
                                AttributedText attributedText = cVar2.f17439g;
                                if (attributedText != null) {
                                    attributedText.setOnDeepLinkClickListener(new C15041a(cptMassActivationDialogFragment, 28));
                                }
                                TextView textView2 = cptMassActivationDialogFragment.f126424s0;
                                if (textView2 == null) {
                                    textView2 = null;
                                }
                                com.avito.android.util.text.a aVar2 = cptMassActivationDialogFragment.f126419n0;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                com.avito.android.util.text.j.a(textView2, attributedText, aVar2);
                                Dialog dialog = cptMassActivationDialogFragment.getDialog();
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                                if (dVar2 != null) {
                                    dVar2.s();
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3754a(CptMassActivationDialogFragment cptMassActivationDialogFragment, Continuation<? super C3754a> continuation) {
                    super(2, continuation);
                    this.f126434r = cptMassActivationDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3754a(this.f126434r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3754a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126433q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CptMassActivationDialogFragment.f126412x0;
                        CptMassActivationDialogFragment cptMassActivationDialogFragment = this.f126434r;
                        n2<Vr.c> state = cptMassActivationDialogFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cptMassActivationDialogFragment.f126415j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3755a c3755a = new C3755a(1, cptMassActivationDialogFragment, CptMassActivationDialogFragment.class, "render", "render(Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationState;)V", 0);
                        this.f126433q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3755a, this) == coroutine_suspended) {
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

            /* compiled from: CptMassActivationDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$onCreateDialog$1$1$2", f = "CptMassActivationDialogFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$b$a$b, reason: collision with other inner class name */
            public static final class C3756b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126435q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CptMassActivationDialogFragment f126436r;

                /* compiled from: CptMassActivationDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3757a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CptMassActivationDialogFragment f126437b;

                    public C3757a(CptMassActivationDialogFragment cptMassActivationDialogFragment) {
                        this.f126437b = cptMassActivationDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15710b interfaceC15710b = (InterfaceC15710b) obj;
                        a aVar = CptMassActivationDialogFragment.f126412x0;
                        CptMassActivationDialogFragment cptMassActivationDialogFragment = this.f126437b;
                        if (interfaceC15710b instanceof InterfaceC15710b.C1206b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = cptMassActivationDialogFragment.f126417l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC15710b.C1206b) interfaceC15710b).f17430a, null, null, 6);
                        } else {
                            if (interfaceC15710b instanceof InterfaceC15710b.c) {
                                FragmentManager parentFragmentManager = cptMassActivationDialogFragment.getParentFragmentManager();
                                String tag = cptMassActivationDialogFragment.getTag();
                                parentFragmentManager.o0(new Bundle(), tag != null ? tag : "");
                            } else if (interfaceC15710b instanceof InterfaceC15710b.a) {
                                FragmentManager parentFragmentManager2 = cptMassActivationDialogFragment.getParentFragmentManager();
                                String tag2 = cptMassActivationDialogFragment.getTag();
                                parentFragmentManager2.o0(C22777e.b(new Q("cpt_mass_activation_key_deeplink", ((InterfaceC15710b.a) interfaceC15710b).f17429a)), tag2 != null ? tag2 : "");
                                cptMassActivationDialogFragment.dismiss();
                            }
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
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f126437b, CptMassActivationDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3756b(CptMassActivationDialogFragment cptMassActivationDialogFragment, Continuation<? super C3756b> continuation) {
                    super(2, continuation);
                    this.f126436r = cptMassActivationDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3756b(this.f126436r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3756b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126435q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CptMassActivationDialogFragment.f126412x0;
                        CptMassActivationDialogFragment cptMassActivationDialogFragment = this.f126436r;
                        InterfaceC43160i<InterfaceC15710b> events = cptMassActivationDialogFragment.f5().getEvents();
                        C3757a c3757a = new C3757a(cptMassActivationDialogFragment);
                        this.f126435q = 1;
                        if (events.collect(c3757a, this) == coroutine_suspended) {
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
            public a(CptMassActivationDialogFragment cptMassActivationDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f126432r = cptMassActivationDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f126432r, continuation);
                aVar.f126431q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f126431q;
                CptMassActivationDialogFragment cptMassActivationDialogFragment = this.f126432r;
                C43259k.d(t12, null, null, new C3754a(cptMassActivationDialogFragment, null), 3);
                C43259k.d(t12, null, null, new C3756b(cptMassActivationDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return CptMassActivationDialogFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f126429q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CptMassActivationDialogFragment cptMassActivationDialogFragment = CptMassActivationDialogFragment.this;
                a aVar = new a(cptMassActivationDialogFragment, null);
                this.f126429q = 1;
                if (C23056p0.b(cptMassActivationDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CptMassActivationDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final CptMassActivationDialogFragment cptMassActivationDialogFragment = (CptMassActivationDialogFragment) this.receiver;
            a aVar = CptMassActivationDialogFragment.f126412x0;
            cptMassActivationDialogFragment.getClass();
            cptMassActivationDialogFragment.f126425t0 = view2.findViewById(R.id.cpt_mass_activation_network_problem_view);
            final int i12 = 0;
            ((Button) view2.findViewById(R.id.cpt_mass_activation_network_problem_retry_button)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cpt.mass_activation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    CptMassActivationDialogFragment cptMassActivationDialogFragment2 = cptMassActivationDialogFragment;
                    switch (i12) {
                        case 0:
                            CptMassActivationDialogFragment.a aVar2 = CptMassActivationDialogFragment.f126412x0;
                            cptMassActivationDialogFragment2.f5().accept(InterfaceC15709a.c.f17427a);
                            break;
                        default:
                            CptMassActivationDialogFragment.a aVar3 = CptMassActivationDialogFragment.f126412x0;
                            cptMassActivationDialogFragment2.f5().accept(InterfaceC15709a.C1205a.f17425a);
                            break;
                    }
                }
            });
            cptMassActivationDialogFragment.f126426u0 = (TextView) view2.findViewById(R.id.cpt_mass_activation_network_problem_error_description);
            cptMassActivationDialogFragment.f126420o0 = view2.findViewById(R.id.cpt_mass_activation_skeleton_item);
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.cpt_mass_activation_recycler_view);
            com.avito.konveyor.adapter.d dVar = cptMassActivationDialogFragment.f126416k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            com.avito.konveyor.a aVar2 = cptMassActivationDialogFragment.f126418m0;
            recyclerView.l(new C15792a(aVar2 != null ? aVar2 : null), -1);
            cptMassActivationDialogFragment.f126421p0 = recyclerView;
            View viewFindViewById = view2.findViewById(R.id.cpt_mass_activation_footer);
            ((ViewGroup) viewFindViewById).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(cptMassActivationDialogFragment, 7));
            cptMassActivationDialogFragment.f126422q0 = viewFindViewById;
            Button button = (Button) view2.findViewById(R.id.cpt_mass_activation_button);
            final int i13 = 1;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cpt.mass_activation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    CptMassActivationDialogFragment cptMassActivationDialogFragment2 = cptMassActivationDialogFragment;
                    switch (i13) {
                        case 0:
                            CptMassActivationDialogFragment.a aVar22 = CptMassActivationDialogFragment.f126412x0;
                            cptMassActivationDialogFragment2.f5().accept(InterfaceC15709a.c.f17427a);
                            break;
                        default:
                            CptMassActivationDialogFragment.a aVar3 = CptMassActivationDialogFragment.f126412x0;
                            cptMassActivationDialogFragment2.f5().accept(InterfaceC15709a.C1205a.f17425a);
                            break;
                    }
                }
            });
            cptMassActivationDialogFragment.f126423r0 = button;
            cptMassActivationDialogFragment.f126424s0 = (TextView) view2.findViewById(R.id.cpt_mass_activation_text_agreement);
            return G0.f406611a;
        }
    }

    /* compiled from: CptMassActivationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CptMassActivationDialogFragment.f126412x0;
            CptMassActivationDialogFragment.this.f5().accept(InterfaceC15709a.b.f17426a);
            return G0.f406611a;
        }
    }

    /* compiled from: CptMassActivationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptMassActivationDialogFragment.f126412x0;
            CptMassActivationDialogFragment.this.f5().accept(new InterfaceC15709a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f126440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f126440l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f126440l);
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
            return CptMassActivationDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f126442l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f126442l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126442l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126443l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126443l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126443l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126444l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126444l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126444l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CptMassActivationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpt/mass_activation/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.cpt.mass_activation.f> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cpt.mass_activation.f invoke() {
            com.avito.android.cpt.mass_activation.g gVar = CptMassActivationDialogFragment.this.f126413h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.cpt.mass_activation.f) gVar.get();
        }
    }

    public CptMassActivationDialogFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f126414i0 = new O0(m0.f406844a.b(com.avito.android.cpt.mass_activation.f.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f126428w0 = y6.b(475);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3764a interfaceC3764aA = o.a();
        InterfaceC14604a interfaceC14604a = (InterfaceC14604a) C29972i.a(C29972i.b(this), InterfaceC14604a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        String[] stringArray = arguments != null ? arguments.getStringArray("cpt_mass_activation_key_item_ids") : null;
        if (stringArray == null) {
            stringArray = new String[0];
        }
        interfaceC3764aA.a(interfaceC14604a, interfaceC39417aB, rVarB, stringArray, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126415j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126415j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    public final com.avito.android.cpt.mass_activation.f f5() {
        return (com.avito.android.cpt.mass_activation.f) this.f126414i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        f5().accept(InterfaceC15709a.b.f17426a);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f126415j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.cpt_mass_activation_dialog_fragment, true, new c(1, this, CptMassActivationDialogFragment.class, "onInflated", "onInflated(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(Math.min(this.f126428w0, C35835l0.g(dVar.getContext()).y));
        dVar.R(new d());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126415j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
