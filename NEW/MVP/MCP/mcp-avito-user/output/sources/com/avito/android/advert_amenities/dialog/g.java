package com.avito.android.advert_amenities.dialog;

import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CloseAmenitiesDialogItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_amenities/dialog/g;", "Lcom/avito/android/advert_amenities/dialog/f;", "<init>", "()V", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f81169b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.F(((CloseAmenitiesDialogItem) aVar).f81164c);
        Y41.a<G0> aVar2 = this.f81169b;
        if (aVar2 != null) {
            iVar.a(aVar2);
        }
        iVar.zS();
    }

    @Override // com.avito.android.advert_amenities.dialog.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f81169b = aVar;
    }
}
