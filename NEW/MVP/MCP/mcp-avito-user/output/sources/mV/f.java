package Mv;

import Lv.C14441a;
import Pv.AbstractC14843b;
import Pv.C14842a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.delivery_tarifikator.analytics.clickstream.ErrorLevel;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TarifikatorErrorsTracker.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMv/f;", "LMv/e;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f11084a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14533a f11085b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f11086c;

    @Inject
    public f(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC14533a interfaceC14533a) {
        this.f11084a = interfaceC28373a;
        this.f11085b = interfaceC14533a;
    }

    @Override // Mv.e
    public final void a(@Y61.k String str) {
        this.f11086c = str;
    }

    @Override // Mv.e
    public final void b(@Y61.k Throwable th2) {
        C14441a c14441a;
        if (th2 instanceof AbstractC14843b) {
            AbstractC14843b abstractC14843b = (AbstractC14843b) th2;
            if (abstractC14843b instanceof C14842a) {
                C14842a c14842a = (C14842a) abstractC14843b;
                c14441a = new C14441a(ErrorLevel.f135225d, this.f11085b.a(0, this.f11086c, (60 & 4) != 0 ? null : null, (60 & 8) != 0 ? null : c14842a.f13366b, (60 & 16) != 0 ? null : c14842a.f13367c, (60 & 32) != 0 ? null : null));
            } else if (abstractC14843b instanceof Pv.c) {
                c14441a = new C14441a(ErrorLevel.f135225d, this.f11085b.a(1, this.f11086c, (60 & 4) != 0 ? null : ((Pv.c) abstractC14843b).f13368b, (60 & 8) != 0 ? null : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? null : null));
            } else {
                if (!(abstractC14843b instanceof Pv.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pv.d dVar = (Pv.d) abstractC14843b;
                c14441a = new C14441a(ErrorLevel.f135225d, this.f11085b.a(3, this.f11086c, (60 & 4) != 0 ? null : dVar.f13369b, (60 & 8) != 0 ? null : dVar.f13370c, (60 & 16) != 0 ? null : dVar.f13371d, (60 & 32) != 0 ? null : null));
            }
            this.f11084a.c(c14441a);
        }
    }
}
