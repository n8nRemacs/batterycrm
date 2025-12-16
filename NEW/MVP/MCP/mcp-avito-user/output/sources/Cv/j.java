package cv;

import Cd.D;
import X41.n;
import androidx.view.P0;
import dagger.internal.u;
import gv.InterfaceC40741c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerModule_ProvideCompositeDeeplinkHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcv/j;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/handler/composite/c;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.android.deeplink_handler.handler.composite.c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f393040c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f393041a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f393042b;

    /* compiled from: DeeplinkHandlerModule_ProvideCompositeDeeplinkHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv/j$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k dagger.internal.l lVar, @Y61.k u uVar) {
        this.f393041a = lVar;
        this.f393042b = uVar;
    }

    @n
    @Y61.k
    public static final j a(@Y61.k dagger.internal.l lVar, @Y61.k u uVar) {
        f393040c.getClass();
        return new j(lVar, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40741c interfaceC40741c = (InterfaceC40741c) this.f393041a.f393949a;
        D d12 = (D) this.f393042b.get();
        f393040c.getClass();
        i.f393039a.getClass();
        com.avito.android.deeplink_handler.handler.composite.d dVar = (com.avito.android.deeplink_handler.handler.composite.d) new P0(interfaceC40741c.c(), d12).a(com.avito.android.deeplink_handler.handler.composite.d.class);
        if (!dVar.f134527K.get()) {
            dVar.ke();
        }
        return dVar;
    }
}
