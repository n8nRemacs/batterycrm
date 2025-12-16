package zu0;

import X41.n;
import Y61.k;
import com.avito.android.service_order_widget.link.SendServiceOrderRequestOldLink;
import com.avito.android.service_order_widget.link.l;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: SendServiceOrderRequestLinkMappingModule_ProvideSendServiceOrderRequestOldLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzu0/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50631c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f444335b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f444336a;

    /* compiled from: SendServiceOrderRequestLinkMappingModule_ProvideSendServiceOrderRequestOldLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzu0/c$a;", "", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zu0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k l lVar) {
            C50629a.f444332a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(SendServiceOrderRequestOldLink.class, new SendServiceOrderRequestOldLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SendServiceOrderRequestOldLink.class), lVar));
        }

        public a() {
        }
    }

    public C50631c(@k l lVar) {
        this.f444336a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f444336a;
        f444335b.getClass();
        return a.a(lVar);
    }
}
