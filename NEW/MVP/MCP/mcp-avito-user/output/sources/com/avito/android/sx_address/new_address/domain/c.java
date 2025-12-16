package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxNewAddressInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.new_address.domain.SxNewAddressInteractorImpl", f = "SxNewAddressInteractor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "addAddressInfo", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f293643q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f293644r;

    /* renamed from: s, reason: collision with root package name */
    public int f293645s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f293644r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f293643q = obj;
        this.f293645s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f293644r.d(null, this);
    }
}
