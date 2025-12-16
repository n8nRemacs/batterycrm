package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CombinedButtonsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_combined_buttons_util/a;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements com.avito.android.delivery_combined_buttons_util.a, n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f79096i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f79097b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f79098c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final i f79099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.delivery_combined_buttons_util.c f79100e;

    /* renamed from: f, reason: collision with root package name */
    public final View f79101f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f79102g;

    /* renamed from: h, reason: collision with root package name */
    public final View f79103h;

    public h(@k View view, @k ConstraintLayout constraintLayout, @l i iVar, boolean z12) {
        super(view);
        this.f79097b = view;
        this.f79098c = constraintLayout;
        this.f79099d = iVar;
        this.f79100e = new com.avito.android.delivery_combined_buttons_util.c(constraintLayout, 11, z12);
        this.f79101f = view.findViewById(R.id.free_delivery_block);
        this.f79102g = (TextView) view.findViewById(R.id.free_delivery_text_view);
        this.f79103h = view.findViewById(R.id.free_delivery_loading);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79099d;
        if (iVar != null) {
            iVar.a();
        }
    }

    public /* synthetic */ h(View view, ConstraintLayout constraintLayout, i iVar, boolean z12, int i12, C42822w c42822w) {
        this(view, constraintLayout, iVar, (i12 & 8) != 0 ? true : z12);
    }
}
