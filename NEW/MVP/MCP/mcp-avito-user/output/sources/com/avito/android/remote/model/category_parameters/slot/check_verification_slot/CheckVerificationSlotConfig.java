package com.avito.android.remote.model.category_parameters.slot.check_verification_slot;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CheckVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/CheckVerificationSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;", "verificationStatusPending", "verificationStatusRequired", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;", "getVerificationStatusPending", "()Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;", "getVerificationStatusRequired", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CheckVerificationSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<CheckVerificationSlotConfig> CREATOR = new Creator();

    @c("verificationPending")
    @k
    private final ContentDependsOnStatus verificationStatusPending;

    @c("verificationRequired")
    @k
    private final ContentDependsOnStatus verificationStatusRequired;

    /* compiled from: CheckVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CheckVerificationSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CheckVerificationSlotConfig createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<ContentDependsOnStatus> creator = ContentDependsOnStatus.CREATOR;
            return new CheckVerificationSlotConfig(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CheckVerificationSlotConfig[] newArray(int i12) {
            return new CheckVerificationSlotConfig[i12];
        }
    }

    public CheckVerificationSlotConfig(@k ContentDependsOnStatus contentDependsOnStatus, @k ContentDependsOnStatus contentDependsOnStatus2) {
        this.verificationStatusPending = contentDependsOnStatus;
        this.verificationStatusRequired = contentDependsOnStatus2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final ContentDependsOnStatus getVerificationStatusPending() {
        return this.verificationStatusPending;
    }

    @k
    public final ContentDependsOnStatus getVerificationStatusRequired() {
        return this.verificationStatusRequired;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.verificationStatusPending.writeToParcel(parcel, flags);
        this.verificationStatusRequired.writeToParcel(parcel, flags);
    }
}
