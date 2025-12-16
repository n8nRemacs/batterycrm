package com.avito.android.player.view;

import D80.a;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import com.avito.android.R;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f220307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlayerGalleryFragment f220308c;

    public /* synthetic */ e(PlayerGalleryFragment playerGalleryFragment, int i12) {
        this.f220307b = i12;
        this.f220308c = playerGalleryFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Resources.Theme theme;
        switch (this.f220307b) {
            case 0:
                PlayerGalleryFragment playerGalleryFragment = this.f220308c;
                boolean z12 = playerGalleryFragment.f220266A0;
                playerGalleryFragment.f220266A0 = !z12;
                StyledPlayerView styledPlayerView = playerGalleryFragment.f220282u0;
                d0 player = styledPlayerView != null ? styledPlayerView.getPlayer() : null;
                if (player != null) {
                    player.setVolume(!z12 ? 0.0f : 1.0f);
                }
                int i12 = !z12 ? R.attr.ic_mute20 : R.attr.ic_unmute20;
                TypedValue typedValue = new TypedValue();
                Context context = playerGalleryFragment.getContext();
                if (context != null && (theme = context.getTheme()) != null) {
                    theme.resolveAttribute(i12, typedValue, true);
                }
                ImageButton imageButton = playerGalleryFragment.f220287z0;
                if (imageButton != null) {
                    imageButton.setImageResource(typedValue.resourceId);
                }
                playerGalleryFragment.r5().accept(new a.c(playerGalleryFragment.f220266A0));
                break;
            default:
                PlayerGalleryFragment playerGalleryFragment2 = this.f220308c;
                if (!playerGalleryFragment2.f220272G0) {
                    playerGalleryFragment2.s5();
                    break;
                } else {
                    playerGalleryFragment2.r5().accept(a.g.f2967a);
                    playerGalleryFragment2.f220272G0 = false;
                    playerGalleryFragment2.t5();
                    break;
                }
        }
    }
}
