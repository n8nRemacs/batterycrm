package com.avito.android.component.user_hat;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfileKonveyor.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/PassportProfileAddItem;", "Lcom/avito/android/component/user_hat/PassportProfileItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PassportProfileAddItem implements PassportProfileItem {

    @k
    public static final Parcelable.Creator<PassportProfileAddItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f125281c;

    /* compiled from: PassportProfileKonveyor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportProfileAddItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportProfileAddItem createFromParcel(Parcel parcel) {
            return new PassportProfileAddItem(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportProfileAddItem[] newArray(int i12) {
            return new PassportProfileAddItem[i12];
        }
    }

    public PassportProfileAddItem(boolean z12, @k String str) {
        this.f125280b = z12;
        this.f125281c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportProfileAddItem)) {
            return false;
        }
        PassportProfileAddItem passportProfileAddItem = (PassportProfileAddItem) obj;
        return this.f125280b == passportProfileAddItem.f125280b && L.f(this.f125281c, passportProfileAddItem.f125281c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF118933d() {
        return this.f125281c;
    }

    public final int hashCode() {
        return this.f125281c.hashCode() + (Boolean.hashCode(this.f125280b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportProfileAddItem(showOnboarding=");
        sb2.append(this.f125280b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f125281c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f125280b ? 1 : 0);
        parcel.writeString(this.f125281c);
    }

    public /* synthetic */ PassportProfileAddItem(boolean z12, String str, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? "PassportProfileAddItem" : str);
    }
}
