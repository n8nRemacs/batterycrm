package com.avito.avcalls.android.signaling.transport;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.signaling.transport.SignalingProcessorImpl", f = "SignalingProcessorImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {133, 137}, m = "sendMessageAndContinue", n = {"this", "sendRequest", "continuation", "logPrefix", "sendAttempts", "this", "sendRequest", "continuation", "logPrefix", "sendAttempts"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes5.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f332203q;

    /* renamed from: r, reason: collision with root package name */
    public Object f332204r;

    /* renamed from: s, reason: collision with root package name */
    public Continuation f332205s;

    /* renamed from: t, reason: collision with root package name */
    public String f332206t;

    /* renamed from: u, reason: collision with root package name */
    public int f332207u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f332208v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f332209w;

    /* renamed from: x, reason: collision with root package name */
    public int f332210x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, Continuation<? super i> continuation) {
        super(continuation);
        this.f332209w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f332208v = obj;
        this.f332210x |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.b(this.f332209w, null, null, this);
    }
}
