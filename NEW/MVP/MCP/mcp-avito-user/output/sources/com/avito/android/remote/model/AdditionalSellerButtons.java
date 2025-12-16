package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdditionalSeller.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/AdditionalSellerButtons;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdditionalSellerButton;", "main", "secondary", "Lcom/avito/android/remote/model/AdditionalSellerAdditionalButton;", "additional", "<init>", "(Lcom/avito/android/remote/model/AdditionalSellerButton;Lcom/avito/android/remote/model/AdditionalSellerButton;Lcom/avito/android/remote/model/AdditionalSellerAdditionalButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdditionalSellerButton;", "getMain", "()Lcom/avito/android/remote/model/AdditionalSellerButton;", "getSecondary", "Lcom/avito/android/remote/model/AdditionalSellerAdditionalButton;", "getAdditional", "()Lcom/avito/android/remote/model/AdditionalSellerAdditionalButton;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdditionalSellerButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalSellerButtons> CREATOR = new Creator();

    @c("additional")
    @l
    private final AdditionalSellerAdditionalButton additional;

    @c("main")
    @k
    private final AdditionalSellerButton main;

    @c("secondary")
    @l
    private final AdditionalSellerButton secondary;

    /* compiled from: AdditionalSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalSellerButtons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSellerButtons createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<AdditionalSellerButton> creator = AdditionalSellerButton.CREATOR;
            return new AdditionalSellerButtons(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? AdditionalSellerAdditionalButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSellerButtons[] newArray(int i12) {
            return new AdditionalSellerButtons[i12];
        }
    }

    public AdditionalSellerButtons(@k AdditionalSellerButton additionalSellerButton, @l AdditionalSellerButton additionalSellerButton2, @l AdditionalSellerAdditionalButton additionalSellerAdditionalButton) {
        this.main = additionalSellerButton;
        this.secondary = additionalSellerButton2;
        this.additional = additionalSellerAdditionalButton;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AdditionalSellerAdditionalButton getAdditional() {
        return this.additional;
    }

    @k
    public final AdditionalSellerButton getMain() {
        return this.main;
    }

    @l
    public final AdditionalSellerButton getSecondary() {
        return this.secondary;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.main.writeToParcel(parcel, flags);
        AdditionalSellerButton additionalSellerButton = this.secondary;
        if (additionalSellerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSellerButton.writeToParcel(parcel, flags);
        }
        AdditionalSellerAdditionalButton additionalSellerAdditionalButton = this.additional;
        if (additionalSellerAdditionalButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSellerAdditionalButton.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ AdditionalSellerButtons(AdditionalSellerButton additionalSellerButton, AdditionalSellerButton additionalSellerButton2, AdditionalSellerAdditionalButton additionalSellerAdditionalButton, int i12, C42822w c42822w) {
        this(additionalSellerButton, (i12 & 2) != 0 ? null : additionalSellerButton2, (i12 & 4) != 0 ? null : additionalSellerAdditionalButton);
    }
}
