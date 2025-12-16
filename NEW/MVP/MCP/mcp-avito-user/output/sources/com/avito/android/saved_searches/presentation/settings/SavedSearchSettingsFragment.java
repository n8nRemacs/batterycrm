package com.avito.android.saved_searches.presentation.settings;

import Cd.C13243a;
import Fo0.InterfaceC13822a;
import Fo0.InterfaceC13823b;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.analytics.screens.SavedSearchNotificationSettingsScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsState;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsViewState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import javax.inject.Inject;
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
import md.InterfaceC44055a;
import z1.AbstractC50339a;

/* compiled from: SavedSearchSettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/SavedSearchSettingsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchSettingsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @k
    public static final a f258724t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.presentation.settings.g f258725n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f258726o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f258727p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f258728q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f258729r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.presentation.core.h f258730s0;

    /* compiled from: SavedSearchSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/SavedSearchSettingsFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SavedSearchSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsFragment$a$a, reason: collision with other inner class name */
        public static final class C7767a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SavedSearchData.Settings.SettingsDetails f258731l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ SavedSearchSettingsMode f258732m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7767a(SavedSearchData.Settings.SettingsDetails settingsDetails, SavedSearchSettingsMode savedSearchSettingsMode) {
                super(1);
                this.f258731l = settingsDetails;
                this.f258732m = savedSearchSettingsMode;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("key.saved_search_settings_details", this.f258731l);
                bundle2.putParcelable("key.saved_search_settings_mode", this.f258732m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SavedSearchSettingsFragment a(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode) {
            SavedSearchSettingsFragment savedSearchSettingsFragment = new SavedSearchSettingsFragment();
            C35966w1.a(savedSearchSettingsFragment, 2, new C7767a(settingsDetails, savedSearchSettingsMode));
            return savedSearchSettingsFragment;
        }

        public a() {
        }
    }

    /* compiled from: SavedSearchSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC13823b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13823b interfaceC13823b) {
            InterfaceC13823b interfaceC13823b2 = interfaceC13823b;
            SavedSearchSettingsFragment savedSearchSettingsFragment = (SavedSearchSettingsFragment) this.receiver;
            a aVar = SavedSearchSettingsFragment.f258724t0;
            savedSearchSettingsFragment.getClass();
            if (interfaceC13823b2 instanceof InterfaceC13823b.a) {
                com.avito.android.saved_searches.presentation.core.h hVar = savedSearchSettingsFragment.f258730s0;
                (hVar != null ? hVar : null).b();
            } else if (interfaceC13823b2 instanceof InterfaceC13823b.C0304b) {
                String tag = savedSearchSettingsFragment.getTag();
                if (tag == null) {
                    tag = "";
                }
                Bundle bundle = new Bundle();
                InterfaceC13823b.C0304b c0304b = (InterfaceC13823b.C0304b) interfaceC13823b2;
                SavedSearchSettingsMode savedSearchSettingsMode = c0304b.f5989a;
                savedSearchSettingsMode.getClass();
                SavedSearchSettingsMode savedSearchSettingsMode2 = SavedSearchSettingsMode.f258740b;
                SavedSearchData.Settings.SettingsDetails settingsDetails = c0304b.f5990b;
                if (savedSearchSettingsMode == savedSearchSettingsMode2) {
                    bundle.putParcelable("tag.settings_details_push_key", settingsDetails);
                } else {
                    bundle.putParcelable("tag.settings_details_email_key", settingsDetails);
                }
                G0 g02 = G0.f406611a;
                C22960s.a(bundle, savedSearchSettingsFragment, tag);
                com.avito.android.saved_searches.presentation.core.h hVar2 = savedSearchSettingsFragment.f258730s0;
                (hVar2 != null ? hVar2 : null).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<SavedSearchSettingsState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.saved_searches.presentation.settings.e f258733l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.saved_searches.presentation.settings.e eVar) {
            super(1);
            this.f258733l = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(SavedSearchSettingsState savedSearchSettingsState) {
            com.avito.android.saved_searches.presentation.settings.e eVar = this.f258733l;
            SavedSearchSettingsViewState savedSearchSettingsViewState = savedSearchSettingsState.f258777f;
            I5.a(eVar.f258749c, savedSearchSettingsViewState.f258778b, false);
            eVar.f258747a.c(new UV0.c(savedSearchSettingsViewState.f258779c));
            RecyclerView.Adapter adapter = eVar.f258750d.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<InterfaceC13822a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13822a interfaceC13822a) {
            ((com.avito.android.saved_searches.presentation.settings.f) this.receiver).accept(interfaceC13822a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f258734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f258734l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f258734l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SavedSearchSettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f258736l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f258736l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f258736l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258737l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258737l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f258737l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258738l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f258738l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SavedSearchSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/saved_searches/presentation/settings/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.saved_searches.presentation.settings.f> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.saved_searches.presentation.settings.f invoke() {
            com.avito.android.saved_searches.presentation.settings.g gVar = SavedSearchSettingsFragment.this.f258725n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.saved_searches.presentation.settings.f) gVar.get();
        }
    }

    public SavedSearchSettingsFragment() {
        super(R.layout.saved_search_settings_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f258726o0 = new O0(m0.f406844a.b(com.avito.android.saved_searches.presentation.settings.f.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((com.avito.android.saved_searches.di.core.b) ((InterfaceC44055a) getParentFragment()).r0()).a().a(new C28478k(SavedSearchNotificationSettingsScreen.f90468d, s.c(this), null, 4, null), new com.avito.android.saved_searches.presentation.settings.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258727p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258727p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialogRequireDialog = ((DialogFragment) requireParentFragment()).requireDialog();
        com.avito.konveyor.adapter.j jVar = this.f258728q0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f258729r0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        O0 o02 = this.f258726o0;
        com.avito.android.saved_searches.presentation.settings.e eVar = new com.avito.android.saved_searches.presentation.settings.e(view, dialogRequireDialog, jVar2, aVar2, new d(1, (com.avito.android.saved_searches.presentation.settings.f) o02.getValue(), com.avito.android.saved_searches.presentation.settings.f.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker = this.f258727p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (com.avito.android.saved_searches.presentation.settings.f) o02.getValue(), new b(1, this, SavedSearchSettingsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsOneTimeEvent;)V", 0), new c(eVar));
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i12 = Build.VERSION.SDK_INT;
                SavedSearchData.Settings.SettingsDetails settingsDetails = (SavedSearchData.Settings.SettingsDetails) (i12 >= 34 ? (Parcelable) arguments.getParcelable("key.saved_search_settings_details", SavedSearchData.Settings.SettingsDetails.class) : arguments.getParcelable("key.saved_search_settings_details"));
                if (settingsDetails != null) {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        SavedSearchSettingsMode savedSearchSettingsMode = (SavedSearchSettingsMode) (i12 >= 34 ? (Parcelable) arguments2.getParcelable("key.saved_search_settings_mode", SavedSearchSettingsMode.class) : arguments2.getParcelable("key.saved_search_settings_mode"));
                        if (savedSearchSettingsMode != null) {
                            ((com.avito.android.saved_searches.presentation.settings.f) o02.getValue()).accept(new InterfaceC13822a.c(settingsDetails, savedSearchSettingsMode));
                        }
                    }
                    throw new IllegalArgumentException("Settings mode must be specified");
                }
            }
            throw new IllegalArgumentException("Settings details must be specified");
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258727p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
