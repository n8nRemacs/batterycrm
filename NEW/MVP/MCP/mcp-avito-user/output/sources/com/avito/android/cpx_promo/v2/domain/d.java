package com.avito.android.cpx_promo.v2.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoV2Interactor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.domain.CpxPromoV2InteractorImpl", f = "CpxPromoV2Interactor.kt", i = {}, l = {203}, m = "removePromotion", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f127464q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127465r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f127466s;

    /* renamed from: t, reason: collision with root package name */
    public int f127467t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f127466s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f127465r = obj;
        this.f127467t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f127466s.d(null, this);
    }
}
