package com.avito.android.select.new_metro;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.M;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectMetroIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/k;", "Lcom/avito/android/select/new_metro/j;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f266213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f266214b;

    @Inject
    public k(@Y61.k Context context, @Y61.k M m12) {
        this.f266213a = context;
        this.f266214b = m12;
    }

    @Override // com.avito.android.select.new_metro.j
    @Y61.k
    public final Intent a(@Y61.l MetroResponseBody metroResponseBody, @Y61.k String str, int i12, @Y61.l Integer num, @Y61.l String str2, boolean z12, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l NavigationTabSetItem navigationTabSetItem) {
        SelectMetroParams selectMetroParams = new SelectMetroParams(metroResponseBody, str, i12, num, str2, z12, list, false, 128, null);
        if (navigationTabSetItem != null) {
            return this.f266214b.d(new SelectMetroFragmentData(selectMetroParams, navigationTabSetItem));
        }
        Intent intent = new Intent(this.f266213a, (Class<?>) SelectMetroActivity.class);
        intent.putExtra("new_metro_arguments", selectMetroParams);
        return intent;
    }
}
