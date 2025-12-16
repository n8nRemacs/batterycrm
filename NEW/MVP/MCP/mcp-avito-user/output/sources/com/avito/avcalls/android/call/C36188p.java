package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.call.AbstractC36187o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession", f = "CallSession.kt", i = {0, 0, 0}, l = {281}, m = "getStatsReportIfNeeded", n = {"this", "startTimestamp", "activeStateTransitionTimestamp"}, s = {"L$0", "J$0", "J$1"})
/* renamed from: com.avito.avcalls.android.call.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36188p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC36187o f331602q;

    /* renamed from: r, reason: collision with root package name */
    public long f331603r;

    /* renamed from: s, reason: collision with root package name */
    public long f331604s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f331605t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331606u;

    /* renamed from: v, reason: collision with root package name */
    public int f331607v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36188p(AbstractC36187o abstractC36187o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331606u = abstractC36187o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331605t = obj;
        this.f331607v |= BeduinInputModel.MIN_TEXT_VERSION;
        AbstractC36187o.Companion companion = AbstractC36187o.INSTANCE;
        return this.f331606u.d(this);
    }
}
