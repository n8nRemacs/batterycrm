package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmApplicationView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/h;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f130041i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f130042b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130043c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f130044d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f130045e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f130046f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f130047g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final FlexboxLayout f130048h;

    public i(@k View view) {
        super(view);
        this.f130042b = view;
        View viewFindViewById = view.findViewById(R.id.name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130043c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description_1);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130044d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description_2);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130045e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.notes_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130046f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.unviewed_mark);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130047g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.badges_layout);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f130048h = (FlexboxLayout) viewFindViewById6;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void AO(boolean z12) {
        D6.G(this.f130047g, z12);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void O20(@l Y41.a<G0> aVar) {
        com.avito.android.component.user_hat.items.k kVar = new com.avito.android.component.user_hat.items.k(12, aVar);
        View view = this.f130042b;
        view.setOnClickListener(kVar);
        if (G0.f406611a == null) {
            view.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void Y20(int i12) {
        TextView textView = this.f130046f;
        if (i12 < 1) {
            D6.w(textView);
        } else {
            I5.a(textView, this.f130042b.getResources().getQuantityString(R.plurals.crm_response_item_notes_text, i12, Integer.valueOf(i12)), false);
        }
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void j7(@k String str) {
        I5.a(this.f130044d, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void l80(@k String str) {
        I5.a(this.f130043c, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence] */
    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void t0(@k List<Badge> list) {
        FlexboxLayout flexboxLayout = this.f130048h;
        flexboxLayout.removeAllViews();
        for (Badge badge : list) {
            Context context = this.f130042b.getContext();
            Integer num = badge.f129997d;
            String strI = badge.f129995b;
            if (num != null) {
                FV.a aVar = FV.a.f4720a;
                Context context2 = flexboxLayout.getContext();
                int iIntValue = badge.f129997d.intValue();
                aVar.getClass();
                strI = FV.a.i(strI, context2, iIntValue, FV.a.f4721b);
            }
            View dockingBadge = new DockingBadge(context, strI, badge.f129996c, DockingBadgeSize.SMALL, DockingBadgeEdgeType.Pyramid, DockingBadgeEdgeType.AntiPyramid);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(0, y6.b(3), 0, 0);
            dockingBadge.setLayoutParams(marginLayoutParams);
            flexboxLayout.addView(dockingBadge);
        }
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.application_item.h
    public final void v7(@k String str) {
        I5.a(this.f130045e, str, false);
    }
}
