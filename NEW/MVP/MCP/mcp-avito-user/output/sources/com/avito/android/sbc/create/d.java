package com.avito.android.sbc.create;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.CreateDiscountDispatchInteractorImpl", f = "CreateDiscountDispatchInteractor.kt", i = {}, l = {63}, m = "initialDataRequestV3", n = {}, s = {})
/* loaded from: classes3.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259177q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f259178r;

    /* renamed from: s, reason: collision with root package name */
    public int f259179s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259178r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259177q = obj;
        this.f259179s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f259178r.c(null, null, this);
    }
}
