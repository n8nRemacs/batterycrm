package com.avito.android.advert_collection.adapter.author;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_collection.adapter.CollectionWidgetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/adapter/author/AuthorItem;", "Lcom/avito/android/advert_collection/adapter/CollectionWidgetItem;", "a", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthorItem implements CollectionWidgetItem {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f81250b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f81251c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f81252d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f81253e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Float f81254f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f81255g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f81256h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f81257i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f81249j = new a(null);

    @k
    public static final Parcelable.Creator<AuthorItem> CREATOR = new b();

    /* compiled from: AuthorItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/author/AuthorItem$a;", "", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AuthorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AuthorItem> {
        @Override // android.os.Parcelable.Creator
        public final AuthorItem createFromParcel(Parcel parcel) {
            return new AuthorItem((Image) parcel.readParcelable(AuthorItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(AuthorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorItem[] newArray(int i12) {
            return new AuthorItem[i12];
        }
    }

    public AuthorItem(@l Image image, @k String str, @l String str2, @l Integer num, @l Float f12, @l String str3, boolean z12, @l DeepLink deepLink) {
        this.f81250b = image;
        this.f81251c = str;
        this.f81252d = str2;
        this.f81253e = num;
        this.f81254f = f12;
        this.f81255g = str3;
        this.f81256h = z12;
        this.f81257i = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorItem)) {
            return false;
        }
        AuthorItem authorItem = (AuthorItem) obj;
        return L.f(this.f81250b, authorItem.f81250b) && L.f(this.f81251c, authorItem.f81251c) && L.f(this.f81252d, authorItem.f81252d) && L.f(this.f81253e, authorItem.f81253e) && L.f(this.f81254f, authorItem.f81254f) && L.f(this.f81255g, authorItem.f81255g) && this.f81256h == authorItem.f81256h && L.f(this.f81257i, authorItem.f81257i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF79216b() {
        return "author_of_collection";
    }

    public final int hashCode() {
        Image image = this.f81250b;
        int iD2 = H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f81251c);
        String str = this.f81252d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f81253e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f12 = this.f81254f;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str2 = this.f81255g;
        int i12 = r.i((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f81256h);
        DeepLink deepLink = this.f81257i;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthorItem(avatar=");
        sb2.append(this.f81250b);
        sb2.append(", name=");
        sb2.append(this.f81251c);
        sb2.append(", description=");
        sb2.append(this.f81252d);
        sb2.append(", ratingScore=");
        sb2.append(this.f81253e);
        sb2.append(", ratingScoreFloat=");
        sb2.append(this.f81254f);
        sb2.append(", ratingText=");
        sb2.append(this.f81255g);
        sb2.append(", online=");
        sb2.append(this.f81256h);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f81257i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f81250b, i12);
        parcel.writeString(this.f81251c);
        parcel.writeString(this.f81252d);
        Integer num = this.f81253e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Float f12 = this.f81254f;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f81255g);
        parcel.writeInt(this.f81256h ? 1 : 0);
        parcel.writeParcelable(this.f81257i, i12);
    }
}
