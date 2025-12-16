package com.avito.android.vas_discount;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasDiscountIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/j;", "Lcom/avito/android/vas_discount/i;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f319677a;

    @Inject
    public j(@Y61.k Context context) {
        this.f319677a = context;
    }

    @Override // com.avito.android.vas_discount.i
    @Y61.k
    public final Intent a(@Y61.l String str) {
        return new Intent(this.f319677a, (Class<?>) VasDiscountActivity.class).putExtra("discount_context", str);
    }
}
