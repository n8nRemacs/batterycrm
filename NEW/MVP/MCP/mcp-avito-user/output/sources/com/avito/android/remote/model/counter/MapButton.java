package com.avito.android.remote.model.counter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MapButton.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/counter/MapButton;", "Landroid/os/Parcelable;", "", "enabled", "Lcom/avito/android/remote/model/PresentationType;", PresentationTypeKt.PRESENTATION_TYPE, "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/PresentationType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/PresentationType;", "getPresentationType", "()Lcom/avito/android/remote/model/PresentationType;", "setPresentationType", "(Lcom/avito/android/remote/model/PresentationType;)V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MapButton implements Parcelable {

    @k
    public static final Parcelable.Creator<MapButton> CREATOR = new Creator();

    @c("enabled")
    @l
    private Boolean enabled;

    @c(PresentationTypeKt.PRESENTATION_TYPE)
    @l
    private PresentationType presentationType;

    /* compiled from: MapButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapButton createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MapButton(boolValueOf, parcel.readInt() != 0 ? PresentationType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapButton[] newArray(int i12) {
            return new MapButton[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final PresentationType getPresentationType() {
        return this.presentationType;
    }

    public final void setEnabled(@l Boolean bool) {
        this.enabled = bool;
    }

    public final void setPresentationType(@l PresentationType presentationType) {
        this.presentationType = presentationType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        PresentationType presentationType = this.presentationType;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
    }

    public MapButton(@l Boolean bool, @l PresentationType presentationType) {
        this.enabled = bool;
        this.presentationType = presentationType;
    }

    public /* synthetic */ MapButton(Boolean bool, PresentationType presentationType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : presentationType);
    }
}
