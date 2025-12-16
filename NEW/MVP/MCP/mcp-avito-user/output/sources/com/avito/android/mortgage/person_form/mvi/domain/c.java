package com.avito.android.mortgage.person_form.mvi.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetMortgageFormUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.GetMortgageFormUseCaseImpl", f = "GetMortgageFormUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {40, 42, 54, 56}, m = "getMortgageForm", n = {"this", "applicationId", "applicantId", "step", "onSuccess", "onFailed", "this", "onSuccess", "onFailed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f201041q;

    /* renamed from: r, reason: collision with root package name */
    public Object f201042r;

    /* renamed from: s, reason: collision with root package name */
    public Object f201043s;

    /* renamed from: t, reason: collision with root package name */
    public String f201044t;

    /* renamed from: u, reason: collision with root package name */
    public Y41.p f201045u;

    /* renamed from: v, reason: collision with root package name */
    public Y41.p f201046v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f201047w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f201048x;

    /* renamed from: y, reason: collision with root package name */
    public int f201049y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f201048x = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f201047w = obj;
        this.f201049y |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f201048x.a(null, null, null, null, null, null, this);
    }
}
