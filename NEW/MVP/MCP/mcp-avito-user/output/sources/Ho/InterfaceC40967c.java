package ho;

import C11.b;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.certificate_pinning.UnsafeNetworkMviActivity;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lho/c;", "", "a", "b", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: ho.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40967c {

    /* compiled from: UnsafeNetworkComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lho/c$a;", "Lcom/avito/android/di/h;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: ho.c$a */
    public interface a extends InterfaceC29971h {
        @k
        b fe();
    }

    /* compiled from: UnsafeNetworkComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lho/c$b;", "", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ho.c$b */
    public interface b {
        @k
        InterfaceC40967c a(@h31.b @k C28478k c28478k);
    }

    void a(@k UnsafeNetworkMviActivity unsafeNetworkMviActivity);
}
