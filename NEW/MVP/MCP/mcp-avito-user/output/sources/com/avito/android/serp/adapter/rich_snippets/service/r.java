package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import mc.C44049b;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "videoUrl", "", "duration", "playbackPosition", "Lcom/avito/android/analytics/event/native_video/VideoStopReason;", "videoStopReason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;DDLcom/avito/android/analytics/event/native_video/VideoStopReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.r<String, Double, Double, VideoStopReason, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f271367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f271369n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271370o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, AdvertItem advertItem, int i12, AdvertItem advertItem2) {
        super(4);
        this.f271367l = sVar;
        this.f271368m = advertItem;
        this.f271369n = i12;
        this.f271370o = advertItem2;
    }

    @Override // Y41.r
    public final G0 invoke(String str, Double d12, Double d13, VideoStopReason videoStopReason) {
        double dDoubleValue = d12.doubleValue();
        double dDoubleValue2 = d13.doubleValue();
        this.f271367l.f271375f.c(new mc.g(str, this.f271368m.f268425c, C44049b.a(VideoEventFromPage.f90107c), Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), Integer.valueOf(this.f271369n), this.f271370o.f268455p0, videoStopReason, null, 256, null));
        return G0.f406611a;
    }
}
