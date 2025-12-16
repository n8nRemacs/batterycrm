package com.avito.android.tariff_lf.edit_info.item.manager_call;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ManagerCallItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/manager_call/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/manager_call/d;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f299019b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f299020c;

    public e(@k View view) {
        super(view);
        Button button = (Button) view.findViewById(R.id.call_button);
        this.f299019b = button;
        button.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 4));
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.manager_call.d
    public final void a(@k Y41.a<G0> aVar) {
        this.f299020c = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.manager_call.d
    public final void c1(@k String str) {
        this.f299019b.setText(str);
    }
}
