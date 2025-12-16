package com.avito.android.analytics.screens.tracker;

import arrow.core.AbstractC23662a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import kj0.C42700a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorDialogTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/q;", "Lcom/avito/android/analytics/screens/tracker/p;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28495q implements InterfaceC28494p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90899a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Screen f90900b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f90901c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f90902d;

    public C28495q(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Screen screen, @Y61.k String str, @Y61.k com.avito.android.remote.analytics.n nVar) {
        this.f90899a = interfaceC28373a;
        this.f90900b = screen;
        this.f90901c = str;
        this.f90902d = nVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28494p
    @Y61.k
    public final C28493o o(@Y61.l AbstractC23662a.b bVar) {
        C34244a c34244aB = bVar != null ? this.f90902d.b(bVar) : null;
        return new C28493o(this.f90901c, c34244aB != null ? c34244aB.f253104c : null);
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28494p
    @Y61.l
    public final C34244a p(@Y61.k String str, @Y61.l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        C34244a c34244aB = abstractC23662a != null ? this.f90902d.b(abstractC23662a) : null;
        this.f90899a.c(new C42700a(z12, str, c34244aB, this.f90900b.f90471b, this.f90901c));
        return c34244aB;
    }
}
