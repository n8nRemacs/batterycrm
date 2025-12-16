package com.avito.android.publish.edit_advert_request_mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EditRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestInteractorImpl", f = "EditRequestInteractor.kt", i = {}, l = {88}, m = "checkAuctionOffer", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f235579q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f235580r;

    /* renamed from: s, reason: collision with root package name */
    public int f235581s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f235580r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f235579q = obj;
        this.f235581s |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.b(this.f235580r, null, null, this);
    }
}
