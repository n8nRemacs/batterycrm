package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacFinalLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractorImpl", f = "IacFinalLinkInteractor.kt", i = {0, 0, 0}, l = {113}, m = "getFinalLink", n = {"this", "params", "data"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes14.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f166012q;

    /* renamed from: r, reason: collision with root package name */
    public IacFinalLinkInteractor.Params f166013r;

    /* renamed from: s, reason: collision with root package name */
    public IacMetaInfoStorage.Data f166014s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f166015t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f166016u;

    /* renamed from: v, reason: collision with root package name */
    public int f166017v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f166016u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f166015t = obj;
        this.f166017v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f166016u.a(null, this);
    }
}
