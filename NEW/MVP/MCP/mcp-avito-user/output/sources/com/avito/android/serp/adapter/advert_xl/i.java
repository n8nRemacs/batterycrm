package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mc.C44049b;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "videoUrl", "", "duration", "playbackPosition", "Lcom/avito/android/analytics/event/native_video/VideoStopReason;", "videoStopReason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;DDLcom/avito/android/analytics/event/native_video/VideoStopReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.r<String, Double, Double, VideoStopReason, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268835l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268836m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f268837n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, AdvertXlItem advertXlItem, int i12) {
        super(4);
        this.f268835l = uVar;
        this.f268836m = advertXlItem;
        this.f268837n = i12;
    }

    @Override // Y41.r
    public final G0 invoke(String str, Double d12, Double d13, VideoStopReason videoStopReason) {
        double dDoubleValue = d12.doubleValue();
        double dDoubleValue2 = d13.doubleValue();
        u uVar = this.f268835l;
        uVar.f268873h.c(new mc.g(str, this.f268836m.f268777c, C44049b.a(VideoEventFromPage.f90107c), Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), Integer.valueOf(this.f268837n), null, videoStopReason, null, 256, null));
        return G0.f406611a;
    }
}
