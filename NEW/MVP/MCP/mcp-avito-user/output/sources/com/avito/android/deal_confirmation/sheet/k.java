package com.avito.android.deal_confirmation.sheet;

import android.content.Context;
import android.content.Intent;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealConfirmationSheetIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/k;", "Lcom/avito/android/deal_confirmation/sheet/j;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f132799a;

    @Inject
    public k(@Y61.k Context context) {
        this.f132799a = context;
    }

    @Override // com.avito.android.deal_confirmation.sheet.j
    @Y61.k
    public final Intent a(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
        DealConfirmationSheetActivity.f132774r.getClass();
        Intent intent = new Intent(this.f132799a, (Class<?>) DealConfirmationSheetActivity.class);
        intent.putExtra("key.deal_confirmation_sheet", dealConfirmationSheet);
        return intent;
    }
}
