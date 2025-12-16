package com.avito.android.serp.adapter.empty_search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpElement;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmptySearchElement.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/EmptySearchElement;", "Lcom/avito/android/remote/model/SerpElement;", "Paddings", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptySearchElement implements SerpElement {

    @Y61.k
    public static final Parcelable.Creator<EmptySearchElement> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f269923b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f269924c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f269925d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Paddings f269926e;

    /* renamed from: f, reason: collision with root package name */
    public long f269927f;

    /* compiled from: EmptySearchElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/EmptySearchElement$Paddings;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Paddings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Paddings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f269928b;

        /* renamed from: c, reason: collision with root package name */
        public final int f269929c;

        /* compiled from: EmptySearchElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Paddings> {
            @Override // android.os.Parcelable.Creator
            public final Paddings createFromParcel(Parcel parcel) {
                return new Paddings(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Paddings[] newArray(int i12) {
                return new Paddings[i12];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Paddings() {
            int i12 = 0;
            this(i12, i12, 3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) obj;
            return this.f269928b == paddings.f269928b && this.f269929c == paddings.f269929c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f269929c) + (Integer.hashCode(this.f269928b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Paddings(top=");
            sb2.append(this.f269928b);
            sb2.append(", bottom=");
            return r.t(sb2, this.f269929c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f269928b);
            parcel.writeInt(this.f269929c);
        }

        public Paddings(@j.r int i12, @j.r int i13) {
            this.f269928b = i12;
            this.f269929c = i13;
        }

        public /* synthetic */ Paddings(int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? -1 : i12, (i14 & 2) != 0 ? -1 : i13);
        }
    }

    /* compiled from: EmptySearchElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptySearchElement> {
        @Override // android.os.Parcelable.Creator
        public final EmptySearchElement createFromParcel(Parcel parcel) {
            return new EmptySearchElement(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Paddings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EmptySearchElement[] newArray(int i12) {
            return new EmptySearchElement[i12];
        }
    }

    public EmptySearchElement(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Paddings paddings) {
        this.f269923b = str;
        this.f269924c = str2;
        this.f269925d = str3;
        this.f269926e = paddings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF231756b() {
        return this.f269927f;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f269927f = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f269923b);
        parcel.writeString(this.f269924c);
        parcel.writeString(this.f269925d);
        Paddings paddings = this.f269926e;
        if (paddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paddings.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ EmptySearchElement(String str, String str2, String str3, Paddings paddings, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : paddings);
    }
}
