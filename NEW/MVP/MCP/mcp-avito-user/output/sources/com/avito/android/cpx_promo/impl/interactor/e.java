package com.avito.android.cpx_promo.impl.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.interactor.CpxPromoInteractorImpl", f = "CpxPromoInteractor.kt", i = {}, l = {110}, m = "updateAuto", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f126985q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f126986r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f126987s;

    /* renamed from: t, reason: collision with root package name */
    public int f126988t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f126987s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f126986r = obj;
        this.f126988t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f126987s.a(null, 0L, null, this);
    }
}
