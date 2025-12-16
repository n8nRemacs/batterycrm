package com.avito.android.advertising.adapter.items.adstub.avl;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.util.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialAvlLoadingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/avl/a;", "LTV0/e;", "Lcom/avito/android/serp/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.serp.c implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86915b;

    public a(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f86915b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.media_view_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        v.b(viewFindViewById2, R.dimen.ad_avl_corner_radius);
        View viewFindViewById3 = view.findViewById(R.id.line1_placeholder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        v.b(viewFindViewById3, R.dimen.ad_avl_placeholder_line_corner_radius);
        View viewFindViewById4 = view.findViewById(R.id.line2_placeholder);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        v.b(viewFindViewById4, R.dimen.ad_avl_placeholder_line_corner_radius);
        View viewFindViewById5 = view.findViewById(R.id.line3_placeholder);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        v.b(viewFindViewById5, R.dimen.ad_avl_placeholder_line_corner_radius);
        View viewFindViewById6 = view.findViewById(R.id.call_to_action_placeholder);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        v.b(viewFindViewById6, R.dimen.ad_avl_call_to_action_corner_radius);
    }
}
