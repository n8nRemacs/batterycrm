package com.avito.android.profile.pro.impl.screen.item.recommendations;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProRecommendationsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/recommendations/ProfileProRecommendationsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Item", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProRecommendationsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProRecommendationsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f223404c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f223405d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f223406e;

    /* compiled from: ProfileProRecommendationsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/recommendations/ProfileProRecommendationsItem$Item;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f223407b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f223408c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f223409d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f223410e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AttributedText f223411f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Object f223412g;

        /* compiled from: ProfileProRecommendationsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Item.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(Item.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Item.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Item.class, parcel, arrayList, iL2, 1);
                }
                return new Item(arrayList, attributedText, image, string, string2, attributedText2);
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@k List list, @k AttributedText attributedText, @l Image image, @k String str, @l String str2, @l AttributedText attributedText2) {
            this.f223407b = attributedText;
            this.f223408c = image;
            this.f223409d = str;
            this.f223410e = str2;
            this.f223411f = attributedText2;
            this.f223412g = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return L.f(this.f223407b, item.f223407b) && L.f(this.f223408c, item.f223408c) && L.f(this.f223409d, item.f223409d) && L.f(this.f223410e, item.f223410e) && L.f(this.f223411f, item.f223411f) && L.f(this.f223412g, item.f223412g);
        }

        public final int hashCode() {
            int iHashCode = this.f223407b.hashCode() * 31;
            Image image = this.f223408c;
            int iD2 = H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f223409d);
            String str = this.f223410e;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f223411f;
            return this.f223412g.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(title=");
            sb2.append(this.f223407b);
            sb2.append(", image=");
            sb2.append(this.f223408c);
            sb2.append(", price=");
            sb2.append(this.f223409d);
            sb2.append(", oldPrice=");
            sb2.append(this.f223410e);
            sb2.append(", additionalInfo=");
            sb2.append(this.f223411f);
            sb2.append(", actions=");
            return H.n(sb2, this.f223412g, ')');
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f223407b, i12);
            parcel.writeParcelable(this.f223408c, i12);
            parcel.writeString(this.f223409d);
            parcel.writeString(this.f223410e);
            parcel.writeParcelable(this.f223411f, i12);
            ?? r02 = this.f223412g;
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i12);
            }
        }
    }

    /* compiled from: ProfileProRecommendationsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProRecommendationsItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProRecommendationsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ProfileProRecommendationsItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProfileProRecommendationsItem(deepLink, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProRecommendationsItem[] newArray(int i12) {
            return new ProfileProRecommendationsItem[i12];
        }
    }

    public ProfileProRecommendationsItem(@l DeepLink deepLink, @k String str, @k String str2, @k ArrayList arrayList) {
        this.f223403b = str;
        this.f223404c = str2;
        this.f223405d = deepLink;
        this.f223406e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProRecommendationsItem)) {
            return false;
        }
        ProfileProRecommendationsItem profileProRecommendationsItem = (ProfileProRecommendationsItem) obj;
        return L.f(this.f223403b, profileProRecommendationsItem.f223403b) && L.f(this.f223404c, profileProRecommendationsItem.f223404c) && L.f(this.f223405d, profileProRecommendationsItem.f223405d) && this.f223406e.equals(profileProRecommendationsItem.f223406e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217870b() {
        return this.f223403b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f223403b.hashCode() * 31, 31, this.f223404c);
        DeepLink deepLink = this.f223405d;
        return this.f223406e.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProRecommendationsItem(stringId=");
        sb2.append(this.f223403b);
        sb2.append(", title=");
        sb2.append(this.f223404c);
        sb2.append(", deeplink=");
        sb2.append(this.f223405d);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f223406e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223403b);
        parcel.writeString(this.f223404c);
        parcel.writeParcelable(this.f223405d, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f223406e, parcel);
        while (itZ.hasNext()) {
            ((Item) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
