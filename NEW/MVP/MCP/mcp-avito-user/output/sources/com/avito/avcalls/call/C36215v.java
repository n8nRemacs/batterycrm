package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.TerminateReason;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSession", f = "CallSession.kt", i = {0, 0, 0, 0}, l = {241}, m = "terminate", n = {"this", "reason", "beforeTerminationState", "isLocally"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* renamed from: com.avito.avcalls.call.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36215v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public r f332830q;

    /* renamed from: r, reason: collision with root package name */
    public TerminateReason f332831r;

    /* renamed from: s, reason: collision with root package name */
    public InvitingState f332832s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f332833t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f332834u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f332835v;

    /* renamed from: w, reason: collision with root package name */
    public int f332836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36215v(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332835v = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332834u = obj;
        this.f332836w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332835v.h(null, false, this);
    }
}
