package com.avito.android.virtual_deal_room_invite.invite.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InviteInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl", f = "InviteInteractor.kt", i = {}, l = {125}, m = "getDeeplink", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f327025q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f327026r;

    /* renamed from: s, reason: collision with root package name */
    public int f327027s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327026r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f327025q = obj;
        this.f327027s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.d(this.f327026r, null, this);
    }
}
