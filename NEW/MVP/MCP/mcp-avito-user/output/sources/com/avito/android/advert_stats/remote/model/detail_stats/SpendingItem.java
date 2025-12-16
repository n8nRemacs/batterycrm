package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertExpensesStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "value", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Action;)V", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SpendingItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SpendingItem> CREATOR = new a();

    @c("action")
    @l
    private final Action action;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("name")
    @l
    private final AttributedText name;

    @c("value")
    @l
    private final AttributedText value;

    /* compiled from: DetailAdvertExpensesStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpendingItem> {
        @Override // android.os.Parcelable.Creator
        public final SpendingItem createFromParcel(Parcel parcel) {
            return new SpendingItem((UniversalImage) parcel.readParcelable(SpendingItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SpendingItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SpendingItem.class.getClassLoader()), (Action) parcel.readParcelable(SpendingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpendingItem[] newArray(int i12) {
            return new SpendingItem[i12];
        }
    }

    public SpendingItem(@l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l Action action) {
        this.icon = universalImage;
        this.name = attributedText;
        this.value = attributedText2;
        this.action = action;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingItem)) {
            return false;
        }
        SpendingItem spendingItem = (SpendingItem) obj;
        return L.f(this.icon, spendingItem.icon) && L.f(this.name, spendingItem.name) && L.f(this.value, spendingItem.value) && L.f(this.action, spendingItem.action);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.icon;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        AttributedText attributedText = this.name;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.value;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Action action = this.action;
        return iHashCode3 + (action != null ? action.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SpendingItem(icon=" + this.icon + ", name=" + this.name + ", value=" + this.value + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeParcelable(this.name, i12);
        parcel.writeParcelable(this.value, i12);
        parcel.writeParcelable(this.action, i12);
    }
}
