package com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacStartNewCallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacStartNewCallLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacStartNewCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f168696b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168697c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f168698d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f168699e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f168700f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Long f168701g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Map<String, String> f168702h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Map<String, String> f168703i;

    /* compiled from: IacStartNewCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacStartNewCallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacStartNewCallLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            LinkedHashMap linkedHashMap2 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA3 = 0;
                while (iA3 != i12) {
                    iA3 = C0.a(parcel, linkedHashMap, parcel.readString(), iA3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
            }
            return new IacStartNewCallLink(string, string2, z12, string3, string4, lValueOf, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final IacStartNewCallLink[] newArray(int i12) {
            return new IacStartNewCallLink[i12];
        }
    }

    /* compiled from: IacStartNewCallLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacStartNewCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b$a;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168704b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1574153644;
            }

            @k
            public final String toString() {
                return "IacCallBlockedByBusy";
            }
        }

        /* compiled from: IacStartNewCallLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b$b;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4990b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f168705b;

            public C4990b(@l String str) {
                super(null);
                this.f168705b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4990b) && L.f(this.f168705b, ((C4990b) obj).f168705b);
            }

            public final int hashCode() {
                String str = this.f168705b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("IacCallStart(itemId="), this.f168705b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacStartNewCallLink(@l String str, @k String str2, boolean z12, @k String str3, @k String str4, @l Long l12, @l Map map, @l Map map2) {
        this.f168696b = str;
        this.f168697c = str2;
        this.f168698d = str3;
        this.f168699e = str4;
        this.f168700f = z12;
        this.f168701g = l12;
        this.f168702h = map;
        this.f168703i = map2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacStartNewCallLink)) {
            return false;
        }
        IacStartNewCallLink iacStartNewCallLink = (IacStartNewCallLink) obj;
        return L.f(this.f168696b, iacStartNewCallLink.f168696b) && L.f(this.f168697c, iacStartNewCallLink.f168697c) && L.f(this.f168698d, iacStartNewCallLink.f168698d) && L.f(this.f168699e, iacStartNewCallLink.f168699e) && this.f168700f == iacStartNewCallLink.f168700f && L.f(this.f168701g, iacStartNewCallLink.f168701g) && L.f(this.f168702h, iacStartNewCallLink.f168702h) && L.f(this.f168703i, iacStartNewCallLink.f168703i);
    }

    public final int hashCode() {
        String str = this.f168696b;
        int i12 = r.i(H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f168697c), 31, this.f168698d), 31, this.f168699e), 31, this.f168700f);
        Long l12 = this.f168701g;
        int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.f168702h;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f168703i;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacStartNewCallLink(callId=");
        sb2.append(this.f168696b);
        sb2.append(", from=");
        sb2.append(this.f168697c);
        sb2.append(", to=");
        sb2.append(this.f168698d);
        sb2.append(", scenario=");
        sb2.append(this.f168699e);
        sb2.append(", isVideo=");
        sb2.append(this.f168700f);
        sb2.append(", itemId=");
        sb2.append(this.f168701g);
        sb2.append(", extraInfo=");
        sb2.append(this.f168702h);
        sb2.append(", analyticsExtraParams=");
        return r.w(sb2, this.f168703i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168696b);
        parcel.writeString(this.f168697c);
        parcel.writeString(this.f168698d);
        parcel.writeString(this.f168699e);
        parcel.writeInt(this.f168700f ? 1 : 0);
        Long l12 = this.f168701g;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Map<String, String> map = this.f168702h;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.f168703i;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
