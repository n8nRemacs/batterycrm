package com.avito.android.stories.adapter;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StoriesItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "storyPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StoriesItem f285061l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f285062m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f285063n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StoriesItem storiesItem, d dVar, int i12) {
        super(1);
        this.f285061l = storiesItem;
        this.f285062m = dVar;
        this.f285063n = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(java.lang.Integer r14) {
        /*
            r13 = this;
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            com.avito.android.stories.adapter.StoriesItem r0 = r13.f285061l
            com.avito.android.stories.model.StoryBannerItem r1 = r0.f285030d
            if (r1 == 0) goto L16
            com.avito.android.stories.model.BannerType r2 = com.avito.android.stories.model.BannerType.f285150d
            com.avito.android.stories.model.BannerType r1 = r1.f285162k
            if (r1 == r2) goto L13
            goto L16
        L13:
            int r1 = r14 + (-1)
            goto L17
        L16:
            r1 = r14
        L17:
            java.util.List<com.avito.android.stories.model.StoryCarouselItem> r2 = r0.f285031e
            if (r2 == 0) goto L5c
            java.lang.Object r1 = r2.get(r1)
            com.avito.android.stories.model.StoryCarouselItem r1 = (com.avito.android.stories.model.StoryCarouselItem) r1
            if (r1 == 0) goto L5c
            com.avito.android.stories.adapter.d r2 = r13.f285062m
            com.avito.android.stories.m r3 = r2.f285050b
            r3.getClass()
            com.avito.android.deep_linking.links.DeepLink r4 = r1.f285165d
            if (r4 == 0) goto L3c
            h31.e<rn0.b> r3 = r3.f285146a
            java.lang.Object r3 = r3.get()
            rn0.c r3 = (rn0.InterfaceC47691c) r3
            r5 = 14
            r6 = 0
            rn0.InterfaceC47691c.a.a(r3, r4, r6, r5)
        L3c:
            java.lang.String r3 = r1.f285169h
            js0.c r4 = r2.f285051c
            java.lang.String r1 = r1.f285163b
            r4.g(r14, r1, r3)
            int r14 = r13.f285063n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            com.avito.android.remote.model.widget_analytics.Analytics r11 = r0.f285036j
            r12 = 60
            js0.c r3 = r2.f285051c
            java.lang.String r5 = "stories"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.f285038l
            js0.d.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L5c:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.stories.adapter.g.invoke(java.lang.Object):java.lang.Object");
    }
}
