package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MortgageApplicationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.MortgageApplicationInteractorImpl", f = "MortgageApplicationInteractor.kt", i = {0, 0, 0, 0, 1, 1}, l = {56, 58, 60, 61}, m = "getApplication", n = {"this", "applicationId", "onSuccess", "onFailed", "onSuccess", "onFailed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f202975q;

    /* renamed from: r, reason: collision with root package name */
    public Object f202976r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.p f202977s;

    /* renamed from: t, reason: collision with root package name */
    public Y41.p f202978t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f202979u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A f202980v;

    /* renamed from: w, reason: collision with root package name */
    public int f202981w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f202980v = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f202979u = obj;
        this.f202981w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f202980v.a(null, null, null, null, this);
    }
}
