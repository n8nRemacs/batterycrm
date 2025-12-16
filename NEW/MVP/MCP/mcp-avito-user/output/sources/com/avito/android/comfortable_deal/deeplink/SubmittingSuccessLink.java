package com.avito.android.comfortable_deal.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SubmittingSuccessDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class SubmittingSuccessLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SubmittingSuccessLink> CREATOR = new a();

    /* compiled from: SubmittingSuccessDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubmittingSuccessLink> {
        @Override // android.os.Parcelable.Creator
        public final SubmittingSuccessLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SubmittingSuccessLink();
        }

        @Override // android.os.Parcelable.Creator
        public final SubmittingSuccessLink[] newArray(int i12) {
            return new SubmittingSuccessLink[i12];
        }
    }

    /* compiled from: SubmittingSuccessDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: SubmittingSuccessDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f121889b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2072975142;
            }

            @Y61.k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: SubmittingSuccessDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink$b$b, reason: collision with other inner class name */
        public static final class C3605b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f121890b;

            public C3605b(@Y61.k DeepLink deepLink) {
                super(null);
                this.f121890b = deepLink;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
