package com.avito.android.gsm_s2b_call_action.impl_module.link;

import Ju.InterfaceC14249c;
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

/* compiled from: GsmS2BCallActionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class GsmS2BCallActionLink extends DeepLink {

    @k
    public static final Parcelable.Creator<GsmS2BCallActionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161281b;

    /* renamed from: c, reason: collision with root package name */
    public final long f161282c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f161283d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f161284e;

    /* compiled from: GsmS2BCallActionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GsmS2BCallActionLink> {
        @Override // android.os.Parcelable.Creator
        public final GsmS2BCallActionLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new GsmS2BCallActionLink(parcel.readLong(), (DeepLink) parcel.readParcelable(GsmS2BCallActionLink.class.getClassLoader()), string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GsmS2BCallActionLink[] newArray(int i12) {
            return new GsmS2BCallActionLink[i12];
        }
    }

    /* compiled from: GsmS2BCallActionLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink$b;", "", "<init>", "()V", "a", "b", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: GsmS2BCallActionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink$b$a;", "LJu/c$a;", "<init>", "()V", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f161285b = new a();
        }

        /* compiled from: GsmS2BCallActionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink$b$b;", "LJu/c$a;", "<init>", "()V", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLink$b$b, reason: collision with other inner class name */
        public static final class C4720b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4720b f161286b = new C4720b();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public GsmS2BCallActionLink(long j12, @l DeepLink deepLink, @k String str, @k String str2) {
        this.f161281b = str;
        this.f161282c = j12;
        this.f161283d = str2;
        this.f161284e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GsmS2BCallActionLink)) {
            return false;
        }
        GsmS2BCallActionLink gsmS2BCallActionLink = (GsmS2BCallActionLink) obj;
        return L.f(this.f161281b, gsmS2BCallActionLink.f161281b) && this.f161282c == gsmS2BCallActionLink.f161282c && L.f(this.f161283d, gsmS2BCallActionLink.f161283d) && L.f(this.f161284e, gsmS2BCallActionLink.f161284e);
    }

    public final int hashCode() {
        int iD2 = H.d(r.g(this.f161281b.hashCode() * 31, 31, this.f161282c), 31, this.f161283d);
        DeepLink deepLink = this.f161284e;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GsmS2BCallActionLink(buyerUserId=");
        sb2.append(this.f161281b);
        sb2.append(", itemId=");
        sb2.append(this.f161282c);
        sb2.append(", source=");
        sb2.append(this.f161283d);
        sb2.append(", onError=");
        DeepLink deepLink = this.f161284e;
        return com.avito.android.actions_sheet.a.t(sb2, deepLink != null ? deepLink.getUri() : null, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161281b);
        parcel.writeLong(this.f161282c);
        parcel.writeString(this.f161283d);
        parcel.writeParcelable(this.f161284e, i12);
    }
}
