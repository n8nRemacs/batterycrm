package com.avito.android.remote.model.search.map;

import Y61.k;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/map/Marker;", "Landroid/os/Parcelable;", "describeContents", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Marker extends Parcelable {

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int describeContents(@k Marker marker) {
            return 0;
        }
    }

    @Override // android.os.Parcelable
    int describeContents();
}
