package Cu0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderWidgetItemPromoStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCu0/g;", "LCu0/f;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cu0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13359g implements InterfaceC13358f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f2734a;

    /* compiled from: ServiceOrderWidgetItemPromoStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCu0/g$a;", "", "<init>", "()V", "", "SERVICE_ORDER_WIDGET_PROMO_SHOWN_KEY", "Ljava/lang/String;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cu0.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C13359g(@k l lVar) {
        this.f2734a = lVar;
    }

    @Override // Cu0.InterfaceC13358f
    public final void a() {
        this.f2734a.putBoolean("service_order_widget_promo_key", true);
    }

    @Override // Cu0.InterfaceC13358f
    public final boolean b() {
        return this.f2734a.c("service_order_widget_promo_key");
    }
}
