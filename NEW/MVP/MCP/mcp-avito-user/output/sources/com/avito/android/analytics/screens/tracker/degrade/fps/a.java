package com.avito.android.analytics.screens.tracker.degrade.fps;

import Y41.l;
import Y61.k;
import android.content.SharedPreferences;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.degrade.fps.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DegradeScreenScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/fps/a;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DegradeScrollTestGroup f90814a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public c f90815b;

    /* compiled from: DegradeScreenScroll.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "averageViewAttachmentDuration", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.screens.tracker.degrade.fps.a$a, reason: collision with other inner class name */
    public static final class C2683a extends N implements l<Long, G0> {
        public C2683a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            a aVar = a.this;
            aVar.f90815b = new d(jLongValue, aVar.f90814a, null, 4, null);
            return G0.f406611a;
        }
    }

    public a(@k Screen screen, @k SharedPreferences sharedPreferences, @k DegradeScrollTestGroup degradeScrollTestGroup) {
        c eVar;
        this.f90814a = degradeScrollTestGroup;
        if (degradeScrollTestGroup == DegradeScrollTestGroup.f67806c || degradeScrollTestGroup == DegradeScrollTestGroup.f67807d) {
            eVar = c.b.f90818a;
        } else {
            if (sharedPreferences.contains("average_attachment_length_" + screen.f90471b)) {
                eVar = new d(sharedPreferences.getLong("average_attachment_length_" + screen.f90471b, 0L), degradeScrollTestGroup, null, 4, null);
            } else {
                eVar = new e(screen, sharedPreferences, new C2683a());
            }
        }
        this.f90815b = eVar;
    }
}
