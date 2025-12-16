package com.avito.android.imv_similiar_adverts;

import android.content.Context;
import android.content.Intent;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvSimilarAdvertsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/k;", "Lcom/avito/android/imv_similiar_adverts/j;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f170876a;

    @Inject
    public k(@Y61.k Context context) {
        this.f170876a = context;
    }

    @Override // com.avito.android.imv_similiar_adverts.j
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k String str4, @Y61.l Long l12, @Y61.l Long l13) {
        ImvSimilarAdvertsActivity.a aVar = ImvSimilarAdvertsActivity.f170811n;
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = new ImvSimilarAdvertsParams(str, str2, str3, j12, str4, l12, l13);
        aVar.getClass();
        return new Intent(this.f170876a, (Class<?>) ImvSimilarAdvertsActivity.class).putExtra("open_params", imvSimilarAdvertsParams);
    }
}
