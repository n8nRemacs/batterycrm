package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35847m4;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PassportSelectBusinessItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/B;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/A;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B extends com.avito.konveyor.adapter.b implements A {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f213495d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemRadio f213496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f213497c;

    public B(@Y61.k ListItemRadio listItemRadio, @Y61.k com.avito.android.util.text.a aVar) {
        super(listItemRadio);
        this.f213496b = listItemRadio;
        this.f213497c = aVar;
    }

    @Override // com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.A
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f213496b.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(14, aVar));
    }

    @Override // com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.A
    public final void e(@Y61.k AttributedText attributedText) {
        ListItemRadio listItemRadio = this.f213496b;
        listItemRadio.setTitle(this.f213497c.c(listItemRadio.getContext(), attributedText));
    }

    @Override // com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.A
    public final void j4(boolean z12) {
        C35847m4.a(this.f213496b, z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f213496b.setOnClickListener(null);
    }

    @Override // com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.A
    public final void setChecked(boolean z12) {
        this.f213496b.setChecked(z12);
    }
}
