package com.avito.android.serp.adapter.empty_search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmptySearchItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/EmptySearchItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Paddings", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptySearchItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<EmptySearchItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f269930b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f269931c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f269932d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f269933e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Paddings f269934f;

    /* renamed from: g, reason: collision with root package name */
    public final int f269935g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f269936h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f269937i = true;

    /* compiled from: EmptySearchItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/EmptySearchItem$Paddings;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Paddings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Paddings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f269938b;

        /* renamed from: c, reason: collision with root package name */
        public final int f269939c;

        /* compiled from: EmptySearchItem.kt */
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
            return this.f269938b == paddings.f269938b && this.f269939c == paddings.f269939c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f269939c) + (Integer.hashCode(this.f269938b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Paddings(top=");
            sb2.append(this.f269938b);
            sb2.append(", bottom=");
            return r.t(sb2, this.f269939c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f269938b);
            parcel.writeInt(this.f269939c);
        }

        public Paddings(@j.r int i12, @j.r int i13) {
            this.f269938b = i12;
            this.f269939c = i13;
        }

        public /* synthetic */ Paddings(int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? -1 : i12, (i14 & 2) != 0 ? -1 : i13);
        }
    }

    /* compiled from: EmptySearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptySearchItem> {
        @Override // android.os.Parcelable.Creator
        public final EmptySearchItem createFromParcel(Parcel parcel) {
            return new EmptySearchItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), Paddings.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EmptySearchItem[] newArray(int i12) {
            return new EmptySearchItem[i12];
        }
    }

    public EmptySearchItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k Paddings paddings, int i12) {
        this.f269930b = j12;
        this.f269931c = str;
        this.f269932d = str2;
        this.f269933e = str3;
        this.f269934f = paddings;
        this.f269935g = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF327326g() {
        return this.f269937i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF207394c() {
        return this.f269930b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269137b() {
        return this.f269935g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270187b() {
        return this.f269931c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269141f() {
        return this.f269936h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f269930b);
        parcel.writeString(this.f269931c);
        parcel.writeString(this.f269932d);
        parcel.writeString(this.f269933e);
        this.f269934f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f269935g);
    }
}
