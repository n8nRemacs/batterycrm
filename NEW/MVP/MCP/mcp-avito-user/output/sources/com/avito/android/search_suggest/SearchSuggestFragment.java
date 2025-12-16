package com.avito.android.search_suggest;

import Cd.C13243a;
import HV.a;
import Op0.C14723a;
import Pp0.InterfaceC14824b;
import Pp0.InterfaceC14825c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.SearchSuggestScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestBubbleItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SearchSuggestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSuggestFragment extends TabBaseFragment implements InterfaceC28477j.b, com.avito.android.ui.status_bar.a {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f264112C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public SearchSuggestArguments f264113A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f264114B0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public x f264115t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f264116u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f264117v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f264118w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f264119x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f264120y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public v f264121z0;

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestFragment$a;", "", "<init>", "()V", "", "KEY_ARGS", "Ljava/lang/String;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SearchSuggestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.search_suggest.SearchSuggestFragment$a$a, reason: collision with other inner class name */
        public static final class C7879a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SearchSuggestArguments f264122l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7879a(SearchSuggestArguments searchSuggestArguments) {
                super(1);
                this.f264122l = searchSuggestArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("suggest_arguments", this.f264122l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SearchSuggestFragment a(@Y61.k SearchSuggestArguments searchSuggestArguments) {
            SearchSuggestFragment searchSuggestFragment = new SearchSuggestFragment();
            C35966w1.a(searchSuggestFragment, -1, new C7879a(searchSuggestArguments));
            return searchSuggestFragment;
        }

        public a() {
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f264123a;

        static {
            int[] iArr = new int[SerpSpaceType.values().length];
            try {
                iArr[SerpSpaceType.AvitoBlack.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f264123a = iArr;
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC14824b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14824b interfaceC14824b) {
            ((w) this.receiver).accept(interfaceC14824b);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC14825c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14825c interfaceC14825c) {
            v vVar;
            InterfaceC14825c interfaceC14825c2 = interfaceC14825c;
            SearchSuggestFragment searchSuggestFragment = (SearchSuggestFragment) this.receiver;
            a aVar = SearchSuggestFragment.f264112C0;
            searchSuggestFragment.getClass();
            if (interfaceC14825c2 instanceof InterfaceC14825c.a) {
                v vVar2 = searchSuggestFragment.f264121z0;
                if (vVar2 != null) {
                    K2.f(vVar2.f264376h, 3);
                }
                if (searchSuggestFragment.l1() instanceof SearchSuggestActivity) {
                    ActivityC22955m activityC22955mL1 = searchSuggestFragment.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.setResult(0);
                    }
                    ActivityC22955m activityC22955mL12 = searchSuggestFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                } else {
                    searchSuggestFragment.B5(0, null);
                    searchSuggestFragment.r5();
                }
            } else if (interfaceC14825c2 instanceof InterfaceC14825c.C0870c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = searchSuggestFragment.f264118w0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("current_screen_action", NavigationScreenAction.f107102d);
                G0 g02 = G0.f406611a;
                b.a.a(aVar2, ((InterfaceC14825c.C0870c) interfaceC14825c2).f13318a, null, bundle, 2);
            } else if (interfaceC14825c2 instanceof InterfaceC14825c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = searchSuggestFragment.f264118w0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((InterfaceC14825c.b) interfaceC14825c2).f13317a, null, null, 6);
            } else if (interfaceC14825c2 instanceof InterfaceC14825c.f) {
                a.C0407a c0407a = HV.a.f7100w;
                Context contextRequireContext = searchSuggestFragment.requireContext();
                int iJ2 = C35835l0.j(R.attr.toastBarDefault, searchSuggestFragment.requireContext());
                c0407a.getClass();
                IV.a.c(searchSuggestFragment.requireContext(), ToastBarState.a(new ToastBarState(com.avito.android.printable_text.b.c(R.string.search_suggest_error_toast, new Serializable[0]), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, searchSuggestFragment.requireView(), 4093), a.C0407a.b(iJ2, contextRequireContext));
            } else if (interfaceC14825c2 instanceof InterfaceC14825c.d) {
                v vVar3 = searchSuggestFragment.f264121z0;
                if (vVar3 != null) {
                    vVar3.f264376h.requestFocus();
                }
            } else if ((interfaceC14825c2 instanceof InterfaceC14825c.e) && (vVar = searchSuggestFragment.f264121z0) != null) {
                vVar.f264380l.A0(0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPp0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LPp0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Pp0.d, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Pp0.d dVar) {
            Pp0.d dVar2 = dVar;
            SearchSuggestFragment searchSuggestFragment = SearchSuggestFragment.this;
            v vVar = searchSuggestFragment.f264121z0;
            if (vVar != null) {
                new com.avito.android.search_suggest.c(1, (w) searchSuggestFragment.f264120y0.getValue(), w.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                vVar.f264371c.l(dVar2.f13324c, null);
                String deformattedText = vVar.f264376h.getDeformattedText();
                String str = dVar2.f13323b;
                if (!L.f(deformattedText, str)) {
                    Input.t(vVar.f264376h, str, false, 4);
                }
                Editable editableM53getText = vVar.f264376h.m53getText();
                if (editableM53getText == null || editableM53getText.length() == 0) {
                    vVar.f264376h.setLeftIconColor(vVar.f264382n);
                } else {
                    vVar.f264376h.setLeftIconColor(vVar.f264383o);
                }
                Q<C14723a, List<SuggestBubbleItem>> q12 = dVar2.f13325d;
                C14723a c14723a = q12.f406619b;
                List<SuggestBubbleItem> list = q12.f406620c;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.avito.android.search.b((SuggestBubbleItem) it.next()));
                }
                boolean z12 = !arrayList.isEmpty();
                Chips chips = vVar.f264378j;
                D6.G(chips, z12);
                chips.setData(arrayList);
                chips.setChipsSelectedListener(new s(vVar, c14723a));
                if (!arrayList.isEmpty()) {
                    chips.o((com.avito.android.lib.design.chips.h) C42745f0.E(arrayList), false);
                }
                HistorySuggestItem historySuggestItem = dVar2.f13326e;
                boolean z13 = !historySuggestItem.getItems().isEmpty();
                List<SuggestHistoryItem> items = historySuggestItem.getItems();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new com.avito.android.search.e((SuggestHistoryItem) it2.next()));
                }
                Chips chips2 = vVar.f264379k;
                D6.G(chips2, z13);
                chips2.setData(arrayList2);
                chips2.setChipsSelectedListener(new t(vVar));
                chips2.setChipsOnRightDrawableClickedListener(new u(vVar));
                if (!historySuggestItem.getItems().isEmpty()) {
                    chips2.o((com.avito.android.lib.design.chips.h) C42745f0.E(arrayList2), false);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPp0/b;", "it", "Lkotlin/G0;", "invoke", "(LPp0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC14824b, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14824b interfaceC14824b) {
            a aVar = SearchSuggestFragment.f264112C0;
            ((w) SearchSuggestFragment.this.f264120y0.getValue()).accept(interfaceC14824b);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f264126l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f264126l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f264126l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SearchSuggestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f264128l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f264128l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f264128l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f264129l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f264129l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f264129l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f264130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f264130l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f264130l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SearchSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/search_suggest/w;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/search_suggest/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<w> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final w invoke() {
            x xVar = SearchSuggestFragment.this.f264115t0;
            if (xVar == null) {
                xVar = null;
            }
            return (w) xVar.get();
        }
    }

    public SearchSuggestFragment() {
        super(R.layout.search_suggest_layout);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f264120y0 = new O0(m0.f406844a.b(w.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f264114B0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final boolean i5() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        SearchSuggestArguments searchSuggestArguments = this.f264113A0;
        SerpSpaceType serpSpaceTypeOrDefault = SerpSpaceTypeKt.orDefault(searchSuggestArguments != null ? searchSuggestArguments.f264109f : null);
        SearchSuggestArguments searchSuggestArguments2 = this.f264113A0;
        m mVar = new m(serpSpaceTypeOrDefault, searchSuggestArguments2 != null ? searchSuggestArguments2.f264110g : null);
        com.avito.android.ui.status_bar.e eVar = this.f264119x0;
        (eVar != null ? eVar : null).c(this, C42745f0.V(mVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    @Override // androidx.fragment.app.Fragment
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r22, @Y61.l android.view.ViewGroup r23, @Y61.l android.os.Bundle r24) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.SearchSuggestFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        v vVar = this.f264121z0;
        if (vVar != null) {
            vVar.f264380l.v0(vVar.f264381m);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        ScreenPerformanceTracker screenPerformanceTracker = this.f264116u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Y61.l Bundle bundle) {
        super.onViewStateRestored(bundle);
        v vVar = this.f264121z0;
        if (vVar != null) {
            com.avito.android.lib.design.input.n.c(vVar.f264376h, new r(vVar));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @SuppressLint({"HardcodeStringDetector"})
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            SearchSuggestArguments searchSuggestArguments = (SearchSuggestArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("suggest_arguments", SearchSuggestArguments.class) : arguments.getParcelable("suggest_arguments"));
            if (searchSuggestArguments != null) {
                this.f264113A0 = searchSuggestArguments;
                searchSuggestArguments.f264111h = bundle == null;
                if (v5()) {
                    SearchSuggestArguments searchSuggestArguments2 = this.f264113A0;
                    this.f264113A0 = searchSuggestArguments2 != null ? new SearchSuggestArguments(searchSuggestArguments2.f264105b, searchSuggestArguments2.f264106c, searchSuggestArguments2.f264107d, searchSuggestArguments2.f264108e, searchSuggestArguments2.f264109f, null) : null;
                }
                com.avito.android.search_suggest.di.a.a().a(cv.c.b(this), (com.avito.android.search_suggest.di.d) C29972i.a(C29972i.b(this), com.avito.android.search_suggest.di.d.class), searchSuggestArguments, new C28478k(SearchSuggestScreen.f90477d, com.avito.android.analytics.screens.s.c(this), "searchSuggest"), new f(), com.avito.android.lib.util.darkTheme.c.a(requireContext())).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f264116u0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new RuntimeException("suggest_arguments was not passed to " + this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF264114B0() {
        return this.f264114B0;
    }
}
