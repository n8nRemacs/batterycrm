package com.avito.android.safedeal.delivery.order_cancellation.konveyor;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReasonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/g;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f256372c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f256373b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f256373b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.konveyor.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f256373b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(29, aVar));
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.konveyor.g
    public final void g0(@l CharSequence charSequence) {
        this.f256373b.setText(charSequence);
    }
}
