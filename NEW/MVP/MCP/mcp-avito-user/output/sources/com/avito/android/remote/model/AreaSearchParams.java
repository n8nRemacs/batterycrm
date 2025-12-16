package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;

/* compiled from: AreaSearchParams.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/AreaSearchParams;", "Lcom/avito/android/remote/model/SearchParam;", "Lcom/avito/android/remote/model/search/map/Area;", "value", "<init>", "(Lcom/avito/android/remote/model/search/map/Area;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/map/Area;", "getValue", "()Lcom/avito/android/remote/model/search/map/Area;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AreaSearchParams extends SearchParam<Area> {

    @k
    public static final Parcelable.Creator<AreaSearchParams> CREATOR = new Creator();

    @k
    private final Area value;

    /* compiled from: AreaSearchParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AreaSearchParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AreaSearchParams createFromParcel(@k Parcel parcel) {
            return new AreaSearchParams(Area.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AreaSearchParams[] newArray(int i12) {
            return new AreaSearchParams[i12];
        }
    }

    public AreaSearchParams(@k Area area) {
        this.value = area;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.value.writeToParcel(parcel, flags);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.SearchParam
    @k
    public Area getValue() {
        return this.value;
    }
}
