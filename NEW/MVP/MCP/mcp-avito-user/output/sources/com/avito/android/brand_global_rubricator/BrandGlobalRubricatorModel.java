package com.avito.android.brand_global_rubricator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandGlobalRubricatorModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/brand_global_rubricator/BrandGlobalRubricatorModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SerpElement;", "", "Lcom/avito/android/brand_global_rubricator/BrandGlobalRubricatorModel$RubricatorItem;", "list", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "RubricatorItem", "_avito_bx-content_widget_brand-global-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandGlobalRubricatorModel implements Parcelable, SerpElement {

    @Y61.k
    public static final Parcelable.Creator<BrandGlobalRubricatorModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f107426b;

    @com.google.gson.annotations.c("list")
    @Y61.l
    private final List<RubricatorItem> list;

    /* compiled from: BrandGlobalRubricatorModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/brand_global_rubricator/BrandGlobalRubricatorModel$RubricatorItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_bx-content_widget_brand-global-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RubricatorItem implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<RubricatorItem> CREATOR = new a();

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @Y61.k
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final UniversalImage image;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: BrandGlobalRubricatorModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RubricatorItem> {
            @Override // android.os.Parcelable.Creator
            public final RubricatorItem createFromParcel(Parcel parcel) {
                return new RubricatorItem(parcel.readString(), (DeepLink) parcel.readParcelable(RubricatorItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(RubricatorItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RubricatorItem[] newArray(int i12) {
                return new RubricatorItem[i12];
            }
        }

        public RubricatorItem(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l UniversalImage universalImage) {
            this.title = str;
            this.deepLink = deepLink;
            this.image = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RubricatorItem)) {
                return false;
            }
            RubricatorItem rubricatorItem = (RubricatorItem) obj;
            return L.f(this.title, rubricatorItem.title) && L.f(this.deepLink, rubricatorItem.deepLink) && L.f(this.image, rubricatorItem.image);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.deepLink, this.title.hashCode() * 31, 31);
            UniversalImage universalImage = this.image;
            return iE2 + (universalImage == null ? 0 : universalImage.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RubricatorItem(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, i12);
            parcel.writeParcelable(this.image, i12);
        }
    }

    /* compiled from: BrandGlobalRubricatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandGlobalRubricatorModel> {
        @Override // android.os.Parcelable.Creator
        public final BrandGlobalRubricatorModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RubricatorItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new BrandGlobalRubricatorModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BrandGlobalRubricatorModel[] newArray(int i12) {
            return new BrandGlobalRubricatorModel[i12];
        }
    }

    public BrandGlobalRubricatorModel(@Y61.l List<RubricatorItem> list) {
        this.list = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandGlobalRubricatorModel) && L.f(this.list, ((BrandGlobalRubricatorModel) obj).list);
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF107426b() {
        return this.f107426b;
    }

    public final int hashCode() {
        List<RubricatorItem> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f107426b = j12;
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("BrandGlobalRubricatorModel(list="), this.list, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<RubricatorItem> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((RubricatorItem) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
