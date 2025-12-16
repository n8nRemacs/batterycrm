package com.avito.android.passport.profiles_list.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_list_item.PassportListItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileListButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/recycler/PassportListButtonItem;", "Lcom/avito/android/passport/profile_list_item/PassportListItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportListButtonItem implements PassportListItem {

    @Y61.k
    public static final Parcelable.Creator<PassportListButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f213860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f213861c;

    /* compiled from: ProfileListButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportListButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportListButtonItem createFromParcel(Parcel parcel) {
            return new PassportListButtonItem(parcel.readString(), (PrintableText) parcel.readParcelable(PassportListButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportListButtonItem[] newArray(int i12) {
            return new PassportListButtonItem[i12];
        }
    }

    public PassportListButtonItem(@Y61.k String str, @Y61.k PrintableText printableText) {
        this.f213860b = printableText;
        this.f213861c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213498b() {
        return this.f213861c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f213860b, i12);
        parcel.writeString(this.f213861c);
    }

    public /* synthetic */ PassportListButtonItem(PrintableText printableText, String str, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? "PassportListButtonItem" : str, printableText);
    }
}
