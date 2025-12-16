package com.avito.android.analytics.timer;

import CY.j;
import androidx.camera.camera2.internal.G;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AnalyticsTimer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000 \u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Q;", "", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f91109b;

    public c(j jVar) {
        this.f91109b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        int iIntValue = ((Number) q12.f406619b).intValue();
        j jVar = this.f91109b;
        String str = (String) jVar.f2242b.get(q12.f406620c);
        y.c cVar = new y.c(G.f("messenger.", str), Integer.valueOf(iIntValue), null);
        V2.f318762a.c("graphite", "timing: key=" + str + ", time=" + iIntValue, null);
        jVar.f2241a.c(cVar);
    }
}
