package com.avito.android.cpx_promo.impl.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CpxPromoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.interactor.CpxPromoInteractorImpl", f = "CpxPromoInteractor.kt", i = {}, l = {114}, m = "removePromotion", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f126981q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f126982r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f126983s;

    /* renamed from: t, reason: collision with root package name */
    public int f126984t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f126983s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f126982r = obj;
        this.f126984t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f126983s.d(null, this);
    }
}
