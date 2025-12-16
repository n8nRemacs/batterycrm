package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession", f = "CallSession.kt", i = {0, 0, 0, 0}, l = {164}, m = "terminate", n = {"this", "reason", "beforeTerminationState", "isLocally"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* renamed from: com.avito.avcalls.android.call.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36190s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC36187o f331615q;

    /* renamed from: r, reason: collision with root package name */
    public xQ0.k f331616r;

    /* renamed from: s, reason: collision with root package name */
    public xQ0.f f331617s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f331618t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f331619u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331620v;

    /* renamed from: w, reason: collision with root package name */
    public int f331621w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36190s(AbstractC36187o abstractC36187o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331620v = abstractC36187o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331619u = obj;
        this.f331621w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331620v.h(null, false, this);
    }
}
