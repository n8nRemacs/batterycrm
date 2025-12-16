package zq0;

import Y61.k;
import com.avito.android.seller_coach.adverts_hint.mvi.o;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import uq0.C49099a;
import zq0.AbstractC50612a;

/* compiled from: ShortAdvicesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzq0/b;", "Lzq0/a$a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50613b implements AbstractC50612a.InterfaceC12979a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o.a f444301a;

    @Inject
    public C50613b(@k o.a aVar) {
        this.f444301a = aVar;
    }

    @Override // zq0.AbstractC50612a.InterfaceC12979a
    @k
    public final C50615d a(@k C49099a c49099a) {
        o.a aVar = this.f444301a;
        R0 r02 = aVar.f267314d;
        return new C50615d(new o(c49099a, aVar.f267311a, aVar.f267312b, aVar.f267313c, r02, null), null, 2, null);
    }
}
