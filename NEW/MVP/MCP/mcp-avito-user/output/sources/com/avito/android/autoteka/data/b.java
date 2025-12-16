package com.avito.android.autoteka.data;

import android.content.Context;
import android.content.Intent;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.presentation.previewsearch.AutotekaPreviewSearchActivity;
import com.avito.android.autoteka.presentation.report.AutotekaReportActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/b;", "Lyf/m;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements yf.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f96101a;

    @Inject
    public b(@Y61.k Context context) {
        this.f96101a = context;
    }

    @Override // yf.m
    @Y61.k
    public final Intent a(@Y61.l Integer num, @Y61.l String str) {
        AutotekaPreviewSearchDetails autotekaPreviewSearchDetails = new AutotekaPreviewSearchDetails(str, num, null, null, false, false);
        Intent intent = new Intent(this.f96101a, (Class<?>) AutotekaPreviewSearchActivity.class);
        intent.putExtra("KeyAutotekaPreviewDetails", autotekaPreviewSearchDetails);
        return intent;
    }

    @Override // yf.m
    @Y61.k
    public final Intent b(@Y61.k ReportDetails reportDetails) {
        return new Intent(this.f96101a, (Class<?>) AutotekaReportActivity.class).putExtra("ReportDetails", reportDetails);
    }
}
