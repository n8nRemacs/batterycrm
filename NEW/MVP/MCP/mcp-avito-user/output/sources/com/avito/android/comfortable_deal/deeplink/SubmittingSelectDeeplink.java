package com.avito.android.comfortable_deal.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SubmittingSelectDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class SubmittingSelectDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SubmittingSelectDeeplink> CREATOR = new a();

    /* compiled from: SubmittingSelectDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubmittingSelectDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final SubmittingSelectDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SubmittingSelectDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final SubmittingSelectDeeplink[] newArray(int i12) {
            return new SubmittingSelectDeeplink[i12];
        }
    }

    /* compiled from: SubmittingSelectDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$c;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: SubmittingSelectDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f121886b;

            public a(@Y61.k String str) {
                super(null);
                this.f121886b = str;
            }
        }

        /* compiled from: SubmittingSelectDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3604b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3604b f121887b = new C3604b();

            public C3604b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C3604b);
            }

            public final int hashCode() {
                return 170038806;
            }

            @Y61.k
            public final String toString() {
                return "CancelWithoutResult";
            }
        }

        /* compiled from: SubmittingSelectDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b$c;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSelectDeeplink$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f121888b;

            public c(@Y61.k DeepLink deepLink) {
                super(null);
                this.f121888b = deepLink;
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
