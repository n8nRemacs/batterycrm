package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicsHintItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicsHintItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicsHintItem> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicsHintItem> {
        @Override // android.os.Parcelable.Creator
        public final DynamicsHintItem createFromParcel(Parcel parcel) {
            return new DynamicsHintItem((AttributedText) parcel.readParcelable(DynamicsHintItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DynamicsHintItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicsHintItem[] newArray(int i12) {
            return new DynamicsHintItem[i12];
        }
    }

    public DynamicsHintItem(@l AttributedText attributedText, @l AttributedText attributedText2) {
        this.description = attributedText;
        this.title = attributedText2;
    }

    @l
    /* renamed from: c, reason: from getter */
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
        if (!(obj instanceof DynamicsHintItem)) {
            return false;
        }
        DynamicsHintItem dynamicsHintItem = (DynamicsHintItem) obj;
        return L.f(this.description, dynamicsHintItem.description) && L.f(this.title, dynamicsHintItem.title);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        AttributedText attributedText = this.description;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.title;
        return iHashCode + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicsHintItem(description=");
        sb2.append(this.description);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.title, i12);
    }
}
