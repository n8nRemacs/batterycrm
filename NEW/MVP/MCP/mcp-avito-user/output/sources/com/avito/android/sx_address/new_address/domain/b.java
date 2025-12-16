package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxNewAddressInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.new_address.domain.SxNewAddressInteractorImpl", f = "SxNewAddressInteractor.kt", i = {}, l = {33}, m = "addAddress", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f293640q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f293641r;

    /* renamed from: s, reason: collision with root package name */
    public int f293642s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f293641r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f293640q = obj;
        this.f293642s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f293641r.e(null, this);
    }
}
