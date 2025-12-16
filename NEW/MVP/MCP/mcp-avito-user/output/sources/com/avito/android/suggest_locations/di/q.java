package com.avito.android.suggest_locations.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.util.Kundle;
import h31.d;
import kotlin.Metadata;

/* compiled from: SuggestLocationsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_locations/di/q;", "", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface q {

    /* compiled from: SuggestLocationsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/di/q$a;", "", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        q a(@h31.b @Y61.l Kundle kundle, @g @h31.b @Y61.l String str, @c @h31.b @Y61.l String str2, @h31.b @i int i12, @h31.b @Y61.l @com.avito.android.suggest_locations.di.a String str3, @h31.b @Y61.k @e PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, @k @h31.b boolean z12, @f @h31.b @Y61.l String str4, @b @h31.b boolean z13, @w @h31.b boolean z14, @j @h31.b @Y61.l String str5, @h31.b @Y61.l @h Boolean bool, @h31.b @Y61.k C28478k c28478k, @Y61.k r rVar);
    }

    void a(@Y61.k SuggestLocationsFragment suggestLocationsFragment);
}
