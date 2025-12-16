package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.util.C35847m4;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Specific.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/B;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/A;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B extends com.avito.konveyor.adapter.b implements A {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f211767c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ListItemRadio f211768b;

    public B(@Y61.k View view) {
        super(view);
        this.f211768b = (ListItemRadio) view.findViewById(R.id.item_specific_radio_item);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.recycler.A
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f211768b.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(10, aVar));
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.recycler.A
    public final void a4(boolean z12) {
        C35847m4.a(this.f211768b, z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f211768b.setOnClickListener(null);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.recycler.A
    public final void setChecked(boolean z12) {
        this.f211768b.setChecked(z12);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.recycler.A
    public final void setTitle(@Y61.k String str) {
        this.f211768b.setTitle(str);
    }
}
