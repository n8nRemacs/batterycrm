package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;", "Landroid/os/Parcelable;", "", "text", "", "hasActiveAction", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/lang/Boolean;", "getHasActiveAction", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersBuyerResponseSectionItemValueStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersBuyerResponseSectionItemValueStatus> CREATOR = new Creator();

    @c("color")
    @l
    private final UniversalColor color;

    @c("hasActiveAction")
    @l
    private final Boolean hasActiveAction;

    @c("text")
    @l
    private final String text;

    /* compiled from: StrOrdersBuyerResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersBuyerResponseSectionItemValueStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItemValueStatus createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrOrdersBuyerResponseSectionItemValueStatus(string, boolValueOf, (UniversalColor) parcel.readParcelable(StrOrdersBuyerResponseSectionItemValueStatus.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItemValueStatus[] newArray(int i12) {
            return new StrOrdersBuyerResponseSectionItemValueStatus[i12];
        }
    }

    public StrOrdersBuyerResponseSectionItemValueStatus(@l String str, @l Boolean bool, @l UniversalColor universalColor) {
        this.text = str;
        this.hasActiveAction = bool;
        this.color = universalColor;
    }

    public static /* synthetic */ StrOrdersBuyerResponseSectionItemValueStatus copy$default(StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus, String str, Boolean bool, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strOrdersBuyerResponseSectionItemValueStatus.text;
        }
        if ((i12 & 2) != 0) {
            bool = strOrdersBuyerResponseSectionItemValueStatus.hasActiveAction;
        }
        if ((i12 & 4) != 0) {
            universalColor = strOrdersBuyerResponseSectionItemValueStatus.color;
        }
        return strOrdersBuyerResponseSectionItemValueStatus.copy(str, bool, universalColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getHasActiveAction() {
        return this.hasActiveAction;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final StrOrdersBuyerResponseSectionItemValueStatus copy(@l String text, @l Boolean hasActiveAction, @l UniversalColor color) {
        return new StrOrdersBuyerResponseSectionItemValueStatus(text, hasActiveAction, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersBuyerResponseSectionItemValueStatus)) {
            return false;
        }
        StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus = (StrOrdersBuyerResponseSectionItemValueStatus) other;
        return L.f(this.text, strOrdersBuyerResponseSectionItemValueStatus.text) && L.f(this.hasActiveAction, strOrdersBuyerResponseSectionItemValueStatus.hasActiveAction) && L.f(this.color, strOrdersBuyerResponseSectionItemValueStatus.color);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final Boolean getHasActiveAction() {
        return this.hasActiveAction;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasActiveAction;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersBuyerResponseSectionItemValueStatus(text=");
        sb2.append(this.text);
        sb2.append(", hasActiveAction=");
        sb2.append(this.hasActiveAction);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        Boolean bool = this.hasActiveAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.color, flags);
    }
}
