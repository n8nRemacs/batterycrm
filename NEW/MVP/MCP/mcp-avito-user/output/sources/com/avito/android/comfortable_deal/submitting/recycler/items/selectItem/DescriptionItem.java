package com.avito.android.comfortable_deal.submitting.recycler.items.selectItem;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/DescriptionItem;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DescriptionItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f123229b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f123230c;

    /* compiled from: SelectorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final DescriptionItem createFromParcel(Parcel parcel) {
            return new DescriptionItem((AttributedText) parcel.readParcelable(DescriptionItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DescriptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DescriptionItem[] newArray(int i12) {
            return new DescriptionItem[i12];
        }
    }

    public DescriptionItem(@l AttributedText attributedText, @k AttributedText attributedText2) {
        this.f123229b = attributedText;
        this.f123230c = attributedText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionItem)) {
            return false;
        }
        DescriptionItem descriptionItem = (DescriptionItem) obj;
        return L.f(this.f123229b, descriptionItem.f123229b) && L.f(this.f123230c, descriptionItem.f123230c);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f123229b;
        return this.f123230c.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionItem(textIcon=");
        sb2.append(this.f123229b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f123230c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f123229b, i12);
        parcel.writeParcelable(this.f123230c, i12);
    }
}
