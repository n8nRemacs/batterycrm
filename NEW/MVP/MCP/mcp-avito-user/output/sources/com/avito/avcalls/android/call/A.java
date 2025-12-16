package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {59}, m = "fetchIncomingCall", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class A extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331399q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331400r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331401s;

    /* renamed from: t, reason: collision with root package name */
    public int f331402t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331401s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331400r = obj;
        this.f331402t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331401s.e(null, null, null, this);
    }
}
