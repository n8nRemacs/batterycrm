package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxNewAddressInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.new_address.domain.SxNewAddressInteractorImpl", f = "SxNewAddressInteractor.kt", i = {}, l = {52}, m = "editAddressInfo", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f293652q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f293653r;

    /* renamed from: s, reason: collision with root package name */
    public int f293654s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f293653r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f293652q = obj;
        this.f293654s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f293653r.b(0L, null, this);
    }
}
