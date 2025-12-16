package com.avito.android.travel_seller_banners;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TravelSellerBannersInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.travel_seller_banners.TravelSellerBannersInteractorImpl", f = "TravelSellerBannersInteractorImpl.kt", i = {}, l = {60}, m = "getBannerForPage", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f303291q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f303292r;

    /* renamed from: s, reason: collision with root package name */
    public int f303293s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f303292r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f303291q = obj;
        this.f303293s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f303292r.a(null, this);
    }
}
