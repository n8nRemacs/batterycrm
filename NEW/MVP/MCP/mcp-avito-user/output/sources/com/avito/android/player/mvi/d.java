package com.avito.android.player.mvi;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.google.android.exoplayer2.InterfaceC36534o;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PlayerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/exoplayer2/o;", "exoPlayer", "Lcom/avito/android/player/ExoPlayerController$a;", "invoke", "(Lcom/google/android/exoplayer2/o;)Lcom/avito/android/player/ExoPlayerController$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.l<InterfaceC36534o, ExoPlayerController.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z1<PlayerInternalAction> f220142l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f220143m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Z1<PlayerInternalAction> z12, e eVar) {
        super(1);
        this.f220142l = z12;
        this.f220143m = eVar;
    }

    @Override // Y41.l
    public final ExoPlayerController.a invoke(InterfaceC36534o interfaceC36534o) {
        return new c(this.f220142l, interfaceC36534o, this.f220143m);
    }
}
