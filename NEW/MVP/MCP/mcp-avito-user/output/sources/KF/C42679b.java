package kf;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.squareup.anvil.annotations.ContributesBinding;
import hc.C40911a;
import hc.C40912b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AutoSelectBookingAnalyticsInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkf/b;", "Lkf/a;", "_avito_auto-select-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42679b implements InterfaceC42678a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f406525a;

    @Inject
    public C42679b(@k InterfaceC28373a interfaceC28373a) {
        this.f406525a = interfaceC28373a;
    }

    @Override // kf.InterfaceC42678a
    public final void a(@k String str, @k String str2) {
        C40912b.f397290g.getClass();
        this.f406525a.c(C40912b.a.a(str, str2, null));
    }

    @Override // kf.InterfaceC42678a
    public final void b(@k String str, @k String str2) {
        C40911a.f397284g.getClass();
        this.f406525a.c(new C40911a(FromPage.f90014d, str2, str, null));
    }
}
