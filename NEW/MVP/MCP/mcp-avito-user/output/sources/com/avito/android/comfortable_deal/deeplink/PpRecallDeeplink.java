package com.avito.android.comfortable_deal.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: PpRecallDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PpRecallDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PpRecallDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f121881b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f121882c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f121883d;

    /* compiled from: PpRecallDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PpRecallDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final PpRecallDeeplink createFromParcel(Parcel parcel) {
            return new PpRecallDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PpRecallDeeplink[] newArray(int i12) {
            return new PpRecallDeeplink[i12];
        }
    }

    /* compiled from: PpRecallDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: PpRecallDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f121884b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: PpRecallDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink$b$b, reason: collision with other inner class name */
        public static final class C3603b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3603b f121885b = new C3603b();

            public C3603b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ PpRecallDeeplink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PpRecallDeeplink)) {
            return false;
        }
        PpRecallDeeplink ppRecallDeeplink = (PpRecallDeeplink) obj;
        return L.f(this.f121881b, ppRecallDeeplink.f121881b) && L.f(this.f121882c, ppRecallDeeplink.f121882c) && L.f(this.f121883d, ppRecallDeeplink.f121883d);
    }

    public final int hashCode() {
        String str = this.f121881b;
        int iD2 = androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f121882c);
        String str2 = this.f121883d;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PpRecallDeeplink(itemId=");
        sb2.append(this.f121881b);
        sb2.append(", phone=");
        sb2.append(this.f121882c);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f121883d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f121881b);
        parcel.writeString(this.f121882c);
        parcel.writeString(this.f121883d);
    }

    public PpRecallDeeplink(@Y61.l String str, @Y61.k String str2, @Y61.l String str3) {
        this.f121881b = str;
        this.f121882c = str2;
        this.f121883d = str3;
    }
}
