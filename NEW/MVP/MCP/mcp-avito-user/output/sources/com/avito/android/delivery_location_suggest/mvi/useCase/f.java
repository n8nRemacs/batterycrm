package com.avito.android.delivery_location_suggest.mvi.useCase;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SearchSuggestionsUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.mvi.useCase.SearchSuggestionsUseCase", f = "SearchSuggestionsUseCase.kt", i = {0}, l = {30}, m = "invoke$_avito_delivery_location_suggest_impl", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f135200q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135201r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f135202s;

    /* renamed from: t, reason: collision with root package name */
    public int f135203t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f135202s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f135201r = obj;
        this.f135203t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f135202s.a(null, this);
    }
}
