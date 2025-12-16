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

/* compiled from: CounterButton.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/counter/CounterButton;", "Landroid/os/Parcelable;", "", "enabled", "", "title", "Lcom/avito/android/remote/model/PresentationType;", PresentationTypeKt.PRESENTATION_TYPE, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/PresentationType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/PresentationType;", "getPresentationType", "()Lcom/avito/android/remote/model/PresentationType;", "setPresentationType", "(Lcom/avito/android/remote/model/PresentationType;)V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CounterButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CounterButton> CREATOR = new Creator();

    @c("enabled")
    @l
    private Boolean enabled;

    @c(PresentationTypeKt.PRESENTATION_TYPE)
    @l
    private PresentationType presentationType;

    @c("title")
    @l
    private String title;

    /* compiled from: CounterButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CounterButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CounterButton createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CounterButton(boolValueOf, parcel.readString(), parcel.readInt() != 0 ? PresentationType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CounterButton[] newArray(int i12) {
            return new CounterButton[i12];
        }
    }

    public CounterButton(@l Boolean bool, @l String str, @l PresentationType presentationType) {
        this.enabled = bool;
        this.title = str;
        this.presentationType = presentationType;
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

    @l
    public final String getTitle() {
        return this.title;
    }

    public final void setEnabled(@l Boolean bool) {
        this.enabled = bool;
    }

    public final void setPresentationType(@l PresentationType presentationType) {
        this.presentationType = presentationType;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.title);
        PresentationType presentationType = this.presentationType;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
    }

    public /* synthetic */ CounterButton(Boolean bool, String str, PresentationType presentationType, int i12, C42822w c42822w) {
        this(bool, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : presentationType);
    }
}
