package Im;

import C11.b;
import C11.c;
import Y61.k;
import com.avito.android.cart.CartBeduinV2Activity;
import com.avito.android.cart.CartBeduinV2Fragment;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import kotlin.Metadata;

/* compiled from: CartBeduinV2Component.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LIm/a;", "", "a", "b", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: Im.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14130a {

    /* compiled from: CartBeduinV2Component.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIm/a$a;", "", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Im.a$a, reason: collision with other inner class name */
    public interface InterfaceC0487a {
        @k
        InterfaceC14130a create();
    }

    /* compiled from: CartBeduinV2Component.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIm/a$b;", "Lcom/avito/android/di/h;", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @c
    /* renamed from: Im.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC0487a Ce();
    }

    void a(@k CartBeduinV2Fragment cartBeduinV2Fragment);

    void b(@k CartBeduinV2Activity cartBeduinV2Activity);
}
