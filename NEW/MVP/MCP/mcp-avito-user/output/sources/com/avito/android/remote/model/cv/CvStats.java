package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: CvDisplayWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/cv/CvStats;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/cv/CvStatsPeriod;", "views", "contacts", "favorites", "<init>", "(Lcom/avito/android/remote/model/cv/CvStatsPeriod;Lcom/avito/android/remote/model/cv/CvStatsPeriod;Lcom/avito/android/remote/model/cv/CvStatsPeriod;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/cv/CvStatsPeriod;", "getViews", "()Lcom/avito/android/remote/model/cv/CvStatsPeriod;", "getContacts", "getFavorites", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvStats implements Parcelable {

    @k
    public static final Parcelable.Creator<CvStats> CREATOR = new Creator();

    @l
    private final CvStatsPeriod contacts;

    @l
    private final CvStatsPeriod favorites;

    @l
    private final CvStatsPeriod views;

    /* compiled from: CvDisplayWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvStats> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvStats createFromParcel(@k Parcel parcel) {
            return new CvStats(parcel.readInt() == 0 ? null : CvStatsPeriod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CvStatsPeriod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CvStatsPeriod.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvStats[] newArray(int i12) {
            return new CvStats[i12];
        }
    }

    public CvStats(@l CvStatsPeriod cvStatsPeriod, @l CvStatsPeriod cvStatsPeriod2, @l CvStatsPeriod cvStatsPeriod3) {
        this.views = cvStatsPeriod;
        this.contacts = cvStatsPeriod2;
        this.favorites = cvStatsPeriod3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final CvStatsPeriod getContacts() {
        return this.contacts;
    }

    @l
    public final CvStatsPeriod getFavorites() {
        return this.favorites;
    }

    @l
    public final CvStatsPeriod getViews() {
        return this.views;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        CvStatsPeriod cvStatsPeriod = this.views;
        if (cvStatsPeriod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatsPeriod.writeToParcel(parcel, flags);
        }
        CvStatsPeriod cvStatsPeriod2 = this.contacts;
        if (cvStatsPeriod2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatsPeriod2.writeToParcel(parcel, flags);
        }
        CvStatsPeriod cvStatsPeriod3 = this.favorites;
        if (cvStatsPeriod3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatsPeriod3.writeToParcel(parcel, flags);
        }
    }
}
