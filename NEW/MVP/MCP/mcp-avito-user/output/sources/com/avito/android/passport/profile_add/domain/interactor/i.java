package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportFinishMergeInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.PassportFinishMergeInteractorImpl", f = "PassportFinishMergeInteractor.kt", i = {0, 1}, l = {39, 54}, m = "finishAccountsMergeWithConversion", n = {"this", "it"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f212331q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212332r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f212333s;

    /* renamed from: t, reason: collision with root package name */
    public int f212334t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f212333s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f212332r = obj;
        this.f212334t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f212333s.a(0, null, null, null, this);
    }
}
