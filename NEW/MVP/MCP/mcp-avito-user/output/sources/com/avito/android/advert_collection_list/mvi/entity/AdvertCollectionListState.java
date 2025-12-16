package com.avito.android.advert_collection_list.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.AdvertCollectionSkeletonItem;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionListState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionListState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f82219b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82220c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f82221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f82217e = new a(null);

    @k
    public static final Parcelable.Creator<AdvertCollectionListState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final AdvertCollectionListState f82218f = new AdvertCollectionListState(Collections.singletonList(new AdvertCollectionSkeletonItem(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0)), false, null);

    /* compiled from: AdvertCollectionListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState$a;", "", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertCollectionListState> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionListState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertCollectionListState.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertCollectionListState(arrayList, parcel.readInt() != 0, (DeepLink) parcel.readParcelable(AdvertCollectionListState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionListState[] newArray(int i12) {
            return new AdvertCollectionListState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertCollectionListState(@k List<? extends ParcelableItem> list, boolean z12, @l DeepLink deepLink) {
        this.f82219b = list;
        this.f82220c = z12;
        this.f82221d = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AdvertCollectionListState a(AdvertCollectionListState advertCollectionListState, ArrayList arrayList, boolean z12, DeepLink deepLink, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = advertCollectionListState.f82219b;
        }
        if ((i12 & 2) != 0) {
            z12 = advertCollectionListState.f82220c;
        }
        if ((i12 & 4) != 0) {
            deepLink = advertCollectionListState.f82221d;
        }
        advertCollectionListState.getClass();
        return new AdvertCollectionListState(list, z12, deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionListState)) {
            return false;
        }
        AdvertCollectionListState advertCollectionListState = (AdvertCollectionListState) obj;
        return L.f(this.f82219b, advertCollectionListState.f82219b) && this.f82220c == advertCollectionListState.f82220c && L.f(this.f82221d, advertCollectionListState.f82221d);
    }

    public final int hashCode() {
        int i12 = r.i(this.f82219b.hashCode() * 31, 31, this.f82220c);
        DeepLink deepLink = this.f82221d;
        return i12 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionListState(item=");
        sb2.append(this.f82219b);
        sb2.append(", swipeToRefreshIsShown=");
        sb2.append(this.f82220c);
        sb2.append(", newCreationFlowDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f82221d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f82219b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f82220c ? 1 : 0);
        parcel.writeParcelable(this.f82221d, i12);
    }
}
