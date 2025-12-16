package com.avito.android.widget_filters;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WidgetFiltersIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/a;", "LKP0/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements KP0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f329696a;

    @Inject
    public a(@k Context context) {
        this.f329696a = context;
    }

    @Override // KP0.a
    @k
    public final Intent a(@k WidgetFiltersOpenParams widgetFiltersOpenParams) {
        WidgetFiltersActivity.f329686n.getClass();
        return new Intent(this.f329696a, (Class<?>) WidgetFiltersActivity.class).putExtra("open_params", widgetFiltersOpenParams);
    }
}
