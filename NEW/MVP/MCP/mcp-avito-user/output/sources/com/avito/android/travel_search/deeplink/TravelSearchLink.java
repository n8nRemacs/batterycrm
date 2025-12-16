package com.avito.android.travel_search.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParams;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TravelSearchLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/deeplink/TravelSearchLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "TravelSearchFlow", "_avito_travel-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TravelSearchLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TravelSearchLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SearchParams f302770b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TravelSearchFlow f302771c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TravelSearchLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/deeplink/TravelSearchLink$TravelSearchFlow;", "", "a", "_avito_travel-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TravelSearchFlow {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f302772b;

        /* renamed from: c, reason: collision with root package name */
        public static final TravelSearchFlow f302773c;

        /* renamed from: d, reason: collision with root package name */
        public static final TravelSearchFlow f302774d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TravelSearchFlow[] f302775e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f302776f;

        /* compiled from: TravelSearchLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/deeplink/TravelSearchLink$TravelSearchFlow$a;", "", "<init>", "()V", "_avito_travel-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            TravelSearchFlow travelSearchFlow = new TravelSearchFlow("FAVORITES", 0);
            f302773c = travelSearchFlow;
            TravelSearchFlow travelSearchFlow2 = new TravelSearchFlow(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            f302774d = travelSearchFlow2;
            TravelSearchFlow[] travelSearchFlowArr = {travelSearchFlow, travelSearchFlow2};
            f302775e = travelSearchFlowArr;
            f302776f = c.a(travelSearchFlowArr);
            f302772b = new a(null);
        }

        public TravelSearchFlow() {
            throw null;
        }

        public static TravelSearchFlow valueOf(String str) {
            return (TravelSearchFlow) Enum.valueOf(TravelSearchFlow.class, str);
        }

        public static TravelSearchFlow[] values() {
            return (TravelSearchFlow[]) f302775e.clone();
        }
    }

    /* compiled from: TravelSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelSearchLink> {
        @Override // android.os.Parcelable.Creator
        public final TravelSearchLink createFromParcel(Parcel parcel) {
            return new TravelSearchLink((SearchParams) parcel.readParcelable(TravelSearchLink.class.getClassLoader()), parcel.readInt() == 0 ? null : TravelSearchFlow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TravelSearchLink[] newArray(int i12) {
            return new TravelSearchLink[i12];
        }
    }

    public TravelSearchLink(@l SearchParams searchParams, @l TravelSearchFlow travelSearchFlow) {
        this.f302770b = searchParams;
        this.f302771c = travelSearchFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f302770b, i12);
        TravelSearchFlow travelSearchFlow = this.f302771c;
        if (travelSearchFlow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(travelSearchFlow.name());
        }
    }
}
