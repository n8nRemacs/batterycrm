package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectAddressListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.domain.SelectAddressListInteractorImpl", f = "SelectAddressListInteractor.kt", i = {}, l = {19}, m = "getAddressList", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f294086q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f294087r;

    /* renamed from: s, reason: collision with root package name */
    public int f294088s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f294087r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f294086q = obj;
        this.f294088s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f294087r.a(0L, this);
    }
}
