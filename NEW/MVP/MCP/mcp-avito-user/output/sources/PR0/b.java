package Pr0;

import Qr0.C14927a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryVerticalFilterAnalyticsTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPr0/b;", "LPr0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14832a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f13340a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f13340a = interfaceC28373a;
    }

    @Override // Pr0.InterfaceC14832a
    public final void a() {
        this.f13340a.c(new C14927a());
    }
}
