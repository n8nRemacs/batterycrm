package com.avito.android.cpx_promo.impl.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.interactor.CpxPromoInteractorImpl", f = "CpxPromoInteractor.kt", i = {}, l = {102}, m = "updateManual", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f126989q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f126990r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f126991s;

    /* renamed from: t, reason: collision with root package name */
    public int f126992t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f126991s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f126990r = obj;
        this.f126992t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f126991s.c(null, 0L, null, this);
    }
}
