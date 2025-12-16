package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: QueryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f221102b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f221103c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f221104d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f221105e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f221106f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f221107g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f221108h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f221109i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e f221110j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public a f221111k;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f221102b = aVar;
        this.f221103c = view.getContext();
        this.f221104d = (TextView) view.findViewById(R.id.query_title);
        TextView textView = (TextView) view.findViewById(R.id.query_expand_more);
        this.f221105e = textView;
        this.f221106f = (TextView) view.findViewById(R.id.query_delta_text);
        View viewFindViewById = view.findViewById(R.id.query_delta_text_click);
        this.f221107g = viewFindViewById;
        this.f221108h = (TextView) view.findViewById(R.id.query_position_text);
        this.f221109i = view.findViewById(R.id.query_position_text_click);
        this.f221110j = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e(viewFindViewById, new r.a(null, 1, 0 == true ? 1 : 0));
        view.setOnClickListener(new com.avito.android.order.feature.c(this, 29));
        FV.a.f4720a.getClass();
        FV.a.c(textView, R.attr.textIconExpandMore);
    }

    public final void B80(a aVar) {
        AttributedText attributedText = aVar.f221086d;
        com.avito.android.util.text.a aVar2 = this.f221102b;
        Context context = this.f221103c;
        CharSequence charSequenceC = aVar2.c(context, attributedText);
        CharSequence charSequenceC2 = aVar2.c(context, aVar.f221085c);
        View view = this.f221107g;
        if (charSequenceC == null || charSequenceC.length() == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f221106f.setText(charSequenceC);
        }
        View view2 = this.f221109i;
        if (charSequenceC2 == null || charSequenceC2.length() == 0) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
            this.f221108h.setText(charSequenceC2);
        }
    }
}
