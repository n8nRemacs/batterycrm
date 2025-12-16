package com.avito.android.advert.item.safedeal.trust_factors.button;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrustFactorsButtonView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/button/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f79062b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f79063c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f79064d;

    public e(@k Button button, @l i iVar) {
        super(button);
        this.f79062b = button;
        this.f79063c = iVar;
        this.f79064d = button.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79063c;
        if (iVar != null) {
            iVar.a();
        }
    }
}
