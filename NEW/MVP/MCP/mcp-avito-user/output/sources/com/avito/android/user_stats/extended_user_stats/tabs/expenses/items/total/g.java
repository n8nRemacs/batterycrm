package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TotalItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f317780i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317781b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f317782c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f317783d;

    /* renamed from: e, reason: collision with root package name */
    public final View f317784e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f317785f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f317786g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f317787h;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f317781b = view;
        this.f317782c = aVar;
        this.f317783d = (LinearLayout) view.findViewById(R.id.ll_total);
        this.f317784e = view.findViewById(R.id.v_metric_hint);
        this.f317785f = (TextView) view.findViewById(R.id.tv_metric_name);
        this.f317786g = (TextView) view.findViewById(R.id.tv_total);
        this.f317787h = (TextView) view.findViewById(R.id.tv_subtitle);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.f
    public final void mm(@k TotalItemData totalItemData, @k l<? super RJ0.a, G0> lVar) {
        this.f317783d.setOnClickListener(new com.avito.android.seller_promotions.b(20, lVar));
        AttributedText attributedText = totalItemData.f317770e;
        int i12 = attributedText != null ? 0 : 8;
        TextView textView = this.f317785f;
        textView.setVisibility(i12);
        textView.setText(this.f317782c.c(textView.getContext(), attributedText));
        this.f317786g.setText(totalItemData.f317768c);
        String str = totalItemData.f317769d;
        int i13 = str != null ? 0 : 8;
        TextView textView2 = this.f317787h;
        textView2.setVisibility(i13);
        textView2.setText(str);
        String str2 = totalItemData.f317771f;
        int i14 = (str2 == null || str2.length() == 0) ? 8 : 0;
        View view = this.f317784e;
        view.setVisibility(i14);
        view.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(20, lVar, totalItemData));
    }
}
