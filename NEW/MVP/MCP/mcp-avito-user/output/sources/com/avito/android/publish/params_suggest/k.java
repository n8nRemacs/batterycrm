package com.avito.android.publish.params_suggest;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ParamsSuggestionsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.params_suggest.ParamsSuggestionsInteractorImpl", f = "ParamsSuggestionsInteractor.kt", i = {}, l = {105}, m = "getParamsSuggestsV2", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f238217q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f238218r;

    /* renamed from: s, reason: collision with root package name */
    public int f238219s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f238218r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f238217q = obj;
        this.f238219s |= BeduinInputModel.MIN_TEXT_VERSION;
        return l.b(this.f238218r, null, this);
    }
}
