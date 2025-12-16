package com.avito.android.iac_outgoing_call_ability.public_module.deep_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacMakeCallInChannelMenuLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeCallInChannelMenuLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacMakeCallInChannelMenuLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacMakeCallInChannelMenuLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IacCallInfo f168686b;

    /* compiled from: IacMakeCallInChannelMenuLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacMakeCallInChannelMenuLink> {
        @Override // android.os.Parcelable.Creator
        public final IacMakeCallInChannelMenuLink createFromParcel(Parcel parcel) {
            return new IacMakeCallInChannelMenuLink((IacCallInfo) parcel.readParcelable(IacMakeCallInChannelMenuLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacMakeCallInChannelMenuLink[] newArray(int i12) {
            return new IacMakeCallInChannelMenuLink[i12];
        }
    }

    /* compiled from: IacMakeCallInChannelMenuLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeCallInChannelMenuLink$b;", "", "<init>", "()V", "a", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacMakeCallInChannelMenuLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeCallInChannelMenuLink$b$a;", "LJu/c$a;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168687b = new a();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacMakeCallInChannelMenuLink(@k IacCallInfo iacCallInfo) {
        this.f168686b = iacCallInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacMakeCallInChannelMenuLink) && L.f(this.f168686b, ((IacMakeCallInChannelMenuLink) obj).f168686b);
    }

    public final int hashCode() {
        return this.f168686b.hashCode();
    }

    @k
    public final String toString() {
        return "IacMakeCallInChannelMenuLink(callInfo=" + this.f168686b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f168686b, i12);
    }
}
