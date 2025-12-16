package com.avito.android.location_picker.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertsCountResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/location_picker/model/CounterButton;", "Landroid/os/Parcelable;", "", "enabled", "", "title", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CounterButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CounterButton> CREATOR = new a();

    @c("enabled")
    @l
    private Boolean enabled;

    @c("title")
    @l
    private String title;

    /* compiled from: AdvertsCountResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CounterButton> {
        @Override // android.os.Parcelable.Creator
        public final CounterButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CounterButton(boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CounterButton[] newArray(int i12) {
            return new CounterButton[i12];
        }
    }

    public CounterButton(@l Boolean bool, @l String str) {
        this.enabled = bool;
        this.title = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.title);
    }

    public /* synthetic */ CounterButton(Boolean bool, String str, int i12, C42822w c42822w) {
        this(bool, (i12 & 2) != 0 ? null : str);
    }
}
