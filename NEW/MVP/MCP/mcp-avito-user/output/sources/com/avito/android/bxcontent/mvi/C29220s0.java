package com.avito.android.bxcontent.mvi;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00000\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.s0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29220s0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f112548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f112549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112551e;

    public C29220s0(F f12, long j12, int i12, int i13) {
        this.f112548b = f12;
        this.f112549c = j12;
        this.f112550d = i12;
        this.f112551e = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        int iIntValue = ((Number) q12.f406619b).intValue();
        CommercialBannerItem commercialBannerItem = (CommercialBannerItem) q12.f406620c;
        CommercialBanner commercialBanner = commercialBannerItem.getCommercialBanner();
        return this.f112548b.f111292n.c(commercialBanner, this.f112549c, Integer.valueOf(this.f112550d), Integer.valueOf(this.f112551e + iIntValue)).d0(new C29215p0(commercialBannerItem)).m0(new C29217q0(commercialBannerItem)).d0(new C29218r0(commercialBannerItem));
    }
}
