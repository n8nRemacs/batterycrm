package ru.cyberity.cbr.geo.model;

import D51.c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;

/* compiled from: AddressItem.kt */
@c
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lru/cyberity/cbr/geo/model/a;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/h$d;", "field", "", "value", "<init>", "(Lru/cyberity/cbr/core/data/model/h$d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/core/data/model/h$d;", "c", "()Lru/cyberity/cbr/core/data/model/h$d;", "b", "Ljava/lang/String;", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class a implements Parcelable {

    @k
    public static final Parcelable.Creator<a> CREATOR = new C12494a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final h.d field;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String value;

    /* compiled from: AddressItem.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.geo.model.a$a, reason: collision with other inner class name */
    public static final class C12494a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(@k Parcel parcel) {
            return new a((h.d) parcel.readParcelable(a.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i12) {
            return new a[i12];
        }
    }

    public a(@k h.d dVar, @k String str) {
        this.field = dVar;
        this.value = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final h.d getField() {
        return this.field;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return L.f(this.field, aVar.field) && L.f(this.value, aVar.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.field.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddressItem(field=");
        sb2.append(this.field);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.field, flags);
        parcel.writeString(this.value);
    }
}
