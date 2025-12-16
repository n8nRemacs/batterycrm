package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.map.Area;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdditionalCategoryParameter.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AdditionalAreaParameter;", "Lcom/avito/android/remote/model/category_parameters/AdditionalCategoryParameter;", "", "id", "Lcom/avito/android/remote/model/search/map/Area;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/map/Area;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/search/map/Area;", "getValue", "()Lcom/avito/android/remote/model/search/map/Area;", "setValue", "(Lcom/avito/android/remote/model/search/map/Area;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdditionalAreaParameter implements AdditionalCategoryParameter {

    @k
    public static final Parcelable.Creator<AdditionalAreaParameter> CREATOR = new Creator();

    @k
    private final String id;

    @c("value")
    @l
    private Area value;

    /* compiled from: AdditionalCategoryParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalAreaParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalAreaParameter createFromParcel(@k Parcel parcel) {
            return new AdditionalAreaParameter(parcel.readString(), parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalAreaParameter[] newArray(int i12) {
            return new AdditionalAreaParameter[i12];
        }
    }

    public AdditionalAreaParameter(@k String str, @l Area area) {
        this.id = str;
        this.value = area;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Area getValue() {
        return this.value;
    }

    public final void setValue(@l Area area) {
        this.value = area;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Area area = this.value;
        if (area == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area.writeToParcel(parcel, flags);
        }
    }
}
