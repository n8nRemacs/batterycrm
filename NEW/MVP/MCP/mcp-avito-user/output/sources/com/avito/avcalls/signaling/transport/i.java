package com.avito.avcalls.signaling.transport;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.signaling.transport.SignalingProcessorImpl", f = "SignalingProcessorImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {138, 142}, m = "sendMessageAndContinue", n = {"this", "sendRequest", "continuation", "logFuncName", "sendAttempts", "this", "sendRequest", "continuation", "logFuncName", "sendAttempts"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes5.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f333426q;

    /* renamed from: r, reason: collision with root package name */
    public Object f333427r;

    /* renamed from: s, reason: collision with root package name */
    public Continuation f333428s;

    /* renamed from: t, reason: collision with root package name */
    public String f333429t;

    /* renamed from: u, reason: collision with root package name */
    public int f333430u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f333431v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f333432w;

    /* renamed from: x, reason: collision with root package name */
    public int f333433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, Continuation<? super i> continuation) {
        super(continuation);
        this.f333432w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f333431v = obj;
        this.f333433x |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.b(this.f333432w, null, null, this);
    }
}
