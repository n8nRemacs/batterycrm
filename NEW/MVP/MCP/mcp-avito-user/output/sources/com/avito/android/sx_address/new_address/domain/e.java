package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxNewAddressInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.new_address.domain.SxNewAddressInteractorImpl", f = "SxNewAddressInteractor.kt", i = {}, l = {39}, m = "editAddress", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f293649q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f293650r;

    /* renamed from: s, reason: collision with root package name */
    public int f293651s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f293650r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f293649q = obj;
        this.f293651s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f293650r.a(null, this);
    }
}
