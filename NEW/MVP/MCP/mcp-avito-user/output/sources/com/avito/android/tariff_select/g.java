package com.avito.android.tariff_select;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffSelectIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/g;", "Lcom/avito/android/tariff_select/f;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f301223a;

    @Inject
    public g(@Y61.k Context context) {
        this.f301223a = context;
    }

    @Override // com.avito.android.tariff_select.f
    @Y61.k
    public final Intent a(@l String str) {
        return new Intent(this.f301223a, (Class<?>) TariffSelectActivity.class).putExtra("remote_context", str);
    }
}
