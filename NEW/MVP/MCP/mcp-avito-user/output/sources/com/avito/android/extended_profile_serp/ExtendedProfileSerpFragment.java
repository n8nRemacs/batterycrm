package com.avito.android.extended_profile_serp;

import Aw0.InterfaceC13094a;
import Cd.C13243a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import ak.C19902a;
import android.content.Context;
import android.content.DialogInterface;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import bB.InterfaceC25487a;
import bB.b;
import cU0.C27106d;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_serp.di.C30515a;
import com.avito.android.extended_profile_serp.di.InterfaceC30532b;
import com.avito.android.extended_profile_serp.di.InterfaceC30535e;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import oW.InterfaceC44697a;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileSerpFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "Lcom/avito/android/select/p;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSerpFragment extends TabBaseFragment implements InterfaceC28477j.b, com.avito.android.bottom_navigation.ui.fragment.e, com.avito.android.select.p, com.avito.android.ui.status_bar.a {

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public static final a f152448e1 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f152449A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f152450B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public h1 f152451C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public Y0 f152452D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f152453E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f152454F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f152455G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f152456H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f152457I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.viewed.f f152458J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f152459K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public FloatingViewsPresenter f152460L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public Zp0.d f152461M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f152462N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public InterfaceC30560x f152463O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f152464P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_phone_dialog.d f152465Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.adapter.f f152466R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f152467S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public Screen f152468T0;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f152469U0;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f152470V0;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f152471W0;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f152472X0;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public C36135w2 f152473Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f152474Z0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.l
    public C30559w f152475a1;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f152476b1;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.l
    public F f152477c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f152478d1;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public e0 f152479t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f152480u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f152481v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f152482w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.inline_filters.dialog.z f152483x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.i f152484y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.a f152485z0;

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpFragment$a;", "", "<init>", "()V", "", "APPEND_ITEMS_THROTTLE_LIMIT", "J", "", "ARGS", "Ljava/lang/String;", "KEY_INLINE_FILTERS_STATE", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ExtendedProfileSerpFragment a(@Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig) {
            ExtendedProfileSerpFragment extendedProfileSerpFragment = new ExtendedProfileSerpFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extended_profile_serp.args", extendedProfileSerpConfig);
            extendedProfileSerpFragment.setArguments(bundle);
            return extendedProfileSerpFragment;
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<ExtendedProfileSerpConfig> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSerpConfig invoke() {
            Bundle bundleRequireArguments = ExtendedProfileSerpFragment.this.requireArguments();
            return (ExtendedProfileSerpConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_serp.args", ExtendedProfileSerpConfig.class) : bundleRequireArguments.getParcelable("extended_profile_serp.args"));
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Intent, Intent> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Intent invoke(Intent intent) {
            Intent intent2 = intent;
            C19902a.b(intent2, ExtendedProfileSerpFragment.this.q5());
            return intent2;
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$onCreate$1", f = "ExtendedProfileSerpFragment.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152488q;

        /* compiled from: ExtendedProfileSerpFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbB/b;", "event", "Lkotlin/G0;", "emit", "(LbB/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSerpFragment f152490b;

            public a(ExtendedProfileSerpFragment extendedProfileSerpFragment) {
                this.f152490b = extendedProfileSerpFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                F f12;
                androidx.view.y onBackPressedDispatcher;
                bB.b bVar = (bB.b) obj;
                a aVar = ExtendedProfileSerpFragment.f152448e1;
                ExtendedProfileSerpFragment extendedProfileSerpFragment = this.f152490b;
                if (bVar instanceof b.C1994b) {
                    DeepLink deepLink = ((b.C1994b) bVar).f56971a;
                    if (deepLink != null) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = extendedProfileSerpFragment.f152467S0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, deepLink, null, null, 6);
                    }
                    if (extendedProfileSerpFragment.q5() != null) {
                        extendedProfileSerpFragment.r5();
                    } else {
                        ActivityC22955m activityC22955mL1 = extendedProfileSerpFragment.l1();
                        if (activityC22955mL1 != null && (onBackPressedDispatcher = activityC22955mL1.getF21241d()) != null) {
                            onBackPressedDispatcher.c();
                        }
                    }
                } else if (bVar instanceof b.c) {
                    InterfaceC30560x interfaceC30560x = extendedProfileSerpFragment.f152463O0;
                    b.c cVar = (b.c) bVar;
                    (interfaceC30560x != null ? interfaceC30560x : null).a(cVar.f56972a, cVar.f56973b, cVar.f56974c);
                } else if (bVar instanceof b.d) {
                    extendedProfileSerpFragment.D5().accept(new InterfaceC25487a.k(((b.d) bVar).f56975a));
                } else if (bVar instanceof b.f) {
                    F f13 = extendedProfileSerpFragment.f152477c1;
                    if (f13 != null) {
                        b.f fVar = (b.f) bVar;
                        com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, f13.f152525b, fVar.f56977a, f13.f152541r, new a0(f13, fVar.f56978b));
                    }
                } else if (bVar instanceof b.e) {
                    String str = ((b.e) bVar).f56976a;
                    InterfaceC35845m2 interfaceC35845m2 = extendedProfileSerpFragment.f152464P0;
                    if (interfaceC35845m2 == null) {
                        interfaceC35845m2 = null;
                    }
                    C35966w1.g(extendedProfileSerpFragment, Intent.createChooser(interfaceC35845m2.f(null, str), extendedProfileSerpFragment.getResources().getString(R.string.share)), new C30542e(extendedProfileSerpFragment));
                } else if (bVar instanceof b.a) {
                    F f14 = extendedProfileSerpFragment.f152477c1;
                    if (f14 != null) {
                        String str2 = ((b.a) bVar).f56970a;
                        ProfileSearchInputView profileSearchInputView = f14.f152547x;
                        profileSearchInputView.setQuery(str2);
                        profileSearchInputView.b();
                    }
                } else if ((bVar instanceof b.g) && (f12 = extendedProfileSerpFragment.f152477c1) != null) {
                    f12.f152547x.setQuery(((b.g) bVar).f56979a);
                }
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSerpFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152488q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = ExtendedProfileSerpFragment.f152448e1;
                ExtendedProfileSerpFragment extendedProfileSerpFragment = ExtendedProfileSerpFragment.this;
                d0 d0VarD5 = extendedProfileSerpFragment.D5();
                a aVar2 = new a(extendedProfileSerpFragment);
                this.f152488q = 1;
                if (d0VarD5.ke(aVar2, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbB/a;", "it", "Lkotlin/G0;", "invoke", "(LbB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<InterfaceC25487a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC25487a interfaceC25487a) {
            a aVar = ExtendedProfileSerpFragment.f152448e1;
            ExtendedProfileSerpFragment.this.D5().accept(interfaceC25487a);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<ExtendedProfileSerpState> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSerpState invoke() {
            a aVar = ExtendedProfileSerpFragment.f152448e1;
            return ExtendedProfileSerpFragment.this.D5().getState().getValue();
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$onViewCreated$serpView$3$1", f = "ExtendedProfileSerpFragment.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152493q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ F f152495s;

        /* compiled from: ExtendedProfileSerpFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$onViewCreated$serpView$3$1$1", f = "ExtendedProfileSerpFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f152496q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSerpFragment f152497r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ F f152498s;

            /* compiled from: ExtendedProfileSerpFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$onViewCreated$serpView$3$1$1$1", f = "ExtendedProfileSerpFragment.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$g$a$a, reason: collision with other inner class name */
            public static final class C4455a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f152499q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ExtendedProfileSerpFragment f152500r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ F f152501s;

                /* compiled from: ExtendedProfileSerpFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment$g$a$a$a, reason: collision with other inner class name */
                public static final class C4456a extends kotlin.jvm.internal.N implements Y41.l<ExtendedProfileSerpState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ F f152502l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4456a(F f12) {
                        super(1);
                        this.f152502l = f12;
                    }

                    @Override // Y41.l
                    public final G0 invoke(ExtendedProfileSerpState extendedProfileSerpState) {
                        ExtendedProfileSerpState extendedProfileSerpState2 = extendedProfileSerpState;
                        final F f12 = this.f152502l;
                        String str = extendedProfileSerpState2.f152952b;
                        ProfileSearchInputView profileSearchInputView = f12.f152547x;
                        profileSearchInputView.setHint(str);
                        f12.f152516A.post(new RunnableC28882d(7, extendedProfileSerpState2, f12));
                        SearchParams searchParams = f12.f152524I;
                        SearchParams searchParams2 = extendedProfileSerpState2.f152954d;
                        if (!kotlin.jvm.internal.L.f(searchParams, searchParams2)) {
                            f12.f152534k.z1(searchParams2, null);
                            f12.f152524I = searchParams2;
                        }
                        boolean z12 = extendedProfileSerpState2.f152961k;
                        ExtendedProfileSerpState.a aVar = extendedProfileSerpState2.f152968r;
                        profileSearchInputView.setInputVisible(aVar == null && !z12);
                        profileSearchInputView.setShareEnabled((aVar != null || z12 || extendedProfileSerpState2.f152956f == null) ? false : true);
                        C30558v c30558v = extendedProfileSerpState2.f152955e;
                        profileSearchInputView.setSuggestsEnabled(c30558v != null ? c30558v.f153120k : false);
                        f12.f152531h.c(new UV0.c(extendedProfileSerpState2.f152971u));
                        RecyclerView.Adapter adapter = profileSearchInputView.f153387e.getAdapter();
                        if (adapter == null) {
                            throw new IllegalStateException("Adapter must be provided via setter");
                        }
                        adapter.notifyDataSetChanged();
                        Context context = f12.f152545v;
                        ExtendedProfileSerpState.b bVar = extendedProfileSerpState2.f152970t;
                        if (bVar != null && f12.f152521F == null) {
                            com.avito.android.lib.design.bottom_sheet.d dVarA = f12.f152538o.a(bVar.f152979a, bVar.f152980b, context, new b0(f12));
                            dVarA.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.extended_profile_serp.D
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    F f13 = f12;
                                    f13.f152521F = null;
                                    f13.f152526c.invoke(InterfaceC25487a.h.f56957a);
                                }
                            });
                            dVarA.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.extended_profile_serp.E
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    F f13 = f12;
                                    f13.f152521F = null;
                                    f13.f152526c.invoke(InterfaceC25487a.h.f56957a);
                                }
                            });
                            com.avito.android.lib.util.g.a(dVarA);
                            f12.f152521F = dVarA;
                        }
                        View view = f12.f152548y;
                        boolean z13 = extendedProfileSerpState2.f152962l;
                        D6.G(view, z13);
                        String str2 = c30558v != null ? c30558v.f153117h : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        int iJ2 = C35835l0.j(R.attr.textH20, context);
                        int iB2 = y6.b(8);
                        TextView textView = f12.f152543t.f283505v;
                        if (textView != null) {
                            I5.a(textView, str2, false);
                            textView.setTextAppearance(iJ2);
                            D6.c(textView, Integer.valueOf(iB2), null, Integer.valueOf(iB2), null, 10);
                        }
                        if (f12.f152520E) {
                            F.a(f12, f12.f152519D);
                        }
                        if (z13) {
                            f12.f152535l.f(0, 1, 0, 0, 0);
                            f12.f152546w.setRefreshing(false);
                        }
                        com.avito.android.extended_profile_ui_components.l lVar = f12.f152549z;
                        if (aVar != null) {
                            f12.f152524I = null;
                            int iOrdinal = aVar.f152978c.ordinal();
                            if (iOrdinal == 0) {
                                String str3 = aVar.f152976a;
                                f12.f152549z.b(str3 == null ? "" : str3, null, C35835l0.h(R.attr.img_handWithMagnifyingGlass, context), null, null);
                            } else if (iOrdinal == 1) {
                                lVar.c(aVar.f152977b, f12.f152541r);
                            }
                        } else if (z12) {
                            lVar.d();
                        } else {
                            lVar.a();
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4455a(ExtendedProfileSerpFragment extendedProfileSerpFragment, F f12, Continuation<? super C4455a> continuation) {
                    super(2, continuation);
                    this.f152500r = extendedProfileSerpFragment;
                    this.f152501s = f12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4455a(this.f152500r, this.f152501s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((C4455a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f152499q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ExtendedProfileSerpFragment.f152448e1;
                        ExtendedProfileSerpFragment extendedProfileSerpFragment = this.f152500r;
                        extendedProfileSerpFragment.D5().accept(InterfaceC25487a.s.f56968a);
                        n2<ExtendedProfileSerpState> state = extendedProfileSerpFragment.D5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSerpFragment.f152481v0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C4456a c4456a = new C4456a(this.f152501s);
                        this.f152499q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c4456a, this) == coroutine_suspended) {
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
            public a(ExtendedProfileSerpFragment extendedProfileSerpFragment, F f12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f152497r = extendedProfileSerpFragment;
                this.f152498s = f12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f152497r, this.f152498s, continuation);
                aVar.f152496q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((kotlinx.coroutines.T) this.f152496q, null, null, new C4455a(this.f152497r, this.f152498s, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(F f12, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f152495s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSerpFragment.this.new g(this.f152495s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152493q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                F f12 = this.f152495s;
                ExtendedProfileSerpFragment extendedProfileSerpFragment = ExtendedProfileSerpFragment.this;
                a aVar = new a(extendedProfileSerpFragment, f12, null);
                this.f152493q = 1;
                if (C23056p0.b(extendedProfileSerpFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbB/a;", "it", "Lkotlin/G0;", "invoke", "(LbB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<InterfaceC25487a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC25487a interfaceC25487a) {
            a aVar = ExtendedProfileSerpFragment.f152448e1;
            ExtendedProfileSerpFragment.this.D5().accept(interfaceC25487a);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoB/k;", "it", "Lkotlin/G0;", "invoke", "(LoB/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<oB.k, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(oB.k kVar) {
            a aVar = ExtendedProfileSerpFragment.f152448e1;
            ExtendedProfileSerpFragment.this.D5().accept(new InterfaceC25487a.t(kVar));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_serp/ExtendedProfileSerpFragment$j", "Lcom/avito/android/ui/adapter/f;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements com.avito.android.ui.adapter.f {
        public j() {
        }

        @Override // com.avito.android.ui.adapter.f
        /* renamed from: gk */
        public final boolean getF207731j() {
            a aVar = ExtendedProfileSerpFragment.f152448e1;
            return ExtendedProfileSerpFragment.this.D5().getState().getValue().f152967q;
        }

        @Override // com.avito.android.ui.adapter.f
        public final void rp() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExtendedProfileSerpFragment extendedProfileSerpFragment = ExtendedProfileSerpFragment.this;
            if (jCurrentTimeMillis - extendedProfileSerpFragment.f152478d1 < 250) {
                return;
            }
            extendedProfileSerpFragment.D5().accept(InterfaceC25487a.c.f56951a);
            extendedProfileSerpFragment.f152478d1 = System.currentTimeMillis();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f152506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f152506l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f152506l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileSerpFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f152508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f152508l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f152508l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f152509l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f152509l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f152509l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f152510l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f152510l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f152510l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileSerpFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_serp/d0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_serp/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<d0> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final d0 invoke() {
            e0 e0Var = ExtendedProfileSerpFragment.this.f152479t0;
            if (e0Var == null) {
                e0Var = null;
            }
            return (d0) e0Var.get();
        }
    }

    public ExtendedProfileSerpFragment() {
        super(R.layout.extended_profile_serp_fragment);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        this.f152480u0 = new O0(m0.f406844a.b(d0.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f152474Z0 = new NavigationState(false, null, 2, null);
        this.f152476b1 = C42727D.c(new b());
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        D5().accept(InterfaceC25487a.d.f56952a);
        return true;
    }

    public final d0 D5() {
        return (d0) this.f152480u0.getValue();
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f152461M0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new com.avito.android.ui.c(new d.a(this), new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ScreenPerformanceTracker screenPerformanceTracker = this.f152481v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        return new com.avito.android.extended_profile_ui_components.s(activityC22955mRequireActivity, null, screenPerformanceTracker);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f152459K0;
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

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f152481v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.favorite.n nVar = this.f152457I0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.I();
        com.avito.android.advert.viewed.f fVar = this.f152458J0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e0();
        com.avito.android.advert_collection_toast.a aVar = this.f152462N0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        InterfaceC31062w interfaceC31062w = this.f152459K0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.I();
        FloatingViewsPresenter floatingViewsPresenter = this.f152460L0;
        if (floatingViewsPresenter == null) {
            floatingViewsPresenter = null;
        }
        floatingViewsPresenter.a();
        super.onDestroyView();
        F f12 = this.f152477c1;
        if (f12 != null) {
            com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> hVar = f12.f152530g;
            RecyclerView recyclerView = f12.f152516A;
            hVar.onDetachedFromRecyclerView(recyclerView);
            recyclerView.v0(f12.f152522G);
        }
        this.f152477c1 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC31062w interfaceC31062w = this.f152459K0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC31062w interfaceC31062w = this.f152459K0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onResume();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        InterfaceC31062w interfaceC31062w = this.f152459K0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        bundle2.putParcelable("inline_filters_state", interfaceC31062w.d0());
        C30559w c30559w = this.f152475a1;
        if (c30559w == null) {
            c30559w = (C30559w) new P0(this).a(C30559w.class);
        }
        this.f152475a1 = c30559w;
        c30559w.f153121E = bundle2;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        int integer = getResources().getInteger(R.integer.profile_adverts_columns);
        GridLayoutManager.c cVar = this.f152450B0;
        GridLayoutManager.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.recycler.data_aware.c cVar3 = this.f152453E0;
        com.avito.android.recycler.data_aware.c cVar4 = cVar3 != null ? cVar3 : null;
        com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> hVar = this.f152456H0;
        com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> hVar2 = hVar != null ? hVar : null;
        com.avito.konveyor.adapter.a aVar = this.f152454F0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f152455G0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.favorite.n nVar = this.f152457I0;
        com.avito.android.favorite.n nVar2 = nVar != null ? nVar : null;
        com.avito.android.advert.viewed.f fVar = this.f152458J0;
        com.avito.android.advert.viewed.f fVar2 = fVar != null ? fVar : null;
        InterfaceC31062w interfaceC31062w = this.f152459K0;
        InterfaceC31062w interfaceC31062w2 = interfaceC31062w != null ? interfaceC31062w : null;
        FloatingViewsPresenter floatingViewsPresenter = this.f152460L0;
        FloatingViewsPresenter floatingViewsPresenter2 = floatingViewsPresenter != null ? floatingViewsPresenter : null;
        FloatingViewsPresenter floatingViewsPresenter3 = floatingViewsPresenter != null ? floatingViewsPresenter : null;
        ExtendedProfileSerpConfig extendedProfileSerpConfig = (ExtendedProfileSerpConfig) this.f152476b1.getValue();
        h1 h1Var = this.f152451C0;
        h1 h1Var2 = h1Var != null ? h1Var : null;
        Y0 y02 = this.f152452D0;
        Y0 y03 = y02 != null ? y02 : null;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        com.avito.android.extended_profile_phone_dialog.d dVar = this.f152465Q0;
        com.avito.android.extended_profile_phone_dialog.d dVar2 = dVar != null ? dVar : null;
        InterfaceC30999b interfaceC30999b = this.f152482w0;
        InterfaceC30999b interfaceC30999b2 = interfaceC30999b != null ? interfaceC30999b : null;
        com.avito.android.inline_filters.dialog.z zVar = this.f152483x0;
        com.avito.android.inline_filters.dialog.z zVar2 = zVar != null ? zVar : null;
        com.avito.android.select.i iVar = this.f152484y0;
        com.avito.android.select.i iVar2 = iVar != null ? iVar : null;
        com.avito.android.onboarding_manager.a aVar3 = this.f152485z0;
        com.avito.android.onboarding_manager.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.util.text.a aVar5 = this.f152449A0;
        com.avito.android.util.text.a aVar6 = aVar5 != null ? aVar5 : null;
        com.avito.android.lib.beduin_v2.feature.item.b bVar = this.f152469U0;
        com.avito.android.lib.beduin_v2.feature.item.b bVar2 = bVar != null ? bVar : null;
        Screen screen = this.f152468T0;
        Screen screen2 = screen != null ? screen : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f152481v0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        InterfaceC13094a interfaceC13094a = this.f152470V0;
        InterfaceC13094a interfaceC13094a2 = interfaceC13094a != null ? interfaceC13094a : null;
        com.avito.konveyor.a aVar7 = this.f152471W0;
        com.avito.konveyor.a aVar8 = aVar7 != null ? aVar7 : null;
        com.avito.beduin.v2.engine.component.x xVar = D5().f152650N.f398526b;
        C27106d c27106d = D5().f152650N.f398527c;
        com.avito.android.onboarding_manager.f fVar3 = this.f152472X0;
        com.avito.android.onboarding_manager.f fVar4 = fVar3 != null ? fVar3 : null;
        C36135w2 c36135w2 = this.f152473Y0;
        F f12 = new F(view, new e(), viewLifecycleOwner, new f(), integer, cVar2, cVar4, hVar2, aVar2, jVar2, nVar2, fVar2, interfaceC31062w2, floatingViewsPresenter3, floatingViewsPresenter2, extendedProfileSerpConfig, h1Var2, y03, this, parentFragmentManager, dVar2, interfaceC30999b2, aVar6, zVar2, iVar2, aVar4, bVar2, screen2, screenPerformanceTracker2, interfaceC13094a2, aVar8, xVar, c27106d, fVar4, c36135w2 != null ? c36135w2 : null);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new g(f12, null), 3);
        com.avito.android.favorite.n nVar3 = this.f152457I0;
        if (nVar3 == null) {
            nVar3 = null;
        }
        nVar3.s4(f12);
        com.avito.android.advert.viewed.f fVar5 = this.f152458J0;
        if (fVar5 == null) {
            fVar5 = null;
        }
        fVar5.d(f12);
        InterfaceC31062w interfaceC31062w3 = this.f152459K0;
        if (interfaceC31062w3 == null) {
            interfaceC31062w3 = null;
        }
        interfaceC31062w3.w1(f12, f12, null, null, null);
        FloatingViewsPresenter floatingViewsPresenter4 = this.f152460L0;
        if (floatingViewsPresenter4 == null) {
            floatingViewsPresenter4 = null;
        }
        floatingViewsPresenter4.c(f12);
        FloatingViewsPresenter floatingViewsPresenter5 = this.f152460L0;
        if (floatingViewsPresenter5 == null) {
            floatingViewsPresenter5 = null;
        }
        com.avito.android.ui.adapter.f fVar6 = this.f152466R0;
        if (fVar6 == null) {
            fVar6 = null;
        }
        floatingViewsPresenter5.g(fVar6);
        FloatingViewsPresenter floatingViewsPresenter6 = this.f152460L0;
        if (floatingViewsPresenter6 == null) {
            floatingViewsPresenter6 = null;
        }
        floatingViewsPresenter6.d(true);
        com.avito.android.advert_collection_toast.a aVar9 = this.f152462N0;
        if (aVar9 == null) {
            aVar9 = null;
        }
        aVar9.d(view, this);
        this.f152477c1 = f12;
        com.avito.android.deeplink_handler.handler.composite.a aVar10 = this.f152467S0;
        if (aVar10 == null) {
            aVar10 = null;
        }
        C43175k.K(new C43197r1(new C30514d(this, null), kotlinx.coroutines.rx3.y.a(aVar10.V9())), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f152481v0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        C30559w c30559w = this.f152475a1;
        if (c30559w == null) {
            c30559w = (C30559w) new P0(this).a(C30559w.class);
        }
        this.f152475a1 = c30559w;
        if (bundle == null) {
            c30559w.f153121E = null;
        }
        Bundle bundle2 = c30559w.f153121E;
        InterfaceC30532b.a aVarA = C30515a.a();
        ActivityC22955m activityC22955mL1 = l1();
        Resources resources = getResources();
        ExtendedProfileSerpConfig extendedProfileSerpConfig = (ExtendedProfileSerpConfig) this.f152476b1.getValue();
        InterfaceC30535e interfaceC30535e = (InterfaceC30535e) C29972i.a(C29972i.b(this), InterfaceC30535e.class);
        InterfaceC44697a interfaceC44697a = (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        ExtendedProfileSerpScreen extendedProfileSerpScreen = ExtendedProfileSerpScreen.f152515d;
        h hVar = new h();
        i iVar = new i();
        S0 f42820b = getF42820b();
        Kundle kundleA = bundle2 != null ? com.avito.android.util.G.a(bundle2, "inline_filters_state") : null;
        InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
        aVarA.a(activityC22955mL1, this, resources, extendedProfileSerpConfig, interfaceC30535e, interfaceC44697a, interfaceC39417aB, rVarC, extendedProfileSerpScreen, this, hVar, iVar, f42820b, kundleA, new j()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f152481v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF312328l1() {
        return this.f152474Z0;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
