package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.xc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39242xc extends AbstractC39184v2<Location> {

    /* renamed from: d, reason: collision with root package name */
    public static final long f382184d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e, reason: collision with root package name */
    public static final List<String> f382185e = Arrays.asList("gps", "network");

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private a f382186c;

    /* renamed from: com.yandex.metrica.impl.ob.xc$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f382187a;

        public a(long j12, long j13, long j14) {
            this.f382187a = j12;
        }
    }

    public C39242xc(@j.P Ph ph2) {
        this(new a(f382184d, 200L, 50L), ph2 != null ? ph2.f379215c : G.f378154e.f378346c, (ph2 != null ? ph2.f379215c : G.f378154e.f378346c) * 2);
    }

    @Override // com.yandex.metrica.impl.ob.G0
    public boolean a(@j.N Object obj) {
        Location location = (Location) obj;
        return f382185e.contains(location.getProvider()) && (this.f378159a.b() || this.f378159a.d() || a(location, (Location) this.f378159a.a()));
    }

    @Override // com.yandex.metrica.impl.ob.G0
    public long b(@j.N Ph ph2) {
        return ph2.f379215c;
    }

    @Override // com.yandex.metrica.impl.ob.G0
    public long a(@j.N Ph ph2) {
        return ph2.f379215c * 2;
    }

    @j.k0
    public C39242xc(@j.N a aVar, long j12, long j13) {
        super(j12, j13);
        this.f382186c = aVar;
    }

    private boolean a(@j.P Location location, @j.P Location location2) {
        boolean zEquals;
        long j12 = this.f382186c.f382187a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z12 = time > j12;
        boolean z13 = time < (-j12);
        boolean z14 = time > 0;
        if (z12) {
            return true;
        }
        if (!z13) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z15 = accuracy > 0;
            boolean z16 = accuracy < 0;
            boolean z17 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                zEquals = provider2 == null;
            } else {
                zEquals = provider.equals(provider2);
            }
            if (z16) {
                return true;
            }
            if (z14 && !z15) {
                return true;
            }
            if (z14 && !z17 && zEquals) {
                return true;
            }
        }
        return false;
    }
}
