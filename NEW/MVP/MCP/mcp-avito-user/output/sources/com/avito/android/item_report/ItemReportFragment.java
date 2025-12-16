package com.avito.android.item_report;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.item_report.di.b;
import com.avito.android.item_report.m;
import com.avito.android.remote.model.AdvertReport;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemReportFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/item_report/ItemReportFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/item_report/m$a;", "Lcom/avito/android/progress_overlay/g;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemReportFragment extends BaseFragment implements m.a, com.avito.android.progress_overlay.g, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    public n f173853n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public a f173854o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.progress_overlay.l f173855p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public TextView f173856q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public TextView f173857r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public TextView f173858s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public TextView f173859t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public TextView f173860u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public LinearLayout f173861v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public HO.a f173862w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f173863x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f173864y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC35741a1 f173865z0;

    public ItemReportFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.progress_overlay.g
    public final void j0() {
        n nVar = this.f173853n0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f173854o0 = (a) context;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        String string = requireArguments().getString("item_id");
        HO.a aVar = this.f173862w0;
        if (aVar == null) {
            aVar = null;
        }
        l lVar = new l(aVar);
        InterfaceC35745a5 interfaceC35745a5 = this.f173864y0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        InterfaceC35741a1 interfaceC35741a1 = this.f173865z0;
        this.f173853n0 = new n(string, lVar, interfaceC35745a5, interfaceC35741a1 != null ? interfaceC35741a1 : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_report, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.content_holder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        InterfaceC28373a interfaceC28373a = this.f173863x0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup2, R.id.content, interfaceC28373a2, 0, 0, 24, null);
        this.f173855p0 = lVar;
        lVar.h(this);
        this.f173856q0 = (TextView) viewInflate.findViewById(R.id.header);
        this.f173857r0 = (TextView) viewInflate.findViewById(R.id.number);
        this.f173858s0 = (TextView) viewInflate.findViewById(R.id.status);
        this.f173859t0 = (TextView) viewInflate.findViewById(R.id.date);
        this.f173860u0 = (TextView) viewInflate.findViewById(R.id.legal_info);
        this.f173861v0 = (LinearLayout) viewInflate.findViewById(R.id.results);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        n nVar = this.f173853n0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.f173882f = null;
        y yVar = nVar.f173883g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        nVar.f173883g = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f173854o0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        n nVar = this.f173853n0;
        if (nVar == null) {
            nVar = null;
        }
        AdvertReport advertReport = nVar.f173881e;
        if (advertReport != null) {
            bundle.putParcelable("item_report", advertReport);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setTitle(R.string.item_report);
        toolbar.setNavigationIcon(R.drawable.ic_close_24_blue);
        toolbar.setNavigationOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 9));
        n nVar = this.f173853n0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.getClass();
        if (bundle != null) {
            nVar.f173881e = (AdvertReport) bundle.getParcelable("item_report");
        }
        n nVar2 = this.f173853n0;
        if (nVar2 == null) {
            nVar2 = null;
        }
        nVar2.getClass();
        nVar2.f173882f = this;
        n nVar3 = this.f173853n0;
        (nVar3 != null ? nVar3 : null).a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.item_report.di.a.a();
        aVarA.a((com.avito.android.item_report.di.c) C29972i.a(C29972i.b(this), com.avito.android.item_report.di.c.class));
        aVarA.build().a(this);
    }
}
