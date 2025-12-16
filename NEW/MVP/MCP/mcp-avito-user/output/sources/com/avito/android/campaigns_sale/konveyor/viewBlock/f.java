package com.avito.android.campaigns_sale.konveyor.viewBlock;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.view.images_row.ImagesRowView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SaleViewBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/viewBlock/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f114038b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f114039c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageButton f114040d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f114041e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImagesRowView f114042f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f114043g;

    /* renamed from: h, reason: collision with root package name */
    public final int f114044h;

    /* renamed from: i, reason: collision with root package name */
    public final int f114045i;

    /* renamed from: j, reason: collision with root package name */
    public final int f114046j;

    public f(@k View view) {
        super(view);
        this.f114038b = view;
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114039c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header_action_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f114040d = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.items_info_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114041e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.images_row);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.campaigns_sale.view.images_row.ImagesRowView");
        }
        this.f114042f = (ImagesRowView) viewFindViewById4;
        Context context = view.getContext();
        this.f114043g = context;
        this.f114044h = C35835l0.d(R.attr.red600, context);
        this.f114045i = C35835l0.d(R.attr.black, context);
        this.f114046j = C35835l0.d(R.attr.gray54, context);
    }
}
