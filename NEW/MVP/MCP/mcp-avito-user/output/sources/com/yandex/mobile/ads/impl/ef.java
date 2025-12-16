package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i91;

/* loaded from: classes8.dex */
public abstract class ef implements gt0 {

    /* renamed from: a, reason: collision with root package name */
    protected final i91.d f384922a = new i91.d();

    public final boolean b() {
        pt ptVar = (pt) this;
        return ptVar.getPlaybackState() == 3 && ptVar.getPlayWhenReady() && ptVar.getPlaybackSuppressionReason() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean hasNextMediaItem() {
        int iA2;
        pt ptVar = (pt) this;
        i91 currentTimeline = ptVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            iA2 = -1;
        } else {
            int currentMediaItemIndex = ptVar.getCurrentMediaItemIndex();
            ptVar.d();
            ptVar.e();
            iA2 = currentTimeline.a(currentMediaItemIndex, 0, false);
        }
        return iA2 != -1;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean hasPreviousMediaItem() {
        int iB2;
        pt ptVar = (pt) this;
        i91 currentTimeline = ptVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            iB2 = -1;
        } else {
            int currentMediaItemIndex = ptVar.getCurrentMediaItemIndex();
            ptVar.d();
            ptVar.e();
            iB2 = currentTimeline.b(currentMediaItemIndex, 0, false);
        }
        return iB2 != -1;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean isCurrentMediaItemDynamic() {
        pt ptVar = (pt) this;
        i91 currentTimeline = ptVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(ptVar.getCurrentMediaItemIndex(), this.f384922a, 0L).f386412i;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean isCurrentMediaItemLive() {
        pt ptVar = (pt) this;
        i91 currentTimeline = ptVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(ptVar.getCurrentMediaItemIndex(), this.f384922a, 0L).a();
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean isCurrentMediaItemSeekable() {
        pt ptVar = (pt) this;
        i91 currentTimeline = ptVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(ptVar.getCurrentMediaItemIndex(), this.f384922a, 0L).f386411h;
    }
}
