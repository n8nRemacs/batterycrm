package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AutotekaAnalytic.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalyticFields;", "", "searchType", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getSearchType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaAnalytic implements Parcelable, AutotekaAnalyticFields {

    @k
    public static final Parcelable.Creator<AutotekaAnalytic> CREATOR = new Creator();

    @c("searchType")
    private final int searchType;

    /* compiled from: AutotekaAnalytic.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaAnalytic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaAnalytic createFromParcel(@k Parcel parcel) {
            return new AutotekaAnalytic(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaAnalytic[] newArray(int i12) {
            return new AutotekaAnalytic[i12];
        }
    }

    public AutotekaAnalytic(int i12) {
        this.searchType = i12;
    }

    public static /* synthetic */ AutotekaAnalytic copy$default(AutotekaAnalytic autotekaAnalytic, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = autotekaAnalytic.searchType;
        }
        return autotekaAnalytic.copy(i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSearchType() {
        return this.searchType;
    }

    @k
    public final AutotekaAnalytic copy(int searchType) {
        return new AutotekaAnalytic(searchType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutotekaAnalytic) && this.searchType == ((AutotekaAnalytic) other).searchType;
    }

    @Override // com.avito.android.remote.model.autotekateaser.AutotekaAnalyticFields
    public int getSearchType() {
        return this.searchType;
    }

    public int hashCode() {
        return Integer.hashCode(this.searchType);
    }

    @k
    public String toString() {
        return r.t(new StringBuilder("AutotekaAnalytic(searchType="), this.searchType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.searchType);
    }
}
