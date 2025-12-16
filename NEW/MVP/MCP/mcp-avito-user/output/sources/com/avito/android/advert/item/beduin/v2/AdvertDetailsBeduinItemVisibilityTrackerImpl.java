package com.avito.android.advert.item.beduin.v2;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.G;
import com.avito.android.util.R0;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/AdvertDetailsBeduinItemVisibilityTrackerImpl;", "Lcom/avito/android/advert/item/beduin/v2/b;", "a", "FilterTrackInfo", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsBeduinItemVisibilityTrackerImpl implements com.avito.android.advert.item.beduin.v2.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<WV0.a> f73256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f73257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42770s0 f73258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C43238h f73259d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public RecyclerView f73260e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f73261f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HashMap<Long, List<FilterTrackInfo>> f73262g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Rect f73263h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Rect f73264i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.beduin.v2.c f73265j;

    /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/AdvertDetailsBeduinItemVisibilityTrackerImpl$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final R0 f73273a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f73274b = new ArrayList();

        public a(@Y61.l Bundle bundle, @Y61.k R0 r02) {
            this.f73273a = r02;
        }

        @Y61.k
        public final void a(@Y61.k WV0.a aVar) {
            this.f73274b.add(aVar);
        }
    }

    /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWV0/a;", "it", "", "invoke", "(LWV0/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<WV0.a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.InterfaceC10495b f73275l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.InterfaceC10495b interfaceC10495b) {
            super(1);
            this.f73275l = interfaceC10495b;
        }

        @Override // Y41.l
        public final Boolean invoke(WV0.a aVar) {
            return Boolean.valueOf(aVar.a(this.f73275l));
        }
    }

    /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWV0/a;", "it", "Lcom/avito/android/advert/item/beduin/v2/AdvertDetailsBeduinItemVisibilityTrackerImpl$FilterTrackInfo;", "invoke", "(LWV0/a;)Lcom/avito/android/advert/item/beduin/v2/AdvertDetailsBeduinItemVisibilityTrackerImpl$FilterTrackInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<WV0.a, FilterTrackInfo> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f73276l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final FilterTrackInfo invoke(WV0.a aVar) {
            WV0.a aVar2 = aVar;
            FilterTrackInfo filterTrackInfo = new FilterTrackInfo(aVar2.getClass(), false, false, 0L, 0L, 30, null);
            filterTrackInfo.f73271g = aVar2;
            return filterTrackInfo;
        }
    }

    public AdvertDetailsBeduinItemVisibilityTrackerImpl() {
        throw null;
    }

    public AdvertDetailsBeduinItemVisibilityTrackerImpl(List list, R0 r02, C42822w c42822w) {
        this.f73256a = list;
        this.f73257b = r02;
        this.f73258c = new C42770s0(list);
        this.f73262g = new HashMap<>();
        this.f73263h = new Rect();
        this.f73264i = new Rect();
        this.f73265j = new com.avito.android.advert.item.beduin.v2.c(this);
    }

    @Override // com.avito.android.advert.item.beduin.v2.b
    public final void a() {
        RecyclerView recyclerView = this.f73260e;
        if (recyclerView != null) {
            recyclerView.v0(this.f73265j);
            this.f73260e = null;
            C43238h c43238h = this.f73259d;
            if (c43238h != null) {
                U.b(c43238h, null);
            }
            this.f73259d = null;
        }
    }

    @Override // com.avito.android.advert.item.beduin.v2.b
    public final void b(@Y61.k RecyclerView recyclerView) {
        if (recyclerView == this.f73260e) {
            return;
        }
        a();
        this.f73259d = U.a(this.f73257b.b().plus(t1.b()));
        this.f73260e = recyclerView;
        this.f73263h.set(recyclerView.getLeft(), recyclerView.getTop(), recyclerView.getRight(), recyclerView.getBottom());
        recyclerView.o(this.f73265j);
        c(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.recyclerview.widget.RecyclerView r27) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.beduin.v2.AdvertDetailsBeduinItemVisibilityTrackerImpl.c(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // com.avito.android.advert.item.beduin.v2.b
    @Y61.k
    public final Bundle d0() {
        Bundle bundle = new Bundle();
        for (Map.Entry<Long, List<FilterTrackInfo>> entry : this.f73262g.entrySet()) {
            G.e(String.valueOf(entry.getKey().longValue()), bundle, entry.getValue());
        }
        return bundle;
    }

    /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/AdvertDetailsBeduinItemVisibilityTrackerImpl$FilterTrackInfo;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class FilterTrackInfo implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<FilterTrackInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<WV0.a> f73266b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f73267c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f73268d;

        /* renamed from: e, reason: collision with root package name */
        public long f73269e;

        /* renamed from: f, reason: collision with root package name */
        public long f73270f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public WV0.a f73271g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public N0 f73272h;

        /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FilterTrackInfo> {
            @Override // android.os.Parcelable.Creator
            public final FilterTrackInfo createFromParcel(Parcel parcel) {
                return new FilterTrackInfo((Class) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final FilterTrackInfo[] newArray(int i12) {
                return new FilterTrackInfo[i12];
            }
        }

        public FilterTrackInfo(@Y61.k Class<WV0.a> cls, boolean z12, boolean z13, long j12, long j13) {
            this.f73266b = cls;
            this.f73267c = z12;
            this.f73268d = z13;
            this.f73269e = j12;
            this.f73270f = j13;
        }

        public final void c() {
            this.f73268d = false;
            WV0.a aVar = this.f73271g;
            if (aVar == null || !aVar.f17930a) {
                this.f73269e = 0L;
                this.f73270f = 0L;
            } else {
                this.f73270f = System.currentTimeMillis();
            }
            N0 n02 = this.f73272h;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterTrackInfo)) {
                return false;
            }
            FilterTrackInfo filterTrackInfo = (FilterTrackInfo) obj;
            return L.f(this.f73266b, filterTrackInfo.f73266b) && this.f73267c == filterTrackInfo.f73267c && this.f73268d == filterTrackInfo.f73268d && this.f73269e == filterTrackInfo.f73269e && this.f73270f == filterTrackInfo.f73270f;
        }

        public final int hashCode() {
            return Long.hashCode(this.f73270f) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f73266b.hashCode() * 31, 31, this.f73267c), 31, this.f73268d), 31, this.f73269e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FilterTrackInfo(visibilityFilterClass=");
            sb2.append(this.f73266b);
            sb2.append(", tracked=");
            sb2.append(this.f73267c);
            sb2.append(", localTracked=");
            sb2.append(this.f73268d);
            sb2.append(", startTrackTime=");
            sb2.append(this.f73269e);
            sb2.append(", pausedTrackTime=");
            return androidx.appcompat.app.r.u(sb2, this.f73270f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f73266b);
            parcel.writeInt(this.f73267c ? 1 : 0);
            parcel.writeInt(this.f73268d ? 1 : 0);
            parcel.writeLong(this.f73269e);
            parcel.writeLong(this.f73270f);
        }

        public /* synthetic */ FilterTrackInfo(Class cls, boolean z12, boolean z13, long j12, long j13, int i12, C42822w c42822w) {
            this(cls, (i12 & 2) != 0 ? false : z12, (i12 & 4) == 0 ? z13 : false, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) == 0 ? j13 : 0L);
        }
    }
}
