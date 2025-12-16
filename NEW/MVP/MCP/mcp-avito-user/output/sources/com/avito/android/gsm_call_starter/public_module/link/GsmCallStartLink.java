package com.avito.android.gsm_call_starter.public_module.link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: GsmCallStartLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_call_starter/public_module/link/GsmCallStartLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gsm-call-starter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class GsmCallStartLink extends DeepLink {

    @k
    public static final Parcelable.Creator<GsmCallStartLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161251b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f161252c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ParametrizedEvent f161253d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f161254e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ParametrizedEvent f161255f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f161256g;

    /* compiled from: GsmCallStartLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GsmCallStartLink> {
        @Override // android.os.Parcelable.Creator
        public final GsmCallStartLink createFromParcel(Parcel parcel) {
            return new GsmCallStartLink(parcel.readString(), (ParametrizedEvent) parcel.readParcelable(GsmCallStartLink.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(GsmCallStartLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(GsmCallStartLink.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(GsmCallStartLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(GsmCallStartLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GsmCallStartLink[] newArray(int i12) {
            return new GsmCallStartLink[i12];
        }
    }

    /* compiled from: GsmCallStartLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gsm_call_starter/public_module/link/GsmCallStartLink$b;", "", "<init>", "()V", "a", "b", "_avito_gsm-call-starter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: GsmCallStartLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gsm_call_starter/public_module/link/GsmCallStartLink$b$a;", "LJu/c$a;", "<init>", "()V", "_avito_gsm-call-starter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f161257b = new a();
        }

        /* compiled from: GsmCallStartLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gsm_call_starter/public_module/link/GsmCallStartLink$b$b;", "LJu/c$a;", "<init>", "()V", "_avito_gsm-call-starter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink$b$b, reason: collision with other inner class name */
        public static final class C4719b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4719b f161258b = new C4719b();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ GsmCallStartLink(String str, ParametrizedEvent parametrizedEvent, ParametrizedEvent parametrizedEvent2, DeepLink deepLink, ParametrizedEvent parametrizedEvent3, DeepLink deepLink2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : parametrizedEvent, (i12 & 4) != 0 ? null : parametrizedEvent2, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : parametrizedEvent3, (i12 & 32) == 0 ? deepLink2 : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GsmCallStartLink)) {
            return false;
        }
        GsmCallStartLink gsmCallStartLink = (GsmCallStartLink) obj;
        return L.f(this.f161251b, gsmCallStartLink.f161251b) && L.f(this.f161252c, gsmCallStartLink.f161252c) && L.f(this.f161253d, gsmCallStartLink.f161253d) && L.f(this.f161254e, gsmCallStartLink.f161254e) && L.f(this.f161255f, gsmCallStartLink.f161255f) && L.f(this.f161256g, gsmCallStartLink.f161256g);
    }

    public final int hashCode() {
        int iHashCode = this.f161251b.hashCode() * 31;
        ParametrizedEvent parametrizedEvent = this.f161252c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent2 = this.f161253d;
        int iHashCode3 = (iHashCode2 + (parametrizedEvent2 == null ? 0 : parametrizedEvent2.hashCode())) * 31;
        DeepLink deepLink = this.f161254e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent3 = this.f161255f;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent3 == null ? 0 : parametrizedEvent3.hashCode())) * 31;
        DeepLink deepLink2 = this.f161256g;
        return iHashCode5 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GsmCallStartLink(phone=");
        sb2.append(this.f161251b);
        sb2.append(", onDialerOpenedEvent=");
        sb2.append(this.f161252c);
        sb2.append(", onDialerUnsupportedEvent=");
        sb2.append(this.f161253d);
        sb2.append(", onDialerUnsupportedLink=");
        sb2.append(this.f161254e);
        sb2.append(", onIacBusyEvent=");
        sb2.append(this.f161255f);
        sb2.append(", onIacBusyLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f161256g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161251b);
        parcel.writeParcelable(this.f161252c, i12);
        parcel.writeParcelable(this.f161253d, i12);
        parcel.writeParcelable(this.f161254e, i12);
        parcel.writeParcelable(this.f161255f, i12);
        parcel.writeParcelable(this.f161256g, i12);
    }

    public GsmCallStartLink(@k String str, @l ParametrizedEvent parametrizedEvent, @l ParametrizedEvent parametrizedEvent2, @l DeepLink deepLink, @l ParametrizedEvent parametrizedEvent3, @l DeepLink deepLink2) {
        this.f161251b = str;
        this.f161252c = parametrizedEvent;
        this.f161253d = parametrizedEvent2;
        this.f161254e = deepLink;
        this.f161255f = parametrizedEvent3;
        this.f161256g = deepLink2;
    }
}
