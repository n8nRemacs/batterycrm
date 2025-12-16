package com.avito.android.iac_util_deeplinks.public_module.replace_contact;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ReplaceContactLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class ReplaceContactLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ReplaceContactLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169319b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f169320c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f169321d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f169322e;

    /* compiled from: ReplaceContactLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReplaceContactLink> {
        @Override // android.os.Parcelable.Creator
        public final ReplaceContactLink createFromParcel(Parcel parcel) {
            return new ReplaceContactLink(parcel.readString(), parcel.createStringArrayList(), (DeepLink) parcel.readParcelable(ReplaceContactLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(ReplaceContactLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReplaceContactLink[] newArray(int i12) {
            return new ReplaceContactLink[i12];
        }
    }

    /* compiled from: ReplaceContactLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b;", "LJu/c$a;", "a", "b", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b$b;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.a {

        /* compiled from: ReplaceContactLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f169323b;

            public a(@l Throwable th2) {
                this.f169323b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f169323b, ((a) obj).f169323b);
            }

            public final int hashCode() {
                Throwable th2 = this.f169323b;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(t="), this.f169323b, ')');
            }
        }

        /* compiled from: ReplaceContactLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5008b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C5008b f169324b = new C5008b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C5008b);
            }

            public final int hashCode() {
                return 1752330134;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }
    }

    public ReplaceContactLink(@k String str, @k List<String> list, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.f169319b = str;
        this.f169320c = list;
        this.f169321d = deepLink;
        this.f169322e = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceContactLink)) {
            return false;
        }
        ReplaceContactLink replaceContactLink = (ReplaceContactLink) obj;
        return L.f(this.f169319b, replaceContactLink.f169319b) && L.f(this.f169320c, replaceContactLink.f169320c) && L.f(this.f169321d, replaceContactLink.f169321d) && L.f(this.f169322e, replaceContactLink.f169322e);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f169319b.hashCode() * 31, 31, this.f169320c);
        DeepLink deepLink = this.f169321d;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f169322e;
        return iHashCode + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceContactLink(contactName=");
        sb2.append(this.f169319b);
        sb2.append(", phones=");
        sb2.append(this.f169320c);
        sb2.append(", onSuccess=");
        sb2.append(this.f169321d);
        sb2.append(", onError=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169322e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169319b);
        parcel.writeStringList(this.f169320c);
        parcel.writeParcelable(this.f169321d, i12);
        parcel.writeParcelable(this.f169322e, i12);
    }
}
