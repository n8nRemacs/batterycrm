package com.avito.android.advert_collection.adapter.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_collection.adapter.CollectionWidgetItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CollectionTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/title/CollectionTitleItem;", "Lcom/avito/android/advert_collection/adapter/CollectionWidgetItem;", "a", "ModerationStatusInfo", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CollectionTitleItem implements CollectionWidgetItem {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81308b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f81309c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f81310d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ModerationStatusInfo f81311e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f81307f = new a(null);

    @k
    public static final Parcelable.Creator<CollectionTitleItem> CREATOR = new b();

    /* compiled from: CollectionTitleItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/adapter/title/CollectionTitleItem$ModerationStatusInfo;", "Landroid/os/Parcelable;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationStatusInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ModerationStatusInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81312b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81313c;

        /* compiled from: CollectionTitleItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ModerationStatusInfo> {
            @Override // android.os.Parcelable.Creator
            public final ModerationStatusInfo createFromParcel(Parcel parcel) {
                return new ModerationStatusInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModerationStatusInfo[] newArray(int i12) {
                return new ModerationStatusInfo[i12];
            }
        }

        public ModerationStatusInfo(@k String str, @k String str2) {
            this.f81312b = str;
            this.f81313c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModerationStatusInfo)) {
                return false;
            }
            ModerationStatusInfo moderationStatusInfo = (ModerationStatusInfo) obj;
            return L.f(this.f81312b, moderationStatusInfo.f81312b) && L.f(this.f81313c, moderationStatusInfo.f81313c);
        }

        public final int hashCode() {
            return this.f81313c.hashCode() + (this.f81312b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationStatusInfo(text=");
            sb2.append(this.f81312b);
            sb2.append(", color=");
            return C22026a.c(sb2, this.f81313c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f81312b);
            parcel.writeString(this.f81313c);
        }
    }

    /* compiled from: CollectionTitleItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/title/CollectionTitleItem$a;", "", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CollectionTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CollectionTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final CollectionTitleItem createFromParcel(Parcel parcel) {
            return new CollectionTitleItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ModerationStatusInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionTitleItem[] newArray(int i12) {
            return new CollectionTitleItem[i12];
        }
    }

    public CollectionTitleItem(@k String str, @l String str2, @l String str3, @l ModerationStatusInfo moderationStatusInfo) {
        this.f81308b = str;
        this.f81309c = str2;
        this.f81310d = str3;
        this.f81311e = moderationStatusInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionTitleItem)) {
            return false;
        }
        CollectionTitleItem collectionTitleItem = (CollectionTitleItem) obj;
        return L.f(this.f81308b, collectionTitleItem.f81308b) && L.f(this.f81309c, collectionTitleItem.f81309c) && L.f(this.f81310d, collectionTitleItem.f81310d) && L.f(this.f81311e, collectionTitleItem.f81311e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF77200c() {
        return "collection_title";
    }

    public final int hashCode() {
        int iHashCode = this.f81308b.hashCode() * 31;
        String str = this.f81309c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81310d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModerationStatusInfo moderationStatusInfo = this.f81311e;
        return iHashCode3 + (moderationStatusInfo != null ? moderationStatusInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CollectionTitleItem(title=" + this.f81308b + ", subtitle=" + this.f81309c + ", description=" + this.f81310d + ", moderationStatus=" + this.f81311e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81308b);
        parcel.writeString(this.f81309c);
        parcel.writeString(this.f81310d);
        ModerationStatusInfo moderationStatusInfo = this.f81311e;
        if (moderationStatusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moderationStatusInfo.writeToParcel(parcel, i12);
        }
    }
}
