package Dp;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Dp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13429b implements TemporalQuery {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3460a;

    @Override // java.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f3460a) {
            case 0:
                return Instant.from(temporalAccessor);
            default:
                return ZoneOffset.from(temporalAccessor);
        }
    }
}
