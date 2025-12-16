package com.avito.avcalls.signaling.transport;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.signaling.a;
import com.avito.avcalls.signaling.b;
import com.avito.avcalls.signaling.transport.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.signaling.transport.SignalingProcessorImpl", f = "SignalingProcessorImpl.kt", i = {0, 0, 0, 0}, l = {91}, m = "sendMessage", n = {"this", "outgoingRequest", "logFuncName", "sequenceId"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes5.dex */
final class h<T extends com.avito.avcalls.signaling.b, R extends com.avito.avcalls.signaling.a> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d.a f333421q;

    /* renamed from: r, reason: collision with root package name */
    public String f333422r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f333423s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f333424t;

    /* renamed from: u, reason: collision with root package name */
    public int f333425u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333424t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f333423s = obj;
        this.f333425u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333424t.c(null, this);
    }
}
