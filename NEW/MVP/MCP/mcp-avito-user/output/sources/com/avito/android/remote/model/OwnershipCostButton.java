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

/* compiled from: OwnershipCostResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostButton;", "Landroid/os/Parcelable;", "", "label", "Lcom/avito/android/remote/model/OwnershipCostAction;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/OwnershipCostAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/OwnershipCostAction;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/OwnershipCostAction;)Lcom/avito/android/remote/model/OwnershipCostButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "Lcom/avito/android/remote/model/OwnershipCostAction;", "getAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OwnershipCostButton implements Parcelable {

    @k
    public static final Parcelable.Creator<OwnershipCostButton> CREATOR = new Creator();

    @c("action")
    @l
    private final OwnershipCostAction action;

    @c("label")
    @k
    private final String label;

    /* compiled from: OwnershipCostResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OwnershipCostButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OwnershipCostButton createFromParcel(@k Parcel parcel) {
            return new OwnershipCostButton(parcel.readString(), parcel.readInt() == 0 ? null : OwnershipCostAction.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OwnershipCostButton[] newArray(int i12) {
            return new OwnershipCostButton[i12];
        }
    }

    public OwnershipCostButton(@k String str, @l OwnershipCostAction ownershipCostAction) {
        this.label = str;
        this.action = ownershipCostAction;
    }

    public static /* synthetic */ OwnershipCostButton copy$default(OwnershipCostButton ownershipCostButton, String str, OwnershipCostAction ownershipCostAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = ownershipCostButton.label;
        }
        if ((i12 & 2) != 0) {
            ownershipCostAction = ownershipCostButton.action;
        }
        return ownershipCostButton.copy(str, ownershipCostAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final OwnershipCostAction getAction() {
        return this.action;
    }

    @k
    public final OwnershipCostButton copy(@k String label, @l OwnershipCostAction action) {
        return new OwnershipCostButton(label, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnershipCostButton)) {
            return false;
        }
        OwnershipCostButton ownershipCostButton = (OwnershipCostButton) other;
        return L.f(this.label, ownershipCostButton.label) && this.action == ownershipCostButton.action;
    }

    @l
    public final OwnershipCostAction getAction() {
        return this.action;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        OwnershipCostAction ownershipCostAction = this.action;
        return iHashCode + (ownershipCostAction == null ? 0 : ownershipCostAction.hashCode());
    }

    @k
    public String toString() {
        return "OwnershipCostButton(label=" + this.label + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.label);
        OwnershipCostAction ownershipCostAction = this.action;
        if (ownershipCostAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ownershipCostAction.name());
        }
    }
}
