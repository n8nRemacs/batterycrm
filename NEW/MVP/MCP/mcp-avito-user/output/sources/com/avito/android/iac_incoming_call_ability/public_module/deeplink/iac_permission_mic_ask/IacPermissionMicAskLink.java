package com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacPermissionMicAskLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_permission_mic_ask/IacPermissionMicAskLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacPermissionMicAskLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacPermissionMicAskLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f168401b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168402c;

    /* compiled from: IacPermissionMicAskLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_permission_mic_ask/IacPermissionMicAskLink$a;", "", "<init>", "()V", "", "IAC_CALL_TIME_REQUEST_SCENARIO", "Ljava/lang/String;", "IAC_CANNOT_DISABLE_DIALOG_SCENARIO", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacPermissionMicAskLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacPermissionMicAskLink> {
        @Override // android.os.Parcelable.Creator
        public final IacPermissionMicAskLink createFromParcel(Parcel parcel) {
            return new IacPermissionMicAskLink(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacPermissionMicAskLink[] newArray(int i12) {
            return new IacPermissionMicAskLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public IacPermissionMicAskLink(boolean z12, @k String str) {
        this.f168401b = z12;
        this.f168402c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacPermissionMicAskLink)) {
            return false;
        }
        IacPermissionMicAskLink iacPermissionMicAskLink = (IacPermissionMicAskLink) obj;
        return this.f168401b == iacPermissionMicAskLink.f168401b && L.f(this.f168402c, iacPermissionMicAskLink.f168402c);
    }

    public final int hashCode() {
        return this.f168402c.hashCode() + (Boolean.hashCode(this.f168401b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacPermissionMicAskLink(redirectToSettings=");
        sb2.append(this.f168401b);
        sb2.append(", micAccessScenario=");
        return C22026a.c(sb2, this.f168402c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f168401b ? 1 : 0);
        parcel.writeString(this.f168402c);
    }
}
