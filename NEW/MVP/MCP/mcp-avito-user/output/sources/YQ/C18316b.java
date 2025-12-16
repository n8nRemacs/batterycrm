package Yq;

import Y61.k;
import Zq.C19589a;
import Zq.C19590b;
import Zq.C19591c;
import Zq.C19592d;
import Zq.C19593e;
import Zq.C19594f;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsEventInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYq/b;", "LYq/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18316b implements InterfaceC18315a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19696a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f19697b;

    @Inject
    public C18316b(long j12, @k InterfaceC28373a interfaceC28373a) {
        this.f19696a = j12;
        this.f19697b = interfaceC28373a;
    }

    @Override // Yq.InterfaceC18315a
    public final void a(boolean z12) {
        this.f19697b.c(new C19592d(this.f19696a, z12 ? "open" : HiddenParameter.TYPE));
    }

    @Override // Yq.InterfaceC18315a
    public final void b(@k String str) {
        this.f19697b.c(new C19589a(this.f19696a, str));
    }

    @Override // Yq.InterfaceC18315a
    public final void c(@k String str) {
        this.f19697b.c(new C19590b(this.f19696a, str));
    }

    @Override // Yq.InterfaceC18315a
    public final void d(int i12) {
        this.f19697b.c(new C19594f(this.f19696a, i12));
    }

    @Override // Yq.InterfaceC18315a
    public final void e(@k String str) {
        this.f19697b.c(new C19593e(this.f19696a, str));
    }

    @Override // Yq.InterfaceC18315a
    public final void f(@k String str) {
        this.f19697b.c(new C19591c(this.f19696a, str));
    }
}
