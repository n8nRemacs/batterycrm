package com.avito.android.service_orders.mvi.domain;

import Su0.C15236l;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceOrdersListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl", f = "ServiceOrdersListInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {131, 137, 145, 152, 160}, m = "handeSuccessResponse", n = {"this", "$this$handeSuccessResponse", "result", "sellerTab", "isAppendingLoad", "this", "$this$handeSuccessResponse", "sellerTab", "isAppendingLoad"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes3.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f279484q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f279485r;

    /* renamed from: s, reason: collision with root package name */
    public Object f279486s;

    /* renamed from: t, reason: collision with root package name */
    public C15236l f279487t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279488u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f279489v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f279490w;

    /* renamed from: x, reason: collision with root package name */
    public int f279491x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f279490w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f279489v = obj;
        this.f279491x |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.b(this.f279490w, null, null, false, this);
    }
}
