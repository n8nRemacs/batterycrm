package com.avito.android.authorization;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.registration.RegisteredProfile;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InternalAuthIntentFactory.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/SocialRegistrationSuggestsParams;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SocialRegistrationSuggestsParams implements Parcelable {

    @k
    public static final Parcelable.Creator<SocialRegistrationSuggestsParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92750b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<RegisteredProfile> f92751c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f92752d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f92753e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f92754f;

    /* compiled from: InternalAuthIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SocialRegistrationSuggestsParams> {
        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationSuggestsParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SocialRegistrationSuggestsParams.class, parcel, arrayList, iL2, 1);
            }
            return new SocialRegistrationSuggestsParams(string, arrayList, parcel.readString(), (AttributedText) parcel.readParcelable(SocialRegistrationSuggestsParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationSuggestsParams[] newArray(int i12) {
            return new SocialRegistrationSuggestsParams[i12];
        }
    }

    public SocialRegistrationSuggestsParams(@k String str, @k List<RegisteredProfile> list, @k String str2, @l AttributedText attributedText, boolean z12) {
        this.f92750b = str;
        this.f92751c = list;
        this.f92752d = str2;
        this.f92753e = attributedText;
        this.f92754f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRegistrationSuggestsParams)) {
            return false;
        }
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = (SocialRegistrationSuggestsParams) obj;
        return L.f(this.f92750b, socialRegistrationSuggestsParams.f92750b) && L.f(this.f92751c, socialRegistrationSuggestsParams.f92751c) && L.f(this.f92752d, socialRegistrationSuggestsParams.f92752d) && L.f(this.f92753e, socialRegistrationSuggestsParams.f92753e) && this.f92754f == socialRegistrationSuggestsParams.f92754f;
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(this.f92750b.hashCode() * 31, 31, this.f92751c), 31, this.f92752d);
        AttributedText attributedText = this.f92753e;
        return Boolean.hashCode(this.f92754f) + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocialRegistrationSuggestsParams(suggestKey=");
        sb2.append(this.f92750b);
        sb2.append(", profiles=");
        sb2.append(this.f92751c);
        sb2.append(", socialType=");
        sb2.append(this.f92752d);
        sb2.append(", warning=");
        sb2.append(this.f92753e);
        sb2.append(", useNewProceed=");
        return r.x(sb2, this.f92754f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92750b);
        Iterator itJ = C0.j(this.f92751c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f92752d);
        parcel.writeParcelable(this.f92753e, i12);
        parcel.writeInt(this.f92754f ? 1 : 0);
    }

    public /* synthetic */ SocialRegistrationSuggestsParams(String str, List list, String str2, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(str, list, str2, (i12 & 8) != 0 ? null : attributedText, z12);
    }
}
