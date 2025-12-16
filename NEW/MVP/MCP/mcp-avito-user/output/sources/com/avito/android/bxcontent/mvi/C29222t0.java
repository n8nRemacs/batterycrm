package com.avito.android.bxcontent.mvi;

import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.serp.i;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "", "<name for destructuring parameter 0>", "", "Lcom/avito/android/serp/adapter/l1;", "apply", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.t0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29222t0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f112567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SerpDisplayType f112568c;

    public C29222t0(F f12, SerpDisplayType serpDisplayType) {
        this.f112567b = f12;
        this.f112568c = serpDisplayType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        CommercialBannerItem commercialBannerItem = (CommercialBannerItem) q12.f406619b;
        Boolean bool = (Boolean) q12.f406620c;
        bool.getClass();
        return new kotlin.Q(i.a.a(this.f112567b.f111280b, Collections.singletonList(commercialBannerItem), SerpDisplayTypeKt.orDefault(this.f112568c), null, null, false, null, 124), bool);
    }
}
