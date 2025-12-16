package DF0;

import Y61.k;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import kotlin.Metadata;

/* compiled from: YandexTravelTimeCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDF0/d;", "LDF0/a;", "_avito_travel-time-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DrivingSummarySession f3116a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SummarySession f3117b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SummarySession f3118c;

    public d(@k DrivingSummarySession drivingSummarySession, @k SummarySession summarySession, @k SummarySession summarySession2) {
        this.f3116a = drivingSummarySession;
        this.f3117b = summarySession;
        this.f3118c = summarySession2;
    }

    @Override // DF0.a
    public final void cancel() {
        this.f3116a.cancel();
        this.f3117b.cancel();
        this.f3118c.cancel();
    }
}
