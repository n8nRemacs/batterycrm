package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionType.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0019J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectionType;", "Landroid/os/Parcelable;", "", "", "types", "<init>", "(Ljava/util/List;)V", "type", "", "has", "(Ljava/lang/String;)Z", "hasDate", "()Z", "hasTime", "hasYear", "hasMonth", "hasDay", "hasHour", "hasMinute", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectionType implements Parcelable {

    @k
    public static final String TYPE_DAY = "day";

    @k
    public static final String TYPE_HOUR = "hour";

    @k
    public static final String TYPE_MINUTE = "minute";

    @k
    public static final String TYPE_MONTH = "month";

    @k
    public static final String TYPE_YEAR = "year";

    @k
    private final List<String> types;

    @k
    public static final Parcelable.Creator<SelectionType> CREATOR = new Creator();

    /* compiled from: SelectionType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectionType createFromParcel(@k Parcel parcel) {
            return new SelectionType(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectionType[] newArray(int i12) {
            return new SelectionType[i12];
        }
    }

    public SelectionType(@k List<String> list) {
        this.types = list;
    }

    private final boolean has(String type) {
        return this.types.contains(type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (SelectionType.class.equals(other != null ? other.getClass() : null)) {
            return L.f(this.types, ((SelectionType) other).types);
        }
        return false;
    }

    @k
    public final List<String> getTypes() {
        return this.types;
    }

    public final boolean hasDate() {
        return hasYear() || hasMonth() || hasDay();
    }

    public final boolean hasDay() {
        return has(TYPE_DAY);
    }

    public final boolean hasHour() {
        return has(TYPE_HOUR);
    }

    public final boolean hasMinute() {
        return has(TYPE_MINUTE);
    }

    public final boolean hasMonth() {
        return has(TYPE_MONTH);
    }

    public final boolean hasTime() {
        return hasHour() || hasMinute();
    }

    public final boolean hasYear() {
        return has(TYPE_YEAR);
    }

    public int hashCode() {
        return this.types.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.types);
    }
}
