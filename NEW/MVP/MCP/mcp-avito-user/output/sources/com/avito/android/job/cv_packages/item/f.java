package com.avito.android.job.cv_packages.item;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49528c;

/* compiled from: PackageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/job/cv_packages/item/e;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f174402h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f174403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f174404c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f174405d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DockingBadge f174406e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f174407f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StrikethroughTextView f174408g;

    public f(@k View view) {
        super(view);
        this.f174403b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f174404c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f174405d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f174406e = (DockingBadge) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f174407f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.old_price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f174408g = (StrikethroughTextView) viewFindViewById5;
        Context context = view.getContext();
        q.b bVar = new q.b();
        bVar.d(y6.b(16));
        view.setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, bVar.a(), 0, 0, 0, 0, C35835l0.e(R.attr.gray4, context), C35835l0.e(R.attr.gray12, context), null, null, 414));
    }

    @Override // com.avito.android.job.cv_packages.item.e
    public final void b40(@k a aVar) {
        G0 g02;
        this.f174404c.setText(aVar.f174391a);
        I5.a(this.f174405d, aVar.f174396f, false);
        DockingBadge dockingBadge = this.f174406e;
        String str = aVar.f174394d;
        if (str != null) {
            dockingBadge.setText(str);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(dockingBadge);
        }
        this.f174407f.setText(aVar.f174393c);
        this.f174408g.setText(aVar.f174395e);
    }

    @Override // com.avito.android.job.cv_packages.item.e
    public final void c(@k Y41.a<G0> aVar) {
        this.f174403b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(23, aVar));
    }
}
