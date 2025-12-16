package com.avito.android.iac_outgoing_call_ability.public_module.deep_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacCanRecallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacCanRecallLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCanRecallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168677c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f168678d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f168679e;

    /* compiled from: IacCanRecallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCanRecallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacCanRecallLink createFromParcel(Parcel parcel) {
            return new IacCanRecallLink(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(IacCanRecallLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacCanRecallLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacCanRecallLink[] newArray(int i12) {
            return new IacCanRecallLink[i12];
        }
    }

    /* compiled from: IacCanRecallLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b;", "LJu/c$a;", "a", "b", "c", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$c;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.a {

        /* compiled from: IacCanRecallLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168680b = new a();
        }

        /* compiled from: IacCanRecallLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink$b$b, reason: collision with other inner class name */
        public static final class C4986b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4986b f168681b = new C4986b();
        }

        /* compiled from: IacCanRecallLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b$c;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f168682b = new c();
        }
    }

    public IacCanRecallLink(@k String str, @k String str2, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.f168676b = str;
        this.f168677c = str2;
        this.f168678d = deepLink;
        this.f168679e = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCanRecallLink)) {
            return false;
        }
        IacCanRecallLink iacCanRecallLink = (IacCanRecallLink) obj;
        return L.f(this.f168676b, iacCanRecallLink.f168676b) && L.f(this.f168677c, iacCanRecallLink.f168677c) && L.f(this.f168678d, iacCanRecallLink.f168678d) && L.f(this.f168679e, iacCanRecallLink.f168679e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f168676b.hashCode() * 31, 31, this.f168677c);
        DeepLink deepLink = this.f168678d;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f168679e;
        return iHashCode + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCanRecallLink(prevCallId=");
        sb2.append(this.f168676b);
        sb2.append(", scenario=");
        sb2.append(this.f168677c);
        sb2.append(", onError=");
        sb2.append(this.f168678d);
        sb2.append(", onForbidden=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f168679e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168676b);
        parcel.writeString(this.f168677c);
        parcel.writeParcelable(this.f168678d, i12);
        parcel.writeParcelable(this.f168679e, i12);
    }
}
