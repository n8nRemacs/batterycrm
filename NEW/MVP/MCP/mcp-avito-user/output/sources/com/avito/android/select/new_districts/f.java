package com.avito.android.select.new_districts;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.M;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectDistrictIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/f;", "Lcom/avito/android/select/new_districts/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f265796a;

    @Inject
    public f(@k Context context, @k M m12) {
        this.f265796a = context;
    }

    @Override // com.avito.android.select.new_districts.e
    @k
    public final Intent a(@k DistrictsWithRegions districtsWithRegions, @k String str, @k List list) {
        SelectDistrictParams selectDistrictParams = new SelectDistrictParams(districtsWithRegions, str, list);
        SelectDistrictActivity.f265662n.getClass();
        Intent intent = new Intent(this.f265796a, (Class<?>) SelectDistrictActivity.class);
        C35961v3.b(intent, selectDistrictParams);
        return intent;
    }
}
