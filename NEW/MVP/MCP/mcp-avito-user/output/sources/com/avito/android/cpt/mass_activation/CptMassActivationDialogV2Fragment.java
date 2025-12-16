package com.avito.android.cpt.mass_activation;

import Cd.C13243a;
import Nr.InterfaceC14604a;
import Pr.C14830a;
import Rh.C15041a;
import Vr.InterfaceC15709a;
import Vr.InterfaceC15710b;
import Vr.c;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.avito.android.cpt.mass_activation.di.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
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
import okhttp3.internal.ws.WebSocketProtocol;
import z1.AbstractC50339a;

/* compiled from: CptMassActivationDialogV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/mass_activation/CptMassActivationDialogV2Fragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CptMassActivationDialogV2Fragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f126446A0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.cpt.mass_activation.g f126447h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f126448i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f126449j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f126450k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126451l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f126452m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f126453n0;

    /* renamed from: o0, reason: collision with root package name */
    public ViewGroup f126454o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f126455p0;

    /* renamed from: q0, reason: collision with root package name */
    public RecyclerView f126456q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f126457r0;

    /* renamed from: s0, reason: collision with root package name */
    public Button f126458s0;

    /* renamed from: t0, reason: collision with root package name */
    public TextView f126459t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f126460u0;

    /* renamed from: v0, reason: collision with root package name */
    public TextView f126461v0;

    /* renamed from: w0, reason: collision with root package name */
    public TextView f126462w0;

    /* renamed from: x0, reason: collision with root package name */
    public ImageView f126463x0;

    /* renamed from: y0, reason: collision with root package name */
    public ImageView f126464y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public Pr.c f126465z0;

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpt/mass_activation/CptMassActivationDialogV2Fragment$a;", "", "<init>", "()V", "", "KEY_ITEM_IDS", "Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$onCreateDialog$1", f = "CptMassActivationDialogV2Fragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f126466q;

        /* compiled from: CptMassActivationDialogV2Fragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$onCreateDialog$1$1", f = "CptMassActivationDialogV2Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f126468q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CptMassActivationDialogV2Fragment f126469r;

            /* compiled from: CptMassActivationDialogV2Fragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$onCreateDialog$1$1$1", f = "CptMassActivationDialogV2Fragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$b$a$a, reason: collision with other inner class name */
            public static final class C3758a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126470q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CptMassActivationDialogV2Fragment f126471r;

                /* compiled from: CptMassActivationDialogV2Fragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3759a extends H implements Y41.l<Vr.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(Vr.c cVar) {
                        q qVar;
                        String str;
                        Vr.c cVar2 = cVar;
                        CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = (CptMassActivationDialogV2Fragment) this.receiver;
                        a aVar = CptMassActivationDialogV2Fragment.f126446A0;
                        cptMassActivationDialogV2Fragment.getClass();
                        if (cVar2.f17434b) {
                            ViewGroup viewGroup = cptMassActivationDialogV2Fragment.f126454o0;
                            if (viewGroup == null) {
                                viewGroup = null;
                            }
                            D6.w(viewGroup);
                            View view = cptMassActivationDialogV2Fragment.f126460u0;
                            if (view == null) {
                                view = null;
                            }
                            D6.w(view);
                            View view2 = cptMassActivationDialogV2Fragment.f126455p0;
                            if (view2 == null) {
                                view2 = null;
                            }
                            D6.H(view2);
                            RecyclerView recyclerView = cptMassActivationDialogV2Fragment.f126456q0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            D6.w(recyclerView);
                            ImageView imageView = cptMassActivationDialogV2Fragment.f126464y0;
                            if (imageView == null) {
                                imageView = null;
                            }
                            D6.H(imageView);
                            ImageView imageView2 = cptMassActivationDialogV2Fragment.f126463x0;
                            if (imageView2 == null) {
                                imageView2 = null;
                            }
                            D6.w(imageView2);
                            View view3 = cptMassActivationDialogV2Fragment.f126457r0;
                            D6.w(view3 != null ? view3 : null);
                        } else if (cVar2.f17435c != null) {
                            ViewGroup viewGroup2 = cptMassActivationDialogV2Fragment.f126454o0;
                            if (viewGroup2 == null) {
                                viewGroup2 = null;
                            }
                            D6.w(viewGroup2);
                            View view4 = cptMassActivationDialogV2Fragment.f126460u0;
                            if (view4 == null) {
                                view4 = null;
                            }
                            D6.H(view4);
                            View view5 = cptMassActivationDialogV2Fragment.f126455p0;
                            if (view5 == null) {
                                view5 = null;
                            }
                            D6.w(view5);
                            ImageView imageView3 = cptMassActivationDialogV2Fragment.f126464y0;
                            if (imageView3 == null) {
                                imageView3 = null;
                            }
                            D6.w(imageView3);
                            ImageView imageView4 = cptMassActivationDialogV2Fragment.f126463x0;
                            if (imageView4 == null) {
                                imageView4 = null;
                            }
                            D6.w(imageView4);
                            RecyclerView recyclerView2 = cptMassActivationDialogV2Fragment.f126456q0;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            D6.w(recyclerView2);
                            View view6 = cptMassActivationDialogV2Fragment.f126457r0;
                            D6.w(view6 != null ? view6 : null);
                        } else {
                            ViewGroup viewGroup3 = cptMassActivationDialogV2Fragment.f126454o0;
                            if (viewGroup3 == null) {
                                viewGroup3 = null;
                            }
                            D6.H(viewGroup3);
                            ImageView imageView5 = cptMassActivationDialogV2Fragment.f126464y0;
                            if (imageView5 == null) {
                                imageView5 = null;
                            }
                            D6.w(imageView5);
                            ImageView imageView6 = cptMassActivationDialogV2Fragment.f126463x0;
                            if (imageView6 == null) {
                                imageView6 = null;
                            }
                            D6.H(imageView6);
                            View view7 = cptMassActivationDialogV2Fragment.f126460u0;
                            if (view7 == null) {
                                view7 = null;
                            }
                            D6.w(view7);
                            View view8 = cptMassActivationDialogV2Fragment.f126455p0;
                            if (view8 == null) {
                                view8 = null;
                            }
                            D6.w(view8);
                            RecyclerView recyclerView3 = cptMassActivationDialogV2Fragment.f126456q0;
                            if (recyclerView3 == null) {
                                recyclerView3 = null;
                            }
                            D6.H(recyclerView3);
                            com.avito.konveyor.adapter.d dVar = cptMassActivationDialogV2Fragment.f126450k0;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.l(cVar2.f17436d, null);
                            View view9 = cptMassActivationDialogV2Fragment.f126457r0;
                            if (view9 == null) {
                                view9 = null;
                            }
                            D6.H(view9);
                            Button button = cptMassActivationDialogV2Fragment.f126458s0;
                            if (button == null) {
                                button = null;
                            }
                            C14830a c14830a = cVar2.f17437e;
                            com.avito.android.lib.design.button.b.a(button, c14830a != null ? c14830a.f13334a : null, false);
                            if (c14830a != null && (str = c14830a.f13335b) != null) {
                                Button button2 = cptMassActivationDialogV2Fragment.f126458s0;
                                if (button2 == null) {
                                    button2 = null;
                                }
                                button2.setSubtitle(str);
                            }
                            TextView textView = cptMassActivationDialogV2Fragment.f126461v0;
                            if (textView == null) {
                                textView = null;
                            }
                            c.b bVar = cVar2.f17438f;
                            I5.a(textView, bVar != null ? bVar.f17440a : null, false);
                            TextView textView2 = cptMassActivationDialogV2Fragment.f126462w0;
                            if (textView2 == null) {
                                textView2 = null;
                            }
                            I5.a(textView2, bVar != null ? bVar.f17441b : null, false);
                            com.avito.android.lib.design.bottom_sheet.d dVarF5 = cptMassActivationDialogV2Fragment.f5();
                            if (dVarF5 != null && (qVar = dVarF5.f178530x) != null) {
                                qVar.g7(2);
                            }
                            AttributedText attributedText = cVar2.f17439g;
                            if (attributedText != null) {
                                attributedText.setOnDeepLinkClickListener(new C15041a(cptMassActivationDialogV2Fragment, 29));
                            }
                            TextView textView3 = cptMassActivationDialogV2Fragment.f126459t0;
                            if (textView3 == null) {
                                textView3 = null;
                            }
                            com.avito.android.util.text.a aVar2 = cptMassActivationDialogV2Fragment.f126453n0;
                            com.avito.android.util.text.j.a(textView3, attributedText, aVar2 != null ? aVar2 : null);
                            com.avito.android.lib.design.bottom_sheet.d dVarF52 = cptMassActivationDialogV2Fragment.f5();
                            if (dVarF52 != null) {
                                dVarF52.s();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3758a(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment, Continuation<? super C3758a> continuation) {
                    super(2, continuation);
                    this.f126471r = cptMassActivationDialogV2Fragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3758a(this.f126471r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3758a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126470q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CptMassActivationDialogV2Fragment.f126446A0;
                        CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = this.f126471r;
                        n2<Vr.c> state = cptMassActivationDialogV2Fragment.g5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cptMassActivationDialogV2Fragment.f126449j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3759a c3759a = new C3759a(1, cptMassActivationDialogV2Fragment, CptMassActivationDialogV2Fragment.class, "render", "render(Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationState;)V", 0);
                        this.f126470q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3759a, this) == coroutine_suspended) {
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

            /* compiled from: CptMassActivationDialogV2Fragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$onCreateDialog$1$1$2", f = "CptMassActivationDialogV2Fragment.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$b$a$b, reason: collision with other inner class name */
            public static final class C3760b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126472q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CptMassActivationDialogV2Fragment f126473r;

                /* compiled from: CptMassActivationDialogV2Fragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3761a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CptMassActivationDialogV2Fragment f126474b;

                    public C3761a(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment) {
                        this.f126474b = cptMassActivationDialogV2Fragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15710b interfaceC15710b = (InterfaceC15710b) obj;
                        a aVar = CptMassActivationDialogV2Fragment.f126446A0;
                        CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = this.f126474b;
                        if (interfaceC15710b instanceof InterfaceC15710b.C1206b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = cptMassActivationDialogV2Fragment.f126451l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC15710b.C1206b) interfaceC15710b).f17430a, null, null, 6);
                        } else {
                            if (interfaceC15710b instanceof InterfaceC15710b.c) {
                                FragmentManager parentFragmentManager = cptMassActivationDialogV2Fragment.getParentFragmentManager();
                                String tag = cptMassActivationDialogV2Fragment.getTag();
                                parentFragmentManager.o0(new Bundle(), tag != null ? tag : "");
                            } else if (interfaceC15710b instanceof InterfaceC15710b.a) {
                                FragmentManager parentFragmentManager2 = cptMassActivationDialogV2Fragment.getParentFragmentManager();
                                String tag2 = cptMassActivationDialogV2Fragment.getTag();
                                parentFragmentManager2.o0(C22777e.b(new Q("cpt_mass_activation_key_deeplink", ((InterfaceC15710b.a) interfaceC15710b).f17429a)), tag2 != null ? tag2 : "");
                                cptMassActivationDialogV2Fragment.dismiss();
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
                        return new C42801a(2, this.f126474b, CptMassActivationDialogV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3760b(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment, Continuation<? super C3760b> continuation) {
                    super(2, continuation);
                    this.f126473r = cptMassActivationDialogV2Fragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3760b(this.f126473r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3760b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126472q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CptMassActivationDialogV2Fragment.f126446A0;
                        CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = this.f126473r;
                        InterfaceC43160i<InterfaceC15710b> events = cptMassActivationDialogV2Fragment.g5().getEvents();
                        C3761a c3761a = new C3761a(cptMassActivationDialogV2Fragment);
                        this.f126472q = 1;
                        if (events.collect(c3761a, this) == coroutine_suspended) {
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
            public a(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f126469r = cptMassActivationDialogV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f126469r, continuation);
                aVar.f126468q = obj;
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
                T t12 = (T) this.f126468q;
                CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = this.f126469r;
                C43259k.d(t12, null, null, new C3758a(cptMassActivationDialogV2Fragment, null), 3);
                C43259k.d(t12, null, null, new C3760b(cptMassActivationDialogV2Fragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return CptMassActivationDialogV2Fragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f126466q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = CptMassActivationDialogV2Fragment.this;
                a aVar = new a(cptMassActivationDialogV2Fragment, null);
                this.f126466q = 1;
                if (C23056p0.b(cptMassActivationDialogV2Fragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = (CptMassActivationDialogV2Fragment) this.receiver;
            a aVar = CptMassActivationDialogV2Fragment.f126446A0;
            cptMassActivationDialogV2Fragment.getClass();
            cptMassActivationDialogV2Fragment.f126460u0 = view2.findViewById(R.id.cpt_mass_activation_network_problem_view_new);
            ((Button) view2.findViewById(R.id.cpt_mass_activation_network_problem_retry_button_new)).setOnClickListener(new com.avito.android.cpt.mass_activation.c(cptMassActivationDialogV2Fragment, 0));
            cptMassActivationDialogV2Fragment.f126455p0 = view2.findViewById(R.id.cpt_mass_activation_skeleton_item_new);
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.cpt_mass_activation_recycler_view_new);
            com.avito.konveyor.adapter.d dVar = cptMassActivationDialogV2Fragment.f126450k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            com.avito.konveyor.a aVar2 = cptMassActivationDialogV2Fragment.f126452m0;
            recyclerView.l(new com.avito.android.cpt.mass_activation.e(aVar2 != null ? aVar2 : null), -1);
            cptMassActivationDialogV2Fragment.f126456q0 = recyclerView;
            ImageView imageView = (ImageView) view2.findViewById(R.id.cpt_mass_activation_fragment_close_button_new);
            imageView.setOnClickListener(new com.avito.android.cpt.mass_activation.c(cptMassActivationDialogV2Fragment, 1));
            cptMassActivationDialogV2Fragment.f126464y0 = imageView;
            View viewFindViewById = view2.findViewById(R.id.cpt_mass_activation_footer_new);
            ((ViewGroup) viewFindViewById).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(cptMassActivationDialogV2Fragment, 8));
            cptMassActivationDialogV2Fragment.f126457r0 = viewFindViewById;
            Button button = (Button) view2.findViewById(R.id.cpt_mass_activation_button_new);
            button.setOnClickListener(new com.avito.android.cpt.mass_activation.c(cptMassActivationDialogV2Fragment, 2));
            cptMassActivationDialogV2Fragment.f126458s0 = button;
            cptMassActivationDialogV2Fragment.f126459t0 = (TextView) view2.findViewById(R.id.cpt_mass_activation_text_agreement_new);
            return G0.f406611a;
        }
    }

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CptMassActivationDialogV2Fragment.f126446A0;
            CptMassActivationDialogV2Fragment.this.g5().accept(InterfaceC15709a.b.f17426a);
            return G0.f406611a;
        }
    }

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptMassActivationDialogV2Fragment.f126446A0;
            CptMassActivationDialogV2Fragment.this.g5().accept(new InterfaceC15709a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f126477l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f126477l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f126477l);
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
            return CptMassActivationDialogV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f126479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f126479l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126479l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126480l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126480l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126480l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126481l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126481l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126481l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CptMassActivationDialogV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpt/mass_activation/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.cpt.mass_activation.f> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cpt.mass_activation.f invoke() {
            com.avito.android.cpt.mass_activation.g gVar = CptMassActivationDialogV2Fragment.this.f126447h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.cpt.mass_activation.f) gVar.get();
        }
    }

    public CptMassActivationDialogV2Fragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f126448i0 = new O0(m0.f406844a.b(com.avito.android.cpt.mass_activation.f.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        i.a aVarA = com.avito.android.cpt.mass_activation.di.p.a();
        InterfaceC14604a interfaceC14604a = (InterfaceC14604a) C29972i.a(C29972i.b(this), InterfaceC14604a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        String[] stringArray = arguments != null ? arguments.getStringArray("cpt_mass_activation_key_item_ids") : null;
        if (stringArray == null) {
            stringArray = new String[0];
        }
        aVarA.a(interfaceC14604a, interfaceC39417aB, rVarB, stringArray, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126449j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126449j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    public final com.avito.android.lib.design.bottom_sheet.d f5() {
        Dialog dialog = getDialog();
        if (dialog instanceof com.avito.android.lib.design.bottom_sheet.d) {
            return (com.avito.android.lib.design.bottom_sheet.d) dialog;
        }
        return null;
    }

    public final com.avito.android.cpt.mass_activation.f g5() {
        return (com.avito.android.cpt.mass_activation.f) this.f126448i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        g5().accept(InterfaceC15709a.b.f17426a);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f126449j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.cpt_mass_activation_dialog_fragment_v2, true, new c(1, this, CptMassActivationDialogV2Fragment.class, "onInflated", "onInflated(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 121);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(dVar.getContext()).inflate(R.layout.cpt_mass_activation_header_v2, (ViewGroup) null);
        this.f126454o0 = (ViewGroup) viewGroup.findViewById(R.id.cpt_activation_header_text_block);
        this.f126461v0 = (TextView) viewGroup.findViewById(R.id.cpt_mass_activation_header_v2_title);
        this.f126462w0 = (TextView) viewGroup.findViewById(R.id.cpt_mass_activation_header_v2_description);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.cpt_mass_activation_skeleton_close_button_new);
        imageView.setOnClickListener(new com.avito.android.cpt.mass_activation.c(this, 3));
        this.f126463x0 = imageView;
        dVar.H(viewGroup);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.R(new d());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126449j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
