package com.avito.android.remote.model.developments_catalog.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersTabs.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u0019¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/serp/Tab;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "filtersDeeplink", "clickstreamDeeplink", "", "isSelected", "Lcom/avito/android/remote/model/Image;", "image", "", "count", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;ZLcom/avito/android/remote/model/Image;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "component4", "()Z", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;ZLcom/avito/android/remote/model/Image;Ljava/lang/Integer;)Lcom/avito/android/remote/model/developments_catalog/serp/Tab;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getFiltersDeeplink", "getClickstreamDeeplink", "Z", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/Integer;", "getCount", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Tab implements Parcelable {

    @k
    public static final Parcelable.Creator<Tab> CREATOR = new Creator();

    @c("clickstreamDeeplink")
    @l
    private final DeepLink clickstreamDeeplink;

    @c("count")
    @l
    private final Integer count;

    @c("filtersDeeplink")
    @k
    private final DeepLink filtersDeeplink;

    @c("images")
    @l
    private final Image image;

    @c("isSelected")
    private final boolean isSelected;

    @c("title")
    @k
    private final String title;

    /* compiled from: FiltersTabs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Tab> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tab createFromParcel(@k Parcel parcel) {
            return new Tab(parcel.readString(), (DeepLink) parcel.readParcelable(Tab.class.getClassLoader()), (DeepLink) parcel.readParcelable(Tab.class.getClassLoader()), parcel.readInt() != 0, (Image) parcel.readParcelable(Tab.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tab[] newArray(int i12) {
            return new Tab[i12];
        }
    }

    public Tab(@k String str, @k DeepLink deepLink, @l DeepLink deepLink2, boolean z12, @l Image image, @l Integer num) {
        this.title = str;
        this.filtersDeeplink = deepLink;
        this.clickstreamDeeplink = deepLink2;
        this.isSelected = z12;
        this.image = image;
        this.count = num;
    }

    public static /* synthetic */ Tab copy$default(Tab tab, String str, DeepLink deepLink, DeepLink deepLink2, boolean z12, Image image, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tab.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = tab.filtersDeeplink;
        }
        DeepLink deepLink3 = deepLink;
        if ((i12 & 4) != 0) {
            deepLink2 = tab.clickstreamDeeplink;
        }
        DeepLink deepLink4 = deepLink2;
        if ((i12 & 8) != 0) {
            z12 = tab.isSelected;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            image = tab.image;
        }
        Image image2 = image;
        if ((i12 & 32) != 0) {
            num = tab.count;
        }
        return tab.copy(str, deepLink3, deepLink4, z13, image2, num);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getFiltersDeeplink() {
        return this.filtersDeeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getClickstreamDeeplink() {
        return this.clickstreamDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @k
    public final Tab copy(@k String title, @k DeepLink filtersDeeplink, @l DeepLink clickstreamDeeplink, boolean isSelected, @l Image image, @l Integer count) {
        return new Tab(title, filtersDeeplink, clickstreamDeeplink, isSelected, image, count);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) other;
        return L.f(this.title, tab.title) && L.f(this.filtersDeeplink, tab.filtersDeeplink) && L.f(this.clickstreamDeeplink, tab.clickstreamDeeplink) && this.isSelected == tab.isSelected && L.f(this.image, tab.image) && L.f(this.count, tab.count);
    }

    @l
    public final DeepLink getClickstreamDeeplink() {
        return this.clickstreamDeeplink;
    }

    @l
    public final Integer getCount() {
        return this.count;
    }

    @k
    public final DeepLink getFiltersDeeplink() {
        return this.filtersDeeplink;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = a.e(this.filtersDeeplink, this.title.hashCode() * 31, 31);
        DeepLink deepLink = this.clickstreamDeeplink;
        int i12 = r.i((iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.isSelected);
        Image image = this.image;
        int iHashCode = (i12 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.count;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Tab(title=");
        sb2.append(this.title);
        sb2.append(", filtersDeeplink=");
        sb2.append(this.filtersDeeplink);
        sb2.append(", clickstreamDeeplink=");
        sb2.append(this.clickstreamDeeplink);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", count=");
        return s.j(sb2, this.count, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.filtersDeeplink, flags);
        parcel.writeParcelable(this.clickstreamDeeplink, flags);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeParcelable(this.image, flags);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
