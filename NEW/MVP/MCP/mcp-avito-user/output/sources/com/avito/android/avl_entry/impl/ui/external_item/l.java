package com.avito.android.avl_entry.impl.ui.external_item;

import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.avl_entry.impl.util.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avl_entry/impl/util/e$c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<e.c.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ShortVideosViewImpl f98550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.avl_entry.impl.util.d f98551m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f98552n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ShortVideosViewImpl shortVideosViewImpl, com.avito.android.avl_entry.impl.util.d dVar, List<? extends ShortVideosWidgetCarouselItem> list) {
        super(1);
        this.f98550l = shortVideosViewImpl;
        this.f98551m = dVar;
        this.f98552n = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(e.c.a aVar) {
        e.c.a aVar2 = aVar;
        if (!(aVar2 instanceof e.c.a.b) && !(aVar2 instanceof e.c.a.C2961a) && !(aVar2 instanceof e.c.a.C2962c)) {
            boolean z12 = aVar2 instanceof e.c.a.d;
            ?? r12 = this.f98552n;
            com.avito.android.avl_entry.impl.util.d dVar = this.f98551m;
            ShortVideosViewImpl shortVideosViewImpl = this.f98550l;
            if (z12) {
                if (shortVideosViewImpl.f98512o) {
                    shortVideosViewImpl.f98500c.d(dVar.getF98620d());
                    int f98620d = dVar.getF98620d();
                    if (!((Collection) r12).isEmpty() && f98620d >= 0 && r12.size() > f98620d) {
                        Object obj = r12.get(f98620d);
                        ShortVideosWidgetCarouselItem.VideoItem videoItem = obj instanceof ShortVideosWidgetCarouselItem.VideoItem ? (ShortVideosWidgetCarouselItem.VideoItem) obj : null;
                        if (videoItem != null) {
                            String previewUrl = videoItem.getPreviewUrl();
                            String itemId = videoItem.getItemId();
                            Double dValueOf = videoItem.getVideoLength() != null ? Double.valueOf(r0.longValue() / 1000.0d) : null;
                            Integer numValueOf = Integer.valueOf(shortVideosViewImpl.getLayoutPosition());
                            String xHash = videoItem.getXHash();
                            VideoStopReason videoStopReason = VideoStopReason.f90111b;
                            shortVideosViewImpl.f98502e.f(dValueOf, numValueOf, previewUrl, itemId, xHash);
                        }
                    }
                }
            } else if (aVar2 instanceof e.c.a.C2963e) {
                int f98620d2 = dVar.getF98620d();
                if (!((Collection) r12).isEmpty() && f98620d2 >= 0 && r12.size() > f98620d2) {
                    Object obj2 = r12.get(f98620d2);
                    ShortVideosWidgetCarouselItem.VideoItem videoItem2 = obj2 instanceof ShortVideosWidgetCarouselItem.VideoItem ? (ShortVideosWidgetCarouselItem.VideoItem) obj2 : null;
                    if (videoItem2 != null) {
                        com.avito.android.avl_analytics.a aVar3 = shortVideosViewImpl.f98502e;
                        String previewUrl2 = videoItem2.getPreviewUrl();
                        String itemId2 = videoItem2.getItemId();
                        aVar3.k(videoItem2.getVideoLength() != null ? Double.valueOf(r14.longValue() / 1000.0d) : null, Integer.valueOf(shortVideosViewImpl.getLayoutPosition()), previewUrl2, itemId2, videoItem2.getXHash());
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
