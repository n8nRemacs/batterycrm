package com.avito.android.extended_profile_selection_create.select;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Aw0.InterfaceC13094a;
import Cd.C13243a;
import RA.a;
import RA.b;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU0.C27106d;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateActivity;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.di.b;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import java.text.DecimalFormat;
import java.util.List;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import oW.InterfaceC44697a;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileSelectionCreateFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSelectionCreateFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c, com.avito.android.select.p {

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final a f151942L0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public FloatingViewsPresenter f151943A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public Zp0.d f151944B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC30507i f151945C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f151946D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public Screen f151947E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f151948F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f151949G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public C36135w2 f151950H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public C30506h f151951I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f151952J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public H f151953K0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public K f151954n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f151955o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f151956p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f151957q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f151958r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.inline_filters.dialog.z f151959s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.i f151960t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.a f151961u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f151962v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f151963w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public QH.b f151964x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f151965y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f151966z0;

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateFragment$a;", "", "<init>", "()V", "", "ARGS", "Ljava/lang/String;", "KEY_INLINE_FILTERS_STATE", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_selection_create/ExtendedProfileSelectionCreateConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ExtendedProfileSelectionCreateConfig> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSelectionCreateConfig invoke() {
            Bundle bundleRequireArguments = ExtendedProfileSelectionCreateFragment.this.requireArguments();
            return (ExtendedProfileSelectionCreateConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_selection_create.args", ExtendedProfileSelectionCreateConfig.class) : bundleRequireArguments.getParcelable("extended_profile_selection_create.args"));
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$onCreate$1", f = "ExtendedProfileSelectionCreateFragment.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151968q;

        /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRA/b;", "event", "Lkotlin/G0;", "emit", "(LRA/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSelectionCreateFragment f151970b;

            public a(ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment) {
                this.f151970b = extendedProfileSelectionCreateFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                RA.b bVar = (RA.b) obj;
                a aVar = ExtendedProfileSelectionCreateFragment.f151942L0;
                ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment = this.f151970b;
                if (bVar instanceof b.a) {
                    extendedProfileSelectionCreateFragment.requireActivity().finish();
                } else if (bVar instanceof b.c) {
                    ActivityC22955m activityC22955mRequireActivity = extendedProfileSelectionCreateFragment.requireActivity();
                    activityC22955mRequireActivity.setResult(-1, activityC22955mRequireActivity.getIntent());
                    b.c cVar = (b.c) bVar;
                    if (cVar.f14184b) {
                        activityC22955mRequireActivity.getIntent().putExtra("ExtendedProfileSelectionCreate_isCreated", true);
                    }
                    ExtendedProfileSelectionCreateActivity.a aVar2 = ExtendedProfileSelectionCreateActivity.f151610m;
                    Context contextRequireContext = extendedProfileSelectionCreateFragment.requireContext();
                    aVar2.getClass();
                    Intent intentPutExtra = new Intent(contextRequireContext, (Class<?>) ExtendedProfileSelectionCreateActivity.class).putExtra("extended_profile.selection.set_selection_name_args", cVar.f14183a).putExtra("extended_profile.selection.screen_name", "extended_profile.selection.set_name_screen");
                    intentPutExtra.setFlags(603979776);
                    extendedProfileSelectionCreateFragment.startActivity(intentPutExtra);
                } else {
                    if (bVar instanceof b.C0944b) {
                        InterfaceC30507i interfaceC30507i = extendedProfileSelectionCreateFragment.f151945C0;
                        b.C0944b c0944b = (b.C0944b) bVar;
                        (interfaceC30507i != null ? interfaceC30507i : null).a(c0944b.f14180a, c0944b.f14181b, c0944b.f14182c);
                    } else if (bVar instanceof b.f) {
                        H h12 = extendedProfileSelectionCreateFragment.f151953K0;
                        if (h12 != null) {
                            String str = ((b.f) bVar).f14187a;
                            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.c.e(cVar2, h12.f152004b, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, false, false, null, null, h12.f152014l, 4014);
                        }
                    } else if (bVar instanceof b.e) {
                        H h13 = extendedProfileSelectionCreateFragment.f151953K0;
                        if (h13 != null) {
                            b.e eVar = (b.e) bVar;
                            Throwable th2 = eVar.f14185a;
                            com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                            a.i iVar = eVar.f14186b;
                            com.avito.android.extended_profile_ui_components.p.c(pVar, h13.f152004b, th2, h13.f152014l, iVar != null ? new F(h13, iVar) : null);
                        }
                    } else if (bVar instanceof b.d) {
                        ((b.d) bVar).getClass();
                        InterfaceC35845m2 interfaceC35845m2 = extendedProfileSelectionCreateFragment.f151946D0;
                        if (interfaceC35845m2 == null) {
                            interfaceC35845m2 = null;
                        }
                        C35966w1.g(extendedProfileSelectionCreateFragment, Intent.createChooser(interfaceC35845m2.f(null, null), extendedProfileSelectionCreateFragment.getResources().getString(R.string.share)), new C30496a(extendedProfileSelectionCreateFragment));
                    }
                }
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSelectionCreateFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151968q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = ExtendedProfileSelectionCreateFragment.f151942L0;
                ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment = ExtendedProfileSelectionCreateFragment.this;
                J jQ5 = extendedProfileSelectionCreateFragment.q5();
                a aVar2 = new a(extendedProfileSelectionCreateFragment);
                this.f151968q = 1;
                if (jQ5.ke(aVar2, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRA/a;", "it", "Lkotlin/G0;", "invoke", "(LRA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<RA.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RA.a aVar) {
            a aVar2 = ExtendedProfileSelectionCreateFragment.f151942L0;
            ExtendedProfileSelectionCreateFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<ExtendedProfileSelectionCreateState> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSelectionCreateState invoke() {
            a aVar = ExtendedProfileSelectionCreateFragment.f151942L0;
            return ExtendedProfileSelectionCreateFragment.this.q5().getState().getValue();
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$onViewCreated$selectionCreateView$3$1", f = "ExtendedProfileSelectionCreateFragment.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151973q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ H f151975s;

        /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$onViewCreated$selectionCreateView$3$1$1", f = "ExtendedProfileSelectionCreateFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f151976q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSelectionCreateFragment f151977r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ H f151978s;

            /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$onViewCreated$selectionCreateView$3$1$1$1", f = "ExtendedProfileSelectionCreateFragment.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$f$a$a, reason: collision with other inner class name */
            public static final class C4444a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f151979q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ExtendedProfileSelectionCreateFragment f151980r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ H f151981s;

                /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment$f$a$a$a, reason: collision with other inner class name */
                public static final class C4445a extends N implements Y41.l<ExtendedProfileSelectionCreateState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ H f151982l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4445a(H h12) {
                        super(1);
                        this.f151982l = h12;
                    }

                    @Override // Y41.l
                    public final G0 invoke(ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState) {
                        com.avito.android.lib.design.bottom_sheet.d dVar;
                        ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState2 = extendedProfileSelectionCreateState;
                        H h12 = this.f151982l;
                        String str = extendedProfileSelectionCreateState2.f152341b;
                        ProfileSearchInputView profileSearchInputView = h12.f152019q;
                        profileSearchInputView.setHint(str);
                        String query = profileSearchInputView.getQuery();
                        SearchParams searchParams = extendedProfileSelectionCreateState2.f152343d;
                        String query2 = searchParams.getQuery();
                        if (query2 == null) {
                            query2 = "";
                        }
                        if (!kotlin.jvm.internal.L.f(query, query2)) {
                            String query3 = searchParams.getQuery();
                            profileSearchInputView.setQuery(query3 != null ? query3 : "");
                        }
                        h12.f152008f.l(extendedProfileSelectionCreateState2.f152358s, new RunnableC28882d(6, h12, extendedProfileSelectionCreateState2));
                        if (!kotlin.jvm.internal.L.f(h12.f152003G, searchParams)) {
                            h12.f152010h.z1(searchParams, null);
                            h12.f152003G = searchParams;
                        }
                        boolean z12 = extendedProfileSelectionCreateState2.f152348i;
                        ExtendedProfileSelectionCreateState.a aVar = extendedProfileSelectionCreateState2.f152363x;
                        profileSearchInputView.setInputVisible(aVar == null && !z12);
                        PrintableText printableText = extendedProfileSelectionCreateState2.f152360u;
                        Context context = h12.f152017o;
                        String strK0 = printableText.k0(context);
                        TextView textView = h12.f152021s;
                        I5.a(textView, strK0, false);
                        if (extendedProfileSelectionCreateState2.f152361v) {
                            textView.setTextColor(C35835l0.d(R.attr.red600, context));
                        } else {
                            textView.setTextColor(C35835l0.d(R.attr.black, context));
                        }
                        boolean z13 = extendedProfileSelectionCreateState2.f152362w;
                        Button button = h12.f152022t;
                        button.setClickable(!z13);
                        button.setLoading(z13);
                        h12.f152023u.setVisibility(z13 ? 0 : 8);
                        TextView textView2 = h12.f152024v;
                        TextView textView3 = textView2 == null ? null : textView2;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        Resources resources = textView2.getResources();
                        DecimalFormat decimalFormat = h12.f152026x;
                        int i12 = extendedProfileSelectionCreateState2.f152345f;
                        I5.a(textView3, resources.getQuantityString(R.plurals.extended_profile_selection_create_search_header, i12, decimalFormat.format(Integer.valueOf(i12))), false);
                        View view = h12.f152025w;
                        if (view == null) {
                            view = null;
                        }
                        view.setVisibility(i12 == 0 ? 4 : 0);
                        View view2 = h12.f152020r;
                        boolean z14 = extendedProfileSelectionCreateState2.f152349j;
                        D6.G(view2, z14);
                        if (z14) {
                            h12.f152011i.f(0, 1, 0, 0, 0);
                            h12.f152018p.setRefreshing(false);
                        }
                        com.avito.android.extended_profile_ui_components.l lVar = h12.f152027y;
                        if (aVar != null) {
                            h12.f152003G = null;
                            lVar.c(aVar.f152369a, h12.f152014l);
                        } else if (z12) {
                            lVar.d();
                        } else {
                            lVar.a();
                        }
                        boolean z15 = extendedProfileSelectionCreateState2.f152364y;
                        final QA.c cVar = h12.f152000D;
                        if (z15) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = cVar.f13589c;
                            if (dVar2 == null || !dVar2.isShowing()) {
                                com.avito.android.lib.design.bottom_sheet.d dVar3 = cVar.f13589c;
                                if (dVar3 != null) {
                                    dVar3.dismiss();
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar4 = new com.avito.android.lib.design.bottom_sheet.d(cVar.f13587a, 0, 2, null);
                                dVar4.setContentView(R.layout.extended_profile_selection_create_more_actions_menu);
                                dVar4.S(C35835l0.g(dVar4.getContext()).y);
                                com.avito.android.lib.design.bottom_sheet.d.M(dVar4, null, false, true, 7);
                                cVar.f13590d = (TextView) dVar4.findViewById(R.id.selection_create_menu_select_all_action);
                                cVar.f13591e = (TextView) dVar4.findViewById(R.id.selection_create_menu_unselect_all_action);
                                TextView textView4 = cVar.f13590d;
                                if (textView4 != null) {
                                    final int i13 = 0;
                                    textView4.setOnClickListener(new View.OnClickListener() { // from class: QA.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i13) {
                                                case 0:
                                                    cVar.f13588b.invoke(a.n.f14176a);
                                                    break;
                                                default:
                                                    cVar.f13588b.invoke(a.p.f14178a);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                TextView textView5 = cVar.f13591e;
                                if (textView5 != null) {
                                    final int i14 = 1;
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: QA.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i14) {
                                                case 0:
                                                    cVar.f13588b.invoke(a.n.f14176a);
                                                    break;
                                                default:
                                                    cVar.f13588b.invoke(a.p.f14178a);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                dVar4.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(cVar, 2));
                                com.avito.android.lib.util.g.a(dVar4);
                                cVar.f13589c = dVar4;
                            }
                        } else {
                            com.avito.android.lib.design.bottom_sheet.d dVar5 = cVar.f13589c;
                            if (dVar5 != null && dVar5.isShowing() && (dVar = cVar.f13589c) != null) {
                                dVar.dismiss();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4444a(ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment, H h12, Continuation<? super C4444a> continuation) {
                    super(2, continuation);
                    this.f151980r = extendedProfileSelectionCreateFragment;
                    this.f151981s = h12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4444a(this.f151980r, this.f151981s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4444a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f151979q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ExtendedProfileSelectionCreateFragment.f151942L0;
                        ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment = this.f151980r;
                        extendedProfileSelectionCreateFragment.q5().accept(a.k.f14173a);
                        n2<ExtendedProfileSelectionCreateState> state = extendedProfileSelectionCreateFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSelectionCreateFragment.f151957q0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C4445a c4445a = new C4445a(this.f151981s);
                        this.f151979q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c4445a, this) == coroutine_suspended) {
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
            public a(ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment, H h12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f151977r = extendedProfileSelectionCreateFragment;
                this.f151978s = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f151977r, this.f151978s, continuation);
                aVar.f151976q = obj;
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
                C43259k.d((T) this.f151976q, null, null, new C4444a(this.f151977r, this.f151978s, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(H h12, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f151975s = h12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSelectionCreateFragment.this.new f(this.f151975s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151973q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                H h12 = this.f151975s;
                ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment = ExtendedProfileSelectionCreateFragment.this;
                a aVar = new a(extendedProfileSelectionCreateFragment, h12, null);
                this.f151973q = 1;
                if (C23056p0.b(extendedProfileSelectionCreateFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRA/a;", "it", "Lkotlin/G0;", "invoke", "(LRA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<RA.a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RA.a aVar) {
            a aVar2 = ExtendedProfileSelectionCreateFragment.f151942L0;
            ExtendedProfileSelectionCreateFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ExtendedProfileSelectionCreateFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ExtendedProfileSelectionCreateFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return ExtendedProfileSelectionCreateFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f151987l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f151987l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f151987l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileSelectionCreateFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f151989l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f151989l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f151989l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151990l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f151990l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151991l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151991l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f151991l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/J;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_selection_create/select/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<J> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final J invoke() {
            K k12 = ExtendedProfileSelectionCreateFragment.this.f151954n0;
            if (k12 == null) {
                k12 = null;
            }
            return (J) k12.get();
        }
    }

    public ExtendedProfileSelectionCreateFragment() {
        super(R.layout.extended_profile_selection_create_fragment);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        n0 n0Var = m0.f406844a;
        this.f151955o0 = new O0(n0Var.b(J.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f151956p0 = new O0(n0Var.b(HA.e.class), new h(), new j(), new i());
        this.f151952J0 = C42727D.c(new b());
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f151944B0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(a.c.f14165a);
        return true;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.q(list);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f151957q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.I();
        FloatingViewsPresenter floatingViewsPresenter = this.f151943A0;
        if (floatingViewsPresenter == null) {
            floatingViewsPresenter = null;
        }
        floatingViewsPresenter.a();
        super.onDestroyView();
        H h12 = this.f151953K0;
        if (h12 != null) {
            h12.f152028z.v0(h12.f152001E);
        }
        this.f151953K0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        bundle2.putParcelable("inline_filters_state", interfaceC31062w.d0());
        C30506h c30506h = this.f151951I0;
        if (c30506h == null) {
            c30506h = (C30506h) new P0(this).a(C30506h.class);
        }
        this.f151951I0 = c30506h;
        c30506h.f152281E = bundle2;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        int integer = getResources().getInteger(R.integer.profile_adverts_columns);
        com.avito.konveyor.adapter.d dVar = this.f151965y0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        QH.b bVar = this.f151964x0;
        QH.b bVar2 = bVar != null ? bVar : null;
        InterfaceC31062w interfaceC31062w = this.f151966z0;
        InterfaceC31062w interfaceC31062w2 = interfaceC31062w != null ? interfaceC31062w : null;
        FloatingViewsPresenter floatingViewsPresenter = this.f151943A0;
        FloatingViewsPresenter floatingViewsPresenter2 = floatingViewsPresenter != null ? floatingViewsPresenter : null;
        FloatingViewsPresenter floatingViewsPresenter3 = floatingViewsPresenter != null ? floatingViewsPresenter : null;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        InterfaceC30999b interfaceC30999b = this.f151958r0;
        InterfaceC30999b interfaceC30999b2 = interfaceC30999b != null ? interfaceC30999b : null;
        com.avito.android.inline_filters.dialog.z zVar = this.f151959s0;
        com.avito.android.inline_filters.dialog.z zVar2 = zVar != null ? zVar : null;
        com.avito.android.select.i iVar = this.f151960t0;
        com.avito.android.select.i iVar2 = iVar != null ? iVar : null;
        com.avito.android.onboarding_manager.a aVar = this.f151961u0;
        com.avito.android.onboarding_manager.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.onboarding_manager.f fVar = this.f151962v0;
        com.avito.android.onboarding_manager.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.util.text.a aVar3 = this.f151963w0;
        com.avito.android.util.text.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.lib.beduin_v2.feature.item.b bVar3 = this.f151948F0;
        com.avito.android.lib.beduin_v2.feature.item.b bVar4 = bVar3 != null ? bVar3 : null;
        Screen screen = this.f151947E0;
        Screen screen2 = screen != null ? screen : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f151957q0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        InterfaceC13094a interfaceC13094a = this.f151949G0;
        InterfaceC13094a interfaceC13094a2 = interfaceC13094a != null ? interfaceC13094a : null;
        com.avito.beduin.v2.engine.component.x xVar = q5().f152029N.f398526b;
        C27106d c27106d = q5().f152029N.f398527c;
        C36135w2 c36135w2 = this.f151950H0;
        H h12 = new H(view, new d(), viewLifecycleOwner, new e(), integer, dVar2, bVar2, interfaceC31062w2, floatingViewsPresenter3, floatingViewsPresenter2, this, parentFragmentManager, interfaceC30999b2, aVar4, zVar2, iVar2, aVar2, fVar2, bVar4, screen2, screenPerformanceTracker2, interfaceC13094a2, xVar, c27106d, c36135w2 != null ? c36135w2 : null);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new f(h12, null), 3);
        InterfaceC31062w interfaceC31062w3 = this.f151966z0;
        if (interfaceC31062w3 == null) {
            interfaceC31062w3 = null;
        }
        interfaceC31062w3.w1(h12, h12, null, null, null);
        FloatingViewsPresenter floatingViewsPresenter4 = this.f151943A0;
        if (floatingViewsPresenter4 == null) {
            floatingViewsPresenter4 = null;
        }
        floatingViewsPresenter4.c(h12);
        FloatingViewsPresenter floatingViewsPresenter5 = this.f151943A0;
        if (floatingViewsPresenter5 == null) {
            floatingViewsPresenter5 = null;
        }
        floatingViewsPresenter5.d(true);
        this.f151953K0 = h12;
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f151957q0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        C30506h c30506h = this.f151951I0;
        if (c30506h == null) {
            c30506h = (C30506h) new P0(this).a(C30506h.class);
        }
        this.f151951I0 = c30506h;
        if (bundle == null) {
            c30506h.f152281E = null;
        }
        Bundle bundle2 = c30506h.f152281E;
        b.a aVarA = com.avito.android.extended_profile_selection_create.select.di.a.a();
        ActivityC22955m activityC22955mL1 = l1();
        Resources resources = getResources();
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = (ExtendedProfileSelectionCreateConfig) this.f151952J0.getValue();
        Z1<HA.g> z12 = ((HA.e) this.f151956p0.getValue()).f6972E;
        com.avito.android.extended_profile_selection_create.select.di.c cVar = (com.avito.android.extended_profile_selection_create.select.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_selection_create.select.di.c.class);
        InterfaceC44697a interfaceC44697a = (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        ExtendedProfileSelectionCreateScreen extendedProfileSelectionCreateScreen = ExtendedProfileSelectionCreateScreen.f151993d;
        g gVar = new g();
        S0 f42820b = getF42820b();
        Kundle kundleA = bundle2 != null ? com.avito.android.util.G.a(bundle2, "inline_filters_state") : null;
        InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
        aVarA.a(activityC22955mL1, this, resources, extendedProfileSelectionCreateConfig, z12, cVar, interfaceC44697a, interfaceC39417aB, rVarC, extendedProfileSelectionCreateScreen, this, gVar, f42820b, kundleA).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f151957q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final J q5() {
        return (J) this.f151955o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
