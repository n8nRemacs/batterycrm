package com.avito.android.serp.adapter.warning;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpWarning;
import com.avito.android.serp.adapter.N0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SerpWarningConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/warning/b;", "Lcom/avito/android/serp/adapter/warning/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Override // com.avito.android.serp.adapter.warning.a
    @Y61.k
    public final SerpWarningItem a(@Y61.k SerpWarning serpWarning) {
        long jA2 = N0.a(serpWarning.getUniqueId(), serpWarning.getId());
        String id2 = serpWarning.getId();
        String title = serpWarning.getTitle();
        Image image = serpWarning.getImage();
        Boolean isCloseable = serpWarning.getIsCloseable();
        boolean zBooleanValue = isCloseable != null ? isCloseable.booleanValue() : false;
        List<Action> actions = serpWarning.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        return new SerpWarningItem(jA2, id2, title, image, zBooleanValue, actions, 6);
    }
}
