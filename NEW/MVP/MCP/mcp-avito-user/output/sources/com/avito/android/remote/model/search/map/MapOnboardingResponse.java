package com.avito.android.remote.model.search.map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapOnboardingResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/search/map/MapOnboardingResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/map/MapOnboarding;", "mapOnboarding", "<init>", "(Lcom/avito/android/remote/model/search/map/MapOnboarding;)V", "component1", "()Lcom/avito/android/remote/model/search/map/MapOnboarding;", "copy", "(Lcom/avito/android/remote/model/search/map/MapOnboarding;)Lcom/avito/android/remote/model/search/map/MapOnboardingResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/map/MapOnboarding;", "getMapOnboarding", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MapOnboardingResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<MapOnboardingResponse> CREATOR = new Creator();

    @c("mapOnboarding")
    @l
    private final MapOnboarding mapOnboarding;

    /* compiled from: MapOnboardingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapOnboardingResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboardingResponse createFromParcel(@k Parcel parcel) {
            return new MapOnboardingResponse(parcel.readInt() == 0 ? null : MapOnboarding.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboardingResponse[] newArray(int i12) {
            return new MapOnboardingResponse[i12];
        }
    }

    public MapOnboardingResponse(@l MapOnboarding mapOnboarding) {
        this.mapOnboarding = mapOnboarding;
    }

    public static /* synthetic */ MapOnboardingResponse copy$default(MapOnboardingResponse mapOnboardingResponse, MapOnboarding mapOnboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            mapOnboarding = mapOnboardingResponse.mapOnboarding;
        }
        return mapOnboardingResponse.copy(mapOnboarding);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final MapOnboarding getMapOnboarding() {
        return this.mapOnboarding;
    }

    @k
    public final MapOnboardingResponse copy(@l MapOnboarding mapOnboarding) {
        return new MapOnboardingResponse(mapOnboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapOnboardingResponse) && L.f(this.mapOnboarding, ((MapOnboardingResponse) other).mapOnboarding);
    }

    @l
    public final MapOnboarding getMapOnboarding() {
        return this.mapOnboarding;
    }

    public int hashCode() {
        MapOnboarding mapOnboarding = this.mapOnboarding;
        if (mapOnboarding == null) {
            return 0;
        }
        return mapOnboarding.hashCode();
    }

    @k
    public String toString() {
        return "MapOnboardingResponse(mapOnboarding=" + this.mapOnboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        MapOnboarding mapOnboarding = this.mapOnboarding;
        if (mapOnboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapOnboarding.writeToParcel(parcel, flags);
        }
    }
}
