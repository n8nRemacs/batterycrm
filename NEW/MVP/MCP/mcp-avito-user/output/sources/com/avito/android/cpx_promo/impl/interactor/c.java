package com.avito.android.cpx_promo.impl.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.interactor.CpxPromoInteractorImpl", f = "CpxPromoInteractor.kt", i = {0, 0}, l = {56}, m = "fetchCpxPromo", n = {"this", "itemId"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f126976q;

    /* renamed from: r, reason: collision with root package name */
    public String f126977r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f126978s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f126979t;

    /* renamed from: u, reason: collision with root package name */
    public int f126980u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f126979t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f126978s = obj;
        this.f126980u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f126979t.b(null, null, this);
    }
}
