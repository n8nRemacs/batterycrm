package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.call.r;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSession", f = "CallSession.kt", i = {0, 0, 0}, l = {357}, m = "getStatsReportIfNeeded", n = {"this", "startTimestamp", "activeStateTransitionTimestamp"}, s = {"L$0", "J$0", "J$1"})
/* renamed from: com.avito.avcalls.call.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36212s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public r f332814q;

    /* renamed from: r, reason: collision with root package name */
    public long f332815r;

    /* renamed from: s, reason: collision with root package name */
    public long f332816s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f332817t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f332818u;

    /* renamed from: v, reason: collision with root package name */
    public int f332819v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36212s(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332818u = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332817t = obj;
        this.f332819v |= BeduinInputModel.MIN_TEXT_VERSION;
        r.Companion companion = r.INSTANCE;
        return this.f332818u.c(this);
    }
}
