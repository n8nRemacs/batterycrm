package com.avito.android.autoteka.data.orderStatus;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutotekaOrderStatusInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.orderStatus.AutotekaPaymentStatusInteractorImpl", f = "AutotekaOrderStatusInteractor.kt", i = {}, l = {23}, m = "checkPaymentStatus", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f96185r;

    /* renamed from: s, reason: collision with root package name */
    public int f96186s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96185r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f96184q = obj;
        this.f96186s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96185r.a(null, this);
    }
}
