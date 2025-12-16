package com.avito.android.autoteka.data.choosingProduct;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: AutotekaChoosingPurchaseInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.choosingProduct.AutotekaChoosingPurchaseInteractorImpl", f = "AutotekaChoosingPurchaseInteractor.kt", i = {0, 0, 1}, l = {31, 43}, m = "getChoosingPurchaseState", n = {"this", "resp", "$this$getChoosingPurchaseState_u24lambda_u243"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f96102q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f96103r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96104s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f96105t;

    /* renamed from: u, reason: collision with root package name */
    public int f96106u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96105t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f96104s = obj;
        this.f96106u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96105t.a(null, false, null, null, false, this);
    }
}
