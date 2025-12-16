package com.avito.android.connection_quality.connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.NetworkInfo;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.connection_quality.reactive_network.a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import j.a0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConnectivityProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/connection_quality/connectivity/b;", "Lcom/avito/android/connection_quality/connectivity/a;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onAppForeground", "()V", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingPermission", "CheckResult"})
/* loaded from: classes12.dex */
public final class b implements com.avito.android.connection_quality.connectivity.a, InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final Context f125692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f125693c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f125694d;

    /* compiled from: ConnectivityProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C23050m0.f46822j.getClass();
            C23050m0.f46823k.f46829g.a(b.this);
            return G0.f406611a;
        }
    }

    /* compiled from: ConnectivityProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lkotlin/Z;", "Lcom/avito/android/connection_quality/reactive_network/a;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.connection_quality.connectivity.b$b, reason: collision with other inner class name */
    public static final class C3732b extends N implements Y41.a<com.jakewharton.rxrelay3.d<Z<? extends com.avito.android.connection_quality.reactive_network.a>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35745a5 f125697m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3732b(InterfaceC35745a5 interfaceC35745a5) {
            super(0);
            this.f125697m = interfaceC35745a5;
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<Z<? extends com.avito.android.connection_quality.reactive_network.a>> invoke() {
            com.jakewharton.rxrelay3.d dVarM0 = new com.jakewharton.rxrelay3.b().M0();
            b bVar = b.this;
            com.jakewharton.rxrelay3.c<G0> cVar = bVar.f125693c;
            InterfaceC35745a5 interfaceC35745a5 = this.f125697m;
            z zVarY0 = cVar.j0(interfaceC35745a5.c()).r0(G0.f406611a).y0(new f(bVar, interfaceC35745a5));
            zVarY0.getClass();
            zVarY0.D(io.reactivex.rxjava3.internal.functions.a.f401991a).u0(new g(dVarM0), new h(dVarM0));
            return dVarM0;
        }
    }

    @Inject
    public b(@Y61.k Context context, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f125692b = context.getApplicationContext();
        this.f125694d = C42727D.c(new C3732b(interfaceC35745a5));
        com.avito.android.util.concurrent.b.a(new a());
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_START)
    private final void onAppForeground() {
        this.f125693c.accept(G0.f406611a);
    }

    @Override // com.avito.android.connection_quality.connectivity.a
    @Y61.k
    @a0
    public final com.avito.android.connection_quality.reactive_network.a a() {
        com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
        return a.C3733a.a(this.f125692b);
    }

    @Override // com.avito.android.connection_quality.connectivity.a
    @Y61.k
    @a0
    public final z<Z<com.avito.android.connection_quality.reactive_network.a>> b() {
        return (z) this.f125694d.getValue();
    }

    @Override // com.avito.android.connection_quality.connectivity.a
    @a0
    public final boolean c() {
        return a().f125716a == NetworkInfo.State.CONNECTED;
    }

    @Override // com.avito.android.connection_quality.connectivity.a
    @Y61.k
    @a0
    public final B0 d() {
        return b().d0(c.f125698b);
    }
}
