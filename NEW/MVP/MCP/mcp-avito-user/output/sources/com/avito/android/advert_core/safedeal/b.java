package com.avito.android.advert_core.safedeal;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertSafeDealResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/b;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f84184a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f84185b;

    @Inject
    public b(@Y61.k Resources resources) {
        this.f84184a = resources.getString(R.string.advert_core_safedeal_service_enabling_error);
        this.f84185b = resources.getString(R.string.advert_core_safedeal_service_disabling_error);
    }
}
