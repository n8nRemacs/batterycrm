package Nv;

import Y61.k;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: DeliveryTarifikatorLinkHandlerModule_ProvideDeliveryTarifikatorLinkMapperFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNv/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11805b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f11806a;

    /* compiled from: DeliveryTarifikatorLinkHandlerModule_ProvideDeliveryTarifikatorLinkMapperFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k d dVar) {
        this.f11806a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f11806a;
        f11805b.getClass();
        b.f11804a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DeliveryTarifikatorLink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}
