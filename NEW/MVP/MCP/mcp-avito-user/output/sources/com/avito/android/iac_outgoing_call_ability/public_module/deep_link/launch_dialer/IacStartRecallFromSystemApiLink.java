package com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacStartRecallFromSystemApiLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacStartRecallFromSystemApiLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacStartRecallFromSystemApiLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168706b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168707c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f168708d;

    /* compiled from: IacStartRecallFromSystemApiLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacStartRecallFromSystemApiLink> {
        @Override // android.os.Parcelable.Creator
        public final IacStartRecallFromSystemApiLink createFromParcel(Parcel parcel) {
            return new IacStartRecallFromSystemApiLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacStartRecallFromSystemApiLink[] newArray(int i12) {
            return new IacStartRecallFromSystemApiLink[i12];
        }
    }

    /* compiled from: IacStartRecallFromSystemApiLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacStartRecallFromSystemApiLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b$a;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168709b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 97282694;
            }

            @k
            public final String toString() {
                return "IacCallBlockedByBusy";
            }
        }

        /* compiled from: IacStartRecallFromSystemApiLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b$b;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartRecallFromSystemApiLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4991b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4991b f168710b = new C4991b();

            public C4991b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4991b);
            }

            public final int hashCode() {
                return 1738005740;
            }

            @k
            public final String toString() {
                return "IacCallStart";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacStartRecallFromSystemApiLink(@k String str, @k String str2, boolean z12) {
        this.f168706b = str;
        this.f168707c = str2;
        this.f168708d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacStartRecallFromSystemApiLink)) {
            return false;
        }
        IacStartRecallFromSystemApiLink iacStartRecallFromSystemApiLink = (IacStartRecallFromSystemApiLink) obj;
        return L.f(this.f168706b, iacStartRecallFromSystemApiLink.f168706b) && L.f(this.f168707c, iacStartRecallFromSystemApiLink.f168707c) && this.f168708d == iacStartRecallFromSystemApiLink.f168708d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168708d) + H.d(this.f168706b.hashCode() * 31, 31, this.f168707c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacStartRecallFromSystemApiLink(prevCallId=");
        sb2.append(this.f168706b);
        sb2.append(", scenario=");
        sb2.append(this.f168707c);
        sb2.append(", isVideo=");
        return r.x(sb2, this.f168708d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168706b);
        parcel.writeString(this.f168707c);
        parcel.writeInt(this.f168708d ? 1 : 0);
    }
}
