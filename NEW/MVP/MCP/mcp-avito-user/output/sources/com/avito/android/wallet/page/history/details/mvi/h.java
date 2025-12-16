package com.avito.android.wallet.page.history.details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentHistoryDetailsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsInteractor", f = "PaymentHistoryDetailsInteractor.kt", i = {}, l = {18}, m = "getDetails", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f327957q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f327958r;

    /* renamed from: s, reason: collision with root package name */
    public int f327959s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327958r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f327957q = obj;
        this.f327959s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f327958r.b(this);
    }
}
