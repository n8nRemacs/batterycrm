package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {59}, m = "fetchIncomingCall", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class D extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f332560q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332561r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f332562s;

    /* renamed from: t, reason: collision with root package name */
    public int f332563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332562s = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332561r = obj;
        this.f332563t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332562s.e(null, null, null, this);
    }
}
