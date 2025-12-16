package com.avito.android.work_profile.profile.gig.ui.list.title_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/title_item/GigTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GigTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f331240b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f331241c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f331242d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f331243e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f331244f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f331245g;

    /* compiled from: GigTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final GigTitleItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new GigTitleItem(string, (DeepLink) parcel.readParcelable(GigTitleItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(GigTitleItem.class.getClassLoader()), string2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigTitleItem[] newArray(int i12) {
            return new GigTitleItem[i12];
        }
    }

    public GigTitleItem(@k String str, @l DeepLink deepLink, @l DeepLink deepLink2, @l String str2, @l String str3, @k String str4) {
        this.f331240b = str;
        this.f331241c = str2;
        this.f331242d = deepLink;
        this.f331243e = str3;
        this.f331244f = deepLink2;
        this.f331245g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigTitleItem)) {
            return false;
        }
        GigTitleItem gigTitleItem = (GigTitleItem) obj;
        return L.f(this.f331240b, gigTitleItem.f331240b) && L.f(this.f331241c, gigTitleItem.f331241c) && L.f(this.f331242d, gigTitleItem.f331242d) && L.f(this.f331243e, gigTitleItem.f331243e) && L.f(this.f331244f, gigTitleItem.f331244f) && L.f(this.f331245g, gigTitleItem.f331245g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return getF331197i().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF331197i() {
        return this.f331245g;
    }

    public final int hashCode() {
        int iHashCode = this.f331240b.hashCode() * 31;
        String str = this.f331241c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f331242d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.f331243e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink2 = this.f331244f;
        return this.f331245g.hashCode() + ((iHashCode4 + (deepLink2 != null ? deepLink2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigTitleItem(title=");
        sb2.append(this.f331240b);
        sb2.append(", subtitle=");
        sb2.append(this.f331241c);
        sb2.append(", deepLink=");
        sb2.append(this.f331242d);
        sb2.append(", buttonTitle=");
        sb2.append(this.f331243e);
        sb2.append(", buttonDeeplink=");
        sb2.append(this.f331244f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f331245g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f331240b);
        parcel.writeString(this.f331241c);
        parcel.writeParcelable(this.f331242d, i12);
        parcel.writeString(this.f331243e);
        parcel.writeParcelable(this.f331244f, i12);
        parcel.writeString(this.f331245g);
    }

    public /* synthetic */ GigTitleItem(String str, String str2, DeepLink deepLink, String str3, DeepLink deepLink2, String str4, int i12, C42822w c42822w) {
        this(str, deepLink, deepLink2, str2, str3, (i12 & 32) != 0 ? str : str4);
    }
}
