package com.avito.android.recall_me.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecallMeV2Interactor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.recall_me.domain.RecallMeV2InteractorImpl", f = "RecallMeV2Interactor.kt", i = {}, l = {50}, m = "getContactInfo", n = {}, s = {})
/* loaded from: classes16.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251860q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f251861r;

    /* renamed from: s, reason: collision with root package name */
    public int f251862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f251861r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f251860q = obj;
        this.f251862s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f251861r.b(null, this);
    }
}
