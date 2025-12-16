package com.avito.android.support_bottom_sheet;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SupportDialogDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/support_bottom_sheet/SupportDialogDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_support-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class SupportDialogDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<SupportDialogDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f292392b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f292393c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f292394d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f292395e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f292396f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f292397g;

    /* compiled from: SupportDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SupportDialogDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final SupportDialogDeeplink createFromParcel(Parcel parcel) {
            return new SupportDialogDeeplink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SupportDialogDeeplink[] newArray(int i12) {
            return new SupportDialogDeeplink[i12];
        }
    }

    public SupportDialogDeeplink(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @l String str6) {
        this.f292392b = str;
        this.f292393c = str2;
        this.f292394d = str3;
        this.f292395e = str4;
        this.f292396f = str5;
        this.f292397g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292392b);
        parcel.writeString(this.f292393c);
        parcel.writeString(this.f292394d);
        parcel.writeString(this.f292395e);
        parcel.writeString(this.f292396f);
        parcel.writeString(this.f292397g);
    }
}
