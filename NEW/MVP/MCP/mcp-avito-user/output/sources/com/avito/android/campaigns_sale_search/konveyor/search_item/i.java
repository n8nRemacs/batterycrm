package com.avito.android.campaigns_sale_search.konveyor.search_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/search_item/i;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f114621i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f114622b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f114623c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f114624d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f114625e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f114626f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f114627g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f114628h;

    public i(@k View view) {
        super(view);
        this.f114622b = view;
        View viewFindViewById = view.findViewById(R.id.item_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f114623c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114624d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114625e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.item_bonus);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114626f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.item_banned_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114627g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.item_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114628h = (Button) viewFindViewById6;
    }
}
