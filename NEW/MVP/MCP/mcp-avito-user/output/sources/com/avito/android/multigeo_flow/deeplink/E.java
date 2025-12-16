package com.avito.android.multigeo_flow.deeplink;

import android.app.Application;
import android.content.Intent;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListActivity;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobMultiGeoIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/E;", "LN20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class E implements N20.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f206814a;

    @Inject
    public E(@Y61.k Application application) {
        this.f206814a = application;
    }

    @Override // N20.a
    @Y61.k
    public final Intent a(@Y61.k JobMultiGeoParams jobMultiGeoParams) {
        JobMultiGeoFullListActivity.f206921m.getClass();
        return new Intent(this.f206814a, (Class<?>) JobMultiGeoFullListActivity.class).putExtra("open_params", jobMultiGeoParams);
    }
}
