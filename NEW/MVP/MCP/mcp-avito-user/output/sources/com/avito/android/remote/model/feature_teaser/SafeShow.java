package com.avito.android.remote.model.feature_teaser;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.BottomSheetInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SafeShow.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/feature_teaser/SafeShow;", "Landroid/os/Parcelable;", "", "teaserTitle", "Lcom/avito/android/remote/model/BottomSheetInfo;", "bottomSheetInfo", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/BottomSheetInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTeaserTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/BottomSheetInfo;", "getBottomSheetInfo", "()Lcom/avito/android/remote/model/BottomSheetInfo;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SafeShow implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeShow> CREATOR = new Creator();

    @c("information")
    @k
    private final BottomSheetInfo bottomSheetInfo;

    @c("teaserTitle")
    @k
    private final String teaserTitle;

    /* compiled from: SafeShow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SafeShow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SafeShow createFromParcel(@k Parcel parcel) {
            return new SafeShow(parcel.readString(), BottomSheetInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SafeShow[] newArray(int i12) {
            return new SafeShow[i12];
        }
    }

    public SafeShow(@k String str, @k BottomSheetInfo bottomSheetInfo) {
        this.teaserTitle = str;
        this.bottomSheetInfo = bottomSheetInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final BottomSheetInfo getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    @k
    public final String getTeaserTitle() {
        return this.teaserTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.teaserTitle);
        this.bottomSheetInfo.writeToParcel(parcel, flags);
    }
}
