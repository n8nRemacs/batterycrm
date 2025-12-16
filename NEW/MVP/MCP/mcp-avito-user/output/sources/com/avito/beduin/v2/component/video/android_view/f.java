package com.avito.beduin.v2.component.video.android_view;

import Y61.k;
import android.view.View;
import com.avito.beduin.v2.component.video.android_view.e;
import com.google.android.exoplayer2.d0;
import kotlin.Metadata;

/* compiled from: VideoComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/f;", "Landroid/view/View$OnAttachStateChangeListener;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f336340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f336341c;

    public f(c cVar, e eVar) {
        this.f336340b = cVar;
        this.f336341c = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
        d0 player;
        d0 player2;
        com.avito.beduin.v2.component.video.state.e eVar;
        c cVar = this.f336340b;
        d0 player3 = cVar.getPlayer();
        b bVar = player3 instanceof b ? (b) player3 : null;
        e eVar2 = this.f336341c;
        if (bVar == null || !bVar.f336321c) {
            e.c cVar2 = eVar2.f336323n;
            boolean z12 = (cVar2 == null || (eVar = cVar2.f336333a) == null) ? false : eVar.f336361b;
            if (z12 && (player = cVar.getPlayer()) != null && player.getPlaybackState() == 1 && (player2 = cVar.getPlayer()) != null) {
                player2.prepare();
            }
            d0 player4 = cVar.getPlayer();
            if (player4 == null) {
                return;
            }
            player4.setPlayWhenReady(z12);
            return;
        }
        e.c cVar3 = eVar2.f336323n;
        if (cVar3 != null) {
            d0.g gVar = cVar3.f336335c;
            d0 player5 = cVar.getPlayer();
            if (player5 != null) {
                player5.s(gVar);
            }
        }
        cVar.setPlayer(eVar2.f336322m.a());
        e.c cVar4 = eVar2.f336323n;
        if (cVar4 != null) {
            eVar2.l(cVar, cVar4.f336334b, cVar4.f336333a);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
        c cVar = this.f336340b;
        d0 player = cVar.getPlayer();
        this.f336341c.f336326q = player != null ? player.getCurrentPosition() : 0L;
        d0 player2 = cVar.getPlayer();
        if (player2 == null) {
            return;
        }
        player2.setPlayWhenReady(false);
    }
}
