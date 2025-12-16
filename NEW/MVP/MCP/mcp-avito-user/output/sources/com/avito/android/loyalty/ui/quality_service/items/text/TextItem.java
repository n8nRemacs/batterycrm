package com.avito.android.loyalty.ui.quality_service.items.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.loyalty.ui.quality_service.items.WidgetItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/text/TextItem;", "Lcom/avito/android/loyalty/ui/quality_service/items/WidgetItem;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TextItem implements WidgetItem {

    @k
    public static final Parcelable.Creator<TextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183941b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f183942c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f183943d;

    /* renamed from: e, reason: collision with root package name */
    public final int f183944e;

    /* compiled from: TextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextItem> {
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            return new TextItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AttributedText) parcel.readParcelable(TextItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i12) {
            return new TextItem[i12];
        }
    }

    public TextItem(@k String str, @l Integer num, @l AttributedText attributedText, @InterfaceC42150f int i12) {
        this.f183941b = str;
        this.f183942c = num;
        this.f183943d = attributedText;
        this.f183944e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItem)) {
            return false;
        }
        TextItem textItem = (TextItem) obj;
        return L.f(this.f183941b, textItem.f183941b) && L.f(this.f183942c, textItem.f183942c) && L.f(this.f183943d, textItem.f183943d) && this.f183944e == textItem.f183944e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF147959c() {
        return this.f183941b;
    }

    public final int hashCode() {
        int iHashCode = this.f183941b.hashCode() * 31;
        Integer num = this.f183942c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AttributedText attributedText = this.f183943d;
        return Integer.hashCode(this.f183944e) + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextItem(stringId=");
        sb2.append(this.f183941b);
        sb2.append(", marginBottom=");
        sb2.append(this.f183942c);
        sb2.append(", content=");
        sb2.append(this.f183943d);
        sb2.append(", textStyleAttrRes=");
        return r.t(sb2, this.f183944e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f183941b);
        Integer num = this.f183942c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f183943d, i12);
        parcel.writeInt(this.f183944e);
    }

    public /* synthetic */ TextItem(String str, Integer num, AttributedText attributedText, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : attributedText, (i13 & 8) != 0 ? R.attr.textL10 : i12);
    }
}
