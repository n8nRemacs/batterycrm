package SI0;

import Y61.k;
import com.avito.android.seller_coach.adverts_hint.view.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yq0.InterfaceC50281a;
import zq0.AbstractC50612a;

/* compiled from: ShortAdvicesBindings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSI0/b;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements f.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC50612a f14892a;

    public b(AbstractC50612a abstractC50612a) {
        this.f14892a = abstractC50612a;
    }

    public final void a(@k f.a aVar) {
        InterfaceC50281a dVar;
        if (aVar instanceof f.a.C7984a) {
            dVar = new InterfaceC50281a.C12919a(((f.a.C7984a) aVar).f267334a);
        } else if (aVar instanceof f.a.b) {
            dVar = new InterfaceC50281a.d(((f.a.b) aVar).f267335a);
        } else {
            if (!(aVar instanceof f.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = InterfaceC50281a.e.f443509a;
        }
        this.f14892a.accept(dVar);
    }
}
