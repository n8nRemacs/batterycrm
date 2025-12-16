package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2Element.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/BeduinV2Element;", "Lcom/avito/android/remote/model/SerpElement;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BeduinV2Element implements SerpElement {

    @k
    public static final Parcelable.Creator<BeduinV2Element> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f268993b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BeduinV2Content f268994c;

    /* renamed from: d, reason: collision with root package name */
    public long f268995d;

    /* compiled from: BeduinV2Element.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2Element> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2Element createFromParcel(Parcel parcel) {
            return new BeduinV2Element(parcel.readString(), BeduinV2Content.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2Element[] newArray(int i12) {
            return new BeduinV2Element[i12];
        }
    }

    public BeduinV2Element(@k String str, @k BeduinV2Content beduinV2Content) {
        this.f268993b = str;
        this.f268994c = beduinV2Content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2Element)) {
            return false;
        }
        BeduinV2Element beduinV2Element = (BeduinV2Element) obj;
        return L.f(this.f268993b, beduinV2Element.f268993b) && L.f(this.f268994c, beduinV2Element.f268994c);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final long getUniqueId() {
        return this.f268995d;
    }

    public final int hashCode() {
        return this.f268994c.f268992b.hashCode() + (this.f268993b.hashCode() * 31);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f268995d = j12;
    }

    @k
    public final String toString() {
        return "BeduinV2Element(id=" + this.f268993b + ", beduinV2Content=" + this.f268994c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f268993b);
        this.f268994c.writeToParcel(parcel, i12);
    }
}
