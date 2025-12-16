package com.avito.android.virtual_deal_room_reference_category.client_add.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientAddSaveResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult;", "Landroid/os/Parcelable;", "Dismissed", "Saved", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult$Dismissed;", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult$Saved;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientAddSaveResult extends Parcelable {

    /* compiled from: ClientAddSaveResult.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult$Dismissed;", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismissed implements ClientAddSaveResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismissed f327184b = new Dismissed();

        @k
        public static final Parcelable.Creator<Dismissed> CREATOR = new a();

        /* compiled from: ClientAddSaveResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismissed> {
            @Override // android.os.Parcelable.Creator
            public final Dismissed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Dismissed.f327184b;
            }

            @Override // android.os.Parcelable.Creator
            public final Dismissed[] newArray(int i12) {
                return new Dismissed[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return 1743932785;
        }

        @k
        public final String toString() {
            return "Dismissed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ClientAddSaveResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult$Saved;", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddSaveResult;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Saved implements ClientAddSaveResult {

        @k
        public static final Parcelable.Creator<Saved> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f327185b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f327186c;

        /* compiled from: ClientAddSaveResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Saved> {
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                return new Saved(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i12) {
                return new Saved[i12];
            }
        }

        public Saved(@k String str, @k String str2) {
            this.f327185b = str;
            this.f327186c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Saved)) {
                return false;
            }
            Saved saved = (Saved) obj;
            return L.f(this.f327185b, saved.f327185b) && L.f(this.f327186c, saved.f327186c);
        }

        public final int hashCode() {
            return this.f327186c.hashCode() + (this.f327185b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Saved(processId=");
            sb2.append(this.f327185b);
            sb2.append(", processType=");
            return C22026a.c(sb2, this.f327186c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f327185b);
            parcel.writeString(this.f327186c);
        }
    }
}
