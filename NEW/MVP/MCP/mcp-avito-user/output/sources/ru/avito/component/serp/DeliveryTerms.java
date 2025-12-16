package ru.avito.component.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryTerms.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/DeliveryTerms;", "Landroid/os/Parcelable;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryTerms implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryTerms> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430438b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f430439c;

    /* compiled from: DeliveryTerms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryTerms> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryTerms createFromParcel(Parcel parcel) {
            return new DeliveryTerms(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryTerms[] newArray(int i12) {
            return new DeliveryTerms[i12];
        }
    }

    public DeliveryTerms(@k String str, @InterfaceC42150f @l Integer num) {
        this.f430438b = str;
        this.f430439c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTerms)) {
            return false;
        }
        DeliveryTerms deliveryTerms = (DeliveryTerms) obj;
        return L.f(this.f430438b, deliveryTerms.f430438b) && L.f(this.f430439c, deliveryTerms.f430439c);
    }

    public final int hashCode() {
        int iHashCode = this.f430438b.hashCode() * 31;
        Integer num = this.f430439c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryTerms(text=");
        sb2.append(this.f430438b);
        sb2.append(", icon=");
        return s.j(sb2, this.f430439c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430438b);
        Integer num = this.f430439c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
