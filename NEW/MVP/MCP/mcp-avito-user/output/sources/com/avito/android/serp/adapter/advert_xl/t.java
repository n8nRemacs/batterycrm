package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mc.C44049b;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f268866n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, AdvertXlItem advertXlItem, int i12) {
        super(1);
        this.f268864l = uVar;
        this.f268865m = advertXlItem;
        this.f268866n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        u uVar = this.f268864l;
        uVar.f268873h.c(new mc.e(str2, this.f268865m.f268777c, C44049b.a(VideoEventFromPage.f90107c), Integer.valueOf(this.f268866n), null, null, null, 96, null));
        return G0.f406611a;
    }
}
