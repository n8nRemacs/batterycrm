package com.avito.android.item_report;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ItemReportIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_report/h;", "Lcom/avito/android/item_report/g;", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f173874a;

    @Inject
    public h(@Y61.k Context context) {
        this.f173874a = context;
    }

    @Override // com.avito.android.item_report.g
    @Y61.k
    public final Intent a(@Y61.k String str) {
        return new Intent(this.f173874a, (Class<?>) ItemReportActivity.class).putExtra("item_id", str);
    }
}
