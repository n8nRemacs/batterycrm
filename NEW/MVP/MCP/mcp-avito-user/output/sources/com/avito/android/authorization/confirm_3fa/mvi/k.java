package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConfirmEmailListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.mvi.ConfirmEmailListInteractorImpl", f = "ConfirmEmailListInteractor.kt", i = {}, l = {22}, m = "requestEmailConfirmation", n = {}, s = {})
/* loaded from: classes11.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f93618q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f93619r;

    /* renamed from: s, reason: collision with root package name */
    public int f93620s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f93619r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f93618q = obj;
        this.f93620s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f93619r.a(null, this);
    }
}
