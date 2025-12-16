package com.avito.android.user_address.map.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressMapInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.map.domain.UserAddressAddNewAddressInteractorImpl", f = "UserAddressMapInteractor.kt", i = {}, l = {131}, m = "addNewAddressV2", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f307592q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f307593r;

    /* renamed from: s, reason: collision with root package name */
    public int f307594s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f307593r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f307592q = obj;
        this.f307594s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f307593r.c(null, this);
    }
}
