package com.avito.android.tariff.cpr.configure.advance;

import Cd.C13243a;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpr.configure.advance.di.s;
import com.avito.android.tariff.cpr.configure.advance.di.t;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import dB0.C39555b;
import gB0.C40568c;
import gB0.InterfaceC40566a;
import gB0.InterfaceC40567b;
import java.util.ArrayList;
import java.util.Set;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;
import vZ.InterfaceC49286a;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: CprConfigureAdvanceFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/CprConfigureAdvanceFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CprConfigureAdvanceFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f295152C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f295153D0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47312b f295154A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public C49899a f295155B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpr.configure.advance.h f295156n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f295157o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f295158p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f295159q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f295160r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f295161s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f295162t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295163u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295164v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295165w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295166x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295167y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295168z0;

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/CprConfigureAdvanceFragment$a;", "", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onCreateView$1", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f295169q;

        /* compiled from: CprConfigureAdvanceFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onCreateView$1$1", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f295171q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CprConfigureAdvanceFragment f295172r;

            /* compiled from: CprConfigureAdvanceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onCreateView$1$1$1", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8970a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295173q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CprConfigureAdvanceFragment f295174r;

                /* compiled from: CprConfigureAdvanceFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB0/c;", "it", "Lkotlin/G0;", "invoke", "(LgB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8971a extends N implements Y41.l<C40568c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CprConfigureAdvanceFragment f295175l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8971a(CprConfigureAdvanceFragment cprConfigureAdvanceFragment) {
                        super(1);
                        this.f295175l = cprConfigureAdvanceFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
                    @Override // Y41.l
                    public final G0 invoke(C40568c c40568c) {
                        DeepLink deeplink;
                        DeepLink deeplink2;
                        C40568c c40568c2 = c40568c;
                        a aVar = CprConfigureAdvanceFragment.f295152C0;
                        CprConfigureAdvanceFragment cprConfigureAdvanceFragment = this.f295175l;
                        com.avito.android.tariff.cpr.configure.advance.a aVar2 = new com.avito.android.tariff.cpr.configure.advance.a(1, cprConfigureAdvanceFragment.r5(), com.avito.android.tariff.cpr.configure.advance.g.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        C47313c c47313c = cprConfigureAdvanceFragment.f295163u0;
                        n<Object>[] nVarArr = CprConfigureAdvanceFragment.f295153D0;
                        n<Object> nVar = nVarArr[0];
                        TextView textView = (TextView) c47313c.a();
                        ButtonAction buttonAction = c40568c2.f396375c;
                        I5.a(textView, buttonAction != null ? buttonAction.getTitle() : null, false);
                        if (buttonAction != null && (deeplink2 = buttonAction.getDeeplink()) != null) {
                            n<Object> nVar2 = nVarArr[0];
                            ((TextView) c47313c.a()).setOnClickListener(new XA0.c(aVar2, deeplink2, 7));
                        }
                        C47313c c47313c2 = cprConfigureAdvanceFragment.f295165w0;
                        n<Object> nVar3 = nVarArr[2];
                        Button button = (Button) c47313c2.a();
                        ButtonAction buttonAction2 = c40568c2.f396376d;
                        com.avito.android.lib.design.button.b.a(button, buttonAction2 != null ? buttonAction2.getTitle() : null, false);
                        if (buttonAction2 != null && (deeplink = buttonAction2.getDeeplink()) != null) {
                            n<Object> nVar4 = nVarArr[2];
                            ((Button) c47313c2.a()).setOnClickListener(new XA0.c(aVar2, deeplink, i));
                        }
                        C47313c c47313c3 = cprConfigureAdvanceFragment.f295166x0;
                        n<Object> nVar5 = nVarArr[3];
                        TextView textView2 = (TextView) c47313c3.a();
                        AttributedText attributedText = c40568c2.f396380h;
                        com.avito.android.util.text.j.a(textView2, attributedText, null);
                        if (attributedText != null) {
                            attributedText.setOnDeepLinkClickListener(new B(14, aVar2));
                        }
                        com.avito.konveyor.adapter.d dVar = cprConfigureAdvanceFragment.f295159q0;
                        androidx.recyclerview.widget.B b12 = dVar;
                        if (dVar == null) {
                            b12 = 0;
                        }
                        b12.l(c40568c2.f396374b, null);
                        Set<TV0.d<?, ?>> set = cprConfigureAdvanceFragment.f295162t0;
                        if (set == null) {
                            set = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : set) {
                            if (obj instanceof InterfaceC49286a) {
                                arrayList.add(obj);
                            }
                        }
                        C43175k.K(new C43197r1(new com.avito.android.tariff.cpr.configure.advance.c(aVar2, null), C43175k.B(new com.avito.android.tariff.cpr.configure.advance.b(2, null), new C43187o(arrayList))), C22984Q.a(cprConfigureAdvanceFragment.getViewLifecycleOwner()));
                        C47313c c47313c4 = cprConfigureAdvanceFragment.f295168z0;
                        n<Object> nVar6 = nVarArr[5];
                        ((View) c47313c4.a()).setVisibility(c40568c2.f396379g ? 0 : 8);
                        C47313c c47313c5 = cprConfigureAdvanceFragment.f295167y0;
                        ApiError apiError = c40568c2.f396378f;
                        if (apiError != null) {
                            n<Object> nVar7 = CprConfigureAdvanceFragment.f295153D0[4];
                            ((com.avito.android.progress_overlay.l) c47313c5.a()).a(z.k(apiError));
                        } else {
                            n<Object> nVar8 = CprConfigureAdvanceFragment.f295153D0[4];
                            ((com.avito.android.progress_overlay.l) c47313c5.a()).j();
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8970a(CprConfigureAdvanceFragment cprConfigureAdvanceFragment, Continuation<? super C8970a> continuation) {
                    super(2, continuation);
                    this.f295174r = cprConfigureAdvanceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8970a(this.f295174r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8970a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295173q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CprConfigureAdvanceFragment.f295152C0;
                        CprConfigureAdvanceFragment cprConfigureAdvanceFragment = this.f295174r;
                        n2<C40568c> state = cprConfigureAdvanceFragment.r5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cprConfigureAdvanceFragment.f295158p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8971a c8971a = new C8971a(cprConfigureAdvanceFragment);
                        this.f295173q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8971a, this) == coroutine_suspended) {
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

            /* compiled from: CprConfigureAdvanceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onCreateView$1$1$2", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8972b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295176q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CprConfigureAdvanceFragment f295177r;

                /* compiled from: CprConfigureAdvanceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8973a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CprConfigureAdvanceFragment f295178b;

                    public C8973a(CprConfigureAdvanceFragment cprConfigureAdvanceFragment) {
                        this.f295178b = cprConfigureAdvanceFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC40567b.c cVar;
                        DeepLink deepLink;
                        InterfaceC40567b interfaceC40567b = (InterfaceC40567b) obj;
                        a aVar = CprConfigureAdvanceFragment.f295152C0;
                        CprConfigureAdvanceFragment cprConfigureAdvanceFragment = this.f295178b;
                        if (interfaceC40567b instanceof InterfaceC40567b.a) {
                            ActivityC22955m activityC22955mL1 = cprConfigureAdvanceFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                            }
                        } else {
                            if (interfaceC40567b instanceof InterfaceC40567b.C11195b) {
                                DeepLink deepLink2 = ((InterfaceC40567b.C11195b) interfaceC40567b).f396369a;
                                if (deepLink2 != null) {
                                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = cprConfigureAdvanceFragment.f295161s0;
                                    if (aVar2 == null) {
                                        aVar2 = null;
                                    }
                                    b.a.a(aVar2, deepLink2, null, null, 6);
                                }
                            } else if (interfaceC40567b instanceof InterfaceC40567b.d) {
                                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                                ((InterfaceC40567b.d) interfaceC40567b).getClass();
                                com.avito.android.component.toast.c.c(cVar2, cprConfigureAdvanceFragment, com.avito.android.printable_text.b.f(z.k(null)), null, null, new f.c((ApiError) null), 0, ToastBarPosition.f181047e, 942);
                            } else if ((interfaceC40567b instanceof InterfaceC40567b.c) && (deepLink = (cVar = (InterfaceC40567b.c) interfaceC40567b).f396370a) != null) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = cprConfigureAdvanceFragment.f295161s0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                String str = cVar.f396371b;
                                aVar3.r6(str != null ? com.avito.android.actions_sheet.a.m("keyCprConfigureAdvance", str) : null, deepLink, "cpr_advance_request_key");
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f295178b, CprConfigureAdvanceFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8972b(CprConfigureAdvanceFragment cprConfigureAdvanceFragment, Continuation<? super C8972b> continuation) {
                    super(2, continuation);
                    this.f295177r = cprConfigureAdvanceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8972b(this.f295177r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8972b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295176q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CprConfigureAdvanceFragment.f295152C0;
                        CprConfigureAdvanceFragment cprConfigureAdvanceFragment = this.f295177r;
                        InterfaceC43160i<InterfaceC40567b> events = cprConfigureAdvanceFragment.r5().getEvents();
                        C8973a c8973a = new C8973a(cprConfigureAdvanceFragment);
                        this.f295176q = 1;
                        if (events.collect(c8973a, this) == coroutine_suspended) {
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
            public a(CprConfigureAdvanceFragment cprConfigureAdvanceFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f295172r = cprConfigureAdvanceFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f295172r, continuation);
                aVar.f295171q = obj;
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
                T t12 = (T) this.f295171q;
                CprConfigureAdvanceFragment cprConfigureAdvanceFragment = this.f295172r;
                C43259k.d(t12, null, null, new C8970a(cprConfigureAdvanceFragment, null), 3);
                C43259k.d(t12, null, null, new C8972b(cprConfigureAdvanceFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CprConfigureAdvanceFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f295169q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CprConfigureAdvanceFragment cprConfigureAdvanceFragment = CprConfigureAdvanceFragment.this;
                a aVar = new a(cprConfigureAdvanceFragment, null);
                this.f295169q = 1;
                if (C23056p0.b(cprConfigureAdvanceFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f295179b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f295180b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onViewCreated$$inlined$filter$1$2", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$c$a$a, reason: collision with other inner class name */
            public static final class C8974a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f295181q;

                /* renamed from: r, reason: collision with root package name */
                public int f295182r;

                public C8974a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f295181q = obj;
                    this.f295182r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f295180b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.c.a.C8974a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$c$a$a r0 = (com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.c.a.C8974a) r0
                    int r1 = r0.f295182r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f295182r = r1
                    goto L18
                L13:
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$c$a$a r0 = new com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f295181q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f295182r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    if (r6 <= 0) goto L48
                    r0.f295182r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f295180b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(d dVar) {
            this.f295179b = dVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Integer> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f295179b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f295184b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CprConfigureAdvanceFragment f295185c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f295186b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CprConfigureAdvanceFragment f295187c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onViewCreated$$inlined$map$1$2", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$d$a$a, reason: collision with other inner class name */
            public static final class C8975a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f295188q;

                /* renamed from: r, reason: collision with root package name */
                public int f295189r;

                public C8975a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f295188q = obj;
                    this.f295189r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, CprConfigureAdvanceFragment cprConfigureAdvanceFragment) {
                this.f295186b = interfaceC43172j;
                this.f295187c = cprConfigureAdvanceFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.d.a.C8975a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$d$a$a r0 = (com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.d.a.C8975a) r0
                    int r1 = r0.f295189r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f295189r = r1
                    goto L18
                L13:
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$d$a$a r0 = new com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f295188q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f295189r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L59
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    kotlin.G0 r5 = (kotlin.G0) r5
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$a r5 = com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.f295152C0
                    com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment r5 = r4.f295187c
                    qK0.c r5 = r5.f295164v0
                    kotlin.reflect.n<java.lang.Object>[] r6 = com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.f295153D0
                    r6 = r6[r3]
                    java.lang.Object r5 = r5.a()
                    android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                    int r5 = com.avito.android.util.D6.v(r5)
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                    r0.f295189r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f295186b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i, CprConfigureAdvanceFragment cprConfigureAdvanceFragment) {
            this.f295184b = interfaceC43160i;
            this.f295185c = cprConfigureAdvanceFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Integer> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f295184b).collect(new a(interfaceC43172j, this.f295185c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "height", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$onViewCreated$4", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ int f295191q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = CprConfigureAdvanceFragment.this.new e(continuation);
            eVar.f295191q = ((Number) obj).intValue();
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((e) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            int i12 = this.f295191q;
            CprConfigureAdvanceFragment cprConfigureAdvanceFragment = CprConfigureAdvanceFragment.this;
            C49899a c49899a = cprConfigureAdvanceFragment.f295155B0;
            if (c49899a != null) {
                cprConfigureAdvanceFragment.q5().r0(c49899a);
            }
            C49899a c49899a2 = new C49899a(i12);
            cprConfigureAdvanceFragment.q5().l(c49899a2, -1);
            cprConfigureAdvanceFragment.f295155B0 = c49899a2;
            return G0.f406611a;
        }
    }

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CprConfigureAdvanceFragment.f295152C0;
            CprConfigureAdvanceFragment.this.r5().accept(InterfaceC40566a.d.f396367a);
            return G0.f406611a;
        }
    }

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<x, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = CprConfigureAdvanceFragment.f295152C0;
            CprConfigureAdvanceFragment.this.r5().accept(new InterfaceC40566a.c(xVar));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f295195l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f295195l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f295195l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CprConfigureAdvanceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f295197l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f295197l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f295197l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295198l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295198l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f295198l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295199l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295199l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f295199l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CprConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpr/configure/advance/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.tariff.cpr.configure.advance.g> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpr.configure.advance.g invoke() {
            com.avito.android.tariff.cpr.configure.advance.h hVar = CprConfigureAdvanceFragment.this.f295156n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.tariff.cpr.configure.advance.g) hVar.get();
        }
    }

    static {
        Y y12 = new Y(CprConfigureAdvanceFragment.class, "toolbarLink", "getToolbarLink()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f295153D0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "rulesTextView", "getRulesTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "shimmer", "getShimmer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CprConfigureAdvanceFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f295152C0 = new a(null);
    }

    public CprConfigureAdvanceFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f295157o0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpr.configure.advance.g.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f295163u0 = new C47313c(null, 1, null);
        this.f295164v0 = new C47313c(null, 1, null);
        this.f295165w0 = new C47313c(null, 1, null);
        this.f295166x0 = new C47313c(null, 1, null);
        this.f295167y0 = new C47313c(null, 1, null);
        this.f295168z0 = new C47313c(null, 1, null);
        this.f295154A0 = new C47312b(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f295158p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return layoutInflater.inflate(R.layout.tariff_cpr_configure_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cpr_recycler_view);
        n<Object>[] nVarArr = f295153D0;
        n<Object> nVar = nVarArr[6];
        this.f295154A0.b(this, recyclerView);
        ((Toolbar) view.findViewById(R.id.cpr_toolbar)).setNavigationOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 20));
        TextView textView = (TextView) view.findViewById(R.id.cpr_toolbar_link);
        C47313c c47313c = this.f295163u0;
        n<Object> nVar2 = nVarArr[0];
        c47313c.b(this, textView);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cpr_button_container);
        C47313c c47313c2 = this.f295164v0;
        n<Object> nVar3 = nVarArr[1];
        c47313c2.b(this, viewGroup);
        Button button = (Button) view.findViewById(R.id.cpr_button);
        C47313c c47313c3 = this.f295165w0;
        n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, button);
        TextView textView2 = (TextView) view.findViewById(R.id.cpr_text_rules);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        C47313c c47313c4 = this.f295166x0;
        n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, textView2);
        View viewFindViewById = view.findViewById(R.id.shimmer_layout);
        C47313c c47313c5 = this.f295168z0;
        n<Object> nVar6 = nVarArr[5];
        c47313c5.b(this, viewFindViewById);
        RecyclerView recyclerViewQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f295159q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewQ5.setAdapter(dVar);
        q5().l(new C39555b(), -1);
        n<Object> nVar7 = nVarArr[1];
        C43175k.K(new C43197r1(new e(null), new c(new d(y.a(C37722i.f((ViewGroup) c47313c2.a())), this))), C22984Q.a(getViewLifecycleOwner()));
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.cpr_content_container);
        InterfaceC28373a interfaceC28373a = this.f295160r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup2, 0, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 26, null);
        lVar.f231600j = new f();
        C47313c c47313c6 = this.f295167y0;
        n<Object> nVar8 = nVarArr[4];
        c47313c6.b(this, lVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295158p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("configure_context");
        if (string == null) {
            throw new IllegalArgumentException("configure_context param must not be null");
        }
        s.a().a(com.avito.android.analytics.screens.s.c(this), (t) C29972i.a(C29972i.b(this), t.class), cv.c.b(this), new g(), string).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295158p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f295161s0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final RecyclerView q5() {
        n<Object> nVar = f295153D0[6];
        return (RecyclerView) this.f295154A0.a();
    }

    public final com.avito.android.tariff.cpr.configure.advance.g r5() {
        return (com.avito.android.tariff.cpr.configure.advance.g) this.f295157o0.getValue();
    }
}
