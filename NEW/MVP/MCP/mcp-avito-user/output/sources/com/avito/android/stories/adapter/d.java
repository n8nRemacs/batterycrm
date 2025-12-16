package com.avito.android.stories.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.stories.model.BannerType;
import com.avito.android.stories.model.StoryBannerItem;
import com.avito.android.stories.model.StoryCarouselItem;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/stories/adapter/d;", "LTV0/d;", "Lcom/avito/android/stories/view/a;", "Lcom/avito/android/stories/adapter/StoriesItem;", "Lcom/avito/android/stories/adapter/k;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<com.avito.android.stories.view.a, StoriesItem>, k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.stories.m f285050b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final js0.c f285051c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Kundle f285052d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f285053e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<StoriesItem> f285054f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f285055g;

    /* compiled from: StoriesItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/stories/adapter/StoriesItem;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/stories/adapter/StoriesItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ArrayList arrayList;
            js0.c cVar = d.this.f285051c;
            List<StoryCarouselItem> list = ((StoriesItem) obj).f285031e;
            if (list != null) {
                List<StoryCarouselItem> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StoryCarouselItem) it.next()).f285163b);
                }
            } else {
                arrayList = null;
            }
            cVar.l(arrayList);
        }
    }

    public d(@Y61.k com.avito.android.stories.m mVar, @Y61.l Kundle kundle, @Y61.k js0.c cVar) {
        this.f285050b = mVar;
        this.f285051c = cVar;
        this.f285052d = kundle == null ? new Kundle() : kundle;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f285053e = cVar2;
        com.jakewharton.rxrelay3.c<StoriesItem> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f285054f = cVar3;
        cVar2.b(cVar3.A().t0(new a()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BannerType bannerType;
        com.avito.android.stories.view.a aVar2 = (com.avito.android.stories.view.a) eVar;
        StoriesItem storiesItem = (StoriesItem) aVar;
        List<StoryCarouselItem> list = storiesItem.f285031e;
        List<StoryCarouselItem> list2 = list;
        StoryBannerItem storyBannerItem = storiesItem.f285030d;
        boolean z12 = (list2 == null || list2.isEmpty()) && storyBannerItem != null && (bannerType = storyBannerItem.f285162k) != null && bannerType == BannerType.f285149c;
        boolean z13 = storiesItem.f285033g;
        if (!z13) {
            this.f285052d = null;
        }
        ArrayList arrayList = new ArrayList();
        aVar2.HV(storiesItem.f285039m);
        if (storyBannerItem != null) {
            if (!this.f285055g) {
                this.f285051c.m(storyBannerItem.f285154c);
                this.f285055g = true;
            }
            BannerType bannerType2 = storyBannerItem.f285162k;
            bannerType2.getClass();
            if (bannerType2 == BannerType.f285150d) {
                aVar2.cr(0);
                arrayList.add(storyBannerItem);
            } else {
                aVar2.D40(storyBannerItem, new e(storyBannerItem, this));
                aVar2.cr(24);
            }
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            aVar2.cr(0);
        }
        if (!z12) {
            aVar2.VS(new f(this, storiesItem));
        }
        aVar2.xv(arrayList, new g(storiesItem, this, i12), new h(this, storiesItem));
        Kundle kundle = this.f285052d;
        if (L.f(kundle != null ? kundle.a("key_position_changes") : null, Boolean.TRUE) || !z13) {
            Integer num = storiesItem.f285032f;
            if (num != null) {
                aVar2.W0(num.intValue());
            }
        } else {
            Kundle kundle2 = this.f285052d;
            aVar2.ol(kundle2 != null ? kundle2.d("key_saved_stories_state") : null);
        }
        aVar2.Nk(storiesItem.f285034h, storiesItem.f285035i);
        this.f285053e.b(aVar2.rj().t0(new i(this, aVar2)));
    }

    @Override // com.avito.android.stories.adapter.k
    public final void e0() {
        this.f285053e.e();
    }

    @Override // com.avito.android.stories.adapter.k
    public final void k() {
        Kundle kundle = this.f285052d;
        if (kundle != null) {
            kundle.h(Boolean.TRUE, "key_position_changes");
        }
    }

    public /* synthetic */ d(com.avito.android.stories.m mVar, Kundle kundle, js0.c cVar, int i12, C42822w c42822w) {
        this(mVar, (i12 & 2) != 0 ? null : kundle, cVar);
    }
}
