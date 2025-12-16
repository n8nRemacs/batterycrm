package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import Fc1.E0;
import Y61.k;
import Y61.l;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.internal.P;
import com.avito.android.notification.m;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: IacRingingModeProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/a;", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165848a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165849b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicBoolean f165850c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f165851d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final O f165852e;

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.ringtone.a$a, reason: collision with other inner class name */
    public static final class C4916a<T> implements l41.g {
        public C4916a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            if (aVar.f165850c.getAndSet(true)) {
                return;
            }
            aVar.f165851d.accept(G0.f406611a);
            aVar.f165848a.registerReceiver(aVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
    }

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.G0 r4 = (kotlin.G0) r4
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r4 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NEW isDndModeEnabled="
                r0.<init>(r1)
                com.avito.android.iac_dialer.impl_module.audio.ringtone.a r1 = com.avito.android.iac_dialer.impl_module.audio.ringtone.a.this
                kotlin.C r1 = r1.f165849b
                java.lang.Object r1 = r1.getValue()
                android.app.NotificationManager r1 = (android.app.NotificationManager) r1
                int r1 = r1.getCurrentInterruptionFilter()
                if (r1 == 0) goto L1f
                r2 = 1
                if (r1 == r2) goto L1f
                goto L20
            L1f:
                r2 = 0
            L20:
                r1 = 32
                java.lang.String r0 = androidx.appcompat.app.r.x(r0, r2, r1)
                r1 = 0
                java.lang.String r2 = "IacRingingModeProvider"
                r4.a(r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.ringtone.a.b.accept(java.lang.Object):void");
        }
    }

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<NotificationManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f165855l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m mVar) {
            super(0);
            this.f165855l = mVar;
        }

        @Override // Y41.a
        public final NotificationManager invoke() {
            return this.f165855l.a();
        }
    }

    @Inject
    public a(@k m mVar, @k Context context) {
        this.f165848a = context;
        this.f165849b = C42727D.c(new c(mVar));
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f165851d = cVar;
        this.f165852e = cVar.J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C4916a()).J(new E0(this, 23), io.reactivex.rxjava3.internal.functions.a.f401994d).K(new b());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        if (L.f(intent != null ? intent.getAction() : null, "android.app.action.INTERRUPTION_FILTER_CHANGED")) {
            this.f165851d.accept(G0.f406611a);
        }
    }
}
