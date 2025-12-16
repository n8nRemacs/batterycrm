package com.avito.android.suggest_addresses.domain.adapter.error;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressesErrorView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/suggest_addresses/domain/adapter/error/g;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f291870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f291871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f291872d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f291873e;

    public h(@k View view) {
        super(view);
        this.f291870b = view;
        View viewFindViewById = view.findViewById(R.id.error_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f291871c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.reload_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f291872d = button;
        button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 14));
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.error.g
    public final void TR(boolean z12) {
        int i12 = z12 ? R.string.search_addresses_network_error : R.string.search_addresses_result_error;
        TextView textView = this.f291871c;
        textView.setText(i12);
        this.f291872d.setVisibility(z12 ? 0 : 8);
        textView.setEnabled(z12);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.error.g
    public final void qM(@k Y41.a<G0> aVar) {
        this.f291873e = aVar;
    }
}
