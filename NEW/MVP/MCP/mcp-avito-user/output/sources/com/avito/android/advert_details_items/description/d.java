package com.avito.android.advert_details_items.description;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDescriptionPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/description/d;", "Lcom/avito/android/advert_details_items/description/c;", "Lcom/avito/android/advert_core/advert/p;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c, p {

    /* renamed from: b, reason: collision with root package name */
    public p f84621b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public AdvertDetailsDescriptionItem f84622c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public f f84623d;

    @Inject
    public d() {
    }

    @Override // com.avito.android.advert_details_items.description.c
    public final void F7(@k p pVar) {
        this.f84621b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem = (AdvertDetailsDescriptionItem) aVar;
        this.f84622c = advertDetailsDescriptionItem;
        this.f84623d = fVar;
        fVar.xJ(advertDetailsDescriptionItem, this);
        if (advertDetailsDescriptionItem.f84609h) {
            fVar.y1();
        }
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void V() {
        p pVar = this.f84621b;
        if (pVar == null) {
            pVar = null;
        }
        pVar.V();
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void Y() {
        p pVar = this.f84621b;
        if (pVar == null) {
            pVar = null;
        }
        pVar.Y();
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void x1() {
        p pVar = this.f84621b;
        if (pVar == null) {
            pVar = null;
        }
        pVar.x1();
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem = this.f84622c;
        if (advertDetailsDescriptionItem == null) {
            return;
        }
        f fVar = this.f84623d;
        advertDetailsDescriptionItem.f84607f = fVar != null ? fVar.d0() : null;
    }
}
