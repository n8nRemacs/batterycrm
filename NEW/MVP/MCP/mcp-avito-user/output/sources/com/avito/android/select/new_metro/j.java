package com.avito.android.select.new_metro;

import android.content.Intent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SelectMetroIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/j;", "", "_avito_select_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: SelectMetroIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.l MetroResponseBody metroResponseBody, @Y61.k String str, int i12, @Y61.l Integer num, @Y61.l String str2, boolean z12, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l NavigationTabSetItem navigationTabSetItem);
}
