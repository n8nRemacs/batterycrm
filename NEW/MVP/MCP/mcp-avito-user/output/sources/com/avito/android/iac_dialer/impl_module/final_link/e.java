package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.final_link.a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacFinalLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractorImpl", f = "IacFinalLinkInteractor.kt", i = {0}, l = {501}, m = "loadFallbackScreenClosingActionInterceptorLink", n = {"this"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f166031q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166032r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f166033s;

    /* renamed from: t, reason: collision with root package name */
    public int f166034t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f166033s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f166032r = obj;
        this.f166034t |= BeduinInputModel.MIN_TEXT_VERSION;
        a.C4921a c4921a = a.f166002i;
        return this.f166033s.f(null, this);
    }
}
