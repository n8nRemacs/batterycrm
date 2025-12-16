package com.avito.android.remote.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsSpecification.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/models/SparePartsSpecification;", "Landroid/os/Parcelable;", "", "", "params", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsSpecification implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsSpecification> CREATOR = new a();

    @c("params")
    @k
    private final List<String> params;

    /* compiled from: SparePartsSpecification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsSpecification> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsSpecification createFromParcel(Parcel parcel) {
            return new SparePartsSpecification(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsSpecification[] newArray(int i12) {
            return new SparePartsSpecification[i12];
        }
    }

    public SparePartsSpecification(@k List<String> list) {
        this.params = list;
    }

    @k
    public final List<String> c() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SparePartsSpecification) && L.f(this.params, ((SparePartsSpecification) obj).params);
    }

    public final int hashCode() {
        return this.params.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("SparePartsSpecification(params="), this.params, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.params);
    }
}
