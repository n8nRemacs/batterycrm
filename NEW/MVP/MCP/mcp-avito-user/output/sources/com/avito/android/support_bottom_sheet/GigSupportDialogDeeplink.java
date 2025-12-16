package com.avito.android.support_bottom_sheet;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: GigSupportDialogDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/support_bottom_sheet/GigSupportDialogDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_support-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class GigSupportDialogDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigSupportDialogDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f292385b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f292386c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f292387d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f292388e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f292389f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f292390g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f292391h;

    /* compiled from: GigSupportDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSupportDialogDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigSupportDialogDeeplink createFromParcel(Parcel parcel) {
            return new GigSupportDialogDeeplink(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigSupportDialogDeeplink[] newArray(int i12) {
            return new GigSupportDialogDeeplink[i12];
        }
    }

    public GigSupportDialogDeeplink(@l String str, @l Long l12, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6) {
        this.f292385b = str;
        this.f292386c = str2;
        this.f292387d = str3;
        this.f292388e = str4;
        this.f292389f = str5;
        this.f292390g = str6;
        this.f292391h = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292385b);
        parcel.writeString(this.f292386c);
        parcel.writeString(this.f292387d);
        parcel.writeString(this.f292388e);
        parcel.writeString(this.f292389f);
        parcel.writeString(this.f292390g);
        Long l12 = this.f292391h;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
