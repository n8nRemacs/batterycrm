package com.avito.android.autoteka.data.order;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutotekaLoadPaymentInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaLoadPaymentInteractorImpl", f = "AutotekaLoadPaymentInteractor.kt", i = {}, l = {32}, m = "invoke", n = {}, s = {})
/* loaded from: classes11.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96171q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f96172r;

    /* renamed from: s, reason: collision with root package name */
    public int f96173s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96172r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96171q = obj;
        this.f96173s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96172r.a(null, null, null, null, null, null, this);
    }
}
