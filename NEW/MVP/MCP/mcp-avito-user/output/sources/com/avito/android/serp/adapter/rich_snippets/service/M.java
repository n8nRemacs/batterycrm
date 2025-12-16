package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import mc.C44049b;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f271275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271276m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f271277n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271278o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o12, AdvertXlItem advertXlItem, int i12, AdvertXlItem advertXlItem2) {
        super(1);
        this.f271275l = o12;
        this.f271276m = advertXlItem;
        this.f271277n = i12;
        this.f271278o = advertXlItem2;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f271275l.f271287f.c(new mc.e(str, this.f271276m.f268777c, C44049b.a(VideoEventFromPage.f90107c), Integer.valueOf(this.f271277n), this.f271278o.f268774a0, null, null, 96, null));
        return G0.f406611a;
    }
}
