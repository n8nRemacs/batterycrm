package com.avito.android.advert.item.geo_distance;

import DF0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.travel_time_calculator.data.TransportType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import x5.InterfaceC49771a;

/* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c;", "", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f75676c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DF0.c f75677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49771a f75678b;

    /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$a;", "LDF0/c$a;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Set<TransportType> f75679c;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Map<TransportType, ? extends b>, G0> f75680a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HashMap<TransportType, b> f75681b = new HashMap<>();

        /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$a$a;", "", "<init>", "()V", "", "Lcom/avito/android/travel_time_calculator/data/TransportType;", "CALCULATING_ROUTE_TYPES", "Ljava/util/Set;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.geo_distance.c$a$a, reason: collision with other inner class name */
        public static final class C2245a {
            public /* synthetic */ C2245a(C42822w c42822w) {
                this();
            }

            public C2245a() {
            }
        }

        /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$a$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/advert/item/geo_distance/c$a$b$a;", "Lcom/avito/android/advert/item/geo_distance/c$a$b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$a$b$a;", "Lcom/avito/android/advert/item/geo_distance/c$a$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advert.item.geo_distance.c$a$b$a, reason: collision with other inner class name */
            public static final class C2246a extends b {

                /* renamed from: a, reason: collision with root package name */
                public final boolean f75682a;

                public C2246a(boolean z12) {
                    super(null);
                    this.f75682a = z12;
                }
            }

            /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$a$b$b;", "Lcom/avito/android/advert/item/geo_distance/c$a$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advert.item.geo_distance.c$a$b$b, reason: collision with other inner class name */
            public static final class C2247b extends b {

                /* renamed from: a, reason: collision with root package name */
                public final long f75683a;

                public C2247b(long j12) {
                    super(null);
                    this.f75683a = j12;
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new C2245a(null);
            f75679c = C42756l.l0(new TransportType[]{TransportType.f303309b, TransportType.f303311d, TransportType.f303310c});
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l<? super Map<TransportType, ? extends b>, G0> lVar) {
            this.f75680a = lVar;
        }

        @Override // DF0.c.a
        public final synchronized void a(@Y61.k TransportType transportType, long j12) {
            this.f75681b.put(transportType, new b.C2247b(j12));
            c();
        }

        @Override // DF0.c.a
        public final synchronized void b(@Y61.k TransportType transportType, boolean z12) {
            this.f75681b.put(transportType, new b.C2246a(z12));
            c();
        }

        public final void c() {
            Set<TransportType> set = f75679c;
            HashMap<TransportType, b> map = this.f75681b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (!map.containsKey((TransportType) it.next())) {
                        return;
                    }
                }
            }
            this.f75680a.invoke(map);
        }
    }

    /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/c$b;", "", "<init>", "()V", "", "ERROR_STATUS_FOR_ANALYTICS", "J", "LARGE_DISTANCE_STATUS_FOR_ANALYTICS", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.geo_distance.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C2248c {
        static {
            int[] iArr = new int[TransportType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransportType transportType = TransportType.f303309b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TransportType transportType2 = TransportType.f303309b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new b(null);
    }

    @Inject
    public c(@Y61.k DF0.c cVar, @Y61.k InterfaceC49771a interfaceC49771a) {
        this.f75677a = cVar;
        this.f75678b = interfaceC49771a;
    }
}
