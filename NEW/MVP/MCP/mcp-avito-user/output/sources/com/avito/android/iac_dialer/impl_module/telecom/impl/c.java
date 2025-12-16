package com.avito.android.iac_dialer.impl_module.telecom.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacConnection.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection", f = "IacConnection.kt", i = {}, l = {194}, m = "moveConnectionStateToActive-gIAlu-s", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f166451q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f166452r;

    /* renamed from: s, reason: collision with root package name */
    public int f166453s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f166452r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f166451q = obj;
        this.f166453s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objC = this.f166452r.c(null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Z.a(objC);
    }
}
