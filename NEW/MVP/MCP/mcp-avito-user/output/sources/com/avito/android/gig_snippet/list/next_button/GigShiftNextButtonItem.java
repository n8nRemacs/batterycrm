package com.avito.android.gig_snippet.list.next_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftNextButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_snippet/list/next_button/GigShiftNextButtonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GigShiftNextButtonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftNextButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161010b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f161011c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f161012d;

    /* compiled from: GigShiftNextButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftNextButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftNextButtonItem createFromParcel(Parcel parcel) {
            return new GigShiftNextButtonItem(parcel.readString(), (DeepLink) parcel.readParcelable(GigShiftNextButtonItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftNextButtonItem[] newArray(int i12) {
            return new GigShiftNextButtonItem[i12];
        }
    }

    public GigShiftNextButtonItem(@k String str, @k DeepLink deepLink, @k String str2) {
        this.f161010b = str;
        this.f161011c = deepLink;
        this.f161012d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigShiftNextButtonItem)) {
            return false;
        }
        GigShiftNextButtonItem gigShiftNextButtonItem = (GigShiftNextButtonItem) obj;
        return L.f(this.f161010b, gigShiftNextButtonItem.f161010b) && L.f(this.f161011c, gigShiftNextButtonItem.f161011c) && L.f(this.f161012d, gigShiftNextButtonItem.f161012d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return getF156524b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF156524b() {
        return this.f161012d;
    }

    public final int hashCode() {
        return this.f161012d.hashCode() + com.avito.android.actions_sheet.a.e(this.f161011c, this.f161010b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftNextButtonItem(title=");
        sb2.append(this.f161010b);
        sb2.append(", deepLink=");
        sb2.append(this.f161011c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f161012d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161010b);
        parcel.writeParcelable(this.f161011c, i12);
        parcel.writeString(this.f161012d);
    }
}
