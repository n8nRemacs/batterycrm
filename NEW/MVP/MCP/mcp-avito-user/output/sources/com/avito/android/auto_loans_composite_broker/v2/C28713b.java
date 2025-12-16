package com.avito.android.auto_loans_composite_broker.v2;

import android.content.Context;
import android.content.res.Configuration;
import com.avito.android.R;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCompositeBrokerV2ResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/b;", "Lcom/avito/android/auto_loans_composite_broker/v2/a;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_composite_broker.v2.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28713b implements InterfaceC28712a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f95629a;

    @Inject
    public C28713b(@Y61.k Context context) {
        this.f95629a = context;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.InterfaceC28712a
    @Y61.k
    public final String a(int i12) {
        Locale locale = new Locale("ru", "RU");
        Context context = this.f95629a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getQuantityString(R.plurals.calculator_terms_years, i12, Integer.valueOf(i12));
    }
}
