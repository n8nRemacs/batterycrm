package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBrokerV2.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/parse/adapter/FaqItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FaqItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FaqItem> CREATOR = new a();

    @com.google.gson.annotations.c("attributedTitle")
    @Y61.l
    private final AttributedText attributedTitle;

    /* compiled from: AdvertCreditCompositeBrokerV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FaqItem> {
        @Override // android.os.Parcelable.Creator
        public final FaqItem createFromParcel(Parcel parcel) {
            return new FaqItem((AttributedText) parcel.readParcelable(FaqItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FaqItem[] newArray(int i12) {
            return new FaqItem[i12];
        }
    }

    public FaqItem(@Y61.l AttributedText attributedText) {
        this.attributedTitle = attributedText;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaqItem) && kotlin.jvm.internal.L.f(this.attributedTitle, ((FaqItem) obj).attributedTitle);
    }

    public final int hashCode() {
        AttributedText attributedText = this.attributedTitle;
        if (attributedText == null) {
            return 0;
        }
        return attributedText.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("FaqItem(attributedTitle="), this.attributedTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.attributedTitle, i12);
    }
}
