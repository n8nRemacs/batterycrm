package com.avito.android.cpx_promo.v2.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoV2Interactor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.domain.CpxPromoV2InteractorImpl", f = "CpxPromoV2Interactor.kt", i = {0, 0}, l = {58}, m = "fetchCpxPromo", n = {"this", "itemId"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f127459q;

    /* renamed from: r, reason: collision with root package name */
    public String f127460r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127461s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f127462t;

    /* renamed from: u, reason: collision with root package name */
    public int f127463u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f127462t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f127461s = obj;
        this.f127463u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f127462t.b(null, null, this);
    }
}
