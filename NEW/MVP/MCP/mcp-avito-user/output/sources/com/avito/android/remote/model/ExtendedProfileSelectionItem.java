package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSelections.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSelectionItem;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/Image;", "coverImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)Lcom/avito/android/remote/model/ExtendedProfileSelectionItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/util/List;", "getCoverImages", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSelectionItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileSelectionItem> CREATOR = new Creator();

    @c("coverImages")
    @l
    private final List<Image> coverImages;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: ExtendedProfileSelections.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileSelectionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSelectionItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ExtendedProfileSelectionItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileSelectionItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ExtendedProfileSelectionItem(string, string2, deepLink, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSelectionItem[] newArray(int i12) {
            return new ExtendedProfileSelectionItem[i12];
        }
    }

    public ExtendedProfileSelectionItem(@l String str, @l String str2, @l DeepLink deepLink, @l List<Image> list) {
        this.title = str;
        this.subtitle = str2;
        this.deepLink = deepLink;
        this.coverImages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileSelectionItem copy$default(ExtendedProfileSelectionItem extendedProfileSelectionItem, String str, String str2, DeepLink deepLink, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileSelectionItem.title;
        }
        if ((i12 & 2) != 0) {
            str2 = extendedProfileSelectionItem.subtitle;
        }
        if ((i12 & 4) != 0) {
            deepLink = extendedProfileSelectionItem.deepLink;
        }
        if ((i12 & 8) != 0) {
            list = extendedProfileSelectionItem.coverImages;
        }
        return extendedProfileSelectionItem.copy(str, str2, deepLink, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final List<Image> component4() {
        return this.coverImages;
    }

    @k
    public final ExtendedProfileSelectionItem copy(@l String title, @l String subtitle, @l DeepLink deepLink, @l List<Image> coverImages) {
        return new ExtendedProfileSelectionItem(title, subtitle, deepLink, coverImages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileSelectionItem)) {
            return false;
        }
        ExtendedProfileSelectionItem extendedProfileSelectionItem = (ExtendedProfileSelectionItem) other;
        return L.f(this.title, extendedProfileSelectionItem.title) && L.f(this.subtitle, extendedProfileSelectionItem.subtitle) && L.f(this.deepLink, extendedProfileSelectionItem.deepLink) && L.f(this.coverImages, extendedProfileSelectionItem.coverImages);
    }

    @l
    public final List<Image> getCoverImages() {
        return this.coverImages;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<Image> list = this.coverImages;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSelectionItem(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", coverImages=");
        return H.p(sb2, this.coverImages, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.deepLink, flags);
        List<Image> list = this.coverImages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
