package com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler;

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

/* compiled from: PassportProfileErrorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/recycler/PassportProfileErrorItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportProfileErrorItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PassportProfileErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f212445b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f212446c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f212447d = String.valueOf(hashCode());

    /* compiled from: PassportProfileErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportProfileErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportProfileErrorItem createFromParcel(Parcel parcel) {
            return new PassportProfileErrorItem((AttributedText) parcel.readParcelable(PassportProfileErrorItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportProfileErrorItem[] newArray(int i12) {
            return new PassportProfileErrorItem[i12];
        }
    }

    public PassportProfileErrorItem(@k AttributedText attributedText, @k String str) {
        this.f212445b = attributedText;
        this.f212446c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportProfileErrorItem)) {
            return false;
        }
        PassportProfileErrorItem passportProfileErrorItem = (PassportProfileErrorItem) obj;
        return L.f(this.f212445b, passportProfileErrorItem.f212445b) && L.f(this.f212446c, passportProfileErrorItem.f212446c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200789b() {
        return this.f212447d;
    }

    public final int hashCode() {
        return this.f212446c.hashCode() + (this.f212445b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportProfileErrorItem(title=");
        sb2.append(this.f212445b);
        sb2.append(", iconId=");
        return C22026a.c(sb2, this.f212446c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f212445b, i12);
        parcel.writeString(this.f212446c);
    }
}
