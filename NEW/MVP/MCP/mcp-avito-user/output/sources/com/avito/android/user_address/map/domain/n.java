package com.avito.android.user_address.map.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressMapInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.map.domain.UserAddressAddNewAddressInteractorImpl", f = "UserAddressMapInteractor.kt", i = {}, l = {173}, m = "updateAddressV2", n = {}, s = {})
/* loaded from: classes4.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f307615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f307616r;

    /* renamed from: s, reason: collision with root package name */
    public int f307617s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f307616r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f307615q = obj;
        this.f307617s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f307616r.i(null, this);
    }
}
