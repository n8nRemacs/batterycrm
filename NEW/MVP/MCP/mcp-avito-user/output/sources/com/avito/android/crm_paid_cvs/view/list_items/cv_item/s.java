package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import Ba.ViewOnClickListenerC13121a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.CvBadge;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.internal.CheckableImageButton;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CvItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/l;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes12.dex */
public final class s extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f130856x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f130857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f130858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f130859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f130860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f130861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f130862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f130863h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f130864i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f130865j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Badge f130866k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f130867l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f130868m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f130869n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f130870o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f130871p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f130872q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Button f130873r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Button f130874s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final View f130875t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final View f130876u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final View f130877v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Button f130878w;

    public s(@Y61.k View view) {
        super(view);
        this.f130857b = view;
        View viewFindViewById = view.findViewById(R.id.avatar_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130858c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f130859d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.empty_avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130860e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130861f = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130862g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.note_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130863h = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.favorites_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f130864i = (CheckableImageButton) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.comparison_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f130865j = (CheckableImageButton) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.status_badge);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f130866k = (Badge) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.subtitle);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130867l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.manager_name);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130868m = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.badges_layout);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f130869n = (FlexboxLayout) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.description_1);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130870o = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.description_2);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130871p = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.chat_button);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130872q = (Button) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.call_button);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130873r = (Button) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.buy_button);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130874s = (Button) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.blur_view);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130875t = viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.loading);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130876u = viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.error_layout);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130877v = viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.refresh);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130878w = (Button) viewFindViewById21;
    }

    public final void B80(boolean z12) {
        View view = this.f130857b;
        view.setClickable(z12);
        view.setFocusable(z12);
        D6.G(this.f130858c, z12);
        D6.G(this.f130859d, z12);
        D6.G(this.f130860e, z12);
        D6.G(this.f130861f, z12);
        D6.G(this.f130862g, z12);
        D6.G(this.f130863h, z12);
        D6.G(this.f130864i, z12);
        D6.G(this.f130865j, z12);
        D6.G(this.f130866k, z12);
        D6.G(this.f130867l, z12);
        D6.G(this.f130868m, z12);
        D6.G(this.f130869n, z12);
        D6.G(this.f130870o, z12);
        D6.G(this.f130871p, z12);
        D6.G(this.f130872q, z12);
        D6.G(this.f130873r, z12);
        D6.G(this.f130874s, z12);
        D6.G(this.f130875t, z12);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void C0() {
        B80(true);
        D6.w(this.f130877v);
        D6.w(this.f130876u);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void DX(@Y61.k Y41.a aVar, boolean z12) {
        Button button = this.f130873r;
        D6.G(button, z12);
        button.setOnClickListener(new ViewOnClickListenerC13121a(28, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void Fr(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar) {
        CheckableImageButton checkableImageButton = this.f130864i;
        D6.G(checkableImageButton, z12);
        checkableImageButton.setChecked(z13);
        checkableImageButton.setOnClickListener(new com.avito.android.component.user_hat.items.k(23, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void Ze(@Y61.k Y41.a<G0> aVar) {
        this.f130857b.setOnClickListener(new ViewOnClickListenerC13121a(27, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    @SuppressLint({"UdfComponentUsage"})
    public final void Zm(@Y61.k Y41.a aVar, boolean z12) {
        Button button = this.f130874s;
        D6.G(button, z12);
        button.setOnClickListener(new com.avito.android.component.user_hat.items.k(25, aVar));
        Context context = this.f130857b.getContext();
        FV.a aVar2 = FV.a.f4720a;
        String string = context.getString(R.string.paid_cvs_buy);
        int iB2 = y6.b(6);
        aVar2.getClass();
        button.setText(FV.a.i(string, context, R.attr.textIconLock, iB2));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void c0() {
        B80(false);
        D6.w(this.f130877v);
        D6.H(this.f130876u);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void f(@Y61.k String str) {
        I5.a(this.f130867l, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void j7(@Y61.k String str) {
        I5.a(this.f130870o, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void kr(@Y61.k Y41.a aVar, boolean z12) {
        Button button = this.f130872q;
        D6.G(button, z12);
        button.setOnClickListener(new ViewOnClickListenerC13121a(25, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void l60(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar) {
        CheckableImageButton checkableImageButton = this.f130865j;
        D6.G(checkableImageButton, z12);
        checkableImageButton.setChecked(z13);
        checkableImageButton.setOnClickListener(new com.avito.android.component.user_hat.items.k(24, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    @SuppressLint({"UdfComponentUsage"})
    public final void l9(@Y61.k Y41.a<G0> aVar) {
        B80(false);
        D6.H(this.f130877v);
        D6.w(this.f130876u);
        ViewOnClickListenerC13121a viewOnClickListenerC13121a = new ViewOnClickListenerC13121a(26, aVar);
        Button button = this.f130878w;
        button.setOnClickListener(viewOnClickListenerC13121a);
        button.setText(R.string.paid_cvs_error_retry);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void pl(@Y61.k String str) {
        I5.a(this.f130868m, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void qe(@Y61.l Uri uri) {
        boolean z12 = uri != null;
        ImageView imageView = this.f130859d;
        D6.G(imageView, z12);
        D6.G(this.f130860e, uri == null);
        if (uri != null) {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
            aVar.f(uri);
            aVar.e(y6.b(16));
            aVar.c();
        }
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void setActive(boolean z12) {
        View view = this.f130875t;
        D6.G(view, !z12);
        if (z12) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new L91.q(4));
        }
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f130862g, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void uK(@Y61.l CvStatus cvStatus) {
        G0 g02;
        Badge badge = this.f130866k;
        if (cvStatus != null) {
            D6.H(badge);
            badge.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.d.getColor(badge.getContext(), cvStatus.f130349d)));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(badge);
        }
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void v7(@Y61.k String str) {
        I5.a(this.f130871p, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    @SuppressLint({"UdfComponentUsage"})
    public final void wC(@Y61.k List<CvBadge> list) {
        String str;
        FlexboxLayout flexboxLayout = this.f130869n;
        flexboxLayout.removeAllViews();
        D6.G(flexboxLayout, !list.isEmpty());
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            CvBadge cvBadge = (CvBadge) obj;
            String str2 = cvBadge.f130324c;
            View view = this.f130857b;
            View dockingBadge = new DockingBadge(view.getContext(), cvBadge.f130323b, (str2 == null || (str = cvBadge.f130325d) == null) ? DockingBadgeType.Predefined.Gray : new DockingBadgeType.CustomColors(com.avito.android.lib.util.f.f(view.getContext(), "greenSmall"), Integer.valueOf(Color.parseColor(str2)), Integer.valueOf(Color.parseColor(str)), null, null, 24, null), DockingBadgeSize.SMALL, i12 == 0 ? DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.AntiPyramid, i12 == list.size() + (-1) ? DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Pyramid);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(0, y6.b(3), 0, 0);
            dockingBadge.setLayoutParams(marginLayoutParams);
            flexboxLayout.addView(dockingBadge);
            i12 = i13;
        }
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.cv_item.l
    public final void xG(@Y61.k Y41.a aVar, boolean z12) {
        View view = this.f130863h;
        D6.G(view, z12);
        view.setOnClickListener(new com.avito.android.component.user_hat.items.k(22, aVar));
    }
}
