package com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.ChainedDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacEnableDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "LLL/a;", "b", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacEnableDeeplink extends ChainedDeepLink implements LL.a {

    @k
    public static final Parcelable.Creator<IacEnableDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168395b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f168396c;

    /* compiled from: IacEnableDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacEnableDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final IacEnableDeeplink createFromParcel(Parcel parcel) {
            return new IacEnableDeeplink(parcel.readString(), (DeepLink) parcel.readParcelable(IacEnableDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacEnableDeeplink[] newArray(int i12) {
            return new IacEnableDeeplink[i12];
        }
    }

    /* compiled from: IacEnableDeeplink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink$b;", "", "a", "b", "c", "d", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacEnableDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168397b = new a();
        }

        /* compiled from: IacEnableDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink$b$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable.IacEnableDeeplink$b$b, reason: collision with other inner class name */
        public static final class C4979b implements InterfaceC14249c.b {
            static {
                new C4979b();
            }
        }

        /* compiled from: IacEnableDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink$b$c;", "LJu/c$a;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f168398b = new c();
        }

        /* compiled from: IacEnableDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink$b$d;", "LJu/c$b;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f168399b = new d();
        }
    }

    public /* synthetic */ IacEnableDeeplink(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacEnableDeeplink)) {
            return false;
        }
        IacEnableDeeplink iacEnableDeeplink = (IacEnableDeeplink) obj;
        return L.f(this.f168395b, iacEnableDeeplink.f168395b) && L.f(this.f168396c, iacEnableDeeplink.f168396c);
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF168396c() {
        return this.f168396c;
    }

    public final int hashCode() {
        int iHashCode = this.f168395b.hashCode() * 31;
        DeepLink deepLink = this.f168396c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacEnableDeeplink(scenario=");
        sb2.append(this.f168395b);
        sb2.append(", then=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f168396c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168395b);
        parcel.writeParcelable(this.f168396c, i12);
    }

    public IacEnableDeeplink(@k String str, @l DeepLink deepLink) {
        this.f168395b = str;
        this.f168396c = deepLink;
    }
}
