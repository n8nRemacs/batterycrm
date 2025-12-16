package com.avito.android.connection_quality.reactive_network;

import Y61.k;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.avito.android.C34429s0;
import com.avito.android.connection_quality.reactive_network.a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.C41892v;
import io.reactivex.rxjava3.internal.operators.flowable.O;
import io.reactivex.rxjava3.internal.operators.flowable.P;
import io.reactivex.rxjava3.internal.operators.flowable.T;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import io.reactivex.rxjava3.subjects.i;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.o;
import l41.q;

/* compiled from: MarshmallowNetworkObservingStrategy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/b;", "Lcom/avito/android/connection_quality/reactive_network/f;", "<init>", "()V", "a", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class b implements f {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f125721d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i<com.avito.android.connection_quality.reactive_network.a> f125722a = new io.reactivex.rxjava3.subjects.e().M0();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f125723b = new c(this);

    /* renamed from: c, reason: collision with root package name */
    @k
    public com.avito.android.connection_quality.reactive_network.a f125724c;

    /* compiled from: MarshmallowNetworkObservingStrategy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/b$a;", "", "<init>", "()V", "", "ERROR_MSG_NETWORK_CALLBACK", "Ljava/lang/String;", "ERROR_MSG_RECEIVER", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MarshmallowNetworkObservingStrategy.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/connection_quality/reactive_network/b$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.connection_quality.reactive_network.b$b, reason: collision with other inner class name */
    public static final class C3734b extends ConnectivityManager.NetworkCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f125726b;

        public C3734b(Context context) {
            this.f125726b = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@k Network network) {
            com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
            b.this.c(a.C3733a.a(this.f125726b));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@k Network network) {
            com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
            b.this.c(a.C3733a.a(this.f125726b));
        }
    }

    public b() {
        com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
        this.f125724c = new com.avito.android.connection_quality.reactive_network.a(null, null, 0, null, null, 31, null);
    }

    @k
    public ConnectivityManager.NetworkCallback a(@k Context context) {
        return new C3734b(context);
    }

    @k
    public final C41960j0 b(@k Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        ConnectivityManager.NetworkCallback networkCallbackA = a(context);
        context.registerReceiver(this.f125723b, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
        f125721d.getClass();
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), networkCallbackA);
        AbstractC41777j<com.avito.android.connection_quality.reactive_network.a> abstractC41777jG0 = this.f125722a.G0(BackpressureStrategy.f401955d);
        C34429s0 c34429s0 = new C34429s0(this, networkCallbackA, connectivityManager, context, 1);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        q qVar = io.reactivex.rxjava3.internal.functions.a.f401997g;
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(qVar, "onRequest is null");
        org.reactivestreams.c cVarC = new P(new T(abstractC41777jG0, gVar, qVar, c34429s0), new d(this)).c(new e(this));
        com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
        com.avito.android.connection_quality.reactive_network.a aVarA = a.C3733a.a(context);
        cVarC.getClass();
        C41892v c41892v = new C41892v(new org.reactivestreams.c[]{AbstractC41777j.j(aVarA), cVarC});
        o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        Objects.requireNonNull(oVar, "keySelector is null");
        return new C41960j0(new O(c41892v, oVar, io.reactivex.rxjava3.internal.functions.b.f402016a));
    }

    public final void c(@k com.avito.android.connection_quality.reactive_network.a aVar) {
        this.f125722a.onNext(aVar);
    }
}
