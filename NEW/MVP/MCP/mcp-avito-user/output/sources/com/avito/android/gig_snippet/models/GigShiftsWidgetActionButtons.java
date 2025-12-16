package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetActionButtons;", "Landroid/os/Parcelable;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;", "primaryButton", "secondaryButton", "<init>", "(Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;)V", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;", "c", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;", "d", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetActionButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetActionButtons> CREATOR = new a();

    @c("primaryButton")
    @l
    private final GigShiftsWidgetSlotActionButton primaryButton;

    @c("secondaryButton")
    @l
    private final GigShiftsWidgetSlotActionButton secondaryButton;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetActionButtons> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetActionButtons createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetActionButtons(parcel.readInt() == 0 ? null : GigShiftsWidgetSlotActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GigShiftsWidgetSlotActionButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetActionButtons[] newArray(int i12) {
            return new GigShiftsWidgetActionButtons[i12];
        }
    }

    public GigShiftsWidgetActionButtons(@l GigShiftsWidgetSlotActionButton gigShiftsWidgetSlotActionButton, @l GigShiftsWidgetSlotActionButton gigShiftsWidgetSlotActionButton2) {
        this.primaryButton = gigShiftsWidgetSlotActionButton;
        this.secondaryButton = gigShiftsWidgetSlotActionButton2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final GigShiftsWidgetSlotActionButton getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final GigShiftsWidgetSlotActionButton getSecondaryButton() {
        return this.secondaryButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        GigShiftsWidgetSlotActionButton gigShiftsWidgetSlotActionButton = this.primaryButton;
        if (gigShiftsWidgetSlotActionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftsWidgetSlotActionButton.writeToParcel(parcel, i12);
        }
        GigShiftsWidgetSlotActionButton gigShiftsWidgetSlotActionButton2 = this.secondaryButton;
        if (gigShiftsWidgetSlotActionButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftsWidgetSlotActionButton2.writeToParcel(parcel, i12);
        }
    }
}
