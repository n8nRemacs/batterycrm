package com.avito.android.util.feature;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OptionSet.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/feature/OptionSet;", "Landroid/os/Parcelable;", "_common_config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OptionSet implements Parcelable {

    @k
    public static final Parcelable.Creator<OptionSet> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f318874c;

    /* compiled from: OptionSet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OptionSet> {
        @Override // android.os.Parcelable.Creator
        public final OptionSet createFromParcel(Parcel parcel) {
            return new OptionSet(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final OptionSet[] newArray(int i12) {
            return new OptionSet[i12];
        }
    }

    public OptionSet(@k String str, @k List<String> list) {
        this.f318873b = str;
        this.f318874c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionSet)) {
            return false;
        }
        OptionSet optionSet = (OptionSet) obj;
        return L.f(this.f318873b, optionSet.f318873b) && L.f(this.f318874c, optionSet.f318874c);
    }

    public final int hashCode() {
        return this.f318874c.hashCode() + (this.f318873b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionSet(selectedOption=");
        sb2.append(this.f318873b);
        sb2.append(", options=");
        return H.p(sb2, this.f318874c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318873b);
        parcel.writeStringList(this.f318874c);
    }
}
