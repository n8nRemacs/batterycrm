package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {110}, m = "update", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class E extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331415q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331417s;

    /* renamed from: t, reason: collision with root package name */
    public int f331418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331417s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331416r = obj;
        this.f331418t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331417s.i(null, null, null, null, this);
    }
}
