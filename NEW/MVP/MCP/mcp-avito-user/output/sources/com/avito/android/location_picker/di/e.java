package com.avito.android.location_picker.di;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.di.B;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.LocationPickerFragment;
import com.avito.android.location_picker.N0;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import h31.d;
import kotlin.Metadata;

/* compiled from: LocationPickerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/di/e;", "", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface e {

    /* compiled from: LocationPickerComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/di/e$a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k LocationPickerFragment locationPickerFragment);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        e build();

        @h31.b
        @Y61.k
        a c(@Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a d(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a e(@x boolean z12);

        @h31.b
        @Y61.k
        a f(@Y61.l AvitoMapTarget avitoMapTarget);

        @h31.b
        @Y61.k
        a g(@w boolean z12);

        @h31.b
        @Y61.k
        a h(@Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation);

        @h31.b
        @Y61.k
        a i(@Y61.k LocationFlowType locationFlowType);

        @h31.b
        @Y61.k
        a j(@Y61.k LocationPickerFragment locationPickerFragment);

        @Y61.k
        a k(@Y61.k f fVar);

        @h31.b
        @Y61.k
        a l(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a m(@Y61.k LocationPickerScreenOpenEvent.EventSource eventSource);

        @h31.b
        @Y61.k
        a n(@y boolean z12);

        @h31.b
        @Y61.k
        a o(@u boolean z12);

        @h31.b
        @Y61.k
        a p(@com.avito.android.location_picker.di.a boolean z12);

        @h31.b
        @Y61.k
        a q(@Y61.k com.avito.android.location_picker.job.f fVar);

        @h31.b
        @Y61.k
        a r(@v @Y61.l String str);

        @h31.b
        @Y61.k
        a s(@Y61.k LocationPickerState locationPickerState);

        @h31.b
        @Y61.k
        a t(@d boolean z12);

        @h31.b
        @Y61.k
        a u(@Y61.k N0 n02);

        @h31.b
        @Y61.k
        a v(@b boolean z12);

        @h31.b
        @Y61.k
        a w(@Y61.k View view);

        @h31.b
        @Y61.k
        a x(@Y61.k com.jakewharton.rxrelay3.c cVar);
    }

    void a(@Y61.k LocationPickerFragment locationPickerFragment);
}
