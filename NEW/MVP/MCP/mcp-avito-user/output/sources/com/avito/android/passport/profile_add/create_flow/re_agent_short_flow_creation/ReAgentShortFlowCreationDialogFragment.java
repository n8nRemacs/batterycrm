package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import Cd.C13243a;
import S50.a;
import S50.b;
import Y41.p;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC22955m;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileLink;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.model.ReAgentShortFlowCreationArguments;
import com.avito.android.passport.profile_add.perf_const.ReAgentShortFlowCreationScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/ReAgentShortFlowCreationDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReAgentShortFlowCreationDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f211512o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public m f211513h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f211514i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f211515j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j f211516k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f211517l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public d f211518m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f211519n0;

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/ReAgentShortFlowCreationDialogFragment$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/model/ReAgentShortFlowCreationArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReAgentShortFlowCreationArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReAgentShortFlowCreationArguments invoke() {
            Bundle bundleRequireArguments = ReAgentShortFlowCreationDialogFragment.this.requireArguments();
            return (ReAgentShortFlowCreationArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("re_agent_short_flow_creation_arguments", ReAgentShortFlowCreationArguments.class) : bundleRequireArguments.getParcelable("re_agent_short_flow_creation_arguments"));
        }
    }

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$onCreateDialog$1", f = "ReAgentShortFlowCreationDialogFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f211521q;

        /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$onCreateDialog$1$1", f = "ReAgentShortFlowCreationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f211523q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211524r;

            /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$onCreateDialog$1$1$1", f = "ReAgentShortFlowCreationDialogFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C6319a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f211525q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211526r;

                /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6320a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h f211527b;

                    public C6320a(com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h hVar) {
                        this.f211527b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f211527b.c((S50.c) obj);
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
                        return new C42801a(2, this.f211527b, com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h.class, "render", "render(Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6319a(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment, Continuation<? super C6319a> continuation) {
                    super(2, continuation);
                    this.f211526r = reAgentShortFlowCreationDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6319a(this.f211526r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6319a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f211525q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = this.f211526r;
                        n2<S50.c> state = ((l) reAgentShortFlowCreationDialogFragment.f211514i0.getValue()).getState();
                        com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar = reAgentShortFlowCreationDialogFragment.f211516k0;
                        if (jVar == null) {
                            jVar = null;
                        }
                        C6320a c6320a = new C6320a(jVar);
                        this.f211525q = 1;
                        if (state.collect(c6320a, this) == coroutine_suspended) {
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

            /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$onCreateDialog$1$1$2", f = "ReAgentShortFlowCreationDialogFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f211528q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211529r;

                /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6321a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211530b;

                    public C6321a(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment) {
                        this.f211530b = reAgentShortFlowCreationDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        View viewV;
                        S50.b bVar = (S50.b) obj;
                        a aVar = ReAgentShortFlowCreationDialogFragment.f211512o0;
                        ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = this.f211530b;
                        if (bVar instanceof b.c) {
                            reAgentShortFlowCreationDialogFragment.dismiss();
                        } else {
                            if (bVar instanceof b.C1000b) {
                                DeepLink deepLink = ((b.C1000b) bVar).f14813a;
                                if (deepLink != null) {
                                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = reAgentShortFlowCreationDialogFragment.f211517l0;
                                    if (aVar2 == null) {
                                        aVar2 = null;
                                    }
                                    b.a.a(aVar2, deepLink, null, null, 6);
                                }
                                reAgentShortFlowCreationDialogFragment.dismiss();
                            } else if (bVar instanceof b.e) {
                                d dVar = reAgentShortFlowCreationDialogFragment.f211518m0;
                                if (dVar != null && (viewV = dVar.v()) != null) {
                                    com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                                    ApiException apiException = ((b.e) bVar).f14816a;
                                    ScreenPerformanceTracker screenPerformanceTracker = reAgentShortFlowCreationDialogFragment.f211515j0;
                                    if (screenPerformanceTracker == null) {
                                        screenPerformanceTracker = null;
                                    }
                                    PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.re_agent_short_flow_creation_error, new Serializable[0]);
                                    pVar.getClass();
                                    com.avito.android.extended_profile_ui_components.p.b(viewV, apiException, screenPerformanceTracker, printableTextC, null);
                                }
                            } else if (bVar instanceof b.d) {
                                ScreenFlowLink screenFlowLink = new ScreenFlowLink(new ProfileLink(false, 1, null), ((b.d) bVar).f14815a ? new ScreenFlowLink(new ProfileSettingsLink(null, null, 2, null), new ToastMessageLink(reAgentShortFlowCreationDialogFragment.getString(R.string.re_agent_short_flow_creation_success), ToastMessageLink.ToastType.f133735d, null, null, null, false, null, 124, null)) : new ProfileSettingsLink(null, null, 2, null));
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = reAgentShortFlowCreationDialogFragment.f211517l0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b.a.a(aVar3, screenFlowLink, null, null, 6);
                                reAgentShortFlowCreationDialogFragment.dismiss();
                            } else if (bVar instanceof b.a) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar4 = reAgentShortFlowCreationDialogFragment.f211517l0;
                                b.a aVar5 = (b.a) bVar;
                                (aVar4 != null ? aVar4 : null).r6(aVar5.f14812c, aVar5.f14810a, aVar5.f14811b);
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
                        return new C42801a(2, this.f211530b, ReAgentShortFlowCreationDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f211529r = reAgentShortFlowCreationDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f211529r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f211528q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = this.f211529r;
                        InterfaceC43160i<S50.b> events = ((l) reAgentShortFlowCreationDialogFragment.f211514i0.getValue()).getEvents();
                        C6321a c6321a = new C6321a(reAgentShortFlowCreationDialogFragment);
                        this.f211528q = 1;
                        if (events.collect(c6321a, this) == coroutine_suspended) {
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

            /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$onCreateDialog$1$1$3", f = "ReAgentShortFlowCreationDialogFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$c$a$c, reason: collision with other inner class name */
            public static final class C6322c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f211531q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211532r;

                /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment$c$a$c$a, reason: collision with other inner class name */
                public static final class C6323a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ReAgentShortFlowCreationDialogFragment f211533b;

                    public C6323a(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment) {
                        this.f211533b = reAgentShortFlowCreationDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C43501a c43501a = (C43501a) obj;
                        l lVar = (l) this.f211533b.f211514i0.getValue();
                        com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
                        lVar.accept(new a.c(aVar.f134521b, c43501a.f413261b));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6322c(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment, Continuation<? super C6322c> continuation) {
                    super(2, continuation);
                    this.f211532r = reAgentShortFlowCreationDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6322c(this.f211532r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6322c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f211531q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = this.f211532r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = reAgentShortFlowCreationDialogFragment.f211517l0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        InterfaceC43160i interfaceC43160iA = y.a(aVar.V9());
                        C6323a c6323a = new C6323a(reAgentShortFlowCreationDialogFragment);
                        this.f211531q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c6323a, this) == coroutine_suspended) {
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
            public a(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f211524r = reAgentShortFlowCreationDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f211524r, continuation);
                aVar.f211523q = obj;
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
                T t12 = (T) this.f211523q;
                ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = this.f211524r;
                C43259k.d(t12, null, null, new C6319a(reAgentShortFlowCreationDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(reAgentShortFlowCreationDialogFragment, null), 3);
                C43259k.d(t12, null, null, new C6322c(reAgentShortFlowCreationDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ReAgentShortFlowCreationDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f211521q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = ReAgentShortFlowCreationDialogFragment.this;
                a aVar = new a(reAgentShortFlowCreationDialogFragment, null);
                this.f211521q = 1;
                if (C23056p0.b(reAgentShortFlowCreationDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/ReAgentShortFlowCreationDialogFragment$d", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.lib.design.bottom_sheet.d {

        /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a extends H implements Y41.l<View, G0> {
            @Override // Y41.l
            public final G0 invoke(View view) {
                ((com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h) this.receiver).b(view);
                return G0.f406611a;
            }
        }

        /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b extends H implements Y41.l<View, G0> {
            @Override // Y41.l
            public final G0 invoke(View view) {
                ((com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h) this.receiver).a(view);
                return G0.f406611a;
            }
        }

        public d(Context context) {
            View view;
            super(context, 0, 2, null);
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar = ReAgentShortFlowCreationDialogFragment.this.f211516k0;
            a aVar = new a(1, jVar != null ? jVar : null, com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h.class, "setContentView", "setContentView(Landroid/view/View;)V", 0);
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar2 = ReAgentShortFlowCreationDialogFragment.this.f211516k0;
            B(R.layout.re_agent_short_flow_creation_dialog_content, R.layout.re_agent_short_flow_creation_dialog_footer, aVar, new b(1, jVar2 != null ? jVar2 : null, com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h.class, "setFooterView", "setFooterView(Landroid/view/View;)V", 0), false);
            com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
            com.avito.android.lib.design.bottom_sheet.d.I(this, true);
            View viewInflate = LayoutInflater.from(ReAgentShortFlowCreationDialogFragment.this.requireContext()).inflate(R.layout.re_agent_short_flow_creation_dialog_header, (ViewGroup) null);
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar3 = ReAgentShortFlowCreationDialogFragment.this.f211516k0;
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar4 = jVar3 != null ? jVar3 : null;
            boolean z12 = ((ReAgentShortFlowCreationArguments) ReAgentShortFlowCreationDialogFragment.this.f211519n0.getValue()).f211578b != null;
            if (viewInflate != null) {
                jVar4.getClass();
                View viewFindViewById = viewInflate.findViewById(R.id.re_agent_short_flow_creation_back_button);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById;
                D6.G(imageView, z12);
                imageView.setOnClickListener(new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.i(jVar4, 0));
                View viewFindViewById2 = viewInflate.findViewById(R.id.re_agent_short_flow_creation_close_button);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ((ImageView) viewFindViewById2).setOnClickListener(new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.i(jVar4, 1));
                view = viewInflate;
            } else {
                view = null;
            }
            jVar4.f211573b = view;
            H(viewInflate);
            ReAgentShortFlowCreationDialogFragment.this.f211518m0 = this;
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        @InterfaceC42830m
        public final void onBackPressed() {
            ReAgentShortFlowCreationDialogFragment.this.requireActivity().getF21241d().c();
        }
    }

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS50/a;", "it", "Lkotlin/G0;", "invoke", "(LS50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<S50.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(S50.a aVar) {
            ((l) ReAgentShortFlowCreationDialogFragment.this.f211514i0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f211536l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f211536l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f211536l);
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
            return ReAgentShortFlowCreationDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f211538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f211538l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f211538l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211539l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f211539l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211540l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f211540l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReAgentShortFlowCreationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<l> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = ReAgentShortFlowCreationDialogFragment.this.f211513h0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public ReAgentShortFlowCreationDialogFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f211514i0 = new O0(m0.f406844a.b(l.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f211519n0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.a.a().a((com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class), cv.c.b(this), new C28478k(ReAgentShortFlowCreationScreen.f213621d, s.b(this), null, 4, null), (ReAgentShortFlowCreationArguments) this.f211519n0.getValue(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f211515j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f211515j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        d dVar = new d(requireContext());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f211515j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j jVar = this.f211516k0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f211573b = null;
        jVar.f211574c = null;
        jVar.a(null);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}
