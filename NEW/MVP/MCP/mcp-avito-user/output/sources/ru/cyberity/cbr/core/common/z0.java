package ru.cyberity.cbr.core.common;

import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: TimeMeasure.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0007\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0014j\b\u0012\u0004\u0012\u00020\u0006`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/common/z0;", "", "<init>", "()V", "", "percentile", "", "a", "(D)J", "Lkotlin/G0;", "b", "Lkotlin/Function0;", "action", "(LY41/a;)J", "f", "()Ljava/lang/Object;", "c", "()J", "e", "d", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "results", "", "Z", "sorted", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ArrayList<Long> results = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean sorted = true;

    private final void b() {
        if (this.sorted) {
            return;
        }
        C42745f0.y0(this.results);
        this.sorted = true;
    }

    public final long a(@Y61.k Y41.a<G0> action) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        action.invoke();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        this.results.add(Long.valueOf(jElapsedRealtime2));
        this.sorted = false;
        return jElapsedRealtime2;
    }

    public final long c() {
        return a(50.0d);
    }

    public final long d() {
        return a(100.0d);
    }

    public final long e() {
        return a(99.0d);
    }

    public final void f() {
        this.results.clear();
        this.sorted = true;
    }

    @Y61.k
    public final Object a() {
        double dM2 = C42745f0.m(this.results);
        Double dValueOf = Double.valueOf(dM2);
        if (Double.isNaN(dM2)) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return -1;
        }
        return dValueOf;
    }

    private final long a(double percentile) {
        b();
        int iA2 = kotlin.math.b.a((percentile / 100.0d) * (this.results.size() - 1));
        ArrayList<Long> arrayList = this.results;
        return ((iA2 < 0 || iA2 > C42745f0.J(arrayList)) ? -1L : arrayList.get(iA2)).longValue();
    }
}
