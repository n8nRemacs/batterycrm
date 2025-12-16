package com.avito.android.beduin.common.component.badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBadgeBarModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JN\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0016R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0018¨\u00063"}, d2 = {"Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItem;", "Landroid/os/Parcelable;", "", "id", "", "title", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(ILjava/lang/String;Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;)Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItem;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "getStyle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/util/List;", "getOnTapActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBadgeBarItem implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinBadgeBarItem> CREATOR = new a();
    private final int id;

    @l
    private final UniversalImage image;

    @l
    private final List<BeduinAction> onTapActions;

    @l
    private final BeduinBadgeBarItemStyle style;

    @k
    private final String title;

    /* compiled from: BeduinBadgeBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            BeduinBadgeBarItemStyle beduinBadgeBarItemStyleCreateFromParcel = parcel.readInt() == 0 ? null : BeduinBadgeBarItemStyle.CREATOR.createFromParcel(parcel);
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(BeduinBadgeBarItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBadgeBarItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinBadgeBarItem(i12, string, beduinBadgeBarItemStyleCreateFromParcel, universalImage, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarItem[] newArray(int i12) {
            return new BeduinBadgeBarItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBadgeBarItem(int i12, @k String str, @l BeduinBadgeBarItemStyle beduinBadgeBarItemStyle, @l UniversalImage universalImage, @l List<? extends BeduinAction> list) {
        this.id = i12;
        this.title = str;
        this.style = beduinBadgeBarItemStyle;
        this.image = universalImage;
        this.onTapActions = list;
    }

    public static /* synthetic */ BeduinBadgeBarItem copy$default(BeduinBadgeBarItem beduinBadgeBarItem, int i12, String str, BeduinBadgeBarItemStyle beduinBadgeBarItemStyle, UniversalImage universalImage, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = beduinBadgeBarItem.id;
        }
        if ((i13 & 2) != 0) {
            str = beduinBadgeBarItem.title;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            beduinBadgeBarItemStyle = beduinBadgeBarItem.style;
        }
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle2 = beduinBadgeBarItemStyle;
        if ((i13 & 8) != 0) {
            universalImage = beduinBadgeBarItem.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i13 & 16) != 0) {
            list = beduinBadgeBarItem.onTapActions;
        }
        return beduinBadgeBarItem.copy(i12, str2, beduinBadgeBarItemStyle2, universalImage2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinBadgeBarItemStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final List<BeduinAction> component5() {
        return this.onTapActions;
    }

    @k
    public final BeduinBadgeBarItem copy(int id2, @k String title, @l BeduinBadgeBarItemStyle style, @l UniversalImage image, @l List<? extends BeduinAction> onTapActions) {
        return new BeduinBadgeBarItem(id2, title, style, image, onTapActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBadgeBarItem)) {
            return false;
        }
        BeduinBadgeBarItem beduinBadgeBarItem = (BeduinBadgeBarItem) other;
        return this.id == beduinBadgeBarItem.id && L.f(this.title, beduinBadgeBarItem.title) && L.f(this.style, beduinBadgeBarItem.style) && L.f(this.image, beduinBadgeBarItem.image) && L.f(this.onTapActions, beduinBadgeBarItem.onTapActions);
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @l
    public final BeduinBadgeBarItemStyle getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.id) * 31, 31, this.title);
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle = this.style;
        int iHashCode = (iD2 + (beduinBadgeBarItemStyle == null ? 0 : beduinBadgeBarItemStyle.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        List<BeduinAction> list = this.onTapActions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBadgeBarItem(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", onTapActions=");
        return H.p(sb2, this.onTapActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle = this.style;
        if (beduinBadgeBarItemStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinBadgeBarItemStyle.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        List<BeduinAction> list = this.onTapActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
