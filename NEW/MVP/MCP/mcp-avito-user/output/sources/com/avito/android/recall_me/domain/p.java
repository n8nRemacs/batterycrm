package com.avito.android.recall_me.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecallMeV2Interactor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.recall_me.domain.RecallMeV2InteractorImpl", f = "RecallMeV2Interactor.kt", i = {}, l = {74}, m = "getContactInfoWithDefaultPhone", n = {}, s = {})
/* loaded from: classes16.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251863q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f251864r;

    /* renamed from: s, reason: collision with root package name */
    public int f251865s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f251864r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f251863q = obj;
        this.f251865s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f251864r.d(null, null, this);
    }
}
