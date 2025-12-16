package Pe;

import Y61.k;
import androidx.view.P0;
import com.avito.android.advert_core.advert.l;
import com.avito.android.auto_loans_composite_broker.v2.C;
import com.avito.android.auto_loans_composite_broker.v2.D;
import com.avito.android.auto_loans_composite_broker.v2.E;
import com.avito.android.auto_loans_composite_broker.v2.F;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerV2Module_ProvideViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPe/b;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v2/C;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pe.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14776b implements h<C> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f13187c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<l> f13188a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f13189b;

    /* compiled from: AdvertDetailsCompositeBrokerV2Module_ProvideViewModelFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe/b$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14776b(@k C14775a c14775a, @k Provider provider, @k E e12) {
        this.f13188a = provider;
        this.f13189b = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f13188a.get();
        D d12 = (D) this.f13189b.get();
        f13187c.getClass();
        return (C) new P0(lVar.b(), d12).a(F.class);
    }
}
