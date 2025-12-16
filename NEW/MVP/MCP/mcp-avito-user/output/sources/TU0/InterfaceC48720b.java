package tu0;

import C11.b;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.permissions.C33031a;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivity;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivityArgs;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: ServiceOrderMapComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Ltu0/b;", "", "a", "b", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: tu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48720b {

    /* compiled from: ServiceOrderMapComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltu0/b$a;", "", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tu0.b$a */
    public interface a {
        @k
        InterfaceC48720b a(@h31.b @k C28478k c28478k, @h31.b @InterfaceC48719a @k WeakReference weakReference, @h31.b @k C33031a c33031a, @h31.b @k ServiceOrderMapActivityArgs serviceOrderMapActivityArgs);
    }

    /* compiled from: ServiceOrderMapComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltu0/b$b;", "Lcom/avito/android/di/h;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: tu0.b$b, reason: collision with other inner class name */
    public interface InterfaceC12692b extends InterfaceC29971h {
        @k
        a Ea();
    }

    void a(@k ServiceOrderMapActivity serviceOrderMapActivity);
}
