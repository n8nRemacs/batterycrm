package com.avito.android.publish.items.atributed_text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishAttributedTextItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/atributed_text/PublishAttributedTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PublishAttributedTextItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PublishAttributedTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f236767b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f236768c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f236769d;

    /* compiled from: PublishAttributedTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishAttributedTextItem> {
        @Override // android.os.Parcelable.Creator
        public final PublishAttributedTextItem createFromParcel(Parcel parcel) {
            return new PublishAttributedTextItem(parcel.readString(), (AttributedText) parcel.readParcelable(PublishAttributedTextItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishAttributedTextItem[] newArray(int i12) {
            return new PublishAttributedTextItem[i12];
        }
    }

    public PublishAttributedTextItem(@k String str, @k AttributedText attributedText, @l String str2) {
        this.f236767b = str;
        this.f236768c = attributedText;
        this.f236769d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishAttributedTextItem)) {
            return false;
        }
        PublishAttributedTextItem publishAttributedTextItem = (PublishAttributedTextItem) obj;
        return L.f(this.f236767b, publishAttributedTextItem.f236767b) && L.f(this.f236768c, publishAttributedTextItem.f236768c) && L.f(this.f236769d, publishAttributedTextItem.f236769d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84571b() {
        return this.f236767b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f236767b.hashCode() * 31, 31, this.f236768c);
        String str = this.f236769d;
        return iB2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishAttributedTextItem(stringId=");
        sb2.append(this.f236767b);
        sb2.append(", attributedText=");
        sb2.append(this.f236768c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f236769d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f236767b);
        parcel.writeParcelable(this.f236768c, i12);
        parcel.writeString(this.f236769d);
    }
}
