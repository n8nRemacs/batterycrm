package com.avito.android.user_address.map.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressMapInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.map.domain.UserAddressAddNewAddressInteractorImpl", f = "UserAddressMapInteractor.kt", i = {}, l = {190}, m = "deleteAddress", n = {}, s = {})
/* loaded from: classes4.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f307595q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f307596r;

    /* renamed from: s, reason: collision with root package name */
    public int f307597s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f307596r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f307595q = obj;
        this.f307597s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f307596r.e(0, this);
    }
}
