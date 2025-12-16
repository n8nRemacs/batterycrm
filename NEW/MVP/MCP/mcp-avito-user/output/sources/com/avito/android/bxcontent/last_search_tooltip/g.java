package com.avito.android.bxcontent.last_search_tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LastSearchTooltipInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.last_search_tooltip.LastSearchTooltipInteractorImpl", f = "LastSearchTooltipInteractor.kt", i = {0, 0, 0, 1, 1}, l = {41, 43}, m = "getTooltipIfNeeded", n = {"this", "searchParams", "context", "this", "categoryId"}, s = {"L$0", "L$1", "L$2", "L$0", "J$0"})
/* loaded from: classes12.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f111169q;

    /* renamed from: r, reason: collision with root package name */
    public SearchParams f111170r;

    /* renamed from: s, reason: collision with root package name */
    public String f111171s;

    /* renamed from: t, reason: collision with root package name */
    public Long f111172t;

    /* renamed from: u, reason: collision with root package name */
    public long f111173u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f111174v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f111175w;

    /* renamed from: x, reason: collision with root package name */
    public int f111176x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f111175w = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f111174v = obj;
        this.f111176x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f111175w.a(null, null, this);
    }
}
