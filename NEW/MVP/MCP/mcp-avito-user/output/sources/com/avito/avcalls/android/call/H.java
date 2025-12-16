package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IncomingCallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.IncomingCallSession", f = "IncomingCallSession.kt", i = {0, 1, 2, 3, 4, 5}, l = {240, 244, 262, 272, 275, 286}, m = "negotiateAndSendAnswer", n = {"this", "this", "this", "$this$onError$iv", "this", "$this$onError$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class H extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f331430q;

    /* renamed from: r, reason: collision with root package name */
    public F f331431r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f331432s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f331433t;

    /* renamed from: u, reason: collision with root package name */
    public int f331434u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(F f12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331433t = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331432s = obj;
        this.f331434u |= BeduinInputModel.MIN_TEXT_VERSION;
        return F.j(this.f331433t, this);
    }
}
