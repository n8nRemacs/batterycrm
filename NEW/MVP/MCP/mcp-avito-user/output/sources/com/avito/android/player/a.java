package com.avito.android.player;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.util.InterfaceC35745a5;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExoPlayerController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/a;", "Lcom/avito/android/player/ExoPlayerController;", "a", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements ExoPlayerController {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f220031a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.player_holder.a f220032b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InterfaceC36534o f220033c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ExoPlayerController.a f220034d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f220035e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ExoPlayerController.State f220036f;

    /* compiled from: ExoPlayerController.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/player/a$a;", "", "<init>", "()V", "", "EXO_PLAYER_CONTROLLER_LISTENER", "Ljava/lang/String;", "", "PLAYBACK_PROGRESS_UPDATE_INTERVAL_MS", "J", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.player.a$a, reason: collision with other inner class name */
    public static final class C6614a {
        public /* synthetic */ C6614a(C42822w c42822w) {
            this();
        }

        public C6614a() {
        }
    }

    static {
        new C6614a(null);
    }

    @Inject
    public a(@k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.player_holder.a aVar, @l ExoPlayerController.State state) {
        this.f220031a = interfaceC35745a5;
        this.f220032b = aVar;
        this.f220036f = state;
    }

    @Override // com.avito.android.player.ExoPlayerController
    @l
    public final ExoPlayerController.State H() {
        InterfaceC36534o interfaceC36534o = this.f220033c;
        if (interfaceC36534o == null) {
            return null;
        }
        return new ExoPlayerController.State(interfaceC36534o.getCurrentMediaItemIndex(), interfaceC36534o.getCurrentPosition(), interfaceC36534o.getPlayWhenReady());
    }

    @Override // com.avito.android.player.ExoPlayerController
    @l
    public final InterfaceC36534o a(@k String str) {
        if (this.f220033c != null) {
            return null;
        }
        Uri uri = Uri.parse(str);
        O.c cVar = new O.c();
        cVar.f343535b = uri;
        O oA2 = cVar.a();
        ExoPlayerController.State state = this.f220036f;
        boolean z12 = state != null ? state.f220025b : true;
        int i12 = state != null ? state.f220026c : 0;
        long j12 = state != null ? state.f220027d : 0L;
        b bVar = new b(z12);
        com.avito.android.player_holder.a aVar = this.f220032b;
        aVar.e(bVar);
        aVar.r(oA2);
        aVar.f(i12, j12);
        ExoPlayerController.a aVar2 = this.f220034d;
        if (aVar2 != null) {
            aVar.b("exo_player_controller_listener");
            aVar.H("exo_player_controller_listener", aVar2);
        }
        InterfaceC36534o interfaceC36534oA = aVar.a();
        this.f220033c = interfaceC36534oA;
        return interfaceC36534oA;
    }

    @Override // com.avito.android.player.ExoPlayerController
    public final void b() {
        y yVar = this.f220035e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f220035e = null;
        com.avito.android.player_holder.a aVar = this.f220032b;
        aVar.b("exo_player_controller_listener");
        aVar.s();
        this.f220033c = null;
    }

    @Override // com.avito.android.player.ExoPlayerController
    public final void c(@k Y41.l<? super InterfaceC36534o, ? extends ExoPlayerController.a> lVar) {
        ExoPlayerController.a aVarInvoke = lVar.invoke(this.f220033c);
        this.f220034d = aVarInvoke;
        com.avito.android.player_holder.a aVar = this.f220032b;
        aVar.b("exo_player_controller_listener");
        aVar.H("exo_player_controller_listener", aVarInvoke);
        this.f220035e = (y) z.a0(200L, 200L, TimeUnit.MILLISECONDS, this.f220031a.e()).d0(new c(this)).N(d.f220052b).t0(new e(this));
    }

    @Override // com.avito.android.player.ExoPlayerController
    public final void d() {
        this.f220032b.pause();
    }

    @Override // com.avito.android.player.ExoPlayerController
    public final void e() {
        this.f220032b.prepare();
    }
}
