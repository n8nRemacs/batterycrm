package com.avito.android.gig_apply;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: GigSlotRetryDeeplink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotRetryDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigSlotRetryDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigSlotRetryDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159530b;

    /* compiled from: GigSlotRetryDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSlotRetryDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigSlotRetryDeeplink createFromParcel(Parcel parcel) {
            return new GigSlotRetryDeeplink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GigSlotRetryDeeplink[] newArray(int i12) {
            return new GigSlotRetryDeeplink[i12];
        }
    }

    /* compiled from: GigSlotRetryDeeplink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b$a;", "Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b$b;", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: GigSlotRetryDeeplink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b$a;", "Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b;", "LJu/c$b;", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f159531b;

            public a(@k String str) {
                super(null);
                this.f159531b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f159531b, ((a) obj).f159531b);
            }

            public final int hashCode() {
                return this.f159531b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f159531b, ')');
            }
        }

        /* compiled from: GigSlotRetryDeeplink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b$b;", "Lcom/avito/android/gig_apply/GigSlotRetryDeeplink$b;", "LJu/c$b;", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.gig_apply.GigSlotRetryDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4659b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f159532b;

            public C4659b(@k DeepLink deepLink) {
                super(null);
                this.f159532b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4659b) && L.f(this.f159532b, ((C4659b) obj).f159532b);
            }

            public final int hashCode() {
                return this.f159532b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentRetry(deepLink="), this.f159532b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public GigSlotRetryDeeplink(long j12) {
        this.f159530b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f159530b);
    }
}
