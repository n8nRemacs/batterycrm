package ho;

import C11.b;
import Y61.k;
import Y61.l;
import com.avito.android.certificate_pinning.UnsafeNetworkActivity;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lho/d;", "", "a", "b", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: UnsafeNetworkComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lho/d$a;", "Lcom/avito/android/di/h;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface a extends InterfaceC29971h {
        @k
        b ui();
    }

    /* compiled from: UnsafeNetworkComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lho/d$b;", "", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        d a(@h31.b @l Kundle kundle);
    }

    void a(@k UnsafeNetworkActivity unsafeNetworkActivity);
}
