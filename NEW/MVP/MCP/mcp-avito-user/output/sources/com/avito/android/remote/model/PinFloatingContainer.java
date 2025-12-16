package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PinAdvertsResult.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/PinFloatingContainer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PinFloatingButton;", "secondaryButton", "primaryButton", "<init>", "(Lcom/avito/android/remote/model/PinFloatingButton;Lcom/avito/android/remote/model/PinFloatingButton;)V", "component1", "()Lcom/avito/android/remote/model/PinFloatingButton;", "component2", "copy", "(Lcom/avito/android/remote/model/PinFloatingButton;Lcom/avito/android/remote/model/PinFloatingButton;)Lcom/avito/android/remote/model/PinFloatingContainer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/PinFloatingButton;", "getSecondaryButton", "getPrimaryButton", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PinFloatingContainer implements Parcelable {

    @k
    public static final Parcelable.Creator<PinFloatingContainer> CREATOR = new Creator();

    @c("order_call_button")
    @l
    private final PinFloatingButton primaryButton;

    @c("call_button")
    @l
    private final PinFloatingButton secondaryButton;

    /* compiled from: PinAdvertsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PinFloatingContainer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PinFloatingContainer createFromParcel(@k Parcel parcel) {
            return new PinFloatingContainer(parcel.readInt() == 0 ? null : PinFloatingButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PinFloatingButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PinFloatingContainer[] newArray(int i12) {
            return new PinFloatingContainer[i12];
        }
    }

    public PinFloatingContainer(@l PinFloatingButton pinFloatingButton, @l PinFloatingButton pinFloatingButton2) {
        this.secondaryButton = pinFloatingButton;
        this.primaryButton = pinFloatingButton2;
    }

    public static /* synthetic */ PinFloatingContainer copy$default(PinFloatingContainer pinFloatingContainer, PinFloatingButton pinFloatingButton, PinFloatingButton pinFloatingButton2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            pinFloatingButton = pinFloatingContainer.secondaryButton;
        }
        if ((i12 & 2) != 0) {
            pinFloatingButton2 = pinFloatingContainer.primaryButton;
        }
        return pinFloatingContainer.copy(pinFloatingButton, pinFloatingButton2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final PinFloatingButton getSecondaryButton() {
        return this.secondaryButton;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final PinFloatingButton getPrimaryButton() {
        return this.primaryButton;
    }

    @k
    public final PinFloatingContainer copy(@l PinFloatingButton secondaryButton, @l PinFloatingButton primaryButton) {
        return new PinFloatingContainer(secondaryButton, primaryButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinFloatingContainer)) {
            return false;
        }
        PinFloatingContainer pinFloatingContainer = (PinFloatingContainer) other;
        return L.f(this.secondaryButton, pinFloatingContainer.secondaryButton) && L.f(this.primaryButton, pinFloatingContainer.primaryButton);
    }

    @l
    public final PinFloatingButton getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    public final PinFloatingButton getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        PinFloatingButton pinFloatingButton = this.secondaryButton;
        int iHashCode = (pinFloatingButton == null ? 0 : pinFloatingButton.hashCode()) * 31;
        PinFloatingButton pinFloatingButton2 = this.primaryButton;
        return iHashCode + (pinFloatingButton2 != null ? pinFloatingButton2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PinFloatingContainer(secondaryButton=" + this.secondaryButton + ", primaryButton=" + this.primaryButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        PinFloatingButton pinFloatingButton = this.secondaryButton;
        if (pinFloatingButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pinFloatingButton.writeToParcel(parcel, flags);
        }
        PinFloatingButton pinFloatingButton2 = this.primaryButton;
        if (pinFloatingButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pinFloatingButton2.writeToParcel(parcel, flags);
        }
    }
}
