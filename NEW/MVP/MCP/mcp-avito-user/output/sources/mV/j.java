package Mv;

import Lv.C14441a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.delivery_tarifikator.analytics.clickstream.ErrorLevel;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: TarifikatorWarningsTracker.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMv/j;", "LMv/i;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f11090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14533a f11091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f11092c;

    @Inject
    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC14533a interfaceC14533a) {
        this.f11090a = interfaceC28373a;
        this.f11091b = interfaceC14533a;
    }

    @Override // Mv.i
    public final void a(@Y61.k String str) {
        this.f11092c = str;
    }

    @Override // Mv.i
    public final void b() {
        this.f11090a.c(new C14441a(ErrorLevel.f135224c, this.f11091b.a(5, this.f11092c, (60 & 4) != 0 ? null : null, (60 & 8) != 0 ? null : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? null : null)));
    }

    @Override // Mv.i
    public final void c(long j12, @Y61.l Long l12, @Y61.k String str) {
        this.f11090a.c(new C14441a(ErrorLevel.f135224c, this.f11091b.a(2, this.f11092c, (60 & 4) != 0 ? null : l12, (60 & 8) != 0 ? null : Long.valueOf(j12), (60 & 16) != 0 ? null : str, (60 & 32) != 0 ? null : null)));
    }

    @Override // Mv.i
    public final void d(long j12, long j13, @Y61.l Long l12) {
        this.f11090a.c(new C14441a(ErrorLevel.f135224c, this.f11091b.a(4, this.f11092c, (60 & 4) != 0 ? null : l12, (60 & 8) != 0 ? null : Long.valueOf(j12), (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? null : Long.valueOf(j13))));
    }
}
