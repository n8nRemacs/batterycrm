package com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import com.avito.android.app_foreground_provider.util_module.AppForegroundStatus;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.L;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import pM.InterfaceC46977a;

/* compiled from: IacAppStatusProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/c;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/b;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CheckResult"})
@Singleton
/* loaded from: classes14.dex */
public final class c implements com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.connection_quality.connectivity.a f167859a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.app_foreground_provider.util_module.a f167860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC46977a f167861c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PK.a f167862d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a> f167863e = new com.jakewharton.rxrelay3.b().M0();

    /* renamed from: f, reason: collision with root package name */
    @k
    public volatile com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a f167864f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AtomicBoolean f167865g;

    /* compiled from: IacAppStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Z;", "Lcom/avito/android/connection_quality/reactive_network/a;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Z<? extends com.avito.android.connection_quality.reactive_network.a>, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Z<? extends com.avito.android.connection_quality.reactive_network.a> z12) {
            Object obj = z12.f406625b;
            c cVar = c.this;
            cVar.c();
            com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVar = cVar.f167864f;
            int i12 = Z.f406624c;
            com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVarA = com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a.a(aVar, null, Z.a(c.this.f167859a.a()), c.this.f167861c.c(), null, 9);
            cVar.f167864f = aVarA;
            cVar.f167863e.accept(aVarA);
            return G0.f406611a;
        }
    }

    /* compiled from: IacAppStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<AppForegroundStatus, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AppForegroundStatus appForegroundStatus) {
            c cVar = c.this;
            cVar.c();
            com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVarA = com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a.a(cVar.f167864f, Boolean.valueOf(appForegroundStatus.isForeground()), null, c.this.f167861c.c(), null, 10);
            cVar.f167864f = aVarA;
            cVar.f167863e.accept(aVarA);
            return G0.f406611a;
        }
    }

    /* compiled from: IacAppStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.c$c, reason: collision with other inner class name */
    public static final class C4969c extends N implements l<Boolean, G0> {
        public C4969c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            c cVar = c.this;
            cVar.c();
            com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVarA = com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a.a(cVar.f167864f, null, null, null, bool2, 7);
            cVar.f167864f = aVarA;
            cVar.f167863e.accept(aVarA);
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k com.avito.android.connection_quality.connectivity.a aVar, @k com.avito.android.app_foreground_provider.util_module.a aVar2, @k InterfaceC46977a interfaceC46977a, @k PK.a aVar3) {
        this.f167859a = aVar;
        this.f167860b = aVar2;
        this.f167861c = interfaceC46977a;
        this.f167862d = aVar3;
        com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a.f167853e.getClass();
        this.f167864f = com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a.f167854f;
        this.f167865g = new AtomicBoolean(false);
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b
    @k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a a() {
        c();
        return this.f167864f;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b
    @k
    public final L b() {
        c();
        com.jakewharton.rxrelay3.d<com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a> dVar = this.f167863e;
        dVar.getClass();
        return dVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    public final void c() {
        if (this.f167865g.getAndSet(true)) {
            return;
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAppStatusProvider", "Initializing...", null);
        com.avito.android.app_foreground_provider.util_module.a aVar = this.f167860b;
        Boolean boolValueOf = Boolean.valueOf(aVar.getStatus().isForeground());
        int i12 = Z.f406624c;
        com.avito.android.connection_quality.connectivity.a aVar2 = this.f167859a;
        Z zA2 = Z.a(aVar2.a());
        List<IacProblem> listC = this.f167861c.c();
        PK.a aVar3 = this.f167862d;
        com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVar4 = new com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a(boolValueOf, zA2, listC, Boolean.valueOf(aVar3.c()));
        this.f167864f = aVar4;
        this.f167863e.accept(aVar4);
        A1.h(aVar2.b(), null, new a(), 3);
        A1.h(aVar.b(), null, new b(), 3);
        A1.h(aVar3.a(), null, new C4969c(), 3);
    }
}
