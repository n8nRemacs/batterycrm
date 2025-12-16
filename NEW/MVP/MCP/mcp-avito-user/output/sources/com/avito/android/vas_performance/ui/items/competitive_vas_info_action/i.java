package com.avito.android.vas_performance.ui.items.competitive_vas_info_action;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasInfoActionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas_info_action/i;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas_info_action/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f321659d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321660b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321661c;

    public i(@k View view) {
        super(view);
        this.f321660b = view;
        View viewFindViewById = view.findViewById(R.id.info_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321661c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas_info_action.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f321660b.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(23, aVar));
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas_info_action.h
    public final void setTitle(@k String str) {
        TextView textView = this.f321661c;
        textView.setText(str);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }
}
