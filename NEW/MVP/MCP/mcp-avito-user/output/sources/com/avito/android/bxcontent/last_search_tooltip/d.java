package com.avito.android.bxcontent.last_search_tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LastSearchTooltipInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.last_search_tooltip.LastSearchTooltipInteractorImpl", f = "LastSearchTooltipInteractor.kt", i = {0}, l = {87}, m = "fetchTooltip", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f111163q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111164r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f111165s;

    /* renamed from: t, reason: collision with root package name */
    public int f111166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f111165s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f111164r = obj;
        this.f111166t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f111165s.c(0L, null, null, this);
    }
}
