package com.avito.android.adapter.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.util.y6;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "ActionType", "GalleryButton", "GalleryContactBar", "GalleryImage", "GalleyReview", "ReviewTextSection", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GalleryItem implements RatingDetailsItem, PersistableSpannedItem {

    @Y61.k
    public static final Parcelable.Creator<GalleryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f68402d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<GalleyReview> f68403e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final GalleryContactBar f68404f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<GalleryImage> f68405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68406h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68407i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Parcelable f68408j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Uri f68409k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$ActionType;", "", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f68410b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f68411c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f68412d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f68413e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f68414f;

        static {
            ActionType actionType = new ActionType("PHONE", 0);
            f68410b = actionType;
            ActionType actionType2 = new ActionType("MESSENGER", 1);
            f68411c = actionType2;
            ActionType actionType3 = new ActionType("CALENDAR", 2);
            f68412d = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            f68413e = actionTypeArr;
            f68414f = kotlin.enums.c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f68413e.clone();
        }
    }

    /* compiled from: GalleryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$GalleryButton;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GalleryButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GalleryButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ActionType f68415b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f68416c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f68417d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f68418e;

        /* compiled from: GalleryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GalleryButton> {
            @Override // android.os.Parcelable.Creator
            public final GalleryButton createFromParcel(Parcel parcel) {
                return new GalleryButton(ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GalleryButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final GalleryButton[] newArray(int i12) {
                return new GalleryButton[i12];
            }
        }

        public GalleryButton(@Y61.k ActionType actionType, @Y61.k String str, @Y61.k String str2, @Y61.l DeepLink deepLink) {
            this.f68415b = actionType;
            this.f68416c = str;
            this.f68417d = str2;
            this.f68418e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GalleryButton)) {
                return false;
            }
            GalleryButton galleryButton = (GalleryButton) obj;
            return this.f68415b == galleryButton.f68415b && L.f(this.f68416c, galleryButton.f68416c) && L.f(this.f68417d, galleryButton.f68417d) && L.f(this.f68418e, galleryButton.f68418e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f68415b.hashCode() * 31, 31, this.f68416c), 31, this.f68417d);
            DeepLink deepLink = this.f68418e;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryButton(actionType=");
            sb2.append(this.f68415b);
            sb2.append(", iconName=");
            sb2.append(this.f68416c);
            sb2.append(", iconColor=");
            sb2.append(this.f68417d);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f68418e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f68415b.name());
            parcel.writeString(this.f68416c);
            parcel.writeString(this.f68417d);
            parcel.writeParcelable(this.f68418e, i12);
        }
    }

    /* compiled from: GalleryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$GalleryContactBar;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GalleryContactBar implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GalleryContactBar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f68419b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f68420c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f68421d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f68422e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f68423f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f68424g;

        /* compiled from: GalleryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GalleryContactBar> {
            @Override // android.os.Parcelable.Creator
            public final GalleryContactBar createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Image image = (Image) parcel.readParcelable(GalleryContactBar.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(GalleryButton.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new GalleryContactBar(string, image, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GalleryContactBar[] newArray(int i12) {
                return new GalleryContactBar[i12];
            }
        }

        public GalleryContactBar(@Y61.k String str, @Y61.l Image image, @Y61.k ArrayList arrayList, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f68419b = str;
            this.f68420c = image;
            this.f68421d = arrayList;
            this.f68422e = str2;
            this.f68423f = str3;
            this.f68424g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GalleryContactBar)) {
                return false;
            }
            GalleryContactBar galleryContactBar = (GalleryContactBar) obj;
            return L.f(this.f68419b, galleryContactBar.f68419b) && L.f(this.f68420c, galleryContactBar.f68420c) && this.f68421d.equals(galleryContactBar.f68421d) && L.f(this.f68422e, galleryContactBar.f68422e) && L.f(this.f68423f, galleryContactBar.f68423f) && L.f(this.f68424g, galleryContactBar.f68424g);
        }

        public final int hashCode() {
            int iHashCode = this.f68419b.hashCode() * 31;
            Image image = this.f68420c;
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f68421d, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31);
            String str = this.f68422e;
            int iHashCode2 = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f68423f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f68424g;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryContactBar(name=");
            sb2.append(this.f68419b);
            sb2.append(", avatar=");
            sb2.append(this.f68420c);
            sb2.append(", actions=");
            sb2.append(this.f68421d);
            sb2.append(", title=");
            sb2.append(this.f68422e);
            sb2.append(", price=");
            sb2.append(this.f68423f);
            sb2.append(", userHash=");
            return C22026a.c(sb2, this.f68424g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f68419b);
            parcel.writeParcelable(this.f68420c, i12);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f68421d, parcel);
            while (itZ.hasNext()) {
                ((GalleryButton) itZ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f68422e);
            parcel.writeString(this.f68423f);
            parcel.writeString(this.f68424g);
        }
    }

    /* compiled from: GalleryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$GalleryImage;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GalleryImage implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GalleryImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TnsGalleryImage f68425b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f68426c;

        /* compiled from: GalleryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GalleryImage> {
            @Override // android.os.Parcelable.Creator
            public final GalleryImage createFromParcel(Parcel parcel) {
                return new GalleryImage((TnsGalleryImage) parcel.readParcelable(GalleryImage.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final GalleryImage[] newArray(int i12) {
                return new GalleryImage[i12];
            }
        }

        public GalleryImage(@Y61.k TnsGalleryImage tnsGalleryImage, @Y61.l Long l12) {
            this.f68425b = tnsGalleryImage;
            this.f68426c = l12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GalleryImage)) {
                return false;
            }
            GalleryImage galleryImage = (GalleryImage) obj;
            return L.f(this.f68425b, galleryImage.f68425b) && L.f(this.f68426c, galleryImage.f68426c);
        }

        public final int hashCode() {
            int iHashCode = this.f68425b.hashCode() * 31;
            Long l12 = this.f68426c;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryImage(image=");
            sb2.append(this.f68425b);
            sb2.append(", id=");
            return androidx.media3.exoplayer.analytics.m.m(sb2, this.f68426c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f68425b, i12);
            Long l12 = this.f68426c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }

    /* compiled from: GalleryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$GalleyReview;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GalleyReview implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GalleyReview> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f68427b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f68428c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Float f68429d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Image f68430e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f68431f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<TnsGalleryImage> f68432g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f68433h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final ArrayList f68434i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f68435j;

        /* compiled from: GalleryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GalleyReview> {
            @Override // android.os.Parcelable.Creator
            public final GalleyReview createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string = parcel.readString();
                Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Image image = (Image) parcel.readParcelable(GalleyReview.class.getClassLoader());
                String string2 = parcel.readString();
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(GalleyReview.class, parcel, arrayList, iL2, 1);
                    }
                }
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(ReviewTextSection.CREATOR, parcel, arrayList3, iC2, 1);
                    }
                    arrayList2 = arrayList3;
                }
                return new GalleyReview(lValueOf, string, fValueOf, image, string2, arrayList, string3, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GalleyReview[] newArray(int i12) {
                return new GalleyReview[i12];
            }
        }

        public GalleyReview(@Y61.l Long l12, @Y61.k String str, @Y61.l Float f12, @Y61.l Image image, @Y61.l String str2, @Y61.l List list, @Y61.l String str3, @Y61.l ArrayList arrayList, @Y61.l String str4) {
            this.f68427b = l12;
            this.f68428c = str;
            this.f68429d = f12;
            this.f68430e = image;
            this.f68431f = str2;
            this.f68432g = list;
            this.f68433h = str3;
            this.f68434i = arrayList;
            this.f68435j = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GalleyReview)) {
                return false;
            }
            GalleyReview galleyReview = (GalleyReview) obj;
            return L.f(this.f68427b, galleyReview.f68427b) && L.f(this.f68428c, galleyReview.f68428c) && L.f(this.f68429d, galleyReview.f68429d) && L.f(this.f68430e, galleyReview.f68430e) && L.f(this.f68431f, galleyReview.f68431f) && L.f(this.f68432g, galleyReview.f68432g) && L.f(this.f68433h, galleyReview.f68433h) && L.f(this.f68434i, galleyReview.f68434i) && L.f(this.f68435j, galleyReview.f68435j);
        }

        public final int hashCode() {
            Long l12 = this.f68427b;
            int iD2 = H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f68428c);
            Float f12 = this.f68429d;
            int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
            Image image = this.f68430e;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            String str = this.f68431f;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<TnsGalleryImage> list = this.f68432g;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.f68433h;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ArrayList arrayList = this.f68434i;
            int iHashCode6 = (iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str3 = this.f68435j;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleyReview(id=");
            sb2.append(this.f68427b);
            sb2.append(", title=");
            sb2.append(this.f68428c);
            sb2.append(", score=");
            sb2.append(this.f68429d);
            sb2.append(", avatar=");
            sb2.append(this.f68430e);
            sb2.append(", stageTitle=");
            sb2.append(this.f68431f);
            sb2.append(", images=");
            sb2.append(this.f68432g);
            sb2.append(", rated=");
            sb2.append(this.f68433h);
            sb2.append(", textSections=");
            sb2.append(this.f68434i);
            sb2.append(", itemTitle=");
            return C22026a.c(sb2, this.f68435j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.f68427b;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f68428c);
            Float f12 = this.f68429d;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeParcelable(this.f68430e, i12);
            parcel.writeString(this.f68431f);
            List<TnsGalleryImage> list = this.f68432g;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            parcel.writeString(this.f68433h);
            ArrayList arrayList = this.f68434i;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
                while (itY.hasNext()) {
                    ((ReviewTextSection) itY.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeString(this.f68435j);
        }
    }

    /* compiled from: GalleryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(GalleyReview.CREATOR, parcel, arrayList, iC3, 1);
            }
            GalleryContactBar galleryContactBarCreateFromParcel = parcel.readInt() == 0 ? null : GalleryContactBar.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(GalleryImage.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new GalleryItem(string, i12, string2, arrayList, galleryContactBarCreateFromParcel, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readParcelable(GalleryItem.class.getClassLoader()), (Uri) parcel.readParcelable(GalleryItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryItem[] newArray(int i12) {
            return new GalleryItem[i12];
        }
    }

    public GalleryItem(@Y61.k String str, int i12, @Y61.l String str2, @Y61.k List<GalleyReview> list, @Y61.l GalleryContactBar galleryContactBar, @Y61.k List<GalleryImage> list2, int i13, int i14, @Y61.l Parcelable parcelable, @Y61.l Uri uri) {
        this.f68400b = str;
        this.f68401c = i12;
        this.f68402d = str2;
        this.f68403e = list;
        this.f68404f = galleryContactBar;
        this.f68405g = list2;
        this.f68406h = i13;
        this.f68407i = i14;
        this.f68408j = parcelable;
        this.f68409k = uri;
    }

    public static GalleryItem a(GalleryItem galleryItem, ArrayList arrayList, ArrayList arrayList2, Uri uri) {
        return new GalleryItem(galleryItem.f68400b, galleryItem.f68401c, galleryItem.f68402d, arrayList, galleryItem.f68404f, arrayList2, galleryItem.f68406h, galleryItem.f68407i, galleryItem.f68408j, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryItem)) {
            return false;
        }
        GalleryItem galleryItem = (GalleryItem) obj;
        return L.f(this.f68400b, galleryItem.f68400b) && this.f68401c == galleryItem.f68401c && L.f(this.f68402d, galleryItem.f68402d) && L.f(this.f68403e, galleryItem.f68403e) && L.f(this.f68404f, galleryItem.f68404f) && L.f(this.f68405g, galleryItem.f68405g) && this.f68406h == galleryItem.f68406h && this.f68407i == galleryItem.f68407i && L.f(this.f68408j, galleryItem.f68408j) && L.f(this.f68409k, galleryItem.f68409k);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF254469f() {
        return this.f68401c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF254468e() {
        return this.f68400b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f68401c, this.f68400b.hashCode() * 31, 31);
        String str = this.f68402d;
        int iE3 = H.e((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f68403e);
        GalleryContactBar galleryContactBar = this.f68404f;
        int iE4 = r.e(this.f68407i, r.e(this.f68406h, H.e((iE3 + (galleryContactBar == null ? 0 : galleryContactBar.hashCode())) * 31, 31, this.f68405g), 31), 31);
        Parcelable parcelable = this.f68408j;
        int iHashCode = (iE4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Uri uri = this.f68409k;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryItem(stringId=");
        sb2.append(this.f68400b);
        sb2.append(", spanCount=");
        sb2.append(this.f68401c);
        sb2.append(", navigationTitle=");
        sb2.append(this.f68402d);
        sb2.append(", reviews=");
        sb2.append(this.f68403e);
        sb2.append(", contactBar=");
        sb2.append(this.f68404f);
        sb2.append(", images=");
        sb2.append(this.f68405g);
        sb2.append(", marginStart=");
        sb2.append(this.f68406h);
        sb2.append(", marginTop=");
        sb2.append(this.f68407i);
        sb2.append(", imagesGalleryState=");
        sb2.append(this.f68408j);
        sb2.append(", nextPage=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f68409k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f68400b);
        parcel.writeInt(this.f68401c);
        parcel.writeString(this.f68402d);
        Iterator itJ = C0.j(this.f68403e, parcel);
        while (itJ.hasNext()) {
            ((GalleyReview) itJ.next()).writeToParcel(parcel, i12);
        }
        GalleryContactBar galleryContactBar = this.f68404f;
        if (galleryContactBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryContactBar.writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f68405g, parcel);
        while (itJ2.hasNext()) {
            ((GalleryImage) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f68406h);
        parcel.writeInt(this.f68407i);
        parcel.writeParcelable(this.f68408j, i12);
        parcel.writeParcelable(this.f68409k, i12);
    }

    /* compiled from: GalleryItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$ReviewTextSection;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewTextSection implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ReviewTextSection> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f68436b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f68437c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f68438d;

        /* compiled from: GalleryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewTextSection> {
            @Override // android.os.Parcelable.Creator
            public final ReviewTextSection createFromParcel(Parcel parcel) {
                return new ReviewTextSection(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewTextSection[] newArray(int i12) {
                return new ReviewTextSection[i12];
            }
        }

        public ReviewTextSection(@Y61.l String str, @Y61.l String str2, boolean z12) {
            this.f68436b = str;
            this.f68437c = str2;
            this.f68438d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewTextSection)) {
                return false;
            }
            ReviewTextSection reviewTextSection = (ReviewTextSection) obj;
            return L.f(this.f68436b, reviewTextSection.f68436b) && L.f(this.f68437c, reviewTextSection.f68437c) && this.f68438d == reviewTextSection.f68438d;
        }

        public final int hashCode() {
            String str = this.f68436b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f68437c;
            return Boolean.hashCode(this.f68438d) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewTextSection(title=");
            sb2.append(this.f68436b);
            sb2.append(", text=");
            sb2.append(this.f68437c);
            sb2.append(", textExpanded=");
            return r.x(sb2, this.f68438d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f68436b);
            parcel.writeString(this.f68437c);
            parcel.writeInt(this.f68438d ? 1 : 0);
        }

        public /* synthetic */ ReviewTextSection(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? false : z12);
        }
    }

    public /* synthetic */ GalleryItem(String str, int i12, String str2, List list, GalleryContactBar galleryContactBar, List list2, int i13, int i14, Parcelable parcelable, Uri uri, int i15, C42822w c42822w) {
        this(str, (i15 & 2) != 0 ? 0 : i12, str2, list, galleryContactBar, list2, (i15 & 64) != 0 ? y6.b(24) : i13, (i15 & 128) != 0 ? y6.b(24) : i14, (i15 & 256) != 0 ? null : parcelable, uri);
    }
}
