package com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request;

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

/* compiled from: IacCallSilentRequestDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacCallSilentRequestDeeplink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCallSilentRequestDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168391b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168392c;

    /* compiled from: IacCallSilentRequestDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCallSilentRequestDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final IacCallSilentRequestDeeplink createFromParcel(Parcel parcel) {
            return new IacCallSilentRequestDeeplink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallSilentRequestDeeplink[] newArray(int i12) {
            return new IacCallSilentRequestDeeplink[i12];
        }
    }

    /* compiled from: IacCallSilentRequestDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b;", "", "a", "b", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b$a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b$b;", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacCallSilentRequestDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b$a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168393b = new a();
        }

        /* compiled from: IacCallSilentRequestDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b$b;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink$b$b, reason: collision with other inner class name */
        public static final class C4978b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4978b f168394b = new C4978b();
        }
    }

    public IacCallSilentRequestDeeplink(@k String str, @k String str2) {
        this.f168391b = str;
        this.f168392c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallSilentRequestDeeplink)) {
            return false;
        }
        IacCallSilentRequestDeeplink iacCallSilentRequestDeeplink = (IacCallSilentRequestDeeplink) obj;
        return L.f(this.f168391b, iacCallSilentRequestDeeplink.f168391b) && L.f(this.f168392c, iacCallSilentRequestDeeplink.f168392c);
    }

    public final int hashCode() {
        return this.f168392c.hashCode() + (this.f168391b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallSilentRequestDeeplink(itemId=");
        sb2.append(this.f168391b);
        sb2.append(", userId=");
        return C22026a.c(sb2, this.f168392c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168391b);
        parcel.writeString(this.f168392c);
    }
}
