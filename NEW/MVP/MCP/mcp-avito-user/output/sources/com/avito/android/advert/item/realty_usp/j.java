package com.avito.android.advert.item.realty_usp;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealtyUspPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.realty_usp.RealtyUspPresenterImpl", f = "RealtyUspPresenter.kt", i = {0}, l = {85}, m = "shouldStartShimmer", n = {"itemId"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f78410q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f78411r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f78412s;

    /* renamed from: t, reason: collision with root package name */
    public int f78413t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f78412s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f78411r = obj;
        this.f78413t |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.k(this.f78412s, null, this);
    }
}
