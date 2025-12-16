package com.avito.android.advert.item.contactbar;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.contactbar.A;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.SellerOnlineStatus;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsContactBarView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/contactbar/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/contactbar/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A f74888b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f74889c;

    public h(@k View view, boolean z12, boolean z13, boolean z14) {
        super(view);
        this.f74888b = new A(view, false, false, null, false, z14, false, z12, z13, null, false, false, null, 7772, null);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    @k
    public final z<G0> Cz(@k List<? extends ContactBar.ContainerClickType> list) {
        return this.f74888b.Cz(list);
    }

    @Override // com.avito.android.advert.item.contactbar.g
    public final void E4(@l Y41.a<G0> aVar) {
        this.f74889c = aVar;
    }

    @Override // com.avito.android.advert_core.contactbar.w
    @l
    public final z<G0> H70(boolean z12) {
        return this.f74888b.H70(z12);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final void LW(@l ContactBarData contactBarData, @k List list, @k List list2, @l LinkedHashMap linkedHashMap, @l ContactBar.b bVar, @k p pVar, @k Y41.l lVar, @k C28266e.h hVar) {
        this.f74888b.LW(contactBarData, list, list2, linkedHashMap, bVar, pVar, lVar, hVar);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    @k
    /* renamed from: Q1 */
    public final com.jakewharton.rxrelay3.c getF83108j() {
        return this.f74888b.f83108j;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f74889c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f74889c = null;
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final void op(@k String str, @k String str2, @k SellerOnlineStatus sellerOnlineStatus) {
        this.f74888b.op(str, str2, sellerOnlineStatus);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final int va() {
        return this.f74888b.va();
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final void W6(boolean z12, boolean z13, boolean z14) {
    }
}
