package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: DomotekaTeaserResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/DomotekaTeaserResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/DomotekaTeaser;", "result", "<init>", "(Lcom/avito/android/remote/DomotekaTeaser;)V", "Lcom/avito/android/remote/DomotekaTeaser;", "c", "()Lcom/avito/android/remote/DomotekaTeaser;", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DomotekaTeaserResponse implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DomotekaTeaserResponse> CREATOR = new a();

    @com.google.gson.annotations.c("result")
    @Y61.l
    private final DomotekaTeaser result;

    /* compiled from: DomotekaTeaserResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DomotekaTeaserResponse> {
        @Override // android.os.Parcelable.Creator
        public final DomotekaTeaserResponse createFromParcel(Parcel parcel) {
            return new DomotekaTeaserResponse(parcel.readInt() == 0 ? null : DomotekaTeaser.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DomotekaTeaserResponse[] newArray(int i12) {
            return new DomotekaTeaserResponse[i12];
        }
    }

    public DomotekaTeaserResponse(@Y61.l DomotekaTeaser domotekaTeaser) {
        this.result = domotekaTeaser;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DomotekaTeaser getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        DomotekaTeaser domotekaTeaser = this.result;
        if (domotekaTeaser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            domotekaTeaser.writeToParcel(parcel, i12);
        }
    }
}
