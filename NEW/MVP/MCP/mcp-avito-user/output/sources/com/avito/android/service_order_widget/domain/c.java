package com.avito.android.service_order_widget.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServiceOrderRequestInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_order_widget.domain.ServiceOrderRequestInteractorImpl", f = "ServiceOrderRequestInteractorImpl.kt", i = {0, 1}, l = {23, 44}, m = "sendServiceOrderRequest", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f278827q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f278828r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f278829s;

    /* renamed from: t, reason: collision with root package name */
    public int f278830t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f278829s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f278828r = obj;
        this.f278830t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f278829s.a(null, null, null, this);
    }
}
