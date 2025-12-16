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

/* compiled from: ComfortableDealPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/OpenQuizButton;", "openQuizButton", "<init>", "(Lcom/avito/android/remote/model/OpenQuizButton;)V", "component1", "()Lcom/avito/android/remote/model/OpenQuizButton;", "copy", "(Lcom/avito/android/remote/model/OpenQuizButton;)Lcom/avito/android/remote/model/ComfortableDealButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/OpenQuizButton;", "getOpenQuizButton", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealButton implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealButton> CREATOR = new Creator();

    @c("openQuizButton")
    @l
    private final OpenQuizButton openQuizButton;

    /* compiled from: ComfortableDealPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealButton createFromParcel(@k Parcel parcel) {
            return new ComfortableDealButton(parcel.readInt() == 0 ? null : OpenQuizButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealButton[] newArray(int i12) {
            return new ComfortableDealButton[i12];
        }
    }

    public ComfortableDealButton(@l OpenQuizButton openQuizButton) {
        this.openQuizButton = openQuizButton;
    }

    public static /* synthetic */ ComfortableDealButton copy$default(ComfortableDealButton comfortableDealButton, OpenQuizButton openQuizButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            openQuizButton = comfortableDealButton.openQuizButton;
        }
        return comfortableDealButton.copy(openQuizButton);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final OpenQuizButton getOpenQuizButton() {
        return this.openQuizButton;
    }

    @k
    public final ComfortableDealButton copy(@l OpenQuizButton openQuizButton) {
        return new ComfortableDealButton(openQuizButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComfortableDealButton) && L.f(this.openQuizButton, ((ComfortableDealButton) other).openQuizButton);
    }

    @l
    public final OpenQuizButton getOpenQuizButton() {
        return this.openQuizButton;
    }

    public int hashCode() {
        OpenQuizButton openQuizButton = this.openQuizButton;
        if (openQuizButton == null) {
            return 0;
        }
        return openQuizButton.hashCode();
    }

    @k
    public String toString() {
        return "ComfortableDealButton(openQuizButton=" + this.openQuizButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        OpenQuizButton openQuizButton = this.openQuizButton;
        if (openQuizButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openQuizButton.writeToParcel(parcel, flags);
        }
    }
}
