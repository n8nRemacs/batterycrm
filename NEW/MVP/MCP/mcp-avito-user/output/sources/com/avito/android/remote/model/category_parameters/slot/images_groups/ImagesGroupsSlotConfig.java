package com.avito.android.remote.model.category_parameters.slot.images_groups;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import kotlin.Metadata;

/* compiled from: ImagesGroupsSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImagesGroupsSlotConfig implements SlotConfig {

    @k
    public static final ImagesGroupsSlotConfig INSTANCE = new ImagesGroupsSlotConfig();

    @k
    public static final Parcelable.Creator<ImagesGroupsSlotConfig> CREATOR = new Creator();

    /* compiled from: ImagesGroupsSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImagesGroupsSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsSlotConfig createFromParcel(@k Parcel parcel) {
            parcel.readInt();
            return ImagesGroupsSlotConfig.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsSlotConfig[] newArray(int i12) {
            return new ImagesGroupsSlotConfig[i12];
        }
    }

    private ImagesGroupsSlotConfig() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(1);
    }
}
