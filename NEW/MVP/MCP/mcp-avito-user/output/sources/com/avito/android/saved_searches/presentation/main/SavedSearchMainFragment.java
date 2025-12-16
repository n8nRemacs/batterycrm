package com.avito.android.saved_searches.presentation.main;

import Cd.C13243a;
import Eo0.InterfaceC13515a;
import Eo0.InterfaceC13516b;
import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SavedSearchMainScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainViewState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import md.InterfaceC44055a;
import z1.AbstractC50339a;

/* compiled from: SavedSearchMainFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/SavedSearchMainFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchMainFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f258577w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.presentation.main.k f258578n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f258579o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f258580p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f258581q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f258582r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.presentation.core.f f258583s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f258584t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.presentation.core.h f258585u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.saved_searches.presentation.main.h f258586v0;

    /* compiled from: SavedSearchMainFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/SavedSearchMainFragment$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SavedSearchMainFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC13515a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13515a interfaceC13515a) {
            ((com.avito.android.saved_searches.presentation.main.j) this.receiver).accept(interfaceC13515a);
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchMainFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC13516b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13516b interfaceC13516b) {
            InterfaceC13516b interfaceC13516b2 = interfaceC13516b;
            SavedSearchMainFragment savedSearchMainFragment = (SavedSearchMainFragment) this.receiver;
            a aVar = SavedSearchMainFragment.f258577w0;
            savedSearchMainFragment.getClass();
            if (interfaceC13516b2 instanceof InterfaceC13516b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = savedSearchMainFragment.f258584t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC13516b.a) interfaceC13516b2).f4257a, null, null, 6);
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.C0256b) {
                com.avito.android.saved_searches.presentation.core.h hVar = savedSearchMainFragment.f258585u0;
                (hVar != null ? hVar : null).b();
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.c) {
                com.avito.android.saved_searches.presentation.core.h hVar2 = savedSearchMainFragment.f258585u0;
                (hVar2 != null ? hVar2 : null).a();
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.d) {
                com.avito.android.saved_searches.presentation.core.h hVar3 = savedSearchMainFragment.f258585u0;
                (hVar3 != null ? hVar3 : null).g(((InterfaceC13516b.d) interfaceC13516b2).f4260a);
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.e) {
                com.avito.android.saved_searches.presentation.core.h hVar4 = savedSearchMainFragment.f258585u0;
                (hVar4 != null ? hVar4 : null).d();
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.f) {
                com.avito.android.saved_searches.presentation.core.h hVar5 = savedSearchMainFragment.f258585u0;
                (hVar5 != null ? hVar5 : null).e(((InterfaceC13516b.f) interfaceC13516b2).f4262a);
            } else if (interfaceC13516b2 instanceof InterfaceC13516b.g) {
                InterfaceC13516b.g gVar = (InterfaceC13516b.g) interfaceC13516b2;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, savedSearchMainFragment, gVar.f4263a, null, null, gVar.f4264b, gVar.f4265c, gVar.f4266d, 910);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchMainFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<SavedSearchMainState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SavedSearchMainState savedSearchMainState) {
            SavedSearchMainState savedSearchMainState2 = savedSearchMainState;
            com.avito.android.saved_searches.presentation.main.h hVar = SavedSearchMainFragment.this.f258586v0;
            if (hVar != null) {
                SavedSearchMainViewState savedSearchMainViewState = savedSearchMainState2.f258669i;
                boolean z12 = savedSearchMainViewState instanceof SavedSearchMainViewState.Loading;
                C42670a c42670a = hVar.f258612h;
                com.avito.konveyor.adapter.a aVar = hVar.f258606b;
                if (z12) {
                    c42670a.b();
                    aVar.c(new UV0.c(((SavedSearchMainViewState.Loading) savedSearchMainViewState).f258679b));
                    hVar.a(null, null);
                } else if (savedSearchMainViewState instanceof SavedSearchMainViewState.Content) {
                    c42670a.b();
                    SavedSearchMainViewState.Content content = (SavedSearchMainViewState.Content) savedSearchMainViewState;
                    aVar.c(new UV0.c(content.f258670b));
                    hVar.a(content.f258671c, content.f258672d);
                    N0 n02 = hVar.f258616l;
                    if (n02 != null) {
                        ((V0) n02).c(null);
                    }
                    C22977J c22977j = hVar.f258615k;
                    hVar.f258616l = c22977j != null ? C43259k.d(c22977j, null, null, new com.avito.android.saved_searches.presentation.main.d(hVar, null), 3) : null;
                } else if (savedSearchMainViewState instanceof SavedSearchMainViewState.Error) {
                    c42670a.c(null, new com.avito.android.saved_searches.presentation.main.g(savedSearchMainViewState, hVar));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchMainFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<String, Bundle, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            int i12 = Build.VERSION.SDK_INT;
            SavedSearchData.Settings.SettingsDetails settingsDetails = (SavedSearchData.Settings.SettingsDetails) (i12 >= 34 ? (Parcelable) bundle2.getParcelable("tag.settings_details_push_key", SavedSearchData.Settings.SettingsDetails.class) : bundle2.getParcelable("tag.settings_details_push_key"));
            SavedSearchMainFragment savedSearchMainFragment = SavedSearchMainFragment.this;
            if (settingsDetails != null) {
                a aVar = SavedSearchMainFragment.f258577w0;
                savedSearchMainFragment.q5().accept(new InterfaceC13515a.j(settingsDetails));
            }
            SavedSearchData.Settings.SettingsDetails settingsDetails2 = (SavedSearchData.Settings.SettingsDetails) (i12 >= 34 ? (Parcelable) bundle2.getParcelable("tag.settings_details_email_key", SavedSearchData.Settings.SettingsDetails.class) : bundle2.getParcelable("tag.settings_details_email_key"));
            if (settingsDetails2 != null) {
                a aVar2 = SavedSearchMainFragment.f258577w0;
                savedSearchMainFragment.q5().accept(new InterfaceC13515a.b(settingsDetails2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f258589l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f258589l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f258589l);
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
            return SavedSearchMainFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f258591l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f258591l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f258591l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258592l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258592l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f258592l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258593l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258593l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f258593l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SavedSearchMainFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/saved_searches/presentation/main/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.saved_searches.presentation.main.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.saved_searches.presentation.main.j invoke() {
            com.avito.android.saved_searches.presentation.main.k kVar = SavedSearchMainFragment.this.f258578n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.saved_searches.presentation.main.j) kVar.get();
        }
    }

    public SavedSearchMainFragment() {
        super(R.layout.saved_search_main_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f258579o0 = new O0(m0.f406844a.b(com.avito.android.saved_searches.presentation.main.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((com.avito.android.saved_searches.di.core.b) ((InterfaceC44055a) getParentFragment()).r0()).c().a(C22984Q.a(getViewLifecycleOwner()), new C28478k(SavedSearchMainScreen.f90467d, s.c(this), null, 4, null), new com.avito.android.saved_searches.presentation.main.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258580p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258580p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.saved_searches.presentation.main.h hVar = this.f258586v0;
        if (hVar != null) {
            C22823h0.K(hVar.f258605a.getWindow().getDecorView(), null);
            D6.o(hVar.f258613i, 200L);
        }
        this.f258586v0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q5().accept(InterfaceC13515a.n.f4254a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        com.avito.konveyor.adapter.a aVar = this.f258581q0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        b bVar = new b(1, q5(), com.avito.android.saved_searches.presentation.main.j.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        Dialog dialogRequireDialog = ((DialogFragment) requireParentFragment()).requireDialog();
        com.avito.konveyor.adapter.j jVar = this.f258582r0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.saved_searches.presentation.core.f fVar = this.f258583s0;
        this.f258586v0 = new com.avito.android.saved_searches.presentation.main.h(activityC22955mRequireActivity, dialogRequireDialog, jVar2, view, aVar2, bVar, fVar != null ? fVar : null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258580p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new c(1, this, SavedSearchMainFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainOneTimeEvent;)V", 0), new d());
        C22960s.b(this, "tag.SavedSearchSettingsFragment", new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258580p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    public final com.avito.android.saved_searches.presentation.main.j q5() {
        return (com.avito.android.saved_searches.presentation.main.j) this.f258579o0.getValue();
    }
}
