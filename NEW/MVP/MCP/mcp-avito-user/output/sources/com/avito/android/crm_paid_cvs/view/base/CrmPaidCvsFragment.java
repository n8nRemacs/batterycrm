package com.avito.android.crm_paid_cvs.view.base;

import Cd.C13243a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.JobPaidCvsListScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.a;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFiltersFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.R0;
import com.google.android.material.internal.CheckableImageButton;
import et.InterfaceC40155a;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import jt.C42424c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: CrmPaidCvsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/base/CrmPaidCvsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CrmPaidCvsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f130713C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.crm_paid_cvs.view.dialogs.b f130714A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.crm_paid_cvs.view.dialogs.e f130715B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f130716n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f130717o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f130718p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f130719q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f130720r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f130721s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public jt.d f130722t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f130723u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f130724v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f130725w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public R0 f130726x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public TV.f f130727y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public C43238h f130728z0;

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/base/CrmPaidCvsFragment$a;", "", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let/a;", "event", "Lkotlin/G0;", "invoke", "(Let/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC40155a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40155a interfaceC40155a) {
            InterfaceC40155a interfaceC40155a2 = interfaceC40155a;
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            if (interfaceC40155a2 instanceof InterfaceC40155a.e) {
                InterfaceC40155a.e eVar = (InterfaceC40155a.e) interfaceC40155a2;
                CvItem cvItem = eVar.f395413a;
                boolean z12 = cvItem.f130342r;
                Context contextRequireContext = crmPaidCvsFragment.requireContext();
                com.avito.android.crm_paid_cvs.view.base.j jVar = new com.avito.android.crm_paid_cvs.view.base.j(crmPaidCvsFragment, cvItem);
                com.avito.android.crm_paid_cvs.view.base.k kVar = new com.avito.android.crm_paid_cvs.view.base.k(crmPaidCvsFragment, cvItem);
                com.avito.android.crm_paid_cvs.view.base.l lVar = new com.avito.android.crm_paid_cvs.view.base.l(crmPaidCvsFragment, cvItem);
                CvStatus cvStatus = eVar.f395415c;
                com.avito.android.crm_paid_cvs.view.dialogs.e eVar2 = new com.avito.android.crm_paid_cvs.view.dialogs.e(contextRequireContext, cvItem.f130328d, cvItem.f130329e, eVar.f395416d, eVar.f395414b, z12, cvStatus, jVar, kVar, lVar, new com.avito.android.crm_paid_cvs.view.base.m(crmPaidCvsFragment, cvItem, cvStatus));
                crmPaidCvsFragment.f130715B0 = eVar2;
                com.avito.android.lib.util.g.a(eVar2);
            } else if (interfaceC40155a2 instanceof InterfaceC40155a.f) {
                InterfaceC40155a.f fVar = (InterfaceC40155a.f) interfaceC40155a2;
                com.avito.android.lib.util.g.a(new com.avito.android.crm_paid_cvs.view.dialogs.h(crmPaidCvsFragment.requireContext(), fVar.f395418b, fVar.f395419c, new com.avito.android.crm_paid_cvs.view.base.n(crmPaidCvsFragment, fVar.f395417a)));
            } else {
                if (interfaceC40155a2 instanceof InterfaceC40155a.C11109a) {
                    FilterItem filterItem = ((InterfaceC40155a.C11109a) interfaceC40155a2).f395408a;
                    String str = filterItem.f130359d;
                    Context contextRequireContext2 = crmPaidCvsFragment.requireContext();
                    com.avito.konveyor.a aVar2 = crmPaidCvsFragment.f130721s0;
                    com.avito.android.crm_paid_cvs.view.dialogs.b bVar = new com.avito.android.crm_paid_cvs.view.dialogs.b(str, contextRequireContext2, aVar2 != null ? aVar2 : null, new com.avito.android.crm_paid_cvs.view.base.e(crmPaidCvsFragment, filterItem), filterItem.f130360e, filterItem.f130358c == FilterItem.FilterType.f130364e);
                    crmPaidCvsFragment.f130714A0 = bVar;
                    com.avito.android.lib.util.g.a(bVar);
                } else if (interfaceC40155a2 instanceof InterfaceC40155a.b) {
                    C22960s.b(crmPaidCvsFragment, "FILTER_RESULT", new com.avito.android.crm_paid_cvs.view.base.h(crmPaidCvsFragment));
                    H hE2 = crmPaidCvsFragment.getParentFragmentManager().e();
                    CrmPaidCvsFiltersFragment.f130689t0.getClass();
                    CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment = new CrmPaidCvsFiltersFragment();
                    C35966w1.a(crmPaidCvsFiltersFragment, -1, new com.avito.android.crm_paid_cvs.view.base.a(((InterfaceC40155a.b) interfaceC40155a2).f395409a));
                    hE2.j(R.id.fragment_container, crmPaidCvsFiltersFragment, null, 1);
                    hE2.c(CrmPaidCvsFiltersFragment.a.class.getSimpleName());
                    hE2.e();
                } else if (interfaceC40155a2 instanceof InterfaceC40155a.d) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(crmPaidCvsFragment.requireContext().getString(R.string.paid_cvs_error));
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.c(cVar, crmPaidCvsFragment, printableTextF, null, null, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                } else if (interfaceC40155a2 instanceof InterfaceC40155a.c) {
                    InterfaceC40155a.c cVar2 = (InterfaceC40155a.c) interfaceC40155a2;
                    com.avito.android.toggle_comparison_state.a aVar3 = cVar2.f395411b;
                    String str2 = aVar3.f301569b;
                    if (str2.length() != 0) {
                        String str3 = aVar3.f301568a;
                        if (str3.length() != 0) {
                            PrintableText printableTextF2 = com.avito.android.printable_text.b.f(str2);
                            List listSingletonList = Collections.singletonList(new c.a.C3719a(str3, false, null, new com.avito.android.crm_paid_cvs.view.base.i(crmPaidCvsFragment, aVar3), 6, null));
                            com.avito.android.crm_paid_cvs.view.dialogs.e eVar3 = crmPaidCvsFragment.f130715B0;
                            if (eVar3 != null) {
                                CheckableImageButton checkableImageButton = eVar3.f130809H;
                                if (checkableImageButton != null) {
                                    checkableImageButton.setChecked(cVar2.f395410a);
                                }
                                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, eVar3, printableTextF2, listSingletonList, null, 0, null, 1018);
                            } else {
                                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, crmPaidCvsFragment, printableTextF2, null, listSingletonList, null, 0, null, 1018);
                            }
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<CvListState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.crm_paid_cvs.render.a f130730l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.crm_paid_cvs.render.a aVar) {
            super(1);
            this.f130730l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(CvListState cvListState) {
            this.f130730l.a(cvListState);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            crmPaidCvsFragment.r5().accept(new a.c(CvListState.Tab.f130509c));
            CrmPaidCvsFragment.q5(crmPaidCvsFragment);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            crmPaidCvsFragment.r5().accept(new a.c(CvListState.Tab.f130510d));
            CrmPaidCvsFragment.q5(crmPaidCvsFragment);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            crmPaidCvsFragment.r5().accept(new a.c(CvListState.Tab.f130511e));
            CrmPaidCvsFragment.q5(crmPaidCvsFragment);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment.this.r5().accept(a.l.f130531a);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment.this.r5().accept(a.k.f130530a);
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState$Tab;", NotificationOpenAtTab.TAB, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState$Tab;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<CvListState.Tab, G0> {

        /* compiled from: CrmPaidCvsFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f130737a;

            static {
                int[] iArr = new int[CvListState.Tab.values().length];
                try {
                    CvListState.Tab tab = CvListState.Tab.f130509c;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f130737a = iArr;
            }
        }

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CvListState.Tab tab) {
            int i12 = a.f130737a[tab.ordinal()];
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            if (i12 == 1) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = crmPaidCvsFragment.f130725w0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, new ItemsSearchLink(new SearchParams("112", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1, null), null, null, null, null, null, null, null, null, false, PresentationType.SERP, null, false, null, false, null, false, null, 260992, null), null, null, 6);
            } else {
                a aVar2 = CrmPaidCvsFragment.f130713C0;
                crmPaidCvsFragment.r5().accept(a.f.f130524a);
                CrmPaidCvsFragment.q5(crmPaidCvsFragment);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            CrmPaidCvsFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvItem;", "cv", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/CvItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<CvItem, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CvItem cvItem) {
            CvItem cvItem2 = cvItem;
            boolean z12 = cvItem2.f130344t;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            if (z12 || cvItem2.f130346v) {
                a aVar = CrmPaidCvsFragment.f130713C0;
                crmPaidCvsFragment.r5().accept(a.g.f130525a);
            } else {
                a aVar2 = CrmPaidCvsFragment.f130713C0;
                crmPaidCvsFragment.r5().accept(new a.i(cvItem2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvItem;", "cv", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/CvItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<CvItem, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CvItem cvItem) {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment.this.r5().accept(new a.n(cvItem));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvItem;", "cv", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/CvItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<CvItem, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CvItem cvItem) {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment.this.r5().accept(new a.m(cvItem.f130326b));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/FilterItem;", "filter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/FilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<FilterItem, G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FilterItem filterItem) {
            a aVar = CrmPaidCvsFragment.f130713C0;
            CrmPaidCvsFragment.this.r5().accept(new a.h(filterItem));
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/OptionItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<OptionItem, G0> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OptionItem optionItem) {
            OptionItem optionItem2 = optionItem;
            com.avito.android.crm_paid_cvs.view.dialogs.b bVar = CrmPaidCvsFragment.this.f130714A0;
            if (bVar != null) {
                bVar.W(optionItem2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.l<DeepLink, G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            boolean z12 = deepLink2 instanceof SavedSearchLink;
            CrmPaidCvsFragment crmPaidCvsFragment = CrmPaidCvsFragment.this;
            if (z12) {
                R0 r02 = crmPaidCvsFragment.f130726x0;
                if (r02 == null) {
                    r02 = null;
                }
                C43238h c43238hA = U.a(r02.b());
                TV.f fVar = crmPaidCvsFragment.f130727y0;
                if (fVar == null) {
                    fVar = null;
                }
                C43175k.K(new com.avito.android.crm_paid_cvs.view.base.g(y.a(fVar.getF15691f()), crmPaidCvsFragment), c43238hA);
                crmPaidCvsFragment.f130728z0 = c43238hA;
                com.avito.android.deeplink_handler.handler.composite.a aVar = crmPaidCvsFragment.f130725w0;
                if (aVar == null) {
                    aVar = null;
                }
                SavedSearchArgs savedSearchArgs = new SavedSearchArgs(new SearchParams("112", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1, null), null, "Paid_cvs", null, null, null, null, 122, null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("saved_search_args", savedSearchArgs);
                b.a.a(aVar, deepLink2, null, bundle, 2);
            } else if (deepLink2 != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = crmPaidCvsFragment.f130725w0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink2, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f130745l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Y41.a aVar) {
            super(0);
            this.f130745l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f130745l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<Fragment> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CrmPaidCvsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f130747l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(r rVar) {
            super(0);
            this.f130747l = rVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f130747l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f130748l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f130748l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f130748l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f130749l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f130749l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f130749l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CrmPaidCvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljt/c;", "kotlin.jvm.PlatformType", "invoke", "()Ljt/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends N implements Y41.a<C42424c> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final C42424c invoke() {
            jt.d dVar = CrmPaidCvsFragment.this.f130722t0;
            if (dVar == null) {
                dVar = null;
            }
            return (C42424c) dVar.get();
        }
    }

    public CrmPaidCvsFragment() {
        super(R.layout.crm_paid_cvs_fragment);
        q qVar = new q(new v());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new s(new r()));
        this.f130723u0 = new O0(m0.f406844a.b(C42424c.class), new t(interfaceC42726CB), qVar, new u(interfaceC42726CB));
    }

    public static final void q5(CrmPaidCvsFragment crmPaidCvsFragment) {
        crmPaidCvsFragment.requireView().postDelayed(new com.avito.android.crm_paid_cvs.view.base.f(crmPaidCvsFragment), 50L);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f130724v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.crm_paid_cvs.view.dialogs.b bVar = this.f130714A0;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f130714A0 = null;
        com.avito.android.crm_paid_cvs.view.dialogs.e eVar = this.f130715B0;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f130715B0 = null;
        C43238h c43238h = this.f130728z0;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f130728z0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f130716n0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.konveyor.adapter.d dVar3 = this.f130717o0;
        com.avito.konveyor.adapter.d dVar4 = dVar3 != null ? dVar3 : null;
        com.avito.konveyor.adapter.d dVar5 = this.f130718p0;
        com.avito.konveyor.adapter.d dVar6 = dVar5 != null ? dVar5 : null;
        com.avito.konveyor.adapter.j jVar = this.f130719q0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f130720r0;
        com.avito.android.crm_paid_cvs.render.a aVar2 = new com.avito.android.crm_paid_cvs.render.a(view, dVar2, dVar4, dVar6, jVar2, aVar != null ? aVar : null, new d(), new e(), new f(), new g(), new h(), new i(), new j());
        ScreenPerformanceTracker screenPerformanceTracker = this.f130724v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, r5(), new b(), new c(aVar2));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f130724v0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        View viewFindViewById = view.findViewById(R.id.cv_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        screenPerformanceTracker2.b((RecyclerView) viewFindViewById);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f130724v0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.crm_paid_cvs.features.cv_list.di.r.a().a((com.avito.android.crm_paid_cvs.features.cv_list.di.c) C29972i.a(C29972i.b(this), com.avito.android.crm_paid_cvs.features.cv_list.di.c.class), cv.c.b(this), new C28478k(JobPaidCvsListScreen.f90392d, com.avito.android.analytics.screens.s.c(this), null, 4, null), getResources(), new k(), new l(), new m(), new n(), new o(), new p()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f130724v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f130724v0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final C42424c r5() {
        return (C42424c) this.f130723u0.getValue();
    }
}
