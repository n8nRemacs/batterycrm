package com.avito.android.connection_quality.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.avito.android.connection_quality.reactive_network.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ObservingStrategyWithRefresh.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/connection_quality/connectivity/k;", "Lcom/avito/android/connection_quality/reactive_network/b;", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.android.connection_quality.reactive_network.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f125707g = 0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f125708e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f125709f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ObservingStrategyWithRefresh.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/connection_quality/connectivity/k$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f125710a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f125711b;

        public a(Context context, k kVar) {
            this.f125710a = context;
            this.f125711b = kVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@Y61.k Network network) {
            com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
            Context context = this.f125710a;
            com.avito.android.connection_quality.reactive_network.a aVarA = a.C3733a.a(context);
            V2.f318762a.c("ObservingStrategyWithRefresh", "onAvailable: " + network + ", connectivity: " + aVarA, null);
            int i12 = k.f125707g;
            k kVar = this.f125711b;
            kVar.c(aVarA);
            k.d(context, kVar, aVarA);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@Y61.k Network network) {
            com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
            Context context = this.f125710a;
            com.avito.android.connection_quality.reactive_network.a aVarA = a.C3733a.a(context);
            V2.f318762a.c("ObservingStrategyWithRefresh", "onLost: " + network + ", connectivity: " + aVarA, null);
            int i12 = k.f125707g;
            k kVar = this.f125711b;
            kVar.c(aVarA);
            k.d(context, kVar, aVarA);
        }
    }

    public k(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f125708e = interfaceC35745a5;
    }

    public static final void d(Context context, k kVar, com.avito.android.connection_quality.reactive_network.a aVar) {
        kVar.f125709f.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = kVar.f125708e;
        kVar.f125709f.b(A1.h(z.a0(1000L, 1000L, timeUnit, interfaceC35745a5.c()).A0(z.F0(60000L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b)).j0(interfaceC35745a5.e()), null, new l(context, kVar, aVar), 3));
    }

    @Override // com.avito.android.connection_quality.reactive_network.b
    @Y61.k
    public final ConnectivityManager.NetworkCallback a(@Y61.k Context context) {
        return new a(context, this);
    }
}
