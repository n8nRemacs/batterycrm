package com.avito.android.advertising.ui.buzzoola;

import android.view.View;
import com.avito.android.util.D6;
import com.google.android.exoplayer2.d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f88598c;

    public /* synthetic */ l(m mVar, int i12) {
        this.f88597b = i12;
        this.f88598c = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88597b) {
            case 0:
                m mVar = this.f88598c;
                d0 player = mVar.f88611m.getPlayer();
                if (player != null) {
                    if (!player.k()) {
                        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar2 = mVar.f88620v;
                        if (mVar2 != null && mVar2.a()) {
                            mVar2.f87538g.T6(mVar2.f87532a, mVar2.f87533b);
                        }
                        player.play();
                        break;
                    } else {
                        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar3 = mVar.f88620v;
                        if (mVar3 != null && mVar3.a()) {
                            mVar3.f87538g.N3(mVar3.f87532a, mVar3.f87533b);
                        }
                        player.pause();
                        break;
                    }
                }
                break;
            case 1:
                m mVar4 = this.f88598c;
                d0 player2 = mVar4.f88611m.getPlayer();
                if (player2 != null) {
                    if (player2.getVolume() != 0.0f) {
                        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar5 = mVar4.f88620v;
                        if (mVar5 != null && mVar5.a()) {
                            mVar5.f87538g.M4(mVar5.f87532a, mVar5.f87533b);
                        }
                        player2.setVolume(0.0f);
                        break;
                    } else {
                        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar6 = mVar4.f88620v;
                        if (mVar6 != null && mVar6.a()) {
                            mVar6.f87538g.d5(mVar6.f87532a, mVar6.f87533b);
                        }
                        player2.setVolume(1.0f);
                        break;
                    }
                }
                break;
            default:
                m mVar7 = this.f88598c;
                d0 player3 = mVar7.f88611m.getPlayer();
                if (player3 != null) {
                    player3.prepare();
                }
                View view2 = mVar7.f88617s;
                if (view2 != null) {
                    D6.G(view2, false);
                }
                D6.G(mVar7.f88615q, true);
                break;
        }
    }
}
