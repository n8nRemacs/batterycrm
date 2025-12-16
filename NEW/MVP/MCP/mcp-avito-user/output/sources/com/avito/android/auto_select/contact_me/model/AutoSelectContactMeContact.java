package com.avito.android.auto_select.contact_me.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeContact.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/model/AutoSelectContactMeContact;", "Landroid/os/Parcelable;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoSelectContactMeContact implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectContactMeContact> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f95991b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f95992c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f95993d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f95994e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f95995f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95996g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f95997h;

    /* compiled from: AutoSelectContactMeContact.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectContactMeContact> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeContact createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoSelectContactMeContact.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AutoSelectContactMeContact.class.getClassLoader());
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(AutoSelectContactMeContact.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AutoSelectContactMeContact.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoSelectContactMeContact(attributedText, attributedText2, string, universalImage, deepLink, z12, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeContact[] newArray(int i12) {
            return new AutoSelectContactMeContact[i12];
        }
    }

    public AutoSelectContactMeContact(@k AttributedText attributedText, @k AttributedText attributedText2, @k String str, @k UniversalImage universalImage, @l DeepLink deepLink, boolean z12, @l Boolean bool) {
        this.f95991b = attributedText;
        this.f95992c = attributedText2;
        this.f95993d = str;
        this.f95994e = universalImage;
        this.f95995f = deepLink;
        this.f95996g = z12;
        this.f95997h = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectContactMeContact)) {
            return false;
        }
        AutoSelectContactMeContact autoSelectContactMeContact = (AutoSelectContactMeContact) obj;
        return L.f(this.f95991b, autoSelectContactMeContact.f95991b) && L.f(this.f95992c, autoSelectContactMeContact.f95992c) && L.f(this.f95993d, autoSelectContactMeContact.f95993d) && L.f(this.f95994e, autoSelectContactMeContact.f95994e) && L.f(this.f95995f, autoSelectContactMeContact.f95995f) && this.f95996g == autoSelectContactMeContact.f95996g && L.f(this.f95997h, autoSelectContactMeContact.f95997h);
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(H.d(com.avito.android.actions_sheet.a.b(this.f95991b.hashCode() * 31, 31, this.f95992c), 31, this.f95993d), 31, this.f95994e);
        DeepLink deepLink = this.f95995f;
        int i12 = r.i((iA2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f95996g);
        Boolean bool = this.f95997h;
        return i12 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectContactMeContact(title=");
        sb2.append(this.f95991b);
        sb2.append(", description=");
        sb2.append(this.f95992c);
        sb2.append(", color=");
        sb2.append(this.f95993d);
        sb2.append(", image=");
        sb2.append(this.f95994e);
        sb2.append(", uri=");
        sb2.append(this.f95995f);
        sb2.append(", isActive=");
        sb2.append(this.f95996g);
        sb2.append(", needsLogItemCall=");
        return C0.g(sb2, this.f95997h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f95991b, i12);
        parcel.writeParcelable(this.f95992c, i12);
        parcel.writeString(this.f95993d);
        parcel.writeParcelable(this.f95994e, i12);
        parcel.writeParcelable(this.f95995f, i12);
        parcel.writeInt(this.f95996g ? 1 : 0);
        Boolean bool = this.f95997h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ AutoSelectContactMeContact(AttributedText attributedText, AttributedText attributedText2, String str, UniversalImage universalImage, DeepLink deepLink, boolean z12, Boolean bool, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, str, universalImage, deepLink, z12, (i12 & 64) != 0 ? null : bool);
    }
}
