package com.avito.android.authorization.social_registration.code_check;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.registration.RegisteredProfile;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SocRegCodeCheckScenarioBuilder.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/social_registration/code_check/SocialRegCcResult;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SocialRegCcResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SocialRegCcResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f94582b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f94583c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<RegisteredProfile> f94584d;

    /* compiled from: SocRegCodeCheckScenarioBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SocialRegCcResult> {
        @Override // android.os.Parcelable.Creator
        public final SocialRegCcResult createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SocialRegCcResult.class.getClassLoader());
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SocialRegCcResult.class, parcel, arrayList, iL2, 1);
            }
            return new SocialRegCcResult(attributedText, arrayList, string);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialRegCcResult[] newArray(int i12) {
            return new SocialRegCcResult[i12];
        }
    }

    public SocialRegCcResult(@Y61.l AttributedText attributedText, @Y61.k List list, @Y61.k String str) {
        this.f94582b = attributedText;
        this.f94583c = str;
        this.f94584d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRegCcResult)) {
            return false;
        }
        SocialRegCcResult socialRegCcResult = (SocialRegCcResult) obj;
        return L.f(this.f94582b, socialRegCcResult.f94582b) && L.f(this.f94583c, socialRegCcResult.f94583c) && L.f(this.f94584d, socialRegCcResult.f94584d);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f94582b;
        return this.f94584d.hashCode() + H.d((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.f94583c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocialRegCcResult(warning=");
        sb2.append(this.f94582b);
        sb2.append(", suggestKey=");
        sb2.append(this.f94583c);
        sb2.append(", profiles=");
        return H.p(sb2, this.f94584d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f94582b, i12);
        parcel.writeString(this.f94583c);
        Iterator itJ = C0.j(this.f94584d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
