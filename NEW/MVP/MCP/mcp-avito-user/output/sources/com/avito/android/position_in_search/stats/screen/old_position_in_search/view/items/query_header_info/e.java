package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: QueriesHeaderInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header_info/e;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f221127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f221128c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f221129d;

    public e(@k View view) {
        super(view);
        this.f221127b = view.getContext();
        this.f221128c = (TextView) view.findViewById(R.id.header_left_column_name);
        this.f221129d = (TextView) view.findViewById(R.id.header_right_column_name);
    }
}
