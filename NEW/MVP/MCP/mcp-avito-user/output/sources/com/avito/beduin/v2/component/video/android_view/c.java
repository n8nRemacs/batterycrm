package com.avito.beduin.v2.component.video.android_view;

import Y61.l;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPlayerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/c;", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "Lcom/google/android/exoplayer2/d0;", "player", "Lkotlin/G0;", "setPlayer", "(Lcom/google/android/exoplayer2/d0;)V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends StyledPlayerView {
    @Override // com.google.android.exoplayer2.ui.StyledPlayerView
    public void setPlayer(@l d0 player) {
        UU0.a aVar;
        d0 player2 = getPlayer();
        super.setPlayer(player);
        if (L.f(player2, player)) {
            return;
        }
        if (player instanceof b) {
            UU0.a aVar2 = ((b) player).f336320b;
        }
        if (!(player2 instanceof b) || (aVar = ((b) player2).f336320b) == null) {
            return;
        }
        b bVar = aVar.f16395a;
        if (!bVar.f336321c) {
            bVar.release();
        }
        bVar.f336320b = null;
        aVar.f16396b.f16398c.remove(bVar);
    }
}
