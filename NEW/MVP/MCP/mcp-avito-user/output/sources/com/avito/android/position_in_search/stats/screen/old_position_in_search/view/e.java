package com.avito.android.position_in_search.stats.screen.old_position_in_search.view;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.view.SearchPositionParams;
import com.squareup.anvil.annotations.ContributesBinding;
import d90.InterfaceC39536b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionActivity.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/e;", "Ld90/b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements InterfaceC39536b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f220848a;

    @Inject
    public e(@k Context context) {
        this.f220848a = context;
    }

    @Override // d90.InterfaceC39536b
    @k
    public final Intent a(@k SearchPositionParams searchPositionParams) {
        SearchPositionParams.a aVar = SearchPositionParams.f221755d;
        Intent intent = new Intent(this.f220848a, (Class<?>) SearchPositionActivity.class);
        aVar.getClass();
        return intent.putExtra("position_in_search.stats.search_position_params_key", searchPositionParams);
    }
}
