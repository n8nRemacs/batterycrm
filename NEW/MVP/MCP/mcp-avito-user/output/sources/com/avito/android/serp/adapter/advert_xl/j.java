package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mc.C44048a;
import mc.C44049b;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "videoUrl", "errorMessage", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268838l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268839m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f268840n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, AdvertXlItem advertXlItem, int i12) {
        super(2);
        this.f268838l = uVar;
        this.f268839m = advertXlItem;
        this.f268840n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        this.f268838l.f268873h.c(new C44048a(str, this.f268839m.f268777c, C44049b.a(VideoEventFromPage.f90107c), str2, Integer.valueOf(this.f268840n)));
        return G0.f406611a;
    }
}
