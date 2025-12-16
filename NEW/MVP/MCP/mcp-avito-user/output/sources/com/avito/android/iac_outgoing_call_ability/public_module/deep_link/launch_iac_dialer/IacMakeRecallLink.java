package com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacMakeRecallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacMakeRecallLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacMakeRecallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168713b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f168714c;

    /* compiled from: IacMakeRecallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacMakeRecallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacMakeRecallLink createFromParcel(Parcel parcel) {
            return new IacMakeRecallLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacMakeRecallLink[] newArray(int i12) {
            return new IacMakeRecallLink[i12];
        }
    }

    /* compiled from: IacMakeRecallLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b;", "", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacMakeRecallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b$a;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {
            static {
                new a();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2019434406;
            }

            @k
            public final String toString() {
                return "Done";
            }
        }

        /* compiled from: IacMakeRecallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b$b;", "LJu/c$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeRecallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeRecallLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4994b implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4994b f168715b = new C4994b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4994b);
            }

            public final int hashCode() {
                return -1252685644;
            }

            @k
            public final String toString() {
                return "Redirect";
            }
        }
    }

    public IacMakeRecallLink(@k String str, @l String str2) {
        this.f168713b = str;
        this.f168714c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacMakeRecallLink)) {
            return false;
        }
        IacMakeRecallLink iacMakeRecallLink = (IacMakeRecallLink) obj;
        return L.f(this.f168713b, iacMakeRecallLink.f168713b) && L.f(this.f168714c, iacMakeRecallLink.f168714c);
    }

    public final int hashCode() {
        int iHashCode = this.f168713b.hashCode() * 31;
        String str = this.f168714c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacMakeRecallLink(prevCallId=");
        sb2.append(this.f168713b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f168714c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168713b);
        parcel.writeString(this.f168714c);
    }
}
