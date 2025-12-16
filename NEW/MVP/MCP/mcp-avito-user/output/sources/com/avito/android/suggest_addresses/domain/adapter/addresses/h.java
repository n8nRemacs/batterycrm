package com.avito.android.suggest_addresses.domain.adapter.addresses;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressesView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/addresses/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/suggest_addresses/domain/adapter/addresses/g;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f291839g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f291840b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f291841c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f291842d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f291843e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f291844f;

    public h(@k View view) {
        super(view);
        this.f291840b = view;
        View viewFindViewById = view.findViewById(R.id.image_historical);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f291841c = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_location);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f291842d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_parent);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f291843e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image_check);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f291844f = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.addresses.g
    public final void B0(@k String str) {
        I5.a(this.f291842d, str, false);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.addresses.g
    public final void HG(boolean z12) {
        this.f291841c.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.addresses.g
    public final void Mp(@k String str) {
        I5.a(this.f291843e, str, false);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.addresses.g
    public final void Uj(boolean z12) {
        this.f291844f.setVisibility(!z12 ? 4 : 0);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.addresses.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f291840b.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(29, aVar));
    }
}
