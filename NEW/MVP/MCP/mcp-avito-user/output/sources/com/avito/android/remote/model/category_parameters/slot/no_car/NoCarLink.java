package com.avito.android.remote.model.category_parameters.slot.no_car;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NoCarText.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarLink;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarValue;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarValue;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarValue;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarValue;)Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarValue;", "getValue", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NoCarLink implements Parcelable {

    @k
    public static final Parcelable.Creator<NoCarLink> CREATOR = new Creator();

    @c("type")
    @k
    private final String type;

    @c("value")
    @k
    private final NoCarValue value;

    /* compiled from: NoCarText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NoCarLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarLink createFromParcel(@k Parcel parcel) {
            return new NoCarLink(parcel.readString(), NoCarValue.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarLink[] newArray(int i12) {
            return new NoCarLink[i12];
        }
    }

    public NoCarLink(@k String str, @k NoCarValue noCarValue) {
        this.type = str;
        this.value = noCarValue;
    }

    public static /* synthetic */ NoCarLink copy$default(NoCarLink noCarLink, String str, NoCarValue noCarValue, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = noCarLink.type;
        }
        if ((i12 & 2) != 0) {
            noCarValue = noCarLink.value;
        }
        return noCarLink.copy(str, noCarValue);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final NoCarValue getValue() {
        return this.value;
    }

    @k
    public final NoCarLink copy(@k String type, @k NoCarValue value) {
        return new NoCarLink(type, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoCarLink)) {
            return false;
        }
        NoCarLink noCarLink = (NoCarLink) other;
        return L.f(this.type, noCarLink.type) && L.f(this.value, noCarLink.value);
    }

    @k
    public final String getType() {
        return this.type;
    }

    @k
    public final NoCarValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "NoCarLink(type=" + this.type + ", value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        this.value.writeToParcel(parcel, flags);
    }
}
