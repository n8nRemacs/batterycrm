package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersBackNavigationSlot.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationSlot;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "id", "", "attrId", "Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationValue;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationValue;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationValue;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationValue;)Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationSlot;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getAttrId", "Lcom/avito/android/remote/model/category_parameters/FiltersBackNavigationValue;", "getValue", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FiltersBackNavigationSlot implements Parcelable, ParameterSlot {

    @k
    public static final String TYPE = "breadcrumbs";

    @c("attrId")
    @l
    private final Long attrId;

    @c("id")
    @k
    private final String id;

    @c("value")
    @l
    private final FiltersBackNavigationValue value;

    @k
    public static final Parcelable.Creator<FiltersBackNavigationSlot> CREATOR = new Creator();

    /* compiled from: FiltersBackNavigationSlot.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FiltersBackNavigationSlot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FiltersBackNavigationSlot createFromParcel(@k Parcel parcel) {
            return new FiltersBackNavigationSlot(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? FiltersBackNavigationValue.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FiltersBackNavigationSlot[] newArray(int i12) {
            return new FiltersBackNavigationSlot[i12];
        }
    }

    public FiltersBackNavigationSlot(@k String str, @l Long l12, @l FiltersBackNavigationValue filtersBackNavigationValue) {
        this.id = str;
        this.attrId = l12;
        this.value = filtersBackNavigationValue;
    }

    public static /* synthetic */ FiltersBackNavigationSlot copy$default(FiltersBackNavigationSlot filtersBackNavigationSlot, String str, Long l12, FiltersBackNavigationValue filtersBackNavigationValue, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = filtersBackNavigationSlot.id;
        }
        if ((i12 & 2) != 0) {
            l12 = filtersBackNavigationSlot.attrId;
        }
        if ((i12 & 4) != 0) {
            filtersBackNavigationValue = filtersBackNavigationSlot.value;
        }
        return filtersBackNavigationSlot.copy(str, l12, filtersBackNavigationValue);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Long getAttrId() {
        return this.attrId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FiltersBackNavigationValue getValue() {
        return this.value;
    }

    @k
    public final FiltersBackNavigationSlot copy(@k String id2, @l Long attrId, @l FiltersBackNavigationValue value) {
        return new FiltersBackNavigationSlot(id2, attrId, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersBackNavigationSlot)) {
            return false;
        }
        FiltersBackNavigationSlot filtersBackNavigationSlot = (FiltersBackNavigationSlot) other;
        return L.f(this.id, filtersBackNavigationSlot.id) && L.f(this.attrId, filtersBackNavigationSlot.attrId) && L.f(this.value, filtersBackNavigationSlot.value);
    }

    @l
    public final Long getAttrId() {
        return this.attrId;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final FiltersBackNavigationValue getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l12 = this.attrId;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        FiltersBackNavigationValue filtersBackNavigationValue = this.value;
        return iHashCode2 + (filtersBackNavigationValue != null ? filtersBackNavigationValue.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FiltersBackNavigationSlot(id=" + this.id + ", attrId=" + this.attrId + ", value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Long l12 = this.attrId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        FiltersBackNavigationValue filtersBackNavigationValue = this.value;
        if (filtersBackNavigationValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filtersBackNavigationValue.writeToParcel(parcel, flags);
        }
    }
}
