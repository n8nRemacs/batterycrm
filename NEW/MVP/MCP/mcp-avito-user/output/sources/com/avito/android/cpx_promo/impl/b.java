package com.avito.android.cpx_promo.impl;

import com.avito.android.cpx_promo.impl.CpxPromoFragment;
import com.avito.android.cpx_promo.impl.mvi.entity.a;
import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import com.avito.android.player_timebar.VideoPlayerTimeBar;
import com.avito.android.ui.fragments.BaseFragment;
import com.google.android.exoplayer2.ui.C;
import com.google.android.material.slider.Slider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b implements Slider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126938b;

    public /* synthetic */ b(BaseFragment baseFragment, int i12) {
        this.f126937a = i12;
        this.f126938b = baseFragment;
    }

    @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
    public final /* bridge */ /* synthetic */ void a(Slider slider, float f12, boolean z12) {
        int i12 = this.f126937a;
        b(f12, z12);
    }

    @Override // com.google.android.material.slider.Slider.a
    public final void b(float f12, boolean z12) {
        Object obj = this.f126938b;
        switch (this.f126937a) {
            case 0:
                CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                if (z12) {
                    ((CpxPromoFragment) obj).r5().accept(new a.l(f12));
                    break;
                }
                break;
            case 1:
                CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                if (z12) {
                    ((CpxPromoV2Fragment) obj).r5().accept(new a.l(f12));
                    break;
                }
                break;
            default:
                int i12 = VideoPlayerTimeBar.f220331p0;
                if (z12) {
                    ((C.a) obj).a((long) f12);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(C.a aVar, VideoPlayerTimeBar videoPlayerTimeBar) {
        this.f126937a = 2;
        this.f126938b = aVar;
    }
}
