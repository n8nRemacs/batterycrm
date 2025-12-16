package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryContactBar;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryReview;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryEntry.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/item_reviews/GalleryEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryReview;", "reviews", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;", AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR, "", "navigationTitle", "Landroid/net/Uri;", "nextPage", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;Ljava/lang/String;Landroid/net/Uri;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;", "component3", "()Ljava/lang/String;", "component4", "()Landroid/net/Uri;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;Ljava/lang/String;Landroid/net/Uri;)Lcom/avito/android/remote/model/item_reviews/GalleryEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getReviews", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;", "getContactBar", "Ljava/lang/String;", "getNavigationTitle", "Landroid/net/Uri;", "getNextPage", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<GalleryEntry> CREATOR = new Creator();

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR)
    @l
    private final PhotoGalleryContactBar contactBar;

    @c("navigationTitle")
    @l
    private final String navigationTitle;

    @c("nextPage")
    @l
    private final Uri nextPage;

    @c("reviews")
    @l
    private final List<PhotoGalleryReview> reviews;

    /* compiled from: GalleryEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(GalleryEntry.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new GalleryEntry(arrayList, (PhotoGalleryContactBar) parcel.readParcelable(GalleryEntry.class.getClassLoader()), parcel.readString(), (Uri) parcel.readParcelable(GalleryEntry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryEntry[] newArray(int i12) {
            return new GalleryEntry[i12];
        }
    }

    public GalleryEntry(@l List<PhotoGalleryReview> list, @l PhotoGalleryContactBar photoGalleryContactBar, @l String str, @l Uri uri) {
        this.reviews = list;
        this.contactBar = photoGalleryContactBar;
        this.navigationTitle = str;
        this.nextPage = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GalleryEntry copy$default(GalleryEntry galleryEntry, List list, PhotoGalleryContactBar photoGalleryContactBar, String str, Uri uri, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = galleryEntry.reviews;
        }
        if ((i12 & 2) != 0) {
            photoGalleryContactBar = galleryEntry.contactBar;
        }
        if ((i12 & 4) != 0) {
            str = galleryEntry.navigationTitle;
        }
        if ((i12 & 8) != 0) {
            uri = galleryEntry.nextPage;
        }
        return galleryEntry.copy(list, photoGalleryContactBar, str, uri);
    }

    @l
    public final List<PhotoGalleryReview> component1() {
        return this.reviews;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final PhotoGalleryContactBar getContactBar() {
        return this.contactBar;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @k
    public final GalleryEntry copy(@l List<PhotoGalleryReview> reviews, @l PhotoGalleryContactBar contactBar, @l String navigationTitle, @l Uri nextPage) {
        return new GalleryEntry(reviews, contactBar, navigationTitle, nextPage);
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryEntry)) {
            return false;
        }
        GalleryEntry galleryEntry = (GalleryEntry) other;
        return L.f(this.reviews, galleryEntry.reviews) && L.f(this.contactBar, galleryEntry.contactBar) && L.f(this.navigationTitle, galleryEntry.navigationTitle) && L.f(this.nextPage, galleryEntry.nextPage);
    }

    @l
    public final PhotoGalleryContactBar getContactBar() {
        return this.contactBar;
    }

    @l
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @l
    public final List<PhotoGalleryReview> getReviews() {
        return this.reviews;
    }

    public int hashCode() {
        List<PhotoGalleryReview> list = this.reviews;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PhotoGalleryContactBar photoGalleryContactBar = this.contactBar;
        int iHashCode2 = (iHashCode + (photoGalleryContactBar == null ? 0 : photoGalleryContactBar.hashCode())) * 31;
        String str = this.navigationTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.nextPage;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryEntry(reviews=");
        sb2.append(this.reviews);
        sb2.append(", contactBar=");
        sb2.append(this.contactBar);
        sb2.append(", navigationTitle=");
        sb2.append(this.navigationTitle);
        sb2.append(", nextPage=");
        return a.t(sb2, this.nextPage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<PhotoGalleryReview> list = this.reviews;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.contactBar, flags);
        parcel.writeString(this.navigationTitle);
        parcel.writeParcelable(this.nextPage, flags);
    }
}
