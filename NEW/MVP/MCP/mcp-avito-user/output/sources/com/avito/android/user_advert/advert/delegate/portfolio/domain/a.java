package com.avito.android.user_advert.advert.delegate.portfolio.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServicesPortfolioWidgetToggleInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.portfolio.domain.ServicesPortfolioWidgetToggleInteractor", f = "ServicesPortfolioWidgetToggleInteractor.kt", i = {}, l = {17}, m = "setToggleSwitched", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f308772q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f308773r;

    /* renamed from: s, reason: collision with root package name */
    public int f308774s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f308773r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f308772q = obj;
        this.f308774s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f308773r.a(null, this, false);
    }
}
