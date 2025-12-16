package com.avito.android.historical_suggests.suggest.usecase;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetIdFromJwtUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.usecase.GetIdFromJwtUseCase", f = "GetIdFromJwtUseCase.kt", i = {0}, l = {15, 16}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f162164q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f162165r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f162166s;

    /* renamed from: t, reason: collision with root package name */
    public int f162167t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162166s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162165r = obj;
        this.f162167t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f162166s.a(null, this);
    }
}
