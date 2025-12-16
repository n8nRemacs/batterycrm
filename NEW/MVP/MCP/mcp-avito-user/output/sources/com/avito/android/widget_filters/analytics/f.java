package com.avito.android.widget_filters.analytics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WidgetFiltersItemsVisibilityTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.widget_filters.analytics.WidgetFiltersItemsVisibilityTrackerImpl", f = "WidgetFiltersItemsVisibilityTracker.kt", i = {0, 0, 0}, l = {53}, m = "clearItemShowed", n = {"this", "key", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f329710q;

    /* renamed from: r, reason: collision with root package name */
    public String f329711r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f329712s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f329713t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f329714u;

    /* renamed from: v, reason: collision with root package name */
    public int f329715v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329714u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329713t = obj;
        this.f329715v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f329714u.b(null, this);
    }
}
