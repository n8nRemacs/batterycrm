package com.avito.android.user_address.list.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.list.domain.UserAddressListInteractorImpl", f = "UserAddressListInteractor.kt", i = {}, l = {20}, m = "setDefault", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f307359q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f307360r;

    /* renamed from: s, reason: collision with root package name */
    public int f307361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f307360r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f307359q = obj;
        this.f307361s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f307360r.a(0, this);
    }
}
