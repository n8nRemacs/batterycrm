package ep0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiGetForecastsForAutoDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lep0/a;", "", "Lep0/d;", "forecasts", "Lep0/f;", "recommendations", "<init>", "(Lep0/d;Lep0/f;)V", "Lep0/d;", "a", "()Lep0/d;", "Lep0/f;", "b", "()Lep0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ep0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40143a {

    @com.google.gson.annotations.c("forecasts")
    @k
    private final d forecasts;

    @com.google.gson.annotations.c("recommendations")
    @k
    private final f recommendations;

    public C40143a(@k d dVar, @k f fVar) {
        this.forecasts = dVar;
        this.recommendations = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final d getForecasts() {
        return this.forecasts;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final f getRecommendations() {
        return this.recommendations;
    }
}
