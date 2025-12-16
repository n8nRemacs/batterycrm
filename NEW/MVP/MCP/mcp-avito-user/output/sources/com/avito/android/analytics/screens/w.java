package com.avito.android.analytics.screens;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28500w;
import com.avito.android.analytics.screens.tracker.C28502y;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ScreenTransferRecovery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/w;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface w {

    /* compiled from: ScreenTransferRecovery.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/w$a;", "Lcom/avito/android/analytics/screens/w;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC28481c f91011a;

        @Inject
        public a(@Y61.k InterfaceC28481c interfaceC28481c) {
            this.f91011a = interfaceC28481c;
        }

        @Override // com.avito.android.analytics.screens.w
        public final void b(@Y61.k ScreenTransfer screenTransfer, @Y61.k Screen screen, @Y61.k r rVar) {
            H.c cVar = new H.c("preload", false);
            com.avito.android.analytics.screens.tracker.K kB2 = this.f91011a.b(screen, rVar);
            long j12 = screenTransfer.f90789b;
            if (j12 != -1) {
                ((C28500w) kB2.b(cVar)).a(j12);
            }
            if (screenTransfer.f90790c != -1) {
                InterfaceC28489k.a.a(((q) kB2.a()).e("preload"), null, J.b.f90385a, screenTransfer.f90790c, 1);
            }
            long j13 = screenTransfer.f90791d;
            if (j13 != -1) {
                ((C28502y) kB2.c(cVar)).b(j13);
            }
        }
    }

    void b(@Y61.k ScreenTransfer screenTransfer, @Y61.k Screen screen, @Y61.k r rVar);
}
