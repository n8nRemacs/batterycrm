package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.teaser.TeaserError;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItem;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "autotekaData", "Lcom/avito/android/remote/model/teaser/TeaserError;", "error", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;Lcom/avito/android/remote/model/teaser/TeaserError;)V", "component1", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "component2", "()Lcom/avito/android/remote/model/teaser/TeaserError;", "copy", "(Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;Lcom/avito/android/remote/model/teaser/TeaserError;)Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "getAutotekaData", "Lcom/avito/android/remote/model/teaser/TeaserError;", "getError", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserItemResponse implements Parcelable, AutotekaTeaserItem {

    @k
    public static final Parcelable.Creator<AutotekaTeaserItemResponse> CREATOR = new Creator();

    @c("data")
    @l
    private final AutotekaTeaserResult autotekaData;

    @c("error")
    @l
    private final TeaserError error;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserItemResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserItemResponse createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserItemResponse(parcel.readInt() == 0 ? null : AutotekaTeaserResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TeaserError.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserItemResponse[] newArray(int i12) {
            return new AutotekaTeaserItemResponse[i12];
        }
    }

    public AutotekaTeaserItemResponse(@l AutotekaTeaserResult autotekaTeaserResult, @l TeaserError teaserError) {
        this.autotekaData = autotekaTeaserResult;
        this.error = teaserError;
    }

    public static /* synthetic */ AutotekaTeaserItemResponse copy$default(AutotekaTeaserItemResponse autotekaTeaserItemResponse, AutotekaTeaserResult autotekaTeaserResult, TeaserError teaserError, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            autotekaTeaserResult = autotekaTeaserItemResponse.autotekaData;
        }
        if ((i12 & 2) != 0) {
            teaserError = autotekaTeaserItemResponse.error;
        }
        return autotekaTeaserItemResponse.copy(autotekaTeaserResult, teaserError);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AutotekaTeaserResult getAutotekaData() {
        return this.autotekaData;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final TeaserError getError() {
        return this.error;
    }

    @k
    public final AutotekaTeaserItemResponse copy(@l AutotekaTeaserResult autotekaData, @l TeaserError error) {
        return new AutotekaTeaserItemResponse(autotekaData, error);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserItemResponse)) {
            return false;
        }
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = (AutotekaTeaserItemResponse) other;
        return L.f(this.autotekaData, autotekaTeaserItemResponse.autotekaData) && L.f(this.error, autotekaTeaserItemResponse.error);
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
        AutotekaTeaserResult autotekaTeaserResult = this.autotekaData;
        int iHashCode = (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode()) * 31;
        TeaserError teaserError = this.error;
        return iHashCode + (teaserError != null ? teaserError.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaTeaserItemResponse(autotekaData=" + this.autotekaData + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
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
