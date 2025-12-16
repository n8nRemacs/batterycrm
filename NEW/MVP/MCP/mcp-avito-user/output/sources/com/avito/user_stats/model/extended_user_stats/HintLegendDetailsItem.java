package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/HintLegendDetailsItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HintLegendDetailsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<HintLegendDetailsItem> CREATOR = new a();

    @c("color")
    @l
    private final UniversalColor color;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HintLegendDetailsItem> {
        @Override // android.os.Parcelable.Creator
        public final HintLegendDetailsItem createFromParcel(Parcel parcel) {
            return new HintLegendDetailsItem((UniversalColor) parcel.readParcelable(HintLegendDetailsItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HintLegendDetailsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HintLegendDetailsItem[] newArray(int i12) {
            return new HintLegendDetailsItem[i12];
        }
    }

    public HintLegendDetailsItem(@l UniversalColor universalColor, @l AttributedText attributedText) {
        this.color = universalColor;
        this.title = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HintLegendDetailsItem)) {
            return false;
        }
        HintLegendDetailsItem hintLegendDetailsItem = (HintLegendDetailsItem) obj;
        return L.f(this.color, hintLegendDetailsItem.color) && L.f(this.title, hintLegendDetailsItem.title);
    }

    public final int hashCode() {
        UniversalColor universalColor = this.color;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        AttributedText attributedText = this.title;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HintLegendDetailsItem(color=");
        sb2.append(this.color);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.color, i12);
        parcel.writeParcelable(this.title, i12);
    }
}
