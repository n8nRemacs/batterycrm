package Rx;

import Sx.C15248a;
import Sx.C15249b;
import Sx.C15250c;
import Sx.d;
import Sx.e;
import Sx.f;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertAnalytics.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRx/a;", "Lcom/avito/android/early_access_advert/a;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15091a implements com.avito.android.early_access_advert.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f14751a;

    @Inject
    public C15091a(@k InterfaceC28373a interfaceC28373a) {
        this.f14751a = interfaceC28373a;
    }

    @Override // com.avito.android.early_access_advert.a
    public final void a(int i12, @k String str) {
        this.f14751a.c(new C15248a(i12, str));
    }

    @Override // com.avito.android.early_access_advert.a
    public final void b(int i12) {
        this.f14751a.c(new C15249b(i12));
    }

    @Override // com.avito.android.early_access_advert.a
    public final void c() {
        this.f14751a.c(new e());
    }

    @Override // com.avito.android.early_access_advert.a
    public final void d(@k String str) {
        this.f14751a.c(new f(str));
    }

    @Override // com.avito.android.early_access_advert.a
    public final void e() {
        this.f14751a.c(new d());
    }

    @Override // com.avito.android.early_access_advert.a
    public final void f() {
        this.f14751a.c(new C15250c());
    }
}
