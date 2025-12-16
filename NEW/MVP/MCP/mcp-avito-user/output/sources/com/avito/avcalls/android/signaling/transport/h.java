package com.avito.avcalls.android.signaling.transport;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.signaling.a;
import com.avito.avcalls.android.signaling.b;
import com.avito.avcalls.android.signaling.transport.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.signaling.transport.SignalingProcessorImpl", f = "SignalingProcessorImpl.kt", i = {0, 0, 0, 0}, l = {86}, m = "sendMessage", n = {"this", "outgoingRequest", "logPrefix", "sequenceId"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes5.dex */
final class h<T extends com.avito.avcalls.android.signaling.b, R extends com.avito.avcalls.android.signaling.a> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d.a f332198q;

    /* renamed from: r, reason: collision with root package name */
    public String f332199r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f332200s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f332201t;

    /* renamed from: u, reason: collision with root package name */
    public int f332202u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332201t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f332200s = obj;
        this.f332202u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332201t.c(null, this);
    }
}
