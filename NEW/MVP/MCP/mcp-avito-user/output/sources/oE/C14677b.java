package Oe;

import Y61.k;
import androidx.view.P0;
import com.avito.android.advert_core.advert.l;
import com.avito.android.auto_loans_composite_broker.v1.n;
import com.avito.android.auto_loans_composite_broker.v1.o;
import com.avito.android.auto_loans_composite_broker.v1.p;
import com.avito.android.auto_loans_composite_broker.v1.q;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerV1Module_ProvideViewModel$_avito_auto_loans_composite_broker_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LOe/b;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v1/n;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oe.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14677b implements h<n> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f12441c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<l> f12442a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f12443b;

    /* compiled from: AdvertDetailsCompositeBrokerV1Module_ProvideViewModel$_avito_auto_loans_composite_broker_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/auto_loans_composite_broker/v1/di/AdvertDetailsCompositeBrokerV1Module_ProvideViewModel$_avito_auto_loans_composite_broker_implFactory.Companion", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14677b(@k C14676a c14676a, @k Provider provider, @k p pVar) {
        this.f12442a = provider;
        this.f12443b = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f12442a.get();
        o oVar = (o) this.f12443b.get();
        f12441c.getClass();
        return (n) new P0(lVar.b(), oVar).a(q.class);
    }
}
