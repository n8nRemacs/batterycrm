package com.avito.android.advert_collection_list.adapter.advert_collection;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Actions", "AuthorInfo", "a", "ModerationStatusInfo", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionItem implements ParcelableItem {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82028b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82029c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f82030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82031e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f82032f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f82033g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ModerationStatusInfo f82034h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AuthorInfo f82035i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Actions f82036j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f82027k = new a(null);

    @k
    public static final Parcelable.Creator<AdvertCollectionItem> CREATOR = new b();

    /* compiled from: AdvertCollectionItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem$Actions;", "Landroid/os/Parcelable;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Actions implements Parcelable {

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f82037b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f82038c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f82039d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f82040e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f82041f;

        /* compiled from: AdvertCollectionItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Actions> {
            @Override // android.os.Parcelable.Creator
            public final Actions createFromParcel(Parcel parcel) {
                return new Actions(parcel.readInt() != 0, parcel.readInt() != 0, (DeepLink) parcel.readParcelable(Actions.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(boolean z12, boolean z13, @l DeepLink deepLink, boolean z14, boolean z15) {
            this.f82037b = z12;
            this.f82038c = z13;
            this.f82039d = deepLink;
            this.f82040e = z14;
            this.f82041f = z15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return this.f82037b == actions.f82037b && this.f82038c == actions.f82038c && L.f(this.f82039d, actions.f82039d) && this.f82040e == actions.f82040e && this.f82041f == actions.f82041f;
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f82037b) * 31, 31, this.f82038c);
            DeepLink deepLink = this.f82039d;
            return Boolean.hashCode(this.f82041f) + r.i((i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f82040e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Actions(canDelete=");
            sb2.append(this.f82037b);
            sb2.append(", canShare=");
            sb2.append(this.f82038c);
            sb2.append(", edit=");
            sb2.append(this.f82039d);
            sb2.append(", canPublish=");
            sb2.append(this.f82040e);
            sb2.append(", canUnpublish=");
            return r.x(sb2, this.f82041f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f82037b ? 1 : 0);
            parcel.writeInt(this.f82038c ? 1 : 0);
            parcel.writeParcelable(this.f82039d, i12);
            parcel.writeInt(this.f82040e ? 1 : 0);
            parcel.writeInt(this.f82041f ? 1 : 0);
        }
    }

    /* compiled from: AdvertCollectionItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem$AuthorInfo;", "Landroid/os/Parcelable;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AuthorInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<AuthorInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f82042b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f82043c;

        /* compiled from: AdvertCollectionItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AuthorInfo> {
            @Override // android.os.Parcelable.Creator
            public final AuthorInfo createFromParcel(Parcel parcel) {
                return new AuthorInfo((Image) parcel.readParcelable(AuthorInfo.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuthorInfo[] newArray(int i12) {
                return new AuthorInfo[i12];
            }
        }

        public AuthorInfo(@l Image image, @l String str) {
            this.f82042b = image;
            this.f82043c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthorInfo)) {
                return false;
            }
            AuthorInfo authorInfo = (AuthorInfo) obj;
            return L.f(this.f82042b, authorInfo.f82042b) && L.f(this.f82043c, authorInfo.f82043c);
        }

        public final int hashCode() {
            Image image = this.f82042b;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.f82043c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AuthorInfo(avatar=");
            sb2.append(this.f82042b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f82043c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f82042b, i12);
            parcel.writeString(this.f82043c);
        }
    }

    /* compiled from: AdvertCollectionItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem$ModerationStatusInfo;", "Landroid/os/Parcelable;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ModerationStatusInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ModerationStatusInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82044b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f82045c;

        /* compiled from: AdvertCollectionItem.kt */
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
            this.f82044b = str;
            this.f82045c = str2;
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
            return L.f(this.f82044b, moderationStatusInfo.f82044b) && L.f(this.f82045c, moderationStatusInfo.f82045c);
        }

        public final int hashCode() {
            return this.f82045c.hashCode() + (this.f82044b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationStatusInfo(text=");
            sb2.append(this.f82044b);
            sb2.append(", color=");
            return C22026a.c(sb2, this.f82045c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f82044b);
            parcel.writeString(this.f82045c);
        }
    }

    /* compiled from: AdvertCollectionItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem$a;", "", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertCollectionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionItem createFromParcel(Parcel parcel) {
            return new AdvertCollectionItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertCollectionItem.class.getClassLoader()), parcel.readInt(), (Image) parcel.readParcelable(AdvertCollectionItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ModerationStatusInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AuthorInfo.CREATOR.createFromParcel(parcel) : null, Actions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionItem[] newArray(int i12) {
            return new AdvertCollectionItem[i12];
        }
    }

    public AdvertCollectionItem(@k String str, @k String str2, @k DeepLink deepLink, int i12, @l Image image, @l String str3, @l ModerationStatusInfo moderationStatusInfo, @l AuthorInfo authorInfo, @k Actions actions) {
        this.f82028b = str;
        this.f82029c = str2;
        this.f82030d = deepLink;
        this.f82031e = i12;
        this.f82032f = image;
        this.f82033g = str3;
        this.f82034h = moderationStatusInfo;
        this.f82035i = authorInfo;
        this.f82036j = actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionItem)) {
            return false;
        }
        AdvertCollectionItem advertCollectionItem = (AdvertCollectionItem) obj;
        return L.f(this.f82028b, advertCollectionItem.f82028b) && L.f(this.f82029c, advertCollectionItem.f82029c) && L.f(this.f82030d, advertCollectionItem.f82030d) && this.f82031e == advertCollectionItem.f82031e && L.f(this.f82032f, advertCollectionItem.f82032f) && L.f(this.f82033g, advertCollectionItem.f82033g) && L.f(this.f82034h, advertCollectionItem.f82034h) && L.f(this.f82035i, advertCollectionItem.f82035i) && L.f(this.f82036j, advertCollectionItem.f82036j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79875h() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79876i() {
        return this.f82028b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f82031e, com.avito.android.actions_sheet.a.e(this.f82030d, H.d(this.f82028b.hashCode() * 31, 31, this.f82029c), 31), 31);
        Image image = this.f82032f;
        int iHashCode = (iE2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f82033g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ModerationStatusInfo moderationStatusInfo = this.f82034h;
        int iHashCode3 = (iHashCode2 + (moderationStatusInfo == null ? 0 : moderationStatusInfo.hashCode())) * 31;
        AuthorInfo authorInfo = this.f82035i;
        return this.f82036j.hashCode() + ((iHashCode3 + (authorInfo != null ? authorInfo.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "AdvertCollectionItem(stringId=" + this.f82028b + ", name=" + this.f82029c + ", deepLink=" + this.f82030d + ", size=" + this.f82031e + ", image=" + this.f82032f + ", description=" + this.f82033g + ", moderationStatusInfo=" + this.f82034h + ", authorInfo=" + this.f82035i + ", actions=" + this.f82036j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f82028b);
        parcel.writeString(this.f82029c);
        parcel.writeParcelable(this.f82030d, i12);
        parcel.writeInt(this.f82031e);
        parcel.writeParcelable(this.f82032f, i12);
        parcel.writeString(this.f82033g);
        ModerationStatusInfo moderationStatusInfo = this.f82034h;
        if (moderationStatusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moderationStatusInfo.writeToParcel(parcel, i12);
        }
        AuthorInfo authorInfo = this.f82035i;
        if (authorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authorInfo.writeToParcel(parcel, i12);
        }
        this.f82036j.writeToParcel(parcel, i12);
    }
}
