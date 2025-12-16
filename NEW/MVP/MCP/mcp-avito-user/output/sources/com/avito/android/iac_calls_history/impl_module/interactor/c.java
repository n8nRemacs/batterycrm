package com.avito.android.iac_calls_history.impl_module.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallsHistoryListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.interactor.CallsHistoryListInteractorImpl", f = "CallsHistoryListInteractor.kt", i = {0}, l = {46}, m = "getCallsHistory", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f164720q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f164721r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f164722s;

    /* renamed from: t, reason: collision with root package name */
    public int f164723t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f164722s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f164721r = obj;
        this.f164723t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f164722s.a(null, null, this);
    }
}
