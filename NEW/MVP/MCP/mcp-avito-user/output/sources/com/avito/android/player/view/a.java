package com.avito.android.player.view;

import android.view.View;
import com.avito.android.player.view.PlayerFragment;
import com.avito.android.player.view.PlayerGalleryFragment;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f220303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f220304c;

    public /* synthetic */ a(StyledPlayerView styledPlayerView, int i12) {
        this.f220303b = i12;
        this.f220304c = styledPlayerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StyledPlayerView styledPlayerView = this.f220304c;
        switch (this.f220303b) {
            case 0:
                PlayerFragment.a aVar = PlayerFragment.f220234F0;
                d0 player = styledPlayerView.getPlayer();
                if (player != null) {
                    if (!player.k()) {
                        player.play();
                        break;
                    } else {
                        player.pause();
                        break;
                    }
                }
                break;
            default:
                PlayerGalleryFragment.a aVar2 = PlayerGalleryFragment.f220264J0;
                d0 player2 = styledPlayerView.getPlayer();
                if (player2 != null) {
                    if (!player2.k()) {
                        player2.play();
                        break;
                    } else {
                        player2.pause();
                        break;
                    }
                }
                break;
        }
    }
}
