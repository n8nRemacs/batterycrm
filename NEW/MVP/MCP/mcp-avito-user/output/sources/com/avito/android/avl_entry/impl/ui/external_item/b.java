package com.avito.android.avl_entry.impl.ui.external_item;

import Kg.InterfaceC14312a;
import android.net.Uri;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C36135w2;
import com.avito.android.avl_entry.impl.ui.external_item.ShortVideosViewImpl;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.avl_entry.impl.util.e;
import com.avito.android.avl_public.repo.AvlVideoItem;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.util.InterfaceC35745a5;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.util.C36585a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShortVideosItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/b;", "LJg/b;", "Lcom/avito/android/avl_entry/impl/ui/external_item/j;", "LIg/d;", "a", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements Jg.b<j, Ig.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14312a f98524b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f98525c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98526d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Ig.f f98527e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f98528f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f98529g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f98530h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98531i = true;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f98532j = C42727D.c(new C2956b());

    /* compiled from: ShortVideosItemPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/b$a;", "", "<init>", "()V", "", "FROM_PAGE", "Ljava/lang/String;", "", "SHORT_VIDEO_LENGTH", "J", "TARGET_PAGE", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ShortVideosItemPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/d;", "invoke", "()Lcom/avito/android/avl_entry/impl/util/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.avl_entry.impl.ui.external_item.b$b, reason: collision with other inner class name */
    public static final class C2956b extends N implements Y41.a<com.avito.android.avl_entry.impl.util.d> {
        public C2956b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.avl_entry.impl.util.d invoke() {
            new e.b();
            return new com.avito.android.avl_entry.impl.util.e(b.this.f98528f);
        }
    }

    static {
        new a(null);
    }

    public b(@Y61.k InterfaceC14312a interfaceC14312a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.avl_analytics.a aVar, @Y61.k Ig.f fVar, @Y61.k com.avito.android.player_holder.a aVar2, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k C36135w2 c36135w2) {
        this.f98524b = interfaceC14312a;
        this.f98525c = interfaceC35745a5;
        this.f98526d = aVar;
        this.f98527e = fVar;
        this.f98528f = aVar2;
        this.f98529g = gVar;
        this.f98530h = c36135w2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.avito.android.avl_entry.impl.ui.external_item.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C42784z0 c42784z0;
        ArrayList arrayList;
        ShortVideosWidgetCarouselItem.VideoItem videoItem;
        AdvertImage image;
        DimmedImage image2;
        ?? r12 = (j) eVar;
        Ig.d dVar = (Ig.d) aVar;
        RecyclerView.C c12 = (RecyclerView.C) r12;
        dVar.getF98643h();
        r12.getClass();
        r12.setTitle(dVar.getTitle());
        boolean z12 = false;
        if (dVar.getIsNew()) {
            r12.Jq(true);
        } else {
            r12.Jq(false);
        }
        Parcelable parcelableA = this.f98524b.a(dVar.getF98643h());
        r12.e3(parcelableA);
        ShortVideosViewImpl.SavedState savedState = parcelableA instanceof ShortVideosViewImpl.SavedState ? (ShortVideosViewImpl.SavedState) parcelableA : null;
        int i13 = savedState != null ? savedState.f98514c : 0;
        List<BaseAvlVideoItem> listD1 = dVar.d1();
        if (listD1 != null) {
            String f96989b = dVar.getF98643h();
            Integer numValueOf = Integer.valueOf(c12.getAbsoluteAdapterPosition());
            String xHash = dVar.getXHash();
            boolean zF2 = dVar.getF98495b();
            String categoryId = dVar.getCategoryId();
            Analytics analytics = dVar.getF98496c();
            ArrayList arrayList2 = new ArrayList();
            int i14 = 0;
            for (Object obj : listD1) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BaseAvlVideoItem baseAvlVideoItem = (BaseAvlVideoItem) obj;
                String videoUrl = baseAvlVideoItem.getF98639d();
                if (videoUrl != null) {
                    if (baseAvlVideoItem instanceof AvlVideoItem) {
                        SerpAdvert serpAdvert = ((AvlVideoItem) baseAvlVideoItem).f98637b;
                        Image image3 = (serpAdvert == null || (image = serpAdvert.getImage()) == null || (image2 = image.getImage()) == null) ? null : image2.getImage();
                        String previewUrl = baseAvlVideoItem.getF98640e();
                        boolean z13 = i14 == 0 ? true : z12;
                        boolean z14 = listD1.size() == 1 ? true : z12;
                        arrayList = arrayList2;
                        videoItem = new ShortVideosWidgetCarouselItem.VideoItem(image3, videoUrl, previewUrl, f96989b, 3000L, z13, z14, categoryId, serpAdvert != null ? serpAdvert.getId() : null, numValueOf, xHash, zF2, analytics);
                    } else {
                        arrayList = arrayList2;
                        videoItem = null;
                    }
                    if (videoItem != null) {
                        arrayList.add(videoItem);
                    }
                } else {
                    arrayList = arrayList2;
                }
                arrayList2 = arrayList;
                i14 = i15;
                z12 = false;
            }
            ?? r52 = arrayList2;
            if (r52.size() > 1) {
                r52.add(new ShortVideosWidgetCarouselItem.ShowAllItem(f96989b, numValueOf, xHash, zF2, categoryId, analytics));
            }
            c42784z0 = r52;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c42784z0) {
            if (obj2 instanceof ShortVideosWidgetCarouselItem.VideoItem) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ShortVideosWidgetCarouselItem.VideoItem videoItem2 = (ShortVideosWidgetCarouselItem.VideoItem) it.next();
            String previewUrl2 = videoItem2.getPreviewUrl();
            if (previewUrl2 == null) {
                previewUrl2 = videoItem2.getVideoUrl();
            }
            Uri uri = Uri.parse(previewUrl2);
            O.c cVar = new O.c();
            cVar.f343535b = uri;
            Long lW2 = videoItem2.getVideoLength();
            if (lW2 != null) {
                long jLongValue = lW2.longValue();
                O.d.a aVar2 = new O.d.a();
                C36585a.b(jLongValue == Long.MIN_VALUE || jLongValue >= 0);
                aVar2.f343554b = jLongValue;
                cVar.f343537d = new O.d.a(aVar2.a(), null);
            }
            arrayList4.add(cVar.a());
        }
        InterfaceC42726C interfaceC42726C = this.f98532j;
        r12.Ug(arrayList4, (com.avito.android.avl_entry.impl.util.d) interfaceC42726C.getValue(), c42784z0);
        r12.oR((com.avito.android.avl_entry.impl.util.d) interfaceC42726C.getValue());
        r12.wX(c42784z0);
        Ig.f fVar = this.f98527e;
        fVar.c(i13);
        r12.s4(i13);
        int size = c42784z0.size();
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        InterfaceC35745a5 interfaceC35745a5 = this.f98525c;
        if (size > 0) {
            cVar2.b(A1.h(fVar.e().x0(interfaceC35745a5.e()).j0(interfaceC35745a5.e()), null, new h(size, this, r12), 3));
        }
        cVar2.b(A1.h(r12.v40().x0(interfaceC35745a5.e()).j0(interfaceC35745a5.e()), null, new c(this, r12, dVar), 3));
        r12.iU(new d(cVar2, this, r12));
        r12.d(new e(cVar2, r12));
        r12.D1(new f(dVar, this, i12), new g(this));
    }
}
