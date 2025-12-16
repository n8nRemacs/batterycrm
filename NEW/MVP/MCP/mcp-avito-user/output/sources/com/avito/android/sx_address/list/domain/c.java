package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxAddressListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.list.domain.SxAddressListInteractorImpl", f = "SxAddressListInteractor.kt", i = {}, l = {30}, m = "deleteAddress", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f293181q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f293182r;

    /* renamed from: s, reason: collision with root package name */
    public int f293183s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f293182r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f293181q = obj;
        this.f293183s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f293182r.b(null, this);
    }
}
