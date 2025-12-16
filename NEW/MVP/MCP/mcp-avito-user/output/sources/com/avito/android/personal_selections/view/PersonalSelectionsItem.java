package com.avito.android.personal_selections.view;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalSelectionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_selections/view/PersonalSelectionsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonalSelectionsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PersonalSelectionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215837b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f215838c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<String> f215839d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f215840e;

    /* renamed from: f, reason: collision with root package name */
    public final long f215841f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f215842g;

    /* compiled from: PersonalSelectionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PersonalSelectionsItem> {
        @Override // android.os.Parcelable.Creator
        public final PersonalSelectionsItem createFromParcel(Parcel parcel) {
            return new PersonalSelectionsItem(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (DeepLink) parcel.readParcelable(PersonalSelectionsItem.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalSelectionsItem[] newArray(int i12) {
            return new PersonalSelectionsItem[i12];
        }
    }

    public PersonalSelectionsItem(@k String str, @k String str2, @k List<String> list, @k DeepLink deepLink, long j12, @k String str3) {
        this.f215837b = str;
        this.f215838c = str2;
        this.f215839d = list;
        this.f215840e = deepLink;
        this.f215841f = j12;
        this.f215842g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalSelectionsItem)) {
            return false;
        }
        PersonalSelectionsItem personalSelectionsItem = (PersonalSelectionsItem) obj;
        return L.f(this.f215837b, personalSelectionsItem.f215837b) && L.f(this.f215838c, personalSelectionsItem.f215838c) && L.f(this.f215839d, personalSelectionsItem.f215839d) && L.f(this.f215840e, personalSelectionsItem.f215840e) && this.f215841f == personalSelectionsItem.f215841f && L.f(this.f215842g, personalSelectionsItem.f215842g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324058b() {
        return this.f215842g;
    }

    public final int hashCode() {
        return this.f215842g.hashCode() + r.g(com.avito.android.actions_sheet.a.e(this.f215840e, H.e(H.d(this.f215837b.hashCode() * 31, 31, this.f215838c), 31, this.f215839d), 31), 31, this.f215841f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalSelectionsItem(title=");
        sb2.append(this.f215837b);
        sb2.append(", subtitle=");
        sb2.append(this.f215838c);
        sb2.append(", urls=");
        sb2.append(this.f215839d);
        sb2.append(", deeplink=");
        sb2.append(this.f215840e);
        sb2.append(", availableItemsCount=");
        sb2.append(this.f215841f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f215842g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215837b);
        parcel.writeString(this.f215838c);
        parcel.writeStringList(this.f215839d);
        parcel.writeParcelable(this.f215840e, i12);
        parcel.writeLong(this.f215841f);
        parcel.writeString(this.f215842g);
    }

    public /* synthetic */ PersonalSelectionsItem(String str, String str2, List list, DeepLink deepLink, long j12, String str3, int i12, C42822w c42822w) {
        this(str, str2, list, deepLink, j12, (i12 & 32) != 0 ? UUID.randomUUID().toString() : str3);
    }
}
