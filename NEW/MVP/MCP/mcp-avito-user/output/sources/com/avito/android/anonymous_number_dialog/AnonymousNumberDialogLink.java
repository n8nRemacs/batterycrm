package com.avito.android.anonymous_number_dialog;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AnonymousNumberDialogLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_anonymous-number-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AnonymousNumberDialogLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AnonymousNumberDialogLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f91269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f91270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f91271d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f91272e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f91273f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f91274g;

    /* compiled from: AnonymousNumberDialogLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnonymousNumberDialogLink> {
        @Override // android.os.Parcelable.Creator
        public final AnonymousNumberDialogLink createFromParcel(Parcel parcel) {
            return new AnonymousNumberDialogLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AnonymousNumberDialogLink.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnonymousNumberDialogLink[] newArray(int i12) {
            return new AnonymousNumberDialogLink[i12];
        }
    }

    public AnonymousNumberDialogLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k DeepLink deepLink, @Y61.l String str5) {
        this.f91269b = str;
        this.f91270c = str2;
        this.f91271d = str3;
        this.f91272e = str4;
        this.f91273f = deepLink;
        this.f91274g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousNumberDialogLink)) {
            return false;
        }
        AnonymousNumberDialogLink anonymousNumberDialogLink = (AnonymousNumberDialogLink) obj;
        return L.f(this.f91269b, anonymousNumberDialogLink.f91269b) && L.f(this.f91270c, anonymousNumberDialogLink.f91270c) && L.f(this.f91271d, anonymousNumberDialogLink.f91271d) && L.f(this.f91272e, anonymousNumberDialogLink.f91272e) && L.f(this.f91273f, anonymousNumberDialogLink.f91273f) && L.f(this.f91274g, anonymousNumberDialogLink.f91274g);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f91269b.hashCode() * 31, 31, this.f91270c);
        String str = this.f91271d;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f91273f, H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91272e), 31);
        String str2 = this.f91274g;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnonymousNumberDialogLink(title=");
        sb2.append(this.f91269b);
        sb2.append(", description=");
        sb2.append(this.f91270c);
        sb2.append(", pictureId=");
        sb2.append(this.f91271d);
        sb2.append(", textButton=");
        sb2.append(this.f91272e);
        sb2.append(", callLink=");
        sb2.append(this.f91273f);
        sb2.append(", sellerHashId=");
        return C22026a.c(sb2, this.f91274g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f91269b);
        parcel.writeString(this.f91270c);
        parcel.writeString(this.f91271d);
        parcel.writeString(this.f91272e);
        parcel.writeParcelable(this.f91273f, i12);
        parcel.writeString(this.f91274g);
    }
}
