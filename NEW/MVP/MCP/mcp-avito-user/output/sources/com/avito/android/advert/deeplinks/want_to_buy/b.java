package com.avito.android.advert.deeplinks.want_to_buy;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdvertWantToBuyInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.deeplinks.want_to_buy.AdvertWantToBuyInteractorImpl", f = "AdvertWantToBuyInteractor.kt", i = {}, l = {18}, m = "request", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f69038q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f69039r;

    /* renamed from: s, reason: collision with root package name */
    public int f69040s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f69039r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f69038q = obj;
        this.f69040s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f69039r.a(null, this);
    }
}
