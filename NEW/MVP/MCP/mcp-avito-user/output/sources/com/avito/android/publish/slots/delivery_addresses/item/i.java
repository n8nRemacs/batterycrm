package com.avito.android.publish.slots.delivery_addresses.item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAddressesSlotView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/delivery_addresses/item/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f243452e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f243453b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243454c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f243455d;

    public i(@k View view) {
        super(view);
        this.f243453b = view;
        View viewFindViewById = view.findViewById(R.id.location_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243454c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.edit);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243455d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.item.h
    public final void B0(@k String str) {
        I5.a(this.f243454c, str, false);
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.item.h
    public final void dG(@l String str) {
        I5.a(this.f243455d, str, false);
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.item.h
    public final void xP(@k Y41.a<G0> aVar) {
        this.f243455d.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(3, aVar));
    }
}
