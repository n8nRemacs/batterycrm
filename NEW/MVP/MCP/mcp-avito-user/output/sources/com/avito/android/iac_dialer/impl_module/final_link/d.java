package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.AutomaticGsmClickSource;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacFinalLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractorImpl", f = "IacFinalLinkInteractor.kt", i = {}, l = {176, 256, 277}, m = "getFinalLinkRemote", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f166022q;

    /* renamed from: r, reason: collision with root package name */
    public IacMetaInfoStorage.Data f166023r;

    /* renamed from: s, reason: collision with root package name */
    public IacFinalLinkInteractor.Params f166024s;

    /* renamed from: t, reason: collision with root package name */
    public DeepLink f166025t;

    /* renamed from: u, reason: collision with root package name */
    public DeepLink f166026u;

    /* renamed from: v, reason: collision with root package name */
    public AutomaticGsmClickSource f166027v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f166028w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f166029x;

    /* renamed from: y, reason: collision with root package name */
    public int f166030y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f166029x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f166028w = obj;
        this.f166030y |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.b(this.f166029x, null, null, this);
    }
}
