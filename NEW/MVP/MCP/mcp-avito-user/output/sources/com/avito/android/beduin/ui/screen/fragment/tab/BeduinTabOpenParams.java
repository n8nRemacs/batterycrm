package com.avito.android.beduin.ui.screen.fragment.tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTabOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/BeduinTabOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<BeduinTabOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f104293b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f104294c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f104295d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BeduinComponentTheme f104296e;

    /* compiled from: BeduinTabOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTabOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTabOpenParams createFromParcel(Parcel parcel) {
            return new BeduinTabOpenParams(parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTabOpenParams[] newArray(int i12) {
            return new BeduinTabOpenParams[i12];
        }
    }

    public BeduinTabOpenParams(@l BeduinComponentTheme beduinComponentTheme, @l String str, @l String str2, @l String str3) {
        this.f104293b = str;
        this.f104294c = str2;
        this.f104295d = str3;
        this.f104296e = beduinComponentTheme;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinTabOpenParams)) {
            return false;
        }
        BeduinTabOpenParams beduinTabOpenParams = (BeduinTabOpenParams) obj;
        return L.f(this.f104293b, beduinTabOpenParams.f104293b) && L.f(this.f104294c, beduinTabOpenParams.f104294c) && L.f(this.f104295d, beduinTabOpenParams.f104295d) && this.f104296e == beduinTabOpenParams.f104296e;
    }

    public final int hashCode() {
        String str = this.f104293b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104294c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104295d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.f104296e;
        return iHashCode3 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinTabOpenParams(topId=" + this.f104293b + ", mainId=" + this.f104294c + ", bottomId=" + this.f104295d + ", theme=" + this.f104296e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104293b);
        parcel.writeString(this.f104294c);
        parcel.writeString(this.f104295d);
        BeduinComponentTheme beduinComponentTheme = this.f104296e;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ BeduinTabOpenParams(String str, String str2, String str3, BeduinComponentTheme beduinComponentTheme, int i12, C42822w c42822w) {
        this((i12 & 8) != 0 ? null : beduinComponentTheme, str, str2, str3);
    }
}
