package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import mc.C44049b;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34819q extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f271363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f271365n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271366o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34819q(s sVar, AdvertItem advertItem, int i12, AdvertItem advertItem2) {
        super(1);
        this.f271363l = sVar;
        this.f271364m = advertItem;
        this.f271365n = i12;
        this.f271366o = advertItem2;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f271363l.f271375f.c(new mc.e(str, this.f271364m.f268425c, C44049b.a(VideoEventFromPage.f90107c), Integer.valueOf(this.f271365n), this.f271366o.f268455p0, null, null, 96, null));
        return G0.f406611a;
    }
}
