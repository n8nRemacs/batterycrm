package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {120}, m = "updateSdp", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class I extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f332580q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f332582s;

    /* renamed from: t, reason: collision with root package name */
    public int f332583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332582s = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332581r = obj;
        this.f332583t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332582s.j(null, null, null, null, null, this);
    }
}
