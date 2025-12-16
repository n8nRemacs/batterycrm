package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.nb0;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* loaded from: classes8.dex */
public final class aw implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final View f383679a;

    /* renamed from: b, reason: collision with root package name */
    private final float f383680b = 0.1f;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final nb0.a f383681c = new nb0.a();

    public aw(@Y61.k VideoAdControlsContainer videoAdControlsContainer) {
        this.f383679a = videoAdControlsContainer;
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @Y61.k
    public final nb0.a a(int i12, int i13) {
        int iB2 = kotlin.math.b.b(this.f383679a.getHeight() * this.f383680b);
        nb0.a aVar = this.f383681c;
        aVar.f388198a = i12;
        aVar.f388199b = View.MeasureSpec.makeMeasureSpec(iB2, 1073741824);
        return this.f383681c;
    }
}
