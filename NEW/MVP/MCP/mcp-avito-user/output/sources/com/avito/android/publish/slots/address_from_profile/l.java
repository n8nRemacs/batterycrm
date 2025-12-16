package com.avito.android.publish.slots.address_from_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectAddressInListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListInteractorImpl", f = "SelectAddressInListInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "getAddressList", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f242843q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f242844r;

    /* renamed from: s, reason: collision with root package name */
    public int f242845s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242844r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f242843q = obj;
        this.f242845s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f242844r.a(0L, this);
    }
}
