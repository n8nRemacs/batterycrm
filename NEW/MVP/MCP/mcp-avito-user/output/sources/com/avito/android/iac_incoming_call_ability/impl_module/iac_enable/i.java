package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacOptionsInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.IacOptionsInteractorImpl", f = "IacOptionsInteractorImpl.kt", i = {0}, l = {55}, m = "getIacOptionsSuspend-0E7RQCE", n = {"this"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f168306q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f168307r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f168308s;

    /* renamed from: t, reason: collision with root package name */
    public int f168309t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f168308s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f168307r = obj;
        this.f168309t |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f168308s.b(null, null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
