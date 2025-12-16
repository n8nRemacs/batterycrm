package com.avito.android.campaigns_sale_search.konveyor.history_item;

import Y61.k;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HistoryItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/history_item/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f114572e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f114573b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageButton f114574c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f114575d;

    public h(@k View view) {
        super(view);
        this.f114573b = view;
        View viewFindViewById = view.findViewById(R.id.remove_action_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f114574c = (ImageButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.search_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114575d = (TextView) viewFindViewById2;
    }
}
