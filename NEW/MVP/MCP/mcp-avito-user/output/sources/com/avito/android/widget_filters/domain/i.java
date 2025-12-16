package com.avito.android.widget_filters.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WidgetFiltersInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersInteractorImpl", f = "WidgetFiltersInteractor.kt", i = {0, 0}, l = {144}, m = "emitToastEvents", n = {"this", "toastClickStream"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f329865q;

    /* renamed from: r, reason: collision with root package name */
    public ParametrizedEvent f329866r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f329867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f329868t;

    /* renamed from: u, reason: collision with root package name */
    public int f329869u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329868t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329867s = obj;
        this.f329869u |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.c(this.f329868t, null, null, this);
    }
}
