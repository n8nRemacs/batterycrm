package com.avito.android.pagination.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import r50.AbstractC47493a;

/* compiled from: DataFetcherImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.pagination.domain.DataFetcherImpl", f = "DataFetcherImpl.kt", i = {0, 0, 1, 1, 2, 2}, l = {13, 14, 15}, m = "fetchData", n = {"this", "direction", "this", "direction", "this", "direction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f210569q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f210570r;

    /* renamed from: s, reason: collision with root package name */
    public int f210571s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f210570r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        b bVar;
        this.f210569q = obj;
        this.f210571s |= BeduinInputModel.MIN_TEXT_VERSION;
        c cVar = this.f210570r;
        cVar.getClass();
        int i12 = this.f210571s;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f210571s = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            bVar = this;
        } else {
            bVar = new b(cVar, this);
        }
        Object obj2 = bVar.f210569q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f210571s;
        if (i13 == 0) {
            C42729a0.b(obj2);
            L.f(null, AbstractC47493a.b.f429597a);
            throw null;
        }
        if (i13 == 1) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 == 2) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        throw null;
    }
}
