package qU;

import Y61.k;
import com.avito.beduin.v2.repository.cart.items.interactions.a;
import com.avito.beduin.v2.repository.cart.items.interactions.c;
import com.avito.beduin.v2.repository.cart.items.interactions.e;
import com.avito.beduin.v2.repository.cart.items.interactions.h;
import com.avito.beduin.v2.repository.cart.items.interactions.j;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: CartItemsRepositoryInteractionModule_ProvideInteractionFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LqU/c;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qU.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47343c implements h<Set<dU0.c>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C47343c f429281a = new C47343c();

    @Override // javax.inject.Provider
    public final Object get() {
        C47342b.f429280a.getClass();
        Set setL0 = C42756l.l0(new dU0.c[]{c.a.f338137b, j.a.f338152b, h.a.f338149b, a.C10476a.f338134b, e.a.f338139b});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
