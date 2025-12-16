package com.avito.android.analytics.screens.tracker.trace;

import Y61.k;
import android.os.Build;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.trace.c;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenSystemTracingTrackerProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/trace/e;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f90921a = new LinkedHashMap();

    @Inject
    public e() {
    }

    public static c a(e eVar, Screen screen, g gVar, String str, int i12) {
        if ((i12 & 4) != 0) {
            str = "";
        }
        boolean z12 = (i12 & 8) != 0;
        eVar.getClass();
        if (Build.VERSION.SDK_INT <= 29) {
            return c.a.f90916a;
        }
        String str2 = screen.f90471b;
        int iHashCode = (str.hashCode() * 31) + (gVar.f90922a.hashCode() * 31) + (str2.hashCode() * 31);
        if (!z12) {
            return new d(str2, gVar, str);
        }
        LinkedHashMap linkedHashMap = eVar.f90921a;
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object dVar = linkedHashMap.get(numValueOf);
        if (dVar == null) {
            dVar = new d(str2, gVar, str);
            linkedHashMap.put(numValueOf, dVar);
        }
        return (c) dVar;
    }
}
