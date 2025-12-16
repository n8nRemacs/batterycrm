package com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_voip_call_request;

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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacVoipCallRequestDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacVoipCallRequestDeeplink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacVoipCallRequestDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168405c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f168406d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f168407e;

    /* compiled from: IacVoipCallRequestDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacVoipCallRequestDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final IacVoipCallRequestDeeplink createFromParcel(Parcel parcel) {
            return new IacVoipCallRequestDeeplink(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(IacVoipCallRequestDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacVoipCallRequestDeeplink[] newArray(int i12) {
            return new IacVoipCallRequestDeeplink[i12];
        }
    }

    /* compiled from: IacVoipCallRequestDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b$a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b$b;", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacVoipCallRequestDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b$a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b;", "LJu/c$b;", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Failure(error=null)";
            }
        }

        /* compiled from: IacVoipCallRequestDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b$b;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_voip_call_request.IacVoipCallRequestDeeplink$b$b, reason: collision with other inner class name */
        public static final class C4980b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4980b f168408b = new C4980b();

            public C4980b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacVoipCallRequestDeeplink(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f168404b = str;
        this.f168405c = str2;
        this.f168406d = str3;
        this.f168407e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacVoipCallRequestDeeplink)) {
            return false;
        }
        IacVoipCallRequestDeeplink iacVoipCallRequestDeeplink = (IacVoipCallRequestDeeplink) obj;
        return L.f(this.f168404b, iacVoipCallRequestDeeplink.f168404b) && L.f(this.f168405c, iacVoipCallRequestDeeplink.f168405c) && L.f(this.f168406d, iacVoipCallRequestDeeplink.f168406d) && L.f(this.f168407e, iacVoipCallRequestDeeplink.f168407e);
    }

    public final int hashCode() {
        return this.f168407e.hashCode() + H.d(H.d(this.f168404b.hashCode() * 31, 31, this.f168405c), 31, this.f168406d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacVoipCallRequestDeeplink(askForCallType=");
        sb2.append(this.f168404b);
        sb2.append(", itemId=");
        sb2.append(this.f168405c);
        sb2.append(", userId=");
        sb2.append(this.f168406d);
        sb2.append(", successUri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f168407e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168404b);
        parcel.writeString(this.f168405c);
        parcel.writeString(this.f168406d);
        parcel.writeParcelable(this.f168407e, i12);
    }
}
