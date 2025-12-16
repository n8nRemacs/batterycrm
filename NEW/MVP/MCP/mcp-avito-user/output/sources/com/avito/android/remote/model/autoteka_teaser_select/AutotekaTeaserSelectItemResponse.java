package com.avito.android.remote.model.autoteka_teaser_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.teaser.TeaserError;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserSelectItemResponse.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0014¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectItemResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItem;", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;", "autoSelectData", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;", "autoSelectDataV2", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "autotekaData", "Lcom/avito/android/remote/model/teaser/TeaserError;", "error", "<init>", "(Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;Lcom/avito/android/remote/model/teaser/TeaserError;)V", "component1", "()Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;", "component2", "()Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;", "component3", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "component4", "()Lcom/avito/android/remote/model/teaser/TeaserError;", "copy", "(Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;Lcom/avito/android/remote/model/teaser/TeaserError;)Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectItemResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;", "getAutoSelectData", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;", "getAutoSelectDataV2", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "getAutotekaData", "Lcom/avito/android/remote/model/teaser/TeaserError;", "getError", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserSelectItemResponse implements Parcelable, AutotekaTeaserItem {

    @k
    public static final Parcelable.Creator<AutotekaTeaserSelectItemResponse> CREATOR = new Creator();

    @c("autoSelectData")
    @l
    private final AutotekaTeaserSelectResult autoSelectData;

    @c("autoSelectDataV2")
    @l
    private final AutotekaTeaserSelectV2Result autoSelectDataV2;

    @c("autotekaData")
    @l
    private final AutotekaTeaserResult autotekaData;

    @c("error")
    @l
    private final TeaserError error;

    /* compiled from: AutotekaTeaserSelectItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserSelectItemResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectItemResponse createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserSelectItemResponse(parcel.readInt() == 0 ? null : AutotekaTeaserSelectResult.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaTeaserSelectV2Result.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaTeaserResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TeaserError.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectItemResponse[] newArray(int i12) {
            return new AutotekaTeaserSelectItemResponse[i12];
        }
    }

    public AutotekaTeaserSelectItemResponse(@l AutotekaTeaserSelectResult autotekaTeaserSelectResult, @l AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result, @l AutotekaTeaserResult autotekaTeaserResult, @l TeaserError teaserError) {
        this.autoSelectData = autotekaTeaserSelectResult;
        this.autoSelectDataV2 = autotekaTeaserSelectV2Result;
        this.autotekaData = autotekaTeaserResult;
        this.error = teaserError;
    }

    public static /* synthetic */ AutotekaTeaserSelectItemResponse copy$default(AutotekaTeaserSelectItemResponse autotekaTeaserSelectItemResponse, AutotekaTeaserSelectResult autotekaTeaserSelectResult, AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result, AutotekaTeaserResult autotekaTeaserResult, TeaserError teaserError, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            autotekaTeaserSelectResult = autotekaTeaserSelectItemResponse.autoSelectData;
        }
        if ((i12 & 2) != 0) {
            autotekaTeaserSelectV2Result = autotekaTeaserSelectItemResponse.autoSelectDataV2;
        }
        if ((i12 & 4) != 0) {
            autotekaTeaserResult = autotekaTeaserSelectItemResponse.autotekaData;
        }
        if ((i12 & 8) != 0) {
            teaserError = autotekaTeaserSelectItemResponse.error;
        }
        return autotekaTeaserSelectItemResponse.copy(autotekaTeaserSelectResult, autotekaTeaserSelectV2Result, autotekaTeaserResult, teaserError);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AutotekaTeaserSelectResult getAutoSelectData() {
        return this.autoSelectData;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AutotekaTeaserSelectV2Result getAutoSelectDataV2() {
        return this.autoSelectDataV2;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AutotekaTeaserResult getAutotekaData() {
        return this.autotekaData;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final TeaserError getError() {
        return this.error;
    }

    @k
    public final AutotekaTeaserSelectItemResponse copy(@l AutotekaTeaserSelectResult autoSelectData, @l AutotekaTeaserSelectV2Result autoSelectDataV2, @l AutotekaTeaserResult autotekaData, @l TeaserError error) {
        return new AutotekaTeaserSelectItemResponse(autoSelectData, autoSelectDataV2, autotekaData, error);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserSelectItemResponse)) {
            return false;
        }
        AutotekaTeaserSelectItemResponse autotekaTeaserSelectItemResponse = (AutotekaTeaserSelectItemResponse) other;
        return L.f(this.autoSelectData, autotekaTeaserSelectItemResponse.autoSelectData) && L.f(this.autoSelectDataV2, autotekaTeaserSelectItemResponse.autoSelectDataV2) && L.f(this.autotekaData, autotekaTeaserSelectItemResponse.autotekaData) && L.f(this.error, autotekaTeaserSelectItemResponse.error);
    }

    @l
    public final AutotekaTeaserSelectResult getAutoSelectData() {
        return this.autoSelectData;
    }

    @l
    public final AutotekaTeaserSelectV2Result getAutoSelectDataV2() {
        return this.autoSelectDataV2;
    }

    @Override // com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem
    @l
    public AutotekaTeaserResult getAutotekaData() {
        return this.autotekaData;
    }

    @Override // com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem
    @l
    public TeaserError getError() {
        return this.error;
    }

    public int hashCode() {
        AutotekaTeaserSelectResult autotekaTeaserSelectResult = this.autoSelectData;
        int iHashCode = (autotekaTeaserSelectResult == null ? 0 : autotekaTeaserSelectResult.hashCode()) * 31;
        AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result = this.autoSelectDataV2;
        int iHashCode2 = (iHashCode + (autotekaTeaserSelectV2Result == null ? 0 : autotekaTeaserSelectV2Result.hashCode())) * 31;
        AutotekaTeaserResult autotekaTeaserResult = this.autotekaData;
        int iHashCode3 = (iHashCode2 + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
        TeaserError teaserError = this.error;
        return iHashCode3 + (teaserError != null ? teaserError.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaTeaserSelectItemResponse(autoSelectData=" + this.autoSelectData + ", autoSelectDataV2=" + this.autoSelectDataV2 + ", autotekaData=" + this.autotekaData + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AutotekaTeaserSelectResult autotekaTeaserSelectResult = this.autoSelectData;
        if (autotekaTeaserSelectResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaTeaserSelectResult.writeToParcel(parcel, flags);
        }
        AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result = this.autoSelectDataV2;
        if (autotekaTeaserSelectV2Result == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaTeaserSelectV2Result.writeToParcel(parcel, flags);
        }
        AutotekaTeaserResult autotekaTeaserResult = this.autotekaData;
        if (autotekaTeaserResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaTeaserResult.writeToParcel(parcel, flags);
        }
        TeaserError teaserError = this.error;
        if (teaserError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            teaserError.writeToParcel(parcel, flags);
        }
    }
}
