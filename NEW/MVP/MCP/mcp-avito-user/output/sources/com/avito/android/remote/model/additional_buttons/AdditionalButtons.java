package com.avito.android.remote.model.additional_buttons;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalButtons.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/additional_buttons/SelectDatesAdditionalButton;", "selectDates", "Lcom/avito/android/remote/model/additional_buttons/UniversalButton;", "universalButton", "<init>", "(Lcom/avito/android/remote/model/additional_buttons/SelectDatesAdditionalButton;Lcom/avito/android/remote/model/additional_buttons/UniversalButton;)V", "component1", "()Lcom/avito/android/remote/model/additional_buttons/SelectDatesAdditionalButton;", "component2", "()Lcom/avito/android/remote/model/additional_buttons/UniversalButton;", "copy", "(Lcom/avito/android/remote/model/additional_buttons/SelectDatesAdditionalButton;Lcom/avito/android/remote/model/additional_buttons/UniversalButton;)Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/additional_buttons/SelectDatesAdditionalButton;", "getSelectDates", "Lcom/avito/android/remote/model/additional_buttons/UniversalButton;", "getUniversalButton", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdditionalButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalButtons> CREATOR = new Creator();

    @c("selectDates")
    @l
    private final SelectDatesAdditionalButton selectDates;

    @c("universalButton")
    @l
    private final UniversalButton universalButton;

    /* compiled from: AdditionalButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalButtons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalButtons createFromParcel(@k Parcel parcel) {
            return new AdditionalButtons(parcel.readInt() == 0 ? null : SelectDatesAdditionalButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalButtons[] newArray(int i12) {
            return new AdditionalButtons[i12];
        }
    }

    public AdditionalButtons(@l SelectDatesAdditionalButton selectDatesAdditionalButton, @l UniversalButton universalButton) {
        this.selectDates = selectDatesAdditionalButton;
        this.universalButton = universalButton;
    }

    public static /* synthetic */ AdditionalButtons copy$default(AdditionalButtons additionalButtons, SelectDatesAdditionalButton selectDatesAdditionalButton, UniversalButton universalButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            selectDatesAdditionalButton = additionalButtons.selectDates;
        }
        if ((i12 & 2) != 0) {
            universalButton = additionalButtons.universalButton;
        }
        return additionalButtons.copy(selectDatesAdditionalButton, universalButton);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SelectDatesAdditionalButton getSelectDates() {
        return this.selectDates;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalButton getUniversalButton() {
        return this.universalButton;
    }

    @k
    public final AdditionalButtons copy(@l SelectDatesAdditionalButton selectDates, @l UniversalButton universalButton) {
        return new AdditionalButtons(selectDates, universalButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalButtons)) {
            return false;
        }
        AdditionalButtons additionalButtons = (AdditionalButtons) other;
        return L.f(this.selectDates, additionalButtons.selectDates) && L.f(this.universalButton, additionalButtons.universalButton);
    }

    @l
    public final SelectDatesAdditionalButton getSelectDates() {
        return this.selectDates;
    }

    @l
    public final UniversalButton getUniversalButton() {
        return this.universalButton;
    }

    public int hashCode() {
        SelectDatesAdditionalButton selectDatesAdditionalButton = this.selectDates;
        int iHashCode = (selectDatesAdditionalButton == null ? 0 : selectDatesAdditionalButton.hashCode()) * 31;
        UniversalButton universalButton = this.universalButton;
        return iHashCode + (universalButton != null ? universalButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdditionalButtons(selectDates=" + this.selectDates + ", universalButton=" + this.universalButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SelectDatesAdditionalButton selectDatesAdditionalButton = this.selectDates;
        if (selectDatesAdditionalButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectDatesAdditionalButton.writeToParcel(parcel, flags);
        }
        UniversalButton universalButton = this.universalButton;
        if (universalButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            universalButton.writeToParcel(parcel, flags);
        }
    }
}
