package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import Fc1.E0;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.MediaStreamTrack;

/* compiled from: IacRingingModeProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/i;", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165872a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f165873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicBoolean f165874c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final O f165875d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AudioManager f165876e;

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i iVar = i.this;
            if (iVar.f165874c.getAndSet(true)) {
                return;
            }
            iVar.f165873b.accept(G0.f406611a);
            iVar.f165872a.registerReceiver(iVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        }
    }

    /* compiled from: IacRingingModeProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacRingingModeProvider", "NEW ringerMode=" + i.this.f165876e.getRingerMode() + ' ', null);
        }
    }

    @Inject
    public i(@k Context context) {
        this.f165872a = context;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f165873b = cVar;
        this.f165874c = new AtomicBoolean(false);
        this.f165875d = cVar.J(io.reactivex.rxjava3.internal.functions.a.f401993c, new a()).J(new E0(this, 24), io.reactivex.rxjava3.internal.functions.a.f401994d).K(new b());
        this.f165876e = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        if (L.f(intent != null ? intent.getAction() : null, "android.media.RINGER_MODE_CHANGED")) {
            this.f165873b.accept(G0.f406611a);
        }
    }
}
