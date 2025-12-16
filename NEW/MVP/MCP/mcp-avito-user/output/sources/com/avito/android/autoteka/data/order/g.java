package com.avito.android.autoteka.data.order;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutotekaGetOrderItemInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaGetOrderItemInteractorImpl", f = "AutotekaGetOrderItemInteractor.kt", i = {}, l = {32}, m = "invoke", n = {}, s = {})
/* loaded from: classes11.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.autoteka.presentation.payment.mvi.mapper.a f96158q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f96159r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f96160s;

    /* renamed from: t, reason: collision with root package name */
    public int f96161t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96160s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96159r = obj;
        this.f96161t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96160s.a(null, null, null, null, null, null, this);
    }
}
