package com.avito.android.remote.model.auto_model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoModelWidget.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001cR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b;\u0010\u001aR(\u0010=\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010D\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/auto_model/AutoModelWidget;", "Lcom/avito/android/remote/model/SerpElement;", "", "title", "price", "Lcom/avito/android/remote/model/auto_model/AutoModelDescription;", "description", "Lcom/avito/android/remote/model/auto_model/AutoModelRating;", "rating", "", "Lcom/avito/android/remote/model/Image;", "images", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/auto_model/AutoModelButton;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/auto_model/AutoModelDescription;Lcom/avito/android/remote/model/auto_model/AutoModelRating;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/auto_model/AutoModelDescription;", "component4", "()Lcom/avito/android/remote/model/auto_model/AutoModelRating;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/auto_model/AutoModelDescription;Lcom/avito/android/remote/model/auto_model/AutoModelRating;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)Lcom/avito/android/remote/model/auto_model/AutoModelWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getPrice", "Lcom/avito/android/remote/model/auto_model/AutoModelDescription;", "getDescription", "Lcom/avito/android/remote/model/auto_model/AutoModelRating;", "getRating", "Ljava/util/List;", "getImages", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getButtons", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoModelWidget implements SerpElement {

    @k
    public static final Parcelable.Creator<AutoModelWidget> CREATOR = new Creator();

    @c("buttons")
    @k
    private final List<AutoModelButton> buttons;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("description")
    @l
    private final AutoModelDescription description;

    @c("images")
    @k
    private final List<Image> images;

    @c("price")
    @l
    private final String price;

    @c("rating")
    @l
    private final AutoModelRating rating;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    /* compiled from: AutoModelWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoModelWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoModelWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            AutoModelDescription autoModelDescriptionCreateFromParcel = parcel.readInt() == 0 ? null : AutoModelDescription.CREATOR.createFromParcel(parcel);
            AutoModelRating autoModelRatingCreateFromParcel = parcel.readInt() != 0 ? AutoModelRating.CREATOR.createFromParcel(parcel) : null;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(AutoModelWidget.class, parcel, arrayList, iL2, 1);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AutoModelWidget.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(AutoModelButton.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new AutoModelWidget(string, string2, autoModelDescriptionCreateFromParcel, autoModelRatingCreateFromParcel, arrayList, deepLink, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoModelWidget[] newArray(int i12) {
            return new AutoModelWidget[i12];
        }
    }

    public AutoModelWidget(@k String str, @l String str2, @l AutoModelDescription autoModelDescription, @l AutoModelRating autoModelRating, @k List<Image> list, @l DeepLink deepLink, @k List<AutoModelButton> list2) {
        this.title = str;
        this.price = str2;
        this.description = autoModelDescription;
        this.rating = autoModelRating;
        this.images = list;
        this.deepLink = deepLink;
        this.buttons = list2;
    }

    public static /* synthetic */ AutoModelWidget copy$default(AutoModelWidget autoModelWidget, String str, String str2, AutoModelDescription autoModelDescription, AutoModelRating autoModelRating, List list, DeepLink deepLink, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoModelWidget.title;
        }
        if ((i12 & 2) != 0) {
            str2 = autoModelWidget.price;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            autoModelDescription = autoModelWidget.description;
        }
        AutoModelDescription autoModelDescription2 = autoModelDescription;
        if ((i12 & 8) != 0) {
            autoModelRating = autoModelWidget.rating;
        }
        AutoModelRating autoModelRating2 = autoModelRating;
        if ((i12 & 16) != 0) {
            list = autoModelWidget.images;
        }
        List list3 = list;
        if ((i12 & 32) != 0) {
            deepLink = autoModelWidget.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 64) != 0) {
            list2 = autoModelWidget.buttons;
        }
        return autoModelWidget.copy(str, str3, autoModelDescription2, autoModelRating2, list3, deepLink2, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AutoModelDescription getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AutoModelRating getRating() {
        return this.rating;
    }

    @k
    public final List<Image> component5() {
        return this.images;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final List<AutoModelButton> component7() {
        return this.buttons;
    }

    @k
    public final AutoModelWidget copy(@k String title, @l String price, @l AutoModelDescription description, @l AutoModelRating rating, @k List<Image> images, @l DeepLink deepLink, @k List<AutoModelButton> buttons) {
        return new AutoModelWidget(title, price, description, rating, images, deepLink, buttons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoModelWidget)) {
            return false;
        }
        AutoModelWidget autoModelWidget = (AutoModelWidget) other;
        return L.f(this.title, autoModelWidget.title) && L.f(this.price, autoModelWidget.price) && L.f(this.description, autoModelWidget.description) && L.f(this.rating, autoModelWidget.rating) && L.f(this.images, autoModelWidget.images) && L.f(this.deepLink, autoModelWidget.deepLink) && L.f(this.buttons, autoModelWidget.buttons);
    }

    @k
    public final List<AutoModelButton> getButtons() {
        return this.buttons;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final AutoModelDescription getDescription() {
        return this.description;
    }

    @k
    public final List<Image> getImages() {
        return this.images;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final AutoModelRating getRating() {
        return this.rating;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.price;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AutoModelDescription autoModelDescription = this.description;
        int iHashCode3 = (iHashCode2 + (autoModelDescription == null ? 0 : autoModelDescription.hashCode())) * 31;
        AutoModelRating autoModelRating = this.rating;
        int iE2 = H.e((iHashCode3 + (autoModelRating == null ? 0 : autoModelRating.hashCode())) * 31, 31, this.images);
        DeepLink deepLink = this.deepLink;
        return this.buttons.hashCode() + ((iE2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoModelWidget(title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        AutoModelDescription autoModelDescription = this.description;
        if (autoModelDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoModelDescription.writeToParcel(parcel, flags);
        }
        AutoModelRating autoModelRating = this.rating;
        if (autoModelRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoModelRating.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.images, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.deepLink, flags);
        Iterator itJ2 = C0.j(this.buttons, parcel);
        while (itJ2.hasNext()) {
            ((AutoModelButton) itJ2.next()).writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
