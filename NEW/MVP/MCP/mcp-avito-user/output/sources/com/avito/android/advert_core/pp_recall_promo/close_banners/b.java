package com.avito.android.advert_core.pp_recall_promo.close_banners;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComfortableDealPromoBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert_core.pp_recall_promo.close_banners.RemoteCloseBannerInteractorImpl", f = "ComfortableDealPromoBannerInteractor.kt", i = {}, l = {17}, m = "close", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f83956q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f83957r;

    /* renamed from: s, reason: collision with root package name */
    public int f83958s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f83957r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f83956q = obj;
        this.f83958s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f83957r.a(null, null, null, this);
    }
}
