package com.avito.android.avl_entry.impl.ui.internal_item.video;

import Lg.InterfaceC14392c;
import Y41.l;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.avl_analytics.AvlEntryType;
import com.avito.android.avl_analytics.AvlFromPage;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.avl_entry.impl.ui.internal_item.show_all.a;
import com.avito.android.util.C35755b0;
import java.util.List;
import javax.inject.Inject;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosWidgetCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/video/g;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/video/c;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14392c f98593b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_entry.impl.util.d f98594c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98595d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f98596e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f98597f;

    /* compiled from: ShortVideosWidgetCarouselItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f98598l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(0);
            this.f98598l = iVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f98598l.i20();
            return G0.f406611a;
        }
    }

    /* compiled from: ShortVideosWidgetCarouselItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Context, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ShortVideosWidgetCarouselItem.VideoItem f98599l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f98600m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f98601n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShortVideosWidgetCarouselItem.VideoItem videoItem, g gVar, int i12) {
            super(1);
            this.f98599l = videoItem;
            this.f98600m = gVar;
            this.f98601n = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Context context) {
            Context context2 = context;
            ShortVideosWidgetCarouselItem.VideoItem videoItem = this.f98599l;
            boolean z12 = videoItem.f98559b;
            int i12 = this.f98601n;
            g gVar = this.f98600m;
            if (z12) {
                d.a.a(gVar.f98597f, Integer.valueOf(i12), "video_widget", "item", null, null, null, C35755b0.c(P0.g(new Q("x", videoItem.getXHash()), new Q("cid", videoItem.getCategoryId()))), videoItem.f98560c, 56);
            }
            com.avito.android.avl_analytics.a aVar = gVar.f98595d;
            String categoryId = videoItem.getCategoryId();
            Integer numValueOf = Integer.valueOf(i12);
            String itemId = videoItem.getItemId();
            Integer entryPosition = videoItem.getEntryPosition();
            Integer numValueOf2 = Integer.valueOf(entryPosition != null ? entryPosition.intValue() : 0);
            AvlEntryType avlEntryType = AvlEntryType.f98425b;
            aVar.l(categoryId, numValueOf, itemId, numValueOf2, AvlEntryType.f98425b, videoItem.f98559b ? AvlFromPage.f98429d : AvlFromPage.f98428c, null);
            context2.startActivity(gVar.f98593b.a(videoItem.getVideoUrl(), videoItem.getKey(), null, null));
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            if (activity != null) {
                activity.overridePendingTransition(R.anim.avl_entry_slide_in_down, R.anim.avl_entry_slide_in_down);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k InterfaceC14392c interfaceC14392c, @Y61.k com.avito.android.avl_entry.impl.util.d dVar, @Y61.k com.avito.android.avl_analytics.a aVar, @Y61.k E e12, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f98593b = interfaceC14392c;
        this.f98594c = dVar;
        this.f98595d = aVar;
        this.f98596e = e12;
        this.f98597f = gVar;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, final int i12, List list) {
        final i iVar = (i) eVar;
        ShortVideosWidgetCarouselItem.VideoItem videoItem = (ShortVideosWidgetCarouselItem.VideoItem) aVar;
        if (list.isEmpty()) {
            O5(iVar, videoItem, i12);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof a.b) {
            if (((a.b) obj).f98563a == i12) {
                iVar.getF98607b().post(new Runnable() { // from class: com.avito.android.avl_entry.impl.ui.internal_item.video.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        i iVar2 = iVar;
                        ViewGroup viewGroup = (ViewGroup) iVar2.getF98607b();
                        g gVar = this;
                        gVar.f98594c.g(viewGroup, new f(i12, gVar, iVar2));
                    }
                });
            }
        } else if ((obj instanceof a.C2957a) && i12 == ((a.C2957a) obj).f98562a) {
            iVar.i20();
        }
    }

    @Override // TV0.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void O5(@Y61.k i iVar, @Y61.k ShortVideosWidgetCarouselItem.VideoItem videoItem, int i12) {
        String strA = this.f98596e.a();
        String itemId = videoItem.getItemId();
        Integer numValueOf = Integer.valueOf(i12);
        Integer entryPosition = videoItem.getEntryPosition();
        Integer numValueOf2 = Integer.valueOf(entryPosition != null ? entryPosition.intValue() : 0);
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        this.f98595d.c(strA, itemId, numValueOf, numValueOf2, videoItem.f98559b);
        iVar.eE(videoItem.getThumbnail());
        iVar.i20();
        iVar.d(new a(iVar));
        iVar.l0(new b(videoItem, this, i12));
    }
}
