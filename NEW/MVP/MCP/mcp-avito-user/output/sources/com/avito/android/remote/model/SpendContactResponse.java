package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.auto_contact_models.SpendContactPopUp;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/SpendContactResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PhoneResponse;", "Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "spendContactPopUp", "<init>", "(Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;)V", "component1", "()Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "copy", "(Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;)Lcom/avito/android/remote/model/SpendContactResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "getSpendContactPopUp", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SpendContactResponse extends PhoneResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<SpendContactResponse> CREATOR = new Creator();

    @c("spendContactPopUp")
    @k
    private final SpendContactPopUp spendContactPopUp;

    /* compiled from: PhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpendContactResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpendContactResponse createFromParcel(@k Parcel parcel) {
            return new SpendContactResponse((SpendContactPopUp) parcel.readParcelable(SpendContactResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpendContactResponse[] newArray(int i12) {
            return new SpendContactResponse[i12];
        }
    }

    public SpendContactResponse(@k SpendContactPopUp spendContactPopUp) {
        super(null);
        this.spendContactPopUp = spendContactPopUp;
    }

    public static /* synthetic */ SpendContactResponse copy$default(SpendContactResponse spendContactResponse, SpendContactPopUp spendContactPopUp, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            spendContactPopUp = spendContactResponse.spendContactPopUp;
        }
        return spendContactResponse.copy(spendContactPopUp);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final SpendContactPopUp getSpendContactPopUp() {
        return this.spendContactPopUp;
    }

    @k
    public final SpendContactResponse copy(@k SpendContactPopUp spendContactPopUp) {
        return new SpendContactResponse(spendContactPopUp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpendContactResponse) && L.f(this.spendContactPopUp, ((SpendContactResponse) other).spendContactPopUp);
    }

    @k
    public final SpendContactPopUp getSpendContactPopUp() {
        return this.spendContactPopUp;
    }

    public int hashCode() {
        return this.spendContactPopUp.hashCode();
    }

    @k
    public String toString() {
        return "SpendContactResponse(spendContactPopUp=" + this.spendContactPopUp + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.spendContactPopUp, flags);
    }
}
