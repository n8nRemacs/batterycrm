package com.avito.android.passport.profile_add.merge.profile_to_convert.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ErrorTextListItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/recycler/ErrorTextListItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ErrorTextListItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ErrorTextListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f213179b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f213180c;

    /* compiled from: ErrorTextListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ErrorTextListItem> {
        @Override // android.os.Parcelable.Creator
        public final ErrorTextListItem createFromParcel(Parcel parcel) {
            return new ErrorTextListItem(parcel.readString(), (PrintableText) parcel.readParcelable(ErrorTextListItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorTextListItem[] newArray(int i12) {
            return new ErrorTextListItem[i12];
        }
    }

    public ErrorTextListItem(@Y61.k String str, @Y61.k PrintableText printableText) {
        this.f213179b = printableText;
        this.f213180c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorTextListItem)) {
            return false;
        }
        ErrorTextListItem errorTextListItem = (ErrorTextListItem) obj;
        return L.f(this.f213179b, errorTextListItem.f213179b) && L.f(this.f213180c, errorTextListItem.f213180c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF395940h() {
        return this.f213180c;
    }

    public final int hashCode() {
        return this.f213180c.hashCode() + (this.f213179b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorTextListItem(text=");
        sb2.append(this.f213179b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f213180c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f213179b, i12);
        parcel.writeString(this.f213180c);
    }

    public /* synthetic */ ErrorTextListItem(PrintableText printableText, String str, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? "ErrorTextItem" : str, printableText);
    }
}
