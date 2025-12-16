package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import h31.d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import wf0.InterfaceC49616a;

/* compiled from: SleepingPlacesComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/di/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: SleepingPlacesComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/di/d$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@e @h31.b @Y61.l String str, @h31.b @Y61.l @c Integer num, @h31.b @Y61.l List<SleepingPlacesBedType> list, @h31.b @Y61.k Y41.l<? super InterfaceC49616a, G0> lVar, @h31.b @Y61.k C28478k c28478k, @Y61.k l lVar2);
    }

    void a(@Y61.k SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog);
}
