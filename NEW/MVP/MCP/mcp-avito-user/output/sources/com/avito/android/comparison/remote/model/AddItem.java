package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/comparison/remote/model/AddItem;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "itemsLimit", "limitedErrorText", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "d", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddItem implements Parcelable {

    @k
    public static final Parcelable.Creator<AddItem> CREATOR = new a();

    @c("itemsLimit")
    @l
    private final Integer itemsLimit;

    @c("limitedErrorText")
    @l
    private final String limitedErrorText;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    @c("text")
    @k
    private final String text;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddItem> {
        @Override // android.os.Parcelable.Creator
        public final AddItem createFromParcel(Parcel parcel) {
            return new AddItem(parcel.readString(), (DeepLink) parcel.readParcelable(AddItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddItem[] newArray(int i12) {
            return new AddItem[i12];
        }
    }

    public AddItem(@k String str, @k DeepLink deepLink, @l Integer num, @l String str2) {
        this.text = str;
        this.link = deepLink;
        this.itemsLimit = num;
        this.limitedErrorText = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getItemsLimit() {
        return this.itemsLimit;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getLimitedErrorText() {
        return this.limitedErrorText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItem)) {
            return false;
        }
        AddItem addItem = (AddItem) obj;
        return L.f(this.text, addItem.text) && L.f(this.link, addItem.link) && L.f(this.itemsLimit, addItem.itemsLimit) && L.f(this.limitedErrorText, addItem.limitedErrorText);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, this.text.hashCode() * 31, 31);
        Integer num = this.itemsLimit;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.limitedErrorText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddItem(text=");
        sb2.append(this.text);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", itemsLimit=");
        sb2.append(this.itemsLimit);
        sb2.append(", limitedErrorText=");
        return C22026a.c(sb2, this.limitedErrorText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.link, i12);
        Integer num = this.itemsLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.limitedErrorText);
    }
}
