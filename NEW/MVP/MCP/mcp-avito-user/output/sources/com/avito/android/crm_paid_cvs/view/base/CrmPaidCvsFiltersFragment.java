package com.avito.android.crm_paid_cvs.view.base;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import androidx.view.C22981N;
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
import com.avito.android.analytics.screens.JobPaidCvsFiltersScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.filters.di.b;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import ft.InterfaceC40476a;
import ft.InterfaceC40477b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import jt.C42422a;
import jt.C42423b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: CrmPaidCvsFiltersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/base/CrmPaidCvsFiltersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CrmPaidCvsFiltersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f130689t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f130690n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f130691o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C42423b f130692p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f130693q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f130694r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.crm_paid_cvs.view.dialogs.b f130695s0;

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/base/CrmPaidCvsFiltersFragment$a;", "", "<init>", "()V", "", "FILTER_ARG", "Ljava/lang/String;", "FILTER_RESULT", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lft/b;", "event", "Lkotlin/G0;", "invoke", "(Lft/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC40477b, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40477b interfaceC40477b) {
            InterfaceC40477b interfaceC40477b2 = interfaceC40477b;
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment = CrmPaidCvsFiltersFragment.this;
            if (interfaceC40477b2 instanceof InterfaceC40477b.a) {
                crmPaidCvsFiltersFragment.getParentFragmentManager().o0(C22777e.b(new Q("FILTER_ARG", ((InterfaceC40477b.a) interfaceC40477b2).f396178a)), "FILTER_RESULT");
                crmPaidCvsFiltersFragment.getParentFragmentManager().Y();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<FiltersState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.crm_paid_cvs.render.d f130697l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.crm_paid_cvs.render.d dVar) {
            super(1);
            this.f130697l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(FiltersState filtersState) {
            com.avito.android.crm_paid_cvs.render.d dVar = this.f130697l;
            dVar.getClass();
            List<FilterItem> list = filtersState.f130629b;
            D6.G(dVar.f130683b, !list.isEmpty());
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (dVar.f130686e.contains(((FilterItem) obj).f130358c)) {
                    arrayList.add(obj);
                }
            }
            dVar.f130682a.l(C42745f0.B0(arrayList, new com.avito.android.crm_paid_cvs.render.e()), null);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            CrmPaidCvsFiltersFragment.this.getParentFragmentManager().Y();
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment.this.q5().accept(InterfaceC40476a.C11179a.f396168a);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment.this.q5().accept(InterfaceC40476a.c.f396171a);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "filterId", "Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/crm_paid_cvs/dto/OptionItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.p<String, OptionItem, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, OptionItem optionItem) {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment.this.q5().accept(new InterfaceC40476a.b(str, optionItem));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "filterId", "Lkotlin/Q;", "", "range", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.p<String, Q<? extends Integer, ? extends Integer>, G0> {
        public h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Q<? extends Integer, ? extends Integer> q12) {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment.this.q5().accept(new InterfaceC40476a.f(str, q12));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/FilterItem;", "filter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/FilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<FilterItem, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FilterItem filterItem) {
            FilterItem filterItem2 = filterItem;
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment = CrmPaidCvsFiltersFragment.this;
            Context contextRequireContext = crmPaidCvsFiltersFragment.requireContext();
            com.avito.konveyor.a aVar2 = crmPaidCvsFiltersFragment.f130691o0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            com.avito.android.crm_paid_cvs.view.dialogs.b bVar = new com.avito.android.crm_paid_cvs.view.dialogs.b(filterItem2.f130359d, contextRequireContext, aVar2, new com.avito.android.crm_paid_cvs.view.base.c(crmPaidCvsFiltersFragment, filterItem2), filterItem2.f130360e, filterItem2.f130358c == FilterItem.FilterType.f130364e);
            crmPaidCvsFiltersFragment.f130695s0 = bVar;
            com.avito.android.lib.util.g.a(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<String, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment.this.q5().accept(new InterfaceC40476a.h(str));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<String, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CrmPaidCvsFiltersFragment.f130689t0;
            CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment = CrmPaidCvsFiltersFragment.this;
            crmPaidCvsFiltersFragment.q5().accept(new InterfaceC40476a.d(str));
            View view = crmPaidCvsFiltersFragment.getView();
            if (view != null) {
                view.postDelayed(new com.avito.android.crm_paid_cvs.view.base.b(crmPaidCvsFiltersFragment), 300L);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/OptionItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<OptionItem, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OptionItem optionItem) {
            OptionItem optionItem2 = optionItem;
            com.avito.android.crm_paid_cvs.view.dialogs.b bVar = CrmPaidCvsFiltersFragment.this.f130695s0;
            if (bVar != null) {
                bVar.W(optionItem2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f130707l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f130707l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f130707l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<Fragment> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CrmPaidCvsFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f130709l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f130709l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f130709l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f130710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f130710l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f130710l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f130711l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f130711l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f130711l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CrmPaidCvsFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljt/a;", "kotlin.jvm.PlatformType", "invoke", "()Ljt/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<C42422a> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final C42422a invoke() {
            C42423b c42423b = CrmPaidCvsFiltersFragment.this.f130692p0;
            if (c42423b == null) {
                c42423b = null;
            }
            return (C42422a) c42423b.get();
        }
    }

    public CrmPaidCvsFiltersFragment() {
        super(R.layout.crm_paid_cvs_filters_fragment);
        m mVar = new m(new r());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new o(new n()));
        this.f130693q0 = new O0(m0.f406844a.b(C42422a.class), new p(interfaceC42726CB), mVar, new q(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f130694r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.crm_paid_cvs.view.dialogs.b bVar = this.f130695s0;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f130695s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f130690n0;
        com.avito.android.crm_paid_cvs.render.d dVar2 = new com.avito.android.crm_paid_cvs.render.d(view, dVar != null ? dVar : null, new d(), new e(), new f());
        ScreenPerformanceTracker screenPerformanceTracker = this.f130694r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, q5(), new b(), new c(dVar2));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f130694r0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        View viewFindViewById = view.findViewById(R.id.filter_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        screenPerformanceTracker2.b((RecyclerView) viewFindViewById);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f130694r0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(JobPaidCvsFiltersScreen.f90391d, s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.crm_paid_cvs.features.filters.di.a.a();
        com.avito.android.crm_paid_cvs.features.filters.di.d dVar = (com.avito.android.crm_paid_cvs.features.filters.di.d) C29972i.a(C29972i.b(this), com.avito.android.crm_paid_cvs.features.filters.di.d.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Resources resources = getResources();
        C22977J c22977jA = C22981N.a(getLifecycle());
        List parcelableArrayList = requireArguments().getParcelableArrayList("FILTER_ARG");
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        aVarA.a(dVar, interfaceC39417aB, c28478k, resources, c22977jA, parcelableArrayList, new g(), new h(), new i(), new j(), new k(), new l()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f130694r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f130694r0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final C42422a q5() {
        return (C42422a) this.f130693q0.getValue();
    }
}
