package com.avito.android.remote.parse.adapter;

import android.app.Application;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchDeviceResourcesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/parse/adapter/Q;", "", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f254209a;

    @Inject
    public Q(@Y61.k Application application) {
        this.f254209a = application.getResources().getBoolean(R.bool.is_tablet);
    }
}
