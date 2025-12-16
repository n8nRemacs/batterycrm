package Cy0;

import Dy0.C13461a;
import Hy0.C14049a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerCalendarAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCy0/c;", "LCy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f2814a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f2815b;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar) {
        this.f2814a = interfaceC28373a;
        this.f2815b = aVar;
    }

    @Override // Cy0.b
    public final void a(@k String str) {
        this.f2814a.c(new Dy0.c(str, this.f2815b.a()));
    }

    @Override // Cy0.b
    public final void b(@k String str) {
        this.f2814a.c(new C14049a(str));
    }

    @Override // Cy0.b
    public final void c(@k String str) {
        this.f2814a.c(new Dy0.b(this.f2815b.a(), str));
    }

    @Override // Cy0.b
    public final void d(@k String str) {
        this.f2814a.c(new Dy0.d(str, this.f2815b.a()));
    }

    @Override // Cy0.b
    public final void e(@k String str) {
        this.f2814a.c(new C13461a(str));
    }
}
