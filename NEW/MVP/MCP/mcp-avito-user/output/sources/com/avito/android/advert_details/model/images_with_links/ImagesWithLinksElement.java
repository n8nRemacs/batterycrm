package com.avito.android.advert_details.model.images_with_links;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.util.O2;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImagesWithLinksElement.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/advert_details/model/images_with_links/ImagesWithLinksElement;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "", "title", "", "isAvailableToHide", "isCollapsed", "Lcom/avito/android/advert_details/model/images_with_links/Displaying;", Navigation.DISPLAYING, "", "Lcom/avito/android/advert_details/model/images_with_links/ImageWithLinkElement;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/advert_details/model/images_with_links/Displaying;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/advert_details/model/images_with_links/Displaying;", "c", "()Lcom/avito/android/advert_details/model/images_with_links/Displaying;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImagesWithLinksElement implements SectionTypeElement {

    @k
    public static final Parcelable.Creator<ImagesWithLinksElement> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f84419b = "";

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f84420c = "";

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("isAvailableToHide")
    @l
    private final Boolean isAvailableToHide;

    @c("isCollapsed")
    @l
    private final Boolean isCollapsed;

    @c("list")
    @l
    private final List<ImageWithLinkElement> items;

    @c("title")
    @l
    private final String title;

    /* compiled from: ImagesWithLinksElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImagesWithLinksElement> {
        @Override // android.os.Parcelable.Creator
        public final ImagesWithLinksElement createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ImageWithLinkElement.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ImagesWithLinksElement(string, boolValueOf, boolValueOf2, displayingCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImagesWithLinksElement[] newArray(int i12) {
            return new ImagesWithLinksElement[i12];
        }
    }

    public ImagesWithLinksElement(@l String str, @l Boolean bool, @l Boolean bool2, @l Displaying displaying, @l List<ImageWithLinkElement> list) {
        this.title = str;
        this.isAvailableToHide = bool;
        this.isCollapsed = bool2;
        this.displaying = displaying;
        this.items = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final boolean getHasContent() {
        return O2.a(this.items);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    /* renamed from: getIconUri, reason: from getter */
    public final String getF84420c() {
        return this.f84420c;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF84419b() {
        return this.f84419b;
    }

    @l
    public final List<ImageWithLinkElement> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    public final String getSectionId() {
        return SectionTypeElement.DefaultImpls.getSectionId(this);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @l
    /* renamed from: isAvailableToHide, reason: from getter */
    public final Boolean getIsAvailableToHide() {
        return this.isAvailableToHide;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @l
    /* renamed from: isCollapsed, reason: from getter */
    public final Boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final boolean isSectionWithId(@k String str) {
        return SectionTypeElement.DefaultImpls.isSectionWithId(this, str);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final void setIconUri(@k String str) {
        this.f84420c = str;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final void setId(@k String str) {
        this.f84419b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Boolean bool = this.isAvailableToHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isCollapsed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, i12);
        }
        List<ImageWithLinkElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ImageWithLinkElement) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
