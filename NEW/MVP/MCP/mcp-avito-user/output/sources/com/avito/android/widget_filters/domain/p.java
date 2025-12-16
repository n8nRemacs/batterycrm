package com.avito.android.widget_filters.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WidgetFiltersOnboardingInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersOnboardingInteractorImpl", f = "WidgetFiltersOnboardingInteractor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "canShowOnboarding", n = {}, s = {})
/* loaded from: classes5.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f329894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f329895r;

    /* renamed from: s, reason: collision with root package name */
    public int f329896s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329895r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329894q = obj;
        this.f329896s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f329895r.a(null, this);
    }
}
